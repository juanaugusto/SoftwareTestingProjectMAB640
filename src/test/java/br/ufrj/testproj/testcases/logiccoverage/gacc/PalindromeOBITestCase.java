package br.ufrj.testproj.testcases.logiccoverage.gacc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.ufrj.testproj.principal.calculator.CalculatePalindromeOBI;

public class PalindromeOBITestCase {
	
	char[] letras;
	String expectOutput;
	
	@Test
	public void testNumber1() {
		this.letras = new char[] { 'x', 'a', 'a', 'a', 'z', 'a', 'z', ' ', 'a', 'x', 'a','a', 'a','a', 'a', '\u001a' };
		
		this.expectOutput = "NAO";

		assertEquals(expectOutput,
				new CalculatePalindromeOBI().calculateWrongPalindromeForLogicCoverage(letras));
	}
	
	@Test
	public void testNumber2() {
		this.letras = new char[]{'x', 'x', 'x', ' ', 'x',  'x', 'x', '\u001a'};
		
		this.expectOutput = "SIM";

		assertEquals(expectOutput,
				new CalculatePalindromeOBI().calculateWrongPalindromeForLogicCoverage(letras));
	}

	@Test
	public void testNumber3() {
		this.letras = new char[]{'y', 'x', 'x', 'x', 'x',  'x', 'y', '\n'};
		
		this.expectOutput = "SIM";

		assertEquals(expectOutput,
				new CalculatePalindromeOBI().calculateWrongPalindromeForLogicCoverage(letras));
	}
	
	
}
