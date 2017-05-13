package br.ufrj.testproj.testcases.graphcoverage.node;

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
		this.word = new char[] {'a', ' ', 'a'};

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

}
