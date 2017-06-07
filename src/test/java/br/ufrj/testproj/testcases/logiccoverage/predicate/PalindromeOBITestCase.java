package br.ufrj.testproj.testcases.logiccoverage.predicate;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.ufrj.testproj.principal.calculator.CalculatePalindromeOBI;

public class PalindromeOBITestCase {
	
	char[] letras;
	String expectOutput;
	
	@Test
	public void testNumber1() {
		this.letras = new char[]{'\n'};
		
		this.expectOutput = "SIM";

		assertEquals(expectOutput,
				new CalculatePalindromeOBI().calculateWrongPalindromeForLogicCoverage(letras));
	}
	
	@Test
	public void testNumber2() {
		this.letras = new char[]{'a', 'a', ' ', 'a',  'a', '\u001a'};
		
		this.expectOutput = "NAO";

		assertEquals(expectOutput,
				new CalculatePalindromeOBI().calculateWrongPalindromeForLogicCoverage(letras));
	}

}
