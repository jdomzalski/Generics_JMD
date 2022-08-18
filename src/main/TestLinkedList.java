/**
 *  This is a class used to test and demonstrate creating Generic LinkedLists
 *  @author Joshua Domzalski
 *  Progamming Project 3
 *  Summer 2022
 */


package main;
import java.util.*;
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		/**
		 * Adding three GenericLinkedLists that are all parameterized with different types of objects
		 */
		
		LinkedList myList=new LinkedList(); 
		GenericLinkedList<Integer> myGenericIntList = new GenericLinkedList<Integer>();
		GenericLinkedList<Double> myGenericDoubleList = new GenericLinkedList<Double>();
		GenericLinkedList<String> myGenericStringList = new GenericLinkedList<String>();
		//end LinkedLists creation
		
		
		/**
		 * Original LinkedList declaration for non-generic type. This block of code was already in assignment.
		 */
		
		Node aNode = new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
	
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		
		//End Original LinkedList
		
		/**
		 * Creating GenericNodes that are parameterized with Integer and adding each Node to the respective LinkedList.
		 */

		GenericNode<Integer> iNode1 = new GenericNode<Integer>();
		iNode1.setData(50);
		GenericNode<Integer> iNode2 = new GenericNode<Integer>();
		iNode2.setData(85);
		GenericNode<Integer> iNode3 = new GenericNode<Integer>();
		iNode3.setData(259);
		GenericNode<Integer> iNode4 = new GenericNode<Integer>();
		iNode4.setData(1000);
		myGenericIntList.addNode(iNode1);
		myGenericIntList.addNode(iNode2);
		myGenericIntList.addNode(iNode3);
		myGenericIntList.addNode(iNode4);
		
		/**
		 * Printing out our GenericLinkedList
		 */
		
		GenericNode<Integer> tempIntList = myGenericIntList.getList();
		do
		{
			System.out.println(tempIntList.getData());
			tempIntList = tempIntList.getNextNode();
		}while(tempIntList != null);
		
		/**
		 * Creating GenericNodes that are parameterized with Double and adding each Node to the respective LinkedList.
		 */
		
		GenericNode<Double> dNode1 = new GenericNode<Double>();
		dNode1.setData(30.8);
		GenericNode<Double> dNode2 = new GenericNode<Double>();
		dNode2.setData(50.6);
		GenericNode<Double> dNode3 = new GenericNode<Double>();
		dNode3.setData(567.89);
		GenericNode<Double> dNode4 = new GenericNode<Double>();
		dNode4.setData(0.581);
		myGenericDoubleList.addNode(dNode1);
		myGenericDoubleList.addNode(dNode2);
		myGenericDoubleList.addNode(dNode3);
		myGenericDoubleList.addNode(dNode4);
		
		/**
		 * Printing out our GenericLinkedList
		 */
		
		GenericNode<Double> tempDoubleList = myGenericDoubleList.getList();
		do
		{
			System.out.println(tempDoubleList.getData());
			tempDoubleList = tempDoubleList.getNextNode();
		}while(tempDoubleList != null);
		
		/**
		 * Creating GenericNodes that are parameterized with String and adding each Node to the respective LinkedList.
		 */
		
		GenericNode<String> sNode1 = new GenericNode<String>();
		sNode1.setData("Hello");
		GenericNode<String> sNode2 = new GenericNode<String>();
		sNode2.setData("My Name Is");
		GenericNode<String> sNode3 = new GenericNode<String>();
		sNode3.setData("Josh");
		GenericNode<String> sNode4 = new GenericNode<String>();
		sNode4.setData(":)");
		myGenericStringList.addNode(sNode1);
		myGenericStringList.addNode(sNode2);
		myGenericStringList.addNode(sNode3);
		myGenericStringList.addNode(sNode4);
		
		/**
		 * Printing out our GenericLinkedList
		 */
		
		GenericNode<String> tempStringList = myGenericStringList.getList();
		do
		{
			System.out.println(tempStringList.getData());
			tempStringList = tempStringList.getNextNode();
		}while(tempStringList != null);
		

	}//end main

}//end class

