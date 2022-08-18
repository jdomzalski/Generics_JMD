package linkedlist;

/**
 * This class models a Node object which contains Strings. Each
 * node has its internal data (a String) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson/Joshua Domzalski
 * Programming Project 1 Start Project
 * CS131ON
 */

/**
 * This class declaration has now been parameterized with a generic type T
 * The variables in the class have now been parameterized with a generic type T
 * @param <T>
 */

public class GenericNode<T> {
	 
	
	private T data;  //data that the object stores (now data is a generic T object, meaning whatever is passed into data does not have to be a String. The data can be any parameterized object.)
	private GenericNode<T> nextNode; //pointer to the nextNode that will be in LinkedList (Now a generic type that can be pointed to any type of parameterized object.)
	
	/**
	 * Constructor build GenericNode object. Sets data equal to data and initializes nextNode.
	 * to null.
	 */
	public GenericNode()
	{
		this.data = data;
		setNextNode(null);
		
	}//end empty-argument constructor
	
	
	/**
	 * This method sets the data of the object. (Now passing in generic type T data, as opposed to simply String data)
	 * @param data
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the data of the object. (Now returning a generic type T instead of simply a String type.)
	 * @return String (data)
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller. (Method is now to be used by GenericNode objects, which once again can be parameterized with any type of object.)
	 * @return
	 */
	public GenericNode<T> getGenericNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node. (Now passing in a GenericNode object, as opposed to simply a Node object.)
	 * @param nextNode
	 */
	public void setNextNode(GenericNode nextNode)
	{
		this.nextNode= nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer. (Now as a generic type that can be parameterized to various types of objects.)
	 * @return Node object
	 */
	public GenericNode<T> getNextNode() {
		return nextNode;
	}//end getNextNode
	
}//end class