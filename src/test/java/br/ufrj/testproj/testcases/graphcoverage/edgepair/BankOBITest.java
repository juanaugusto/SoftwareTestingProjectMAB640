package br.ufrj.testproj.testcases.graphcoverage.edgepair;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.ufrj.testproj.principal.CalculateBankOBI;

public class BankOBITest {
	int C, N;
	int[] T, D;
	int expectNumberClientsWait;
	
	@Test
	public void testPathNumber1(){
		this.C = 2;
		this.N = 2;
		this.T = new int[] { 0,0 };
		this.D = new int[] { 1,1 };

		this.expectNumberClientsWait = 0;

		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
		
	}
	
	@Test
	public void testPathNumber2(){
		this.C = 1;
		this.N = 10;
		this.T = new int[] { 0,5,10,15,20,25,30,30,30,30 };
		this.D = new int[] { 1,2,3,4,5,6,7,8,9,10 };

		this.expectNumberClientsWait = 1;

		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
		
	}
	

	@Test
	public void testPathNumber3(){
		this.C = 3;
		this.N = 10;
		this.T = new int[] { 0,3,6,9,12,15,18,21,24,27 };
		this.D = new int[] { 9,9,9,9,9,9,9,9,9,9 };

		this.expectNumberClientsWait = 0;
		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
				
	}
	
	@Test
	public void testPathNumber4(){
		this.C = 3;
		this.N = 4;
		this.T = new int[] { 0,2,4,4 };
		this.D = new int[] { 3,1,1,1 };

		this.expectNumberClientsWait = 0;

		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
					
	}
	
	@Test
	public void testPathNumber5(){
		this.C = 3;
		this.N = 4;
		this.T = new int[] { 0,2,4,4 };
		this.D = new int[] { 3,3,3,1 };

		this.expectNumberClientsWait = 0;

		assertEquals(
			expectNumberClientsWait, 
			new CalculateBankOBI().calculateWrongBank(this.C, this.N, this.T, this.D).getReturnedValue()
		);
		
	}
	
	
}
