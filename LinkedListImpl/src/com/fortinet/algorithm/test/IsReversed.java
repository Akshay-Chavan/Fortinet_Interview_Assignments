package com.fortinet.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fortinet.algorithm.LinkedList;
import com.fortinet.algorithm.LinkedList.Node;

public class IsReversed {
	
	@Test
	public void test() {
		LinkedList lList = new LinkedList();
		LinkedList.Node head = new LinkedList.Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.setNext(second);
		second.setNext(third);
		
		//Getting tail node value of non reversed LinkedList.
		Node nonReversedHead = head;
		int valueTailNonReversed = 0;
		while(nonReversedHead.getNext()!=null){
			nonReversedHead = nonReversedHead.getNext();
			valueTailNonReversed = nonReversedHead.getData();
		}
		Node reverseHead = lList.reverseList(head);
		boolean isReversed = lList.isReversed(head.getData(), valueTailNonReversed, reverseHead);
		assertEquals(true, isReversed);
	}

}
