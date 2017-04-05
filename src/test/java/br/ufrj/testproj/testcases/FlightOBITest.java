package br.ufrj.testproj.testcases;

import br.ufrj.testproj.principal.CalculatePlaneFlight;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FlightOBITest {

	private String pA = "00:00", pB = "00:00", cA, cB;

	// Test for duration = 0h01 and DeltaFuse = -11
	@Test
	public void testD0FNegative11() {
		this.cB = "13:01";
		this.cA = "11:01";
		int[] durationAndFuse = { 1, -11 };

		assertEquals(CalculatePlaneFlight.calculateDurationAndFuseDifference(
				pA, cB, pB, cA), durationAndFuse);
	}

	// Test for duration = 0h01 and DeltaFuse = 12
	@Test
	public void testD0F12() {
		this.cB = "12:01";
		this.cA = "12:01";
		int[] durationAndFuse = { 1, 12 };

		assertEquals(CalculatePlaneFlight.calculateDurationAndFuseDifference(
				pA, cB, pB, cA), durationAndFuse);
	}

	// Test for duration = 0h01 and DeltaFuse = 7
	@Test
	public void testD0FBetweenNegative11And12() {
		this.cB = "07:01";
		this.cA = "17:01";
		int[] durationAndFuse = { 1, 7 };

		assertEquals(CalculatePlaneFlight.calculateDurationAndFuseDifference(
				pA, cB, pB, cA), durationAndFuse);
	}

	// Test for duration = 11h59 and DeltaFuse = -11
	@Test
	public void testD719FNegative11() {
		this.cB = "00:59";
		this.cA = "23:59";
		int[] durationAndFuse = { 719, -11 };

		assertEquals(CalculatePlaneFlight.calculateDurationAndFuseDifference(
				pA, cB, pB, cA), durationAndFuse);
	}

	// Test for duration = 11h59 and DeltaFuse = 12
	@Test
	public void testD719F12() {
		this.cB = "23:59";
		this.cA = "23:59";
		int[] durationAndFuse = { 719, 12 };

		assertEquals(CalculatePlaneFlight.calculateDurationAndFuseDifference(
				pA, cB, pB, cA), durationAndFuse);
	}

	// Test for duration = 11h59 and DeltaFuse = -5
	@Test
	public void testD719FBetweenNegative11And12() {
		this.cB = "07:59";
		this.cA = "16:59";
		int[] durationAndFuse = { 710, -5 };

		assertEquals(CalculatePlaneFlight.calculateDurationAndFuseDifference(
				pA, cB, pB, cA), durationAndFuse);
	}

	// Test for duration = 10h32 and DeltaFuse = -11
	@Test
	public void testD632FNegative11() {
		this.cB = "23:32";
		this.cA = "21:32";
		int[] durationAndFuse = { 632, -11 };

		assertEquals(CalculatePlaneFlight.calculateDurationAndFuseDifference(
				pA, cB, pB, cA), durationAndFuse);
	}

	// Test for duration = 5h21 and DeltaFuse = 12
	@Test
	public void testD321F12() {
		this.cB = "17:21";
		this.cA = "17:21";
		int[] durationAndFuse = { 321, 12 };

		assertEquals(CalculatePlaneFlight.calculateDurationAndFuseDifference(
				pA, cB, pB, cA), durationAndFuse);
	}

	// Test for duration = 7h54 and DeltaFuse = 0
	@Test
	public void testD474F0() {
		this.cB = "07:54";
		this.cA = "07:54";
		int[] durationAndFuse = { 474, 0 };

		assertEquals(CalculatePlaneFlight.calculateDurationAndFuseDifference(
				pA, cB, pB, cA), durationAndFuse);
	}
}
