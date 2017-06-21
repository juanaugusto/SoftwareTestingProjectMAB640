package br.ufrj.testproj.testcases.mutation.window2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufrj.testproj.window.CalculateWindow2Problem;

public class WindowTestCaseCompleteMutantsCoverage {

	int p1;
	int p2;
	int p3;
	int expectOutput;
	
	// Testes do conjunto grande

	@Test
	public void testNumber4() {
		this.p1 = 400;
		this.p2 = 0;
		this.p3 = 400;
		this.expectOutput = 40000;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);
		assertEquals(this.expectOutput, output);
	}

	@Test
	public void testNumber5() {
		this.p1 = 0;
		this.p2 = 200;
		this.p3 = 400;
		this.expectOutput = 0;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);
		assertEquals(this.expectOutput, output);
	}

	@Test
	public void testNumber9() {
		this.p1 = 100;
		this.p2 = 0;
		this.p3 = 400;
		this.expectOutput = 30000;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);
		assertEquals(this.expectOutput, output);
	}
	
	@Test
	public void testNumber14() {
		this.p1 = 200;
		this.p2 = 0;
		this.p3 = 400;
		this.expectOutput = 40000;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);
		assertEquals(this.expectOutput, output);
	}
	
	// Testes a mais
	
	@Test
	public void testNumber2173() {
		int output = CalculateWindow2Problem.calculateWindowC2(170, 370, 384);
		assertEquals(0, output);
	}
	
	@Test
	public void testNumber1720() {
		int output = CalculateWindow2Problem.calculateWindowC2(37, 99, 299);
		assertEquals(0, output);
	}
	
	@Test
	public void testNumber1200() {
		int output = CalculateWindow2Problem.calculateWindowC2(26, 177, 318);
		assertEquals(10800, output);
	}
	
	@Test
	public void testNumber1068() {
		int output = CalculateWindow2Problem.calculateWindowC2(29, 239, 252);
		assertEquals(18700, output);
	}
	
	@Test
	public void testNumber1266() {
		int output = CalculateWindow2Problem.calculateWindowC2(105, 138, 393);
		assertEquals(16700, output);
	}
	
	@Test
	public void testNumberX1() {
		int output = CalculateWindow2Problem.calculateWindowC2( 139, 339, 341);
		assertEquals(0, output);
	}
	
	
	
//	@Test
//	public void testNumberX(){
//		int output = CalculateWindow2Problem.calculateWindowC2(400, 200, 0);
//		
//		assertEquals(80000, output);
//
//	}

}
