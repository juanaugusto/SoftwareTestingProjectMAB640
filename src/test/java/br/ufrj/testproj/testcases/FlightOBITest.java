package br.ufrj.testproj.testcases;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import br.ufrj.testproj.principal.calculator.CalculatePlaneFlight;

public class FlightOBITest {

	private String pA, pB, cA, cB;

	// Test for duration = 0h01 and DeltaFuse = -11
	@Test
	public void testD0FNegative11() {
		this.pA = "11:00";
		this.cB = "00:01";
		this.pB = "00:00";
		this.cA = "11:01";
		int[] durationAndFuse = { 1, -11 };

		assertArrayEquals(durationAndFuse,
				CalculatePlaneFlight.calculateWrongDurationAndFuseDifference(pA, cB, pB, cA));
	}

	// Test for duration = 0h01 and DeltaFuse = 12
	@Test
	public void testD0F12() {
		this.pA = "00:00";
		this.cB = "12:01";
		this.pB = "12:00";
		this.cA = "00:01";
		int[] durationAndFuse = { 1, 12 };

		assertArrayEquals(durationAndFuse,
				CalculatePlaneFlight.calculateWrongDurationAndFuseDifference(pA, cB, pB, cA));
	}

	// Test for duration = 0h01 and DeltaFuse = 7
	@Test
	public void testD0FBetweenNegative11And12() {
		this.pA = "00:00";
		this.cB = "07:01";
		this.pB = "07:00";
		this.cA = "00:01";
		int[] durationAndFuse = { 1, 7 };

		assertArrayEquals(durationAndFuse,
				CalculatePlaneFlight.calculateWrongDurationAndFuseDifference(pA, cB, pB, cA));
	}

	// Test for duration = 11h59 and DeltaFuse = -11
	@Test
	public void testD719FNegative11() {
		this.pA = "11:00";
		this.cB = "11:59";
		this.pB = "00:00";
		this.cA = "22:59";
		int[] durationAndFuse = { 719, -11 };

		assertArrayEquals(durationAndFuse,
				CalculatePlaneFlight.calculateWrongDurationAndFuseDifference(pA, cB, pB, cA));
	}

	// Test for duration = 11h59 and DeltaFuse = 12
	@Test
	public void testD719F12() {
		this.pA = "00:00";
		this.cB = "23:59";
		this.pB = "12:00";
		this.cA = "11:59";
		int[] durationAndFuse = { 719, 12 };

		assertArrayEquals(durationAndFuse,
				CalculatePlaneFlight.calculateWrongDurationAndFuseDifference(pA, cB, pB, cA));
	}

	// Test for duration = 11h59 and DeltaFuse = -5
	@Test
	public void testD719FBetweenNegative11And12() {
		this.pA = "15:00";
		this.cB = "21:59";
		this.pB = "10:00";
		this.cA = "02:59";
		int[] durationAndFuse = { 719, -5 };

		assertArrayEquals(durationAndFuse,
				CalculatePlaneFlight.calculateWrongDurationAndFuseDifference(pA, cB, pB, cA));
	}

	// Test for duration = 10h32 and DeltaFuse = -11
	@Test
	public void testD632FNegative11() {
		this.pA = "20:00";
		this.cB = "19:32";
		this.pB = "09:00";
		this.cA = "06:32";
		int[] durationAndFuse = { 632, -11 };

		assertArrayEquals(durationAndFuse,
				CalculatePlaneFlight.calculateWrongDurationAndFuseDifference(pA, cB, pB, cA));
	}

	// Test for duration = 5h21 and DeltaFuse = 12
	@Test
	public void testD321F12() {
		this.pA = "05:00";
		this.cB = "22:21";
		this.pB = "17:00";
		this.cA = "10:21";
		int[] durationAndFuse = { 321, 12 };

		assertArrayEquals(durationAndFuse,
				CalculatePlaneFlight.calculateWrongDurationAndFuseDifference(pA, cB, pB, cA));
	}

	// Test for duration = 7h54 and DeltaFuse = 0
	@Test
	public void testD474F0() {
		this.pA = "13:00";
		this.cB = "20:54";
		this.pB = "14:00";
		this.cA = "21:54";
		int[] durationAndFuse = { 474, 0 };

		assertArrayEquals(durationAndFuse,
				CalculatePlaneFlight.calculateWrongDurationAndFuseDifference(pA, cB, pB, cA));
	}
}
