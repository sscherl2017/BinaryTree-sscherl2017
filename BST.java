/**
* A BinarySearchTree that which contains methods for adding and finding items.
*/
public class BST<E extends Comparable<E>>
{
	/* A BinaryTree<E> that contains all the data for the BinarySearchTree. */
	private BinaryTree<E> root;
	
	/*
	* Adds a given item to the BinarySearchTree and returns true if the item was successfully added
	* and false if it was not.
	* @param item	The item that will be added
	* @return	True if the item was successfully added and false if it was not
	*/
	public boolean add(E item)
	{
		if (root == null)
		{
			root = new BinaryTree<E>();
			root.setValue(item);
			return true;
		}
		return recursiveAdd(root, item);
	}
	
	/**
	* A helper function that recursively adds an item to the BinarySearchTree.
	* @param current	The current BinaryTree in the traversal
	* @param item	The item that will be added
	* @return	True if the item was successfully added and false if it was not
	*/
	public boolean recursiveAdd(BinaryTree<E> current, E item)
	{
		if (item.compareTo(current.value()) < 0)
		{
			if (current.left() == null)
			{
				current.setLeft(new BinaryTree<E>(item));
				return true;
			}
			return recursiveAdd(current.left(), item);
		}
		else if (item.compareTo(current.value()) > 0)
		{
			if (current.right() == null)
			{
				current.setRight(new BinaryTree<E>(item));
				return true;
			}
			return recursiveAdd(current.right(), item);
		}
		return false;
	}
	
	/**
	* Finds whether or not a given item exists within the BinarySearchTree.
	* @param item	The item that will be searched for
	* @return		The BinaryTree<E> that's value is equal to the given item
	*/
	public BinaryTree<E> find(E item)
	{
		if (root == null)
			return root;
		return recursiveFind(root, item);
	}
	
	/**
	* A helper function that recursively finds an item in the BinarySearchTree.
	* @param current	The current BinaryTree in the traversal
	* @param item	The item that will be looked for
	* @return	True if the item was found and false if it was not
	*/
	public BinaryTree<E> recursiveFind(BinaryTree<E> current, E item)
	{
		if (item.compareTo(current.value()) < 0)
		{
			if (current.left() == null)
				return null;
			return recursiveFind(current.left(), item);
		}
		else if (item.compareTo(current.value()) > 0)
		{
			if (current.right() == null)
				return null;
			return recursiveFind(current.right(), item);
		}
		return current;
	}
	
	/**
	* Returns a String representation of the BinaryTree.
	* @return	A String representation of the BinaryTree
	*/
	public String toString()
	{
		return root.toString();
	}

	public static void main(String[] args)
	{
	BST<String> tester = new BST<String>();
	tester.add("kevin");
	tester.add("akshina");
	tester.add("maddie");
	tester.add("aaron");
	tester.add("daria");
	tester.add("yanni");
	tester.add("anish");
	tester.add("jack");
	tester.add("sam");
	tester.add("zach");
	tester.add("billy");
	tester.add("ingrid");
	tester.add("kartikeya");
	tester.add("will");
	tester.add("brendan");
	tester.add("john");
	tester.add("jessica");
	System.out.println(tester.find("yanni"));
}
}