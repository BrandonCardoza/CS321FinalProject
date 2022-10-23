package cs321.btree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class BTreeTest
{
    // HINT:
    //  instead of checking all intermediate states of constructing a tree
    //  you can check the final state of the tree and
    //  assert that the constructed tree has the expected number of nodes and
    //  assert that some (or all) of the nodes have the expected values
	
	
	// write a test case with a height of 3
	// have someone work on Sequence.utils class
	// work on converting dna sequences into long representations

    @Test
    public void btreeDegree2Test() throws IOException {

        // Instantiate and populate a bTree object
        BTree bTree = new BTree(2); // New BTree of degree 2

        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);

        int expectedNumberOfNodes = 3;

        String[] expectedNodesContent = new String[]{
                "[2]", // root content
                "[1]", // first child of root content
                "[3, 4, 5]", // second child of root content
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

       }
    }
    
    @Test
    public void btreeDegree2Testadd1to6() throws IOException {

        // Instantiate and populate a bTree object
        BTree bTree = new BTree(2); // New BTree of degree 2

        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);

        int expectedNumberOfNodes = 4;

        String[] expectedNodesContent = new String[]{
                "[2, 4]", // root content
                "[1]", // first child of root content
                "[3]", // second child of root content
                "[5, 6]", // third child of root content
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

       }
    }
    
    @Test
    public void btreeDegree2Testadd1to7() throws IOException {

        // Instantiate and populate a bTree object
        BTree bTree = new BTree(2); // New BTree of degree 2

        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);
        bTree.bTreeInsert(7);

        int expectedNumberOfNodes = 4;

        String[] expectedNodesContent = new String[]{
                "[2, 4]", // root content
                "[1]", // first child of root content
                "[3]", // second child of root content
                "[5, 6, 7]", // third child of root content
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

       }
    }
    
    @Test
    public void btreeDegree2Testadd1to8() throws IOException {

        // Instantiate and populate a bTree object
        BTree bTree = new BTree(2); // New BTree of degree 2

        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);
        bTree.bTreeInsert(7);
        bTree.bTreeInsert(8);

        int expectedNumberOfNodes = 5;

        String[] expectedNodesContent = new String[]{
                "[2, 4, 6]", // root content
                "[1]", // first child of root content
                "[3]", // second child of root content
                "[5]", // third child of root content
                "[7, 8]", // fourth child of root content
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

       }
    }
    
    @Test
    public void btreeDegree2Testadd1to9() throws IOException {

        // Instantiate and populate a bTree object
        BTree bTree = new BTree(2); // New BTree of degree 2

        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);
        bTree.bTreeInsert(7);
        bTree.bTreeInsert(8);
        bTree.bTreeInsert(9);

        int expectedNumberOfNodes = 7;

        String[] expectedNodesContent = new String[]{
        		"[4]", // root content
        "[2]",			"[6]", //root children
    "[1]", 	"[3]",	"[5]",	"[7, 8, 9]", // children of root children
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

       }
    }
    
    @Test
    public void btreeDegree2Testadd1to10() throws IOException {

        // Instantiate and populate a bTree object
        BTree bTree = new BTree(2); // New BTree of degree 2

        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);
        bTree.bTreeInsert(7);
        bTree.bTreeInsert(8);
        bTree.bTreeInsert(9);
        bTree.bTreeInsert(10);

        int expectedNumberOfNodes = 8;

        String[] expectedNodesContent = new String[]{
                "[4]", // root content
                "[2]", // first child of root content
                "[6, 8]", // second child of root content
                "[1]", // first child of root first child content
                "[3]", // second child of root first child content
                "[5]", // first child of root second child content
                "[7]", // second child of root second child content
                "[9, 10]", // third child of root second child content
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

       }
    }
    
    @Test
    public void btreeDegree3Test() throws IOException {

        // Instantiate and populate a bTree object
        BTree bTree = new BTree(3); // New BTree of degree 3

        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);
        bTree.bTreeInsert(7);
        bTree.bTreeInsert(8);
        bTree.bTreeInsert(9);
        bTree.bTreeInsert(10);

        int expectedNumberOfNodes = 4;

        String[] expectedNodesContent = new String[]{
                "[3, 6]", // root content
                "[1, 2]", // first child of root content
                "[4, 5]", // second child of root content
                "[7, 8, 9, 10]", // third child of root content
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

       }
    }
    
    @Test
    public void btreeDegree3Testadd1to21() throws IOException {

        // Instantiate and populate a bTree object
        BTree bTree = new BTree(3); // New BTree of degree 3

        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);
        bTree.bTreeInsert(7);
        bTree.bTreeInsert(8);
        bTree.bTreeInsert(9);
        bTree.bTreeInsert(10);
        bTree.bTreeInsert(11);
        bTree.bTreeInsert(12);
        bTree.bTreeInsert(13);
        bTree.bTreeInsert(14);
        bTree.bTreeInsert(15);
        bTree.bTreeInsert(16);
        bTree.bTreeInsert(17);
        bTree.bTreeInsert(18);
        bTree.bTreeInsert(19);
        bTree.bTreeInsert(20);
        bTree.bTreeInsert(21);

        int expectedNumberOfNodes = 10;

        String[] expectedNodesContent = new String[]{
                "[9]", // root content
                "[3, 6]", "[12, 15, 18]", // children of root content
                "[1, 2]", "[4, 5]", "[7, 8]", "[10, 11]", "[13, 14]", //children of root children
                "[16, 17]", "[19, 20, 21]", // children of root children continued
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

       }
    }
    
    @Test
    public void deg2_emptyBTree_add321_node123() throws IOException {

        // Instantiate and populate a bTree object
        BTree bTree = new BTree(2); // New BTree of degree 2

        bTree.bTreeInsert(3);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(1);
        
        int expectedNumberOfNodes = 1;

        String expectedNodesContent = "[1, 2, 3]";
//        {
//        		"[1, 2, 3]" // first child of root content
//        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));
        assertEquals(expectedNodesContent, bTree.getRoot().toString());
    }

    @Test
    public void btreeDegree4TestAdd1To10() throws IOException
    {

        // Instantiate and populate a bTree object
        BTree bTree = new BTree(4); // New BTree of degree 4

        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);
        bTree.bTreeInsert(7);
        bTree.bTreeInsert(8);
        bTree.bTreeInsert(9);
        bTree.bTreeInsert(10);


        int expectedNumberOfNodes = 3;

        String[] expectedNodesContent = new String[]{
                "[4]", // root content
                "[1, 2, 3]", "[5, 6, 7, 8, 9, 10]", // children of root content
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

        }
    }
    @Test
    public void btreeDegree4TestTestadd1to15() throws IOException
    {
        // Instantiate and populate a bTree object
        BTree bTree = new BTree(4); // New BTree of degree 4

        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);
        bTree.bTreeInsert(7);
        bTree.bTreeInsert(8);
        bTree.bTreeInsert(9);
        bTree.bTreeInsert(10);
        bTree.bTreeInsert(11);
        bTree.bTreeInsert(12);
        bTree.bTreeInsert(13);
        bTree.bTreeInsert(14);
        bTree.bTreeInsert(15);


        int expectedNumberOfNodes = 4;

        String[] expectedNodesContent = new String[]{
                "[4, 8]", // root content
                "[1, 2, 3]", "[5, 6, 7]", "[9, 10, 11, 12, 13, 14, 15]", // children of root content
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

        }
    }

    @Test
    public void btreeDegree4TestTestadd1to16() throws IOException
    {
        // Instantiate and populate a bTree object
        BTree bTree = new BTree(4); // New BTree of degree 4

        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);
        bTree.bTreeInsert(7);
        bTree.bTreeInsert(8);
        bTree.bTreeInsert(9);
        bTree.bTreeInsert(10);
        bTree.bTreeInsert(11);
        bTree.bTreeInsert(12);
        bTree.bTreeInsert(13);
        bTree.bTreeInsert(14);
        bTree.bTreeInsert(15);
        bTree.bTreeInsert(16);

        int expectedNumberOfNodes = 5;

        String[] expectedNodesContent = new String[]{
                "[4, 8, 12]", // root content
                "[1, 2, 3]", "[5, 6, 7]", "[9, 10, 11]", "[13, 14, 15, 16]", // children of root content
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

        }
    }

    @Test
    public void btreeDegree4TestTestadd1to20() throws IOException
    {
        // Instantiate and populate a bTree object
        BTree bTree = new BTree(4); // New BTree of degree 4

        Long startTime = System.currentTimeMillis();
        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);
        bTree.bTreeInsert(7);
        bTree.bTreeInsert(8);
        bTree.bTreeInsert(9);
        bTree.bTreeInsert(10);
        bTree.bTreeInsert(11);
        bTree.bTreeInsert(12);
        bTree.bTreeInsert(13);
        bTree.bTreeInsert(14);
        bTree.bTreeInsert(15);
        bTree.bTreeInsert(16);
        bTree.bTreeInsert(17);
        bTree.bTreeInsert(18);
        bTree.bTreeInsert(19);
        bTree.bTreeInsert(20);
        System.out.println("Inserting 20");
        System.out.println("Degree 4 Without Cache: " + (System.currentTimeMillis() - startTime));

        int expectedNumberOfNodes = 6;

        String[] expectedNodesContent = new String[]{
                "[4, 8, 12, 16]", // root content
                "[1, 2, 3]", "[5, 6, 7]", "[9, 10, 11]", "[13, 14, 15]", "[17, 18, 19, 20]",// children of root content
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

        }
    }
    
    @Test
    public void btreeDegree4TestTestadd1to20WithCache() throws IOException
    {
        // Instantiate and populate a bTree object
        BTree bTree = new BTree(4, 10); // New BTree of degree 4

        Long startTime = System.currentTimeMillis();
        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);
        bTree.bTreeInsert(7);
        bTree.bTreeInsert(8);
        bTree.bTreeInsert(9);
        bTree.bTreeInsert(10);
        bTree.bTreeInsert(11);
        bTree.bTreeInsert(12);
        bTree.bTreeInsert(13);
        bTree.bTreeInsert(14);
        bTree.bTreeInsert(15);
        bTree.bTreeInsert(16);
        bTree.bTreeInsert(17);
        bTree.bTreeInsert(18);
        bTree.bTreeInsert(19);
        bTree.bTreeInsert(20);
        System.out.println("Degree 4 With Cache: " + (System.currentTimeMillis() - startTime));

        int expectedNumberOfNodes = 6;

        String[] expectedNodesContent = new String[]{
                "[4, 8, 12, 16]", // root content
                "[1, 2, 3]", "[5, 6, 7]", "[9, 10, 11]", "[13, 14, 15]", "[17, 18, 19, 20]",// children of root content
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

        }
    }

    @Test
    public void btreeDegree4TestTestadd1to30() throws IOException
    {
        // Instantiate and populate a bTree object
        BTree bTree = new BTree(4); // New BTree of degree 4

        bTree.bTreeInsert(1);
        bTree.bTreeInsert(2);
        bTree.bTreeInsert(3);
        bTree.bTreeInsert(4);
        bTree.bTreeInsert(5);
        bTree.bTreeInsert(6);
        bTree.bTreeInsert(7);
        bTree.bTreeInsert(8);
        bTree.bTreeInsert(9);
        bTree.bTreeInsert(10);
        bTree.bTreeInsert(11);
        bTree.bTreeInsert(12);
        bTree.bTreeInsert(13);
        bTree.bTreeInsert(14);
        bTree.bTreeInsert(15);
        bTree.bTreeInsert(16);
        bTree.bTreeInsert(17);
        bTree.bTreeInsert(18);
        bTree.bTreeInsert(19);
        bTree.bTreeInsert(20);
        bTree.bTreeInsert(21);
        bTree.bTreeInsert(22);
        bTree.bTreeInsert(23);
        bTree.bTreeInsert(24);
        bTree.bTreeInsert(25);
        bTree.bTreeInsert(26);
        bTree.bTreeInsert(27);
        bTree.bTreeInsert(28);
        bTree.bTreeInsert(29);
        bTree.bTreeInsert(30);

        int expectedNumberOfNodes = 8;

        String[] expectedNodesContent = new String[]{
                "[4, 8, 12, 16, 20, 24]", // root content
                "[1, 2, 3]", "[5, 6, 7]", "[9, 10, 11]", "[13, 14, 15]", "[17, 18, 19]","[21, 22, 23]","[25, 26, 27, 28, 29, 30]",// children of root content
        };

        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));

        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {

            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());

        }
    }
    
    @Test
    public void btreeDegree4TestInsert10000() throws IOException
    {
    	//This is a timing test to compare using a cache and not using a cache so we
    	//aren't actually checking the contents of all the nodes.
    	
        // Instantiate and populate a bTree object
        BTree bTree = new BTree(50); // New BTree of degree 50

        Long startTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
        {
        	bTree.bTreeInsert(i);
        }
        System.out.println("Inserting 100,000");
        System.out.println("Degree 10 Without Cache: " + (System.currentTimeMillis() - startTime));

        assert(true);
//        int expectedNumberOfNodes = 6;
//
//        String[] expectedNodesContent = new String[]{
//                "[4, 8, 12, 16]", // root content
//                "[1, 2, 3]", "[5, 6, 7]", "[9, 10, 11]", "[13, 14, 15]", "[17, 18, 19, 20]",// children of root content
//        };
//
//        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));
//
//        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {
//
//            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());
//
//        }
    }
    
    @Test
    public void btreeDegree4TestInsert10000WithCache() throws IOException
    {
    	//This is a timing test to compare using a cache and not using a cache so we
    	//aren't actually checking the contents of all the nodes.
    	
        // Instantiate and populate a bTree object
        BTree bTree = new BTree(50, 500); // New BTree of degree 50

        Long startTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
        {
        	bTree.bTreeInsert(i);
        }
        System.out.println("Degree 10 With Cache: " + (System.currentTimeMillis() - startTime));

        assert(true);
//        int expectedNumberOfNodes = 6;
//
//        String[] expectedNodesContent = new String[]{
//                "[4, 8, 12, 16]", // root content
//                "[1, 2, 3]", "[5, 6, 7]", "[9, 10, 11]", "[13, 14, 15]", "[17, 18, 19, 20]",// children of root content
//        };
//
//        assertEquals(expectedNumberOfNodes, bTree.getNumberOfNodes(bTree.getRoot()));
//
//        for (int indexNode = 0; indexNode < expectedNumberOfNodes; indexNode++) {
//
//            assertEquals(expectedNodesContent[indexNode], bTree.getArrayOfNodeContentsForNodeIndex(indexNode).toString());
//
//        }
    }


}
