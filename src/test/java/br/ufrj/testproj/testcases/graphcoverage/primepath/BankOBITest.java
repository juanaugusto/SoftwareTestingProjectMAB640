package br.ufrj.testproj.testcases.graphcoverage.primepath;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.ufrj.testproj.principal.CalculateBankOBI;

public class BankOBITest {

	int N;
	int C;
	int[] T;
	int[] D;
	int expectedResponse;

	@Test
	public void testPathNumber2() {
		//Infeasible Path
	}

	@Test
	public void testPathNumber3() {
		//Infeasible Path
	}

	@Test
	public void testPathNumber5() {
		this.N = 4;
		this.C = 6;
		this.T = {2, 5, 13, 23};
		this.D = {6, 3, 5, 9};

		this.expectedResponse = 0;
		assertEquals(this.expectedResponse, CalculateBankOBI.calculateWrongBank(C, N, T, D));
	}

	@Test
	public void testPathNumber6() {
		//Infeasible Path
	}
}
