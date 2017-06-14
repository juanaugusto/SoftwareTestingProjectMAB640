package br.ufrj.testproj.testcases.mutation.window1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufrj.testproj.window.CalculateWindow1Problem;

public class WindowTestCaseBig {
	
	int p1;
	int p2;
	int p3;
	int expectOutput;

	@Test
	public void testNumber1() {
		this.p1 = 400;
		this.p2 = 0;
		this.p3 = 0;
		this.expectOutput = 20000;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}

	
	@Test
	public void testNumber2() {
		this.p1 = 400;
		this.p2 = 0;
		this.p3 = 100;
		this.expectOutput = 10000;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}
	
	@Test
	public void testNumber3() {
		this.p1 = 400;
		this.p2 = 0;
		this.p3 = 200;
		this.expectOutput = 0;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}
	
	@Test
	public void testNumber4() {
		this.p1 = 400;
		this.p2 = 0;
		this.p3 = 400;
		this.expectOutput = 20000;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}
	
	@Test
	public void testNumber5() {
		this.p1 = 0;
		this.p2 = 200;
		this.p3 = 400;
		this.expectOutput = 0;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}
	
	@Test
	public void testNumber6() {
		this.p1 = 100;
		this.p2 = 0;
		this.p3 = 0;
		this.expectOutput = 30000;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}

	
	@Test
	public void testNumber7() {
		this.p1 = 100;
		this.p2 = 0;
		this.p3 = 100;
		this.expectOutput = 30000;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}
	
	@Test
	public void testNumber8() {
		this.p1 = 100;
		this.p2 = 0;
		this.p3 = 200;
		this.expectOutput = 20000;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}
	
	@Test
	public void testNumber9() {
		this.p1 = 100;
		this.p2 = 0;
		this.p3 = 400;
		this.expectOutput = 10000;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}
	
	@Test
	public void testNumber10() {
		this.p1 = 100;
		this.p2 = 100;
		this.p3 = 0;
		this.expectOutput = 30000;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}
	
	@Test
	public void testNumber11() {
		this.p1 = 200;
		this.p2 = 0;
		this.p3 = 0;
		this.expectOutput = 20000;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}

	
	@Test
	public void testNumber12() {
		this.p1 = 200;
		this.p2 = 0;
		this.p3 = 100;
		this.expectOutput = 20000;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}
	
	@Test
	public void testNumber13() {
		this.p1 = 200;
		this.p2 = 0;
		this.p3 = 200;
		this.expectOutput = 20000;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}
	
	@Test
	public void testNumber14() {
		this.p1 = 200;
		this.p2 = 0;
		this.p3 = 400;
		this.expectOutput = 0;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}
	
	@Test
	public void testNumber15() {
		this.p1 = 200;
		this.p2 = 100;
		this.p3 = 0;
		this.expectOutput = 20000;

		assertEquals(expectOutput, CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3));
	}

}
