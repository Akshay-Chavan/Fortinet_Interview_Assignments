package com.fortinet.algorithm;

public class LinkedList {
	Node head;

	public static class Node {
		int data;
		Node next;

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		lList.head.next = second;
		second.next = third;
		third.next = null;

		System.out.println("LinkedList");
		lList.printList(lList.head);
		System.out.println("\nReversed LinkedList");
		lList.printList(lList.reverseList(lList.head));
	}

	public void printList(Node head) {
		Node n = head;
		
		while (n != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
	}

	public Node reverseList(Node currentNode) {
		if (currentNode == null) {
			System.err.println("List is Null");
			throw new IllegalArgumentException();
		}
		if (currentNode.next == null) {
			System.out.println("Only one node in list no need to reverse");
			return currentNode;
		}
		int valueHeadNonReversed = currentNode.data;
		
		//retrieving value of tail of non reversed LinkedList
		Node headNonReversedNode = currentNode;
		int valueTailNonReversed = 0;
		while(headNonReversedNode.next!=null){
			headNonReversedNode = headNonReversedNode.next;
			valueTailNonReversed = headNonReversedNode.data;
		}
		
		//Reversing a LinkedList
		Node previousNode = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		
		//Check if list is reversed or not
		Node headReversedNode = previousNode;
		if(!isReversed(valueHeadNonReversed,valueTailNonReversed, headReversedNode)){
			System.err.println("LinkedList not reversed");
		}
		return previousNode;

	}
	
	//Checks if value of Head of LinkedList is equal to tail of reversed LinkedList.
	public boolean isReversed(int valueHeadNonReversed, int valueTailNonReversed, Node headReversedNode){
		boolean isReversed = false;
		int valueTailReversed = 0;
		int valueHeadReversed = headReversedNode.data;
		while(headReversedNode.next!=null){
			headReversedNode = headReversedNode.next;
			valueTailReversed = headReversedNode.data;
		}
		
		if(valueHeadNonReversed == valueTailReversed && valueTailNonReversed == valueHeadReversed){
			isReversed = true;
		}
		return isReversed;
		
	}

}
