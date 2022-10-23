package cs321.btree;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Interface for a B-Tree containing BTreeNodes.
 * 
 * @author Brandon Cardoza
 *
 */
public interface BTreeInterface
{
	
	/**
	 * Searches a node for a given key. If found returns the node.
	 * If not found and the node is a leaf node, returns null, otherwise
	 * recursively searches the child of the node.
	 * @param node - The node to search for the key
	 * @param key - The key to be searching for
	 * @return - Either null if the key is not found, or the node the key is in.
	 * @throws IOException 
	 */
	public BTreeNode bTreeSearch(BTreeNode node, long key) throws IOException;
	
	/**
	 * Takes a non full node x and splits a full child of x into two children
	 * by removing one of the keys from the child and adding it to x.
	 * @param node - The node to split a child of and to add the key to
	 * @param i - Where in the node you want to insert the key. All keys to the
	 * right will be shifted by one.
	 * @throws IOException 
	 */
	public void bTreeSplitChild(BTreeNode node, int i, BTreeNode child) throws IOException;
	
	/**
	 * Checks if the root node is full, if so splits the node and inserts the key.
	 * Otherwise inserts the key into the non full node.
	 * @param key
	 * @throws IOException 
	 */
	public void bTreeInsert(long key) throws IOException;
	
	/**
	 * Checks if the node is a leaf node, and if so, inserts the key into it.
	 * If not, searches for the correct node to insert the key into and splits
	 * children if necessary.
	 * @param node - The node to attempt to insert the key into.
	 * @param key - The key to be inserted into the node.
	 * @throws IOException 
	 */
	public void bTreeInsertNonFull(BTreeNode node, long key) throws IOException;

	/** Returns the root node of this <code>BTree</code>.
	 *
	 * @return - the root node
	 */
	public BTreeNode getRoot();

	/** Returns the number of nodes below this node including the given node.
	 *
	 * @param x - the node to check nodes below
	 * @return - 0 if root node is null, 1 if node is a leaf, and the number of nodes
	 * below this node otherwise
	 * @throws IOException if there is an issue reading from the <code>raf</code>
	 */
	public int getNumberOfNodes(BTreeNode x) throws IOException;

	/** Returns the content of a <code>BTreeNode</code> in this <code>BTree</code>.
	 *
	 * @param i - the node to get the content for
	 * @return - a node with a list of TreeObjects as content
	 * @throws IOException if there is an issue reading from raf
	 */
	public BTreeNode getArrayOfNodeContentsForNodeIndex(int i) throws IOException;

	/**
	 * Creates a dump for the debug level and creates and
	 * new PrintStream for the file dump.
	 *
	 * @param filename the filename of the PrintStream
	 * @param sequenceLength the length of the sequence
	 */
	public void dump(String filename, int sequenceLength) throws FileNotFoundException;
}
