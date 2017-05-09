package br.ufrj.testproj.testcases.graphcoverage.edgepair;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.ufrj.testproj.principal.CalculatePalindromeOBI;

public class PalindromeOBITestCase {

	char[] word;
	String expectedResponse;

	@Test
	public void testPathNumber1() {
		//Infeasible Path	
	}

	@Test
	public void testPathNumber2() {
		//Infeasible Path
		
	}
	
	@Test
	public void testPathNumber3() {
		this.word = new char[] {'a', ' '};

		this.expectedResponse = "NAO";
		assertEquals(this.expectedResponse, CalculatePalindromeOBI.calculateWrongPalindrome(word));
	}
	
}

