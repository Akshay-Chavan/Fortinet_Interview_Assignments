package com.fortinet.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fortinet.algorithm.LinkedList;

public class SingleNode {

	@Test
	public void test() {
		LinkedList lList = new LinkedList();
		LinkedList.Node head = new LinkedList.Node(1);
		LinkedList.Node reverseListHead = lList.reverseList(head);
		assertEquals(head, reverseListHead);
	}

}
