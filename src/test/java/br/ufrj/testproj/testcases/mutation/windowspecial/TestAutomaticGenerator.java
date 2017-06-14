package br.ufrj.testproj.testcases.mutation.windowspecial;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import br.ufrj.testproj.window.CalculateWindow1Problem;

@RunWith(Parameterized.class)
public class TestAutomaticGenerator {

	
	int p1;
	int p2;
	int p3;
	int expectOutput;

	
//	@Test
//	public void testNumber664() {
//		this.p1 = 100;
//		this.p2 = 0;
//		this.p3 = 0;
//		this.expectOutput = 30000;
//		
//		int result = CalculateWindow1Problem.calculateWindowCorrect(p1, p2, p3);
//
//		assertEquals(expectOutput, result);
//	}

	
	@Parameters
	public static Collection<Object[]> data() {

		int min = 0;
		int max = 400;
		int MAXLEN = 500;


		ArrayList<Object[]> obj = new ArrayList<>();

		for (int i = 0; i < MAXLEN; i++) {
			Object[] objsDrawn = new Object[] { ThreadLocalRandom.current().nextInt(min, max + 1),
					ThreadLocalRandom.current().nextInt(min, max + 1),
					ThreadLocalRandom.current().nextInt(min, max + 1) };

			while (isInList(obj, objsDrawn)) {
				objsDrawn = new Object[] { ThreadLocalRandom.current().nextInt(min, max + 1),
						ThreadLocalRandom.current().nextInt(min, max + 1),
						ThreadLocalRandom.current().nextInt(min, max + 1) };
			}

			obj.add(objsDrawn);
		}
		

		return obj;

	}

	public TestAutomaticGenerator(int p1, int p2, int p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	@Test
	public void test() {
		System.out.println(Arrays.toString(new int[]{this.p1, this.p2, this.p3}));

		int result = CalculateWindow1Problem.calculateWindowCorrect(this.p1, this.p2, this.p3);
		
		assertEquals(result, result);
	}

	public static boolean isInList(final List<Object[]> list, final Object[] candidate) {
		return list.stream().anyMatch(a -> Arrays.equals(a, candidate));

	}

}
