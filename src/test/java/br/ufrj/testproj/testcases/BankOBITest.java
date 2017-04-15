package br.ufrj.testproj.testcases;

import br.ufrj.testproj.principal.CalculateBankOBI;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BankOBITest {

	int C, N;
	int[] T, D;
	int expectNumberClientsWait;

	@Test
	public void testA1B1C1D1() {

		this.C = 1;
		this.N = 1;
		this.T = new int[] { 0 };
		this.D = new int[] { 1 };

		this.expectNumberClientsWait = 0;

		assertEquals(expectNumberClientsWait, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
	}

	@Test
	public void testA1B2C2D2() {

		this.C = 1;
		this.N = 10;
		this.T = new int[] { 300, 300, 300, 300, 300, 300, 300, 300, 300, 300 };
		this.D = new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		this.expectNumberClientsWait = 7;

		assertEquals(expectNumberClientsWait, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
	}

	@Test
	public void testA1B3C3D3() {

		this.C = 1;
		this.N = 5;
		this.T = new int[] { 1, 2, 30, 299, 299 };
		this.D = new int[] { 2, 7, 5, 3, 9 };

		this.expectNumberClientsWait = 0;
		assertEquals(expectNumberClientsWait, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
	}

	@Test
	public void testA2B1C1D2() {

		this.C = 10;
		this.N = 1;
		this.T = new int[] { 0 };
		this.D = new int[] { 10 };

		this.expectNumberClientsWait = 0;
		assertEquals(expectNumberClientsWait, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
	}

	@Test
	public void testA2B2C2D3() {

		this.C = 10;
		this.N = 10;
		this.T = new int[] { 300, 300, 300, 300, 300, 300, 300, 300, 300, 300 };
		this.D = new int[] { 2, 9, 5, 2, 6, 5, 9, 4, 3, 6 };

		this.expectNumberClientsWait = 0;

		assertEquals(expectNumberClientsWait, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
	}

	@Test
	public void testA2B3C3D1() {

		this.C = 10;
		this.N = 5;
		this.T = new int[] { 1, 10, 20, 100, 299 };
		this.D = new int[] { 1, 1, 1, 1, 1 };

		this.expectNumberClientsWait = 0;

		assertEquals(expectNumberClientsWait, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
	}

	@Test
	public void testA3B1C1D3() {

		this.C = 8;
		this.N = 1;
		this.T = new int[] { 0 };
		this.D = new int[] { 7 };

		this.expectNumberClientsWait = 0;

		assertEquals(expectNumberClientsWait, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
	}

	@Test
	public void testA3B2C2D1() {

		this.C = 2;
		this.N = 10;
		this.T = new int[] { 300, 300, 300, 300, 300, 300, 300, 300, 300, 300 };
		this.D = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		this.expectNumberClientsWait = 0;

		assertEquals(expectNumberClientsWait, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
	}

	@Test
	public void testA3B3C3D2() {

		this.C = 2;
		this.N = 9;
		this.T = new int[] { 1, 8, 291, 292, 293, 294, 297, 298, 299 };
		this.D = new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		this.expectNumberClientsWait = 1;

		assertEquals(expectNumberClientsWait, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
	}

}
