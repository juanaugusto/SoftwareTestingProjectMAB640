package br.ufrj.testproj.testcases.graphcoverage.primepath;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.ufrj.testproj.principal.calculator.CalculateBankOBI;

public class BankOBITestCase {

	int N;
	int C;
	int[] T;
	int[] D;
	int expectNumberClientsWait;

	@Test
	public void testPathNumber1() {
		this.N = 4;
		this.C = 6;
		this.T = new int[] { 2, 5, 13, 23 };
		this.D = new int[] { 6, 3, 5, 9 };

		this.expectNumberClientsWait = 0;
		assertEquals(expectNumberClientsWait,
				new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue());
	}

}
