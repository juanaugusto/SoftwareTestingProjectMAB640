package br.ufrj.testproj.testcases;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.ufrj.testproj.principal.calculator.CalculateBankOBI;

public class BankOBITestCase {

	int C, N;
	int[] T, D;
	int expectNumberClientsWait;

	@Test
	public void testNo1() {

		this.C = 1;
		this.N = 1;
		this.T = new int[] { 0 };
		this.D = new int[] { 1 };

		this.expectNumberClientsWait = 0;

		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
	}

	@Test
	public void testNo2() {

		this.C = 10;
		this.N = 10;
		this.T = new int[] { 0,0,0,0,0,150,300,300,300,300 };
		this.D = new int[] {  8,9,9,9,9,8,9,9,9,9};

		this.expectNumberClientsWait = 0;

		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
	}

	@Test
	public void testNo3() {

		this.C = 1;
		this.N = 10;
		this.T = new int[] { 0,0,0,0,0,0,0,0,0,0 };
		this.D = new int[] { 1,8,9,10,9,8,7,9,10,1 };

		this.expectNumberClientsWait = 6;
		
		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
	}

	@Test
	public void testNo4() {

		this.C = 9;
		this.N = 1;
		this.T = new int[] { 150 };
		this.D = new int[] { 1 };

		this.expectNumberClientsWait = 0;
		
		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
	}

	@Test
	public void testNo5() {

		this.C = 1;
		this.N = 10;
		this.T = new int[] { 150,150,150,150,150,291,292,293,294,295 };
		this.D = new int[] { 1,1,1,1,1,1,1,1,1,1 };

		this.expectNumberClientsWait = 0;
		
		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
	}

	@Test
	public void testNo6() {
		this.C = 5;
		this.N = 1;
		this.T = new int[] { 0 };
		this.D = new int[] {  5};

		this.expectNumberClientsWait = 0;

		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
	}

	@Test
	public void testNo7() {

		this.C = 1;
		this.N = 10;
		this.T = new int[] { 0,30,30,90,90,91,91,92,93,99 };
		this.D = new int[] { 9,9,9,9,1,9,9,9,9,9 };

		this.expectNumberClientsWait = 3;
		
		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
	}

	@Test
	public void testNo8() {

		this.C = 10;
		this.N = 1;
		this.T = new int[] { 0 };
		this.D = new int[] { 1 };

		this.expectNumberClientsWait = 0;

		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
	}


}
