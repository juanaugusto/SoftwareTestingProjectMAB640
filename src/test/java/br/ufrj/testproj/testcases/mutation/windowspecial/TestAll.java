package br.ufrj.testproj.testcases.mutation.windowspecial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufrj.testproj.window.CalculateWindow2Problem;

public class TestAll {


	@Test
	public void testNumber1() {

		int output = CalculateWindow2Problem.calculateWindowC2(100, 0, 100 );
		
		assertEquals(40000, output);
		
	}
}