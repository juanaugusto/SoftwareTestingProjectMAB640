package br.ufrj.testproj.testcases.graphcoverage.edgepair;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.ufrj.testproj.principal.calculator.CalculatePalindromeOBI;

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
		this.word = new char[] {'a', 'a', ' ', 'a', 'a'};

		this.expectedResponse = "SIM";
		assertEquals(
				this.expectedResponse, 
				new CalculatePalindromeOBI().calculateWrongPalindrome(word).getReturnedValue()
		);
	
	}	

	@Test
	public void testPathNumber2() {
		this.word = new char[] {'b', 'x'};

		this.expectedResponse = "NAO";
		assertEquals(
				this.expectedResponse, 
				new CalculatePalindromeOBI().calculateWrongPalindrome(word).getReturnedValue()
		);
	
	}
	
	@Test
	public void testPathNumber3() {
		this.word = new char[] {};

		this.expectedResponse = "SIM";
		assertEquals(
				this.expectedResponse, 
				new CalculatePalindromeOBI().calculateWrongPalindrome(word).getReturnedValue()
		);
	
	}

}

