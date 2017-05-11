package br.ufrj.testproj.testcases.graphcoverage.node;

import br.ufrj.testproj.principal.CalculateBankOBI;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BankOBITest {

	int C, N;
	int[] T, D;
	int expectNumberClientsWait;
	
	@Test
	public void testPathNumber1(){
		this.C = 1;
		this.N = 1;
		this.T = new int[] { 0 };
		this.D = new int[] { 1 };

		this.expectNumberClientsWait = 0;

		//assertEquals(expectNumberClientsWait, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
		
	}
	
	@Test
	public void testPathNumber2(){
		//Infeasible path
				
	}
	
	@Test
	public void testPathNumber3(){
		//Infeasible path
				
	}

	@Test
	public void testPathNumber4(){
		//Infeasible path
		this.C = 1;
		this.N = 2;
		this.T = new int[] { 0, 0 };
		this.D = new int[] { 3, 3 };

		this.expectNumberClientsWait = 0;

		assertEquals(expectNumberClientsWait, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
		
	}

	@Test
	public void testNoBAK() {

//		this.C = 1;
//		this.N = 1;
//		this.T = new int[] { 0 };
//		this.D = new int[] { 1 };
//
//		this.expectNumberClientsWait = 0;
//
//		assertEquals(expectNumberClientsWait, CalculateBankOBI.calculateWrongBank(this.C, this.N, this.T, this.D));
	}

}

