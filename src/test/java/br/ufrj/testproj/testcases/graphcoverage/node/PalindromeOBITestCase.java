package br.ufrj.testproj.testcases.graphcoverage.node;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.ufrj.testproj.principal.CalculatePalindromeOBI;

public class PalindromeOBITestCase {

	char[] word;
	String expectedResponse;

	@Test
	public void testPathNumber1() {
		this.word = new char[] {};

		this.expectedResponse = "SIM";
		assertEquals(this.expectedResponse, CalculatePalindromeOBI.calculateWrongPalindrome(word));
	}

	@Test
	public void testPathNumber2() {
		this.word = new char[] {'a'};

		this.expectedResponse = "SIM";
		assertEquals(this.expectedResponse, CalculatePalindromeOBI.calculateWrongPalindrome(word));
	}
	
	@Test
	public void testPathNumber3() {
		//Infeasible path
	}

}
