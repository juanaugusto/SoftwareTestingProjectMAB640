package br.ufrj.testproj.testcases.logiccoverage.clause;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.ufrj.testproj.principal.calculator.CalculatePalindromeOBI;

public class PalindromeOBITestCase {
	
	char[] letras;
	String expectOutput;
	
	@Test
	public void testNumber1() {
		this.letras = new char[]{'a', 'i', 'b','o', 'f', 'o', 'b', 'i', 'a', '\n'};
		
		this.expectOutput = "SIM";

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
		this.letras = new char[]{'b', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'b', '\u001a'};
		
		this.expectOutput = "SIM";

		assertEquals(expectOutput,
				new CalculatePalindromeOBI().calculateWrongPalindromeForLogicCoverage(letras));
	}
	
	@Test
	public void testNumber4() {
		this.letras = new char[]{ '\n'};
		
		this.expectOutput = "SIM";

		assertEquals(expectOutput,
				new CalculatePalindromeOBI().calculateWrongPalindromeForLogicCoverage(letras));
	}
}
