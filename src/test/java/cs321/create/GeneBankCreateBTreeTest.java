package cs321.create;

import cs321.common.ParseArgumentException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneBankCreateBTreeTest
{
    private String[] args;
    private GeneBankCreateBTreeArguments expectedConfiguration;
    private GeneBankCreateBTreeArguments actualConfiguration;

    @Test
    public void parse4CorrectArgumentsTest() throws ParseArgumentException
    {
        args = new String[4];
        args[0] = "0";
        args[1] = "20";
        args[2] = "fileNameGbk.gbk";
        args[3] = "13";

        expectedConfiguration = new GeneBankCreateBTreeArguments(false, 20, "fileNameGbk.gbk", 13, 0, 0);
        actualConfiguration = GeneBankCreateBTree.parseArguments(args);
        assertEquals(expectedConfiguration, actualConfiguration);
    }

    @Test
    public void parse4inorrectArgumentsTest() throws ParseArgumentException
    { //incorrect sequence length
        args = new String[4];
        args[0] = "0";
        args[1] = "20";
        args[2] = "fileNameGbk.gbk";
        args[3] = "0";

        actualConfiguration = GeneBankCreateBTree.parseArguments(args);
        assertEquals(null, actualConfiguration);
    }
    @Test
    public void parse6CorrectArgumentsTest() throws ParseArgumentException
    { //all correct
        args = new String[6];
        args[0] = "1";
        args[1] = "20";
        args[2] = "fileNameGbk.gbk";
        args[3] = "13";
        args[4] = "100";
        args[5] = "1";

        expectedConfiguration = new GeneBankCreateBTreeArguments(true, 20, "fileNameGbk.gbk", 13, 100, 1);
        actualConfiguration = GeneBankCreateBTree.parseArguments(args);
        assertEquals(expectedConfiguration, actualConfiguration);
    }

    @Test
    public void parse6inorrectArgumentsTestSize() throws ParseArgumentException
    {
        //incorrect size
        args = new String[6];
        args[0] = "1";
        args[1] = "20";
        args[2] = "fileNameGbk.gbk";
        args[3] = "13";
        args[4] = "99";
        args[5] = "1";

        actualConfiguration = GeneBankCreateBTree.parseArguments(args);
        assertEquals(null, actualConfiguration);
    }


    @Test
    public void parse6inorrectArgumentsTestDebug() throws ParseArgumentException
    {
        //incorrect debug
        args = new String[6];
        args[0] = "1";
        args[1] = "20";
        args[2] = "fileNameGbk.gbk";
        args[3] = "13";
        args[4] = "100";
        args[5] = "3";

        actualConfiguration = GeneBankCreateBTree.parseArguments(args);
        assertEquals(null, actualConfiguration);
    }

    @Test
    public void parse5CorrectArgumentsTestCache() throws ParseArgumentException
    {
        //use cache but no debug
        args = new String[5];
        args[0] = "1";
        args[1] = "20";
        args[2] = "fileNameGbk.gbk";
        args[3] = "13";
        args[4] = "100"; //cache size

        expectedConfiguration = new GeneBankCreateBTreeArguments(true, 20, "fileNameGbk.gbk", 13, 100, 0);
        actualConfiguration = GeneBankCreateBTree.parseArguments(args);
        assertEquals(expectedConfiguration, actualConfiguration);
    }
    @Test
    public void parse5incorrectArgumentsTestCache() throws ParseArgumentException
    {
        //use cache but bad size
        args = new String[5];
        args[0] = "1";
        args[1] = "20";
        args[2] = "fileNameGbk.gbk";
        args[3] = "13";
        args[4] = "10";

        actualConfiguration = GeneBankCreateBTree.parseArguments(args);
        assertEquals(null, actualConfiguration);
    }

    @Test
    public void parse5incorrectArgumentsTestCache1() throws ParseArgumentException
    {
        //use cache but size 1
        args = new String[5];
        args[0] = "1";
        args[1] = "20";
        args[2] = "fileNameGbk.gbk";
        args[3] = "13";
        args[4] = "1";

        actualConfiguration = GeneBankCreateBTree.parseArguments(args);
        assertEquals(null, actualConfiguration);
    }


    @Test
    public void parse5incorrectArgumentsTestCache0() throws ParseArgumentException
    {
        //use cache but size 0
        args = new String[5];
        args[0] = "1";
        args[1] = "20";
        args[2] = "fileNameGbk.gbk";
        args[3] = "13";
        args[4] = "0";

        actualConfiguration = GeneBankCreateBTree.parseArguments(args);
        assertEquals(null, actualConfiguration);
    }



    @Test
    public void parse5CorrectArgumentsTestDebug0() throws ParseArgumentException
    {
        //use debug 0 but no cache
        args = new String[5];
        args[0] = "0";
        args[1] = "20";
        args[2] = "fileNameGbk.gbk";
        args[3] = "13";
        args[4] = "0";

        expectedConfiguration = new GeneBankCreateBTreeArguments(false, 20, "fileNameGbk.gbk", 13, 0, 0);
        actualConfiguration = GeneBankCreateBTree.parseArguments(args);
        assertEquals(expectedConfiguration, actualConfiguration);
    }
    @Test
    public void parse5CorrectArgumentsTestDebug1() throws ParseArgumentException
    {
        //use debug 1 but no cache
        args = new String[5];
        args[0] = "0";
        args[1] = "20";
        args[2] = "fileNameGbk.gbk";
        args[3] = "13";
        args[4] = "1";

        expectedConfiguration = new GeneBankCreateBTreeArguments(false, 20, "fileNameGbk.gbk", 13, 0, 1);
        actualConfiguration = GeneBankCreateBTree.parseArguments(args);
        assertEquals(expectedConfiguration, actualConfiguration);
    }

    @Test
    public void parse5IncorrectArgumentsTestDebug3() throws ParseArgumentException
    {
        //no cache but incorrect debug
        args = new String[5];
        args[0] = "0";
        args[1] = "20";
        args[2] = "fileNameGbk.gbk";
        args[3] = "13";
        args[4] = "3";

        actualConfiguration = GeneBankCreateBTree.parseArguments(args);
        assertEquals(null, actualConfiguration);
    }

}
