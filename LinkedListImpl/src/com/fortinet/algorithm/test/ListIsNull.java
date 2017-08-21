package com.fortinet.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fortinet.algorithm.LinkedList;

public class ListIsNull {

	@Test
	public void test() {
		try{
			LinkedList lList = new LinkedList();
			LinkedList.Node node = null;
			lList.reverseList(node);
			fail("Expected Illegal Argument Exception");
		}catch(Exception e){
			System.out.println("\nIllegal argument exception expected");
		}
		
	}

}
