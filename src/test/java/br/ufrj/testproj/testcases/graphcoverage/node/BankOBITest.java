package br.ufrj.testproj.testcases.graphcoverage.node;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.ufrj.testproj.principal.calculator.CalculateBankOBI;

public class BankOBITest {

	int C, N;
	int[] T, D;
	int expectNumberClientsWait;

	@Test
	public void testPathNumber1() {
		this.C = 1;
		this.N = 1;
		this.T = new int[] { 0 };
		this.D = new int[] { 1 };

		this.expectNumberClientsWait = 0;

		assertEquals(expectNumberClientsWait,
				new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue());
	}

	@Test
	public void testPathNumber2() {
		this.C = 1;
		this.N = 10;
		this.T = new int[] { 0, 5, 10, 15, 20, 25, 30, 30, 30, 30 };
		this.D = new int[] { 4, 5, 6, 6, 5, 4, 10, 10, 10, 10 };

		this.expectNumberClientsWait = 2;

		assertEquals(expectNumberClientsWait,
				new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue());
	}

}
