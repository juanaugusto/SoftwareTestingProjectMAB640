package br.ufrj.testproj.testcases.mutation.windowspecial;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import br.ufrj.testproj.window.CalculateWindow2Problem;

public class TestingPossibilities {

	@Test
	public void testNumber0() {
		int output = CalculateWindow2Problem.calculateWindowC2(0, 200, 400);
		
		assertEquals(0, output);
	}
}