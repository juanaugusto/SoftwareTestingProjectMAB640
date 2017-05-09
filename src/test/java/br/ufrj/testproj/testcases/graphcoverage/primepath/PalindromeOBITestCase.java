package br.ufrj.testproj.testcases.graphcoverage.primepath;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.ufrj.testproj.principal.CalculatePalindromeOBI;

public class PalindromeOBITestCase {

	char[] word;
	String expectedResponse;

	@Test
	public void testPathNumber1() {
		//Infeasible path	
	
	}
	
	@Test
	public void testPathNumber2() {
		//Infeasible path
	
	}

	@Test
	public void testPathNumber3() {
		//Infeasible path
		
	}
	
	@Test
	public void testPathNumber4() {
		this.word = new char[] {' '};

		this.expectedResponse = "SIM";
		//assertEquals(this.expectedResponse, CalculatePalindromeOBI.calculateWrongPalindrome(word));
	}
	
	@Test
	public void testPathNumber5() {
		//Infeasible path
	}
	
	@Test
	public void testPathNumber6() {
		//Infeasible path
		
	}
	
	@Test
	public void testPathNumber7() {
		//Infeasible path
		
	}
	
	@Test
	public void testPathNumber8() {
		this.word = new char[] {};

		this.expectedResponse = "NAO";
		//assertEquals(this.expectedResponse, CalculatePalindromeOBI.calculateWrongPalindrome(word));
	}
	
	@Test
	public void testPathNumber9() {
		//Infeasible path
		
	}
	
	@Test
	public void testPathNumber10() {
		//Infeasible path
		
	}
	
	@Test
	public void testPathNumber11() {
		//Infeasible path
		
	}
	
	@Test
	public void testPathNumber12() {
		this.word = new char[] {'a'};

		this.expectedResponse = "SIM";
		assertEquals(this.expectedResponse, CalculatePalindromeOBI.calculateWrongPalindrome(word));
	}
	
	@Test
	public void testPathNumber13() {
		//Infeasible path
		
	}
	
	
}



