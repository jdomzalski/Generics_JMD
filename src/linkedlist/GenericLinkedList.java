package linkedlist;
/**
 * This class models a linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after.
 * @author rkelley/njohnson/Joshua Domzalski
 * Programming Project 1 Start Project
 * CS131ON
 */

/**
 * This class declaration has now been parameterized with a generic type T
 * The variables in the class have now been parameterized with a generic type T
 * @param <T>
 */

public class GenericLinkedList<T> {

	private GenericNode<T> head; //node to represent the head of the list (Now can be set to any generic parameterized object T)
	private GenericNode<T> tail; //node to represent the tail (end) of the list (Now can be set to any generic parameterized object T)
	private int length; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 */
	public GenericLinkedList()
	{
		this.head=null;
		this.length=0;
		this.tail=head;
	}//end empty-argument constructor
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	
	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * (This method is for GenericNode objects, which are parameterized with a generic <T>, as compared to the Node objects, which only accept Strings.)
	 * @return
	 */
	public GenericNode<T> getList()
	{
		return head;
	}//end getList
	
	/**
	 * This method adds a new node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * 
	 *(Now accepting a GenericNode object to be passed into it. The GenericNode objects can be parameterized for any type, and are not limited to just String types.)
	 * @param aNode
	 */
	public void addNode(GenericNode aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		
		tail.setNextNode(aNode);
		tail=tail.getNextNode();
		tail.setNextNode(null);
		length++;
		
	}//end addNode

}//end class