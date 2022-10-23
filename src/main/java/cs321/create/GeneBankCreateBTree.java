package cs321.create;

import cs321.btree.BTree;
import cs321.btree.TreeObject;
import cs321.common.ParseArgumentException;
import cs321.search.GeneBankSearchBTreeArgumentException;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GeneBankCreateBTree
{
    public static void main(String[] args) throws Exception
    {
        GeneBankCreateBTreeArguments argPirates = parseArguments(args);

        BTree beeTree = new BTree(argPirates.getDegree());

        String DNAseq;

        SequenceUtils seq = new SequenceUtils();

        List<String> sequences = seq.getDNASequencesFromGBKGenomeFile(argPirates.getGbkFileName());
        //iterate through subsequences
        for(int i  = 0; i < sequences.size(); i++)
        {
            String sequencez = sequences.get(i);
            //insert into btree from command line args
            while(sequencez.length() >= argPirates.getSubsequenceLength())
            {
                DNAseq = sequencez.substring(0, argPirates.getSubsequenceLength());
                //System.out.println(" " + DNAseq + " ");
                //aaaaact(7) goes to count 1 2 3 [2,7] then to a 2 3 4 [7,15]-> [7], gets reset in a way??  so 4 instead of 6 as if there are two different keys
                //aaaacta(28) is 1 suppose to be 2
                Long results = ConvertToLong(DNAseq);
                System.out.println(" " + results + " ");
                beeTree.bTreeInsert(results);
                sequencez = sequencez.replaceFirst(String.valueOf(sequencez.charAt(0)), "");

            }
        }

        if (argPirates.getDebugLevel() == 1) {
            beeTree.dump("dump", argPirates.getSubsequenceLength());
        }

    }

    private static void CreateDatabase(File tree) {

        Connection connection = null;

        try {

            connection = DriverManager.getConnection("jdbc:sqlite:GeneBankDB.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            statement.executeUpdate("drop table if exists genebank");
            statement.executeUpdate("create table genebank (sequence string, frequency integer)");

            Scanner fileScan = new Scanner(tree);

            while (fileScan.hasNextLine()) {

                String nextLine = fileScan.nextLine();
                Scanner lineScan = new Scanner(nextLine);

                String nextSequence = lineScan.next();
                nextSequence = nextSequence.substring(0, nextSequence.length() - 1);

                String nextFrequency = lineScan.next();

                String nextUpdate = "insert into genebank values('" + nextSequence + "', " + nextFrequency + ")";

                statement.executeUpdate(nextUpdate);

            }

            tree.delete();

        } catch (SQLException e) {

            System.err.println(e.getMessage());

        } catch (FileNotFoundException e) {

            System.err.println(e.getMessage());

        }

    }


    private static long ConvertToLong(String DNASequenceChar)
    {
        long retVal = 0;

        for(int i = 0; i < DNASequenceChar.length(); i++)
        {
            char Dna = DNASequenceChar.charAt(i);
            retVal = retVal << 2;

            if(Dna == 'A' || Dna == 'a')
            {
                retVal = retVal + 0;
            }
            if(Dna == 'C' || Dna == 'c')
            {
                retVal = retVal + 1;
            }
            if(Dna == 'T' || Dna == 't')
            {
                retVal = retVal + 3;
            }
            if(Dna == 'G' || Dna == 'g')
            {
                retVal = retVal + 2;
            }
        }
        return retVal;
    }
    private static GeneBankCreateBTreeArguments parseArgumentsAndHandleExceptions(String[] args)
    {
        GeneBankCreateBTreeArguments geneBankCreateBTreeArguments = null;
        try
        {
            geneBankCreateBTreeArguments = parseArguments(args);
        }
        catch (ParseArgumentException e)
        {
            printUsageAndExit(e.getMessage());
        }
        return geneBankCreateBTreeArguments;
    }

    private static void printUsageAndExit(String errorMessage)
    {

        System.exit(1);
    }

    public static GeneBankCreateBTreeArguments parseArguments(String[] args) throws ParseArgumentException
    {
        GeneBankCreateBTreeArguments argsTester = null;
        try {
            argsTester = new GeneBankCreateBTreeArguments(args);
        } catch (GeneBankSearchBTreeArgumentException e) {
            System.out.println("e.printStackTrace()");
        }

        return argsTester;
    }

}
