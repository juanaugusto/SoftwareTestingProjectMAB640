package br.ufrj.testproj.testcases;

import br.ufrj.testproj.principal.CalculateBankOBI;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BankOBITest {

	int C, N;
	int[] T, D;

	@Test
	public void testQualquer() {
		this.C = 3;
		this.N = 16;
		this.T = new int[] { 0,0,0,3,5,7,11,13,14,15,16,17,18,19,20,23};
		this.D = new int[] { 10,10,10,10,10,10,10,10,10,10,10,10,3,10,10,3};
		int expectResult = 2;

//		this.C = 1;
//		this.N = 5;
//		this.T = new int[] { 0,0,1,2,30};
//		this.D = new int[] { 10,10,10,10,10};
//		int expectResult = 1;

		assertEquals(expectResult, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
	}

}
