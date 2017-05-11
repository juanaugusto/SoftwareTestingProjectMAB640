package br.ufrj.testproj.testcases.graphcoverage.primepath;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufrj.testproj.principal.CalculatePalindromeOBI;

public class PalindromeOBITestCase {

	char[] word;
	String expectedResponse;
	int[] percurredPath;
	
	int[] nodeRequirements;
	int[][] edgeRequirements;
	int[][] edgePairRequirements;
	int[][] primePathsRequirements;
	
	@BeforeClass
	public static void setUpOnceForAll(){
		System.out.println("Starting tests");
		
	}
	
	@AfterClass
	public static void tearDownOnceForAll(){
		System.out.println("Finishing tests");
	}

	@Before
	public void setUp(){
		this.nodeRequirements = new int [] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14 };
		this.edgeRequirements = new int [][] { 
			{1, 2}, {2, 3}, {2, 6}, {3, 4}, {3, 5}, {4, 5}, {5, 2}, {6, 7}, 
			{7, 8}, {7, 11}, {8, 9}, {8, 10}, {9, 10}, {10, 7}, {11, 12}, {11, 13},
			{12, 14}, {13, 14}
		};
		this.edgePairRequirements = new int [][] {
			{1, 2, 3}, {1, 2, 6}, {2, 3, 4}, {2, 3, 5}, {2, 6, 7}, {3, 5, 2}, 
			{3, 4, 5}, {4, 5, 2}, {5, 2, 3}, {5, 2, 6}, {6, 7, 8}, {6, 7, 11}, 
			{7, 8, 9}, {7, 8, 10},  {7, 11, 12}, {7, 11, 13}, {8, 9, 10}, {8, 10, 7}, 
			{9, 10, 7}, {10, 7, 8}, {10, 7, 11}, {11, 12, 14}, {11, 13, 14}};
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
			{8,10,7,8}, {7,8,10,7}
		};
		
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

