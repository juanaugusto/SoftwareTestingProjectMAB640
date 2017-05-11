package br.ufrj.testproj.testcases.graphcoverage.primepath;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.ufrj.testproj.principal.CalculatePalindromeOBI;

public class PalindromeOBITestCase {

	char[] word;
	String expectedResponse;
	int[] percurredPath;
	
	int[][] primePathsRequirements;

	@Before
	public void setUp(){
		this.primePathsRequirements = new int[][] {
			{3,4,5,2,6,7,8,9,10},  {3,4,5,2,6,7,11,12,14}, 
			{3,4,5,2,6,7,11,13,14}, {3,5,2,6,7,8,9,10}, {3,4,5,2,6,7,8,10}, 
			{3,5,2,6,7,11,12,14}, {3,5,2,6,7,11,13,14}, {3,5,2,6,7,8,10}, 
			{1,2,6,7,11,12,14}, {1,2,6,7,8,9,10}, {1,2,6,7,11,13,14}, 
			{8,9,10,7,11,12,14}, {8,9,10,7,11,13,14}, {1,2,6,7,8,10}, 
			{8,10,7,11,12,14},  {8,10,7,11,13,14}, {3,4,5,2,3}, 
			{4,5,2,3,4}, {5,2,3,4,5}, {1,2,3,4,5}, {2,3,4,5,2}, 
			{9,10,7,8,9}, {10,7,8,9,10}, {7,8,9,10,7},  {8,9,10,7,8},  
			{3,5,2,3}, {5,2,3,5}, {1,2,3,5}, {2,3,5,2}, {10,7,8,10}, 
			{8,10,7,8}, {7,8,10,7}};
	}
	
	@After
	public void tearDown(){
		System.out.println();
	}
	
	@Test
	public void testPathNumber1() {
		this.word = new char[] {'a', 'a', ' ', 'a', 'a'};

		this.expectedResponse = "SIM";
		assertEquals(
				this.expectedResponse, 
				CalculatePalindromeOBI.calculateWrongPalindrome(word)
		);
	
	}	

	@Test
	public void testPathNumber2() {
		this.word = new char[] {'b', 'x'};

		this.expectedResponse = "NAO";
		assertEquals(
				this.expectedResponse, 
				CalculatePalindromeOBI.calculateWrongPalindrome(word)
		);
	
	}
	
	@Test
	public void testPathNumber3() {
		this.word = new char[] {};

		this.expectedResponse = "SIM";
		assertEquals(
				this.expectedResponse, 
				CalculatePalindromeOBI.calculateWrongPalindrome(word)
		);
	
	}

}

