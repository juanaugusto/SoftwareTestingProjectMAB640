package br.ufrj.testproj.testcases.graphcoverage.primepath;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.ufrj.testproj.principal.CalculatePalindromeOBI;

public class PalindromeOBITestCase {

	char[] word;
	String expectedResponse;

	@Before
	public void setUp(){
		
	}
	
	@After
	public void tearDown(){
	
	}
	
	@Test
	public void testPathNumber1() {
		this.word = new char[] {'a', 'b', 'b', 'b', 'a', 'a'};

		this.expectedResponse = "NAO";
		assertEquals(
				this.expectedResponse, 
				CalculatePalindromeOBI.calculateWrongPalindrome(word)
		);
	
	}	

	@Test
	public void testPathNumber2() {
		this.word = new char[] {'b', 'y', 'b', 'y', 'b', 'y', 'a', 'c', ' '};

		this.expectedResponse = "NAO";
		assertEquals(
				this.expectedResponse, 
				CalculatePalindromeOBI.calculateWrongPalindrome(word)
		);
	
	}
	
	@Test
	public void testPathNumber3() {
		this.word = new char[] {'a', 'a', ' ', 'a', 'a'};

		this.expectedResponse = "SIM";
		assertEquals(
				this.expectedResponse, 
				CalculatePalindromeOBI.calculateWrongPalindrome(word)
		);
	
	}

	@Test
	public void testPathNumber4() {
		this.word = new char[] {' ', 'a', ' ','a', ' '};

		this.expectedResponse = "SIM";
		assertEquals(
				this.expectedResponse, 
				CalculatePalindromeOBI.calculateWrongPalindrome(word)
		);
	
	}
	
	@Test
	public void testPathNumber5() {
		this.word = new char[] {'b', 'x'};

		this.expectedResponse = "NAO";
		assertEquals(
				this.expectedResponse, 
				CalculatePalindromeOBI.calculateWrongPalindrome(word)
		);
	
	}
	
	@Test
	public void testPathNumber6() {
		this.word = new char[] {'a'};

		this.expectedResponse = "SIM";
		assertEquals(
				this.expectedResponse, 
				CalculatePalindromeOBI.calculateWrongPalindrome(word)
		);
	
	}
	
	@Test
	public void testPathNumber7() {
		this.word = new char[] {};

		this.expectedResponse = "SIM";
		assertEquals(
				this.expectedResponse, 
				CalculatePalindromeOBI.calculateWrongPalindrome(word)
		);
	
	}
	
	@Test
	public void testPathNumber8() {
		this.word = new char[] {' '};

		this.expectedResponse = "SIM";
		assertEquals(
				this.expectedResponse, 
				CalculatePalindromeOBI.calculateWrongPalindrome(word)
		);
	
	}
}

