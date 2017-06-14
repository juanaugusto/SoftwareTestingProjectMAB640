package br.ufrj.testproj.testcases.mutation.window2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufrj.testproj.window.CalculateWindow2Problem;

public class WindowTestCaseLittle {

	int p1;
	int p2;
	int p3;
	int expectOutput;

	@Test
	public void testNumber1() {
		this.p1 = 50;
		this.p2 = 210;
		this.p3 = 390;
		this.expectOutput = 6000;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);

		assertEquals(this.expectOutput, output);

	}

	@Test
	public void testNumber2() {
		this.p1 = 70;
		this.p2 = 70;
		this.p3 = 70;
		this.expectOutput = 40000;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);

		assertEquals(this.expectOutput, output);

	}

	@Test
	public void testNumber3() {
		this.p1 = 0;
		this.p2 = 0;
		this.p3 = 200;
		this.expectOutput = 0;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);

		assertEquals(this.expectOutput, output);

	}

	@Test
	public void testNumber4() {
		this.p1 = 0;
		this.p2 = 200;
		this.p3 = 400;
		this.expectOutput = 0;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);

		assertEquals(this.expectOutput, output);

	}

	@Test
	public void testNumber5() {
		this.p1 = 0;
		this.p2 = 200;
		this.p3 = 100;
		this.expectOutput = 30000;

		int output = CalculateWindow2Problem.calculateWindowC2(p1, p2, p3);

		assertEquals(this.expectOutput, output);

	}
}
