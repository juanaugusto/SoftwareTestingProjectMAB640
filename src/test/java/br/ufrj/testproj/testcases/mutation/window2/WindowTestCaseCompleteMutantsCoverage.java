package br.ufrj.testproj.testcases.mutation.window2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufrj.testproj.window.CalculateWindow2Problem;

public class WindowTestCaseCompleteMutantsCoverage {

	int p1;
	int p2;
	int p3;
	int expectOutput;
	
	// Tests from the large set

	@Test
	public void testNumber1() {
		this.p1 = 400;
		this.p2 = 0;
		this.p3 = 400;
		this.expectOutput = 40000;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);
		assertEquals(this.expectOutput, output);
	}

	@Test
	public void testNumber2() {
		this.p1 = 0;
		this.p2 = 200;
		this.p3 = 400;
		this.expectOutput = 0;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);
		assertEquals(this.expectOutput, output);
	}

	@Test
	public void testNumber3() {
		this.p1 = 100;
		this.p2 = 0;
		this.p3 = 400;
		this.expectOutput = 30000;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);
		assertEquals(this.expectOutput, output);
	}
	
	@Test
	public void testNumber4() {
		this.p1 = 200;
		this.p2 = 0;
		this.p3 = 400;
		this.expectOutput = 40000;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);
		assertEquals(this.expectOutput, output);
	}
	
	// New Tests
	
	@Test
	public void testNumber5() {
		int output = CalculateWindow2Problem.calculateWindowC2(170, 370, 384);
		assertEquals(0, output);
	}
	
	@Test
	public void testNumber6() {
		int output = CalculateWindow2Problem.calculateWindowC2(37, 99, 299);
		assertEquals(0, output);
	}
	
	@Test
	public void testNumber7() {
		int output = CalculateWindow2Problem.calculateWindowC2(26, 177, 318);
		assertEquals(10800, output);
	}
	
	@Test
	public void testNumber8() {
		int output = CalculateWindow2Problem.calculateWindowC2(29, 239, 252);
		assertEquals(18700, output);
	}
	
	@Test
	public void testNumber9() {
		int output = CalculateWindow2Problem.calculateWindowC2(105, 138, 393);
		assertEquals(16700, output);
	}
	
}
