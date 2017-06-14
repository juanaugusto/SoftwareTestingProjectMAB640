package br.ufrj.testproj.testcases.mutation.windowspecial;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import br.ufrj.testproj.window.CalculateWindow2Problem;

public class GenerateTestClass {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		// TODO Auto-generated method stub
	    PrintWriter writer = new PrintWriter("src/test/java/br/ufrj/testproj/testcases/mutation/windowspecial/AllPossibleTests.java", "UTF-8");
	    
	    writer.println("package br.ufrj.testproj.testcases.mutation.windowspecial;");
	    
	    // Imports
	    writer.println("import static org.junit.Assert.assertEquals;");
	    writer.println("import org.junit.Test;");
	    writer.println("import br.ufrj.testproj.window.CalculateWindow2Problem;");
	    
	    // Open class
	    writer.println("public class AllPossibleTests {");
	    
	    int min1 = 100;
		int max1 = 200;
		int MAXLEN = 2000;


		ArrayList<Object[]> obj = new ArrayList<>();

		for (int i = 0; i < MAXLEN; i++) {
			Object[] objsDrawn = new Object[] { ThreadLocalRandom.current().nextInt(min1, max1 + 1),
					ThreadLocalRandom.current().nextInt(min1, max1 + 1),
					ThreadLocalRandom.current().nextInt(min1, max1 + 1) };

			while (isInList(obj, objsDrawn)) {
				objsDrawn = new Object[] { ThreadLocalRandom.current().nextInt(min1, max1 + 1),
						ThreadLocalRandom.current().nextInt(min1, max1 + 1),
						ThreadLocalRandom.current().nextInt(min1, max1 + 1) };
			}
			
			writer.println("");
			writer.println("@Test");
			writer.println("public void testNumber{0}() {".replace("{0}",Integer.toString(i)));
			
			writer.println("int output = CalculateWindow2Problem.calculateWindowC2({0}, {1}, {2});".replace("{0}",Integer.toString((int) objsDrawn[0])).replace("{1}",Integer.toString((int) objsDrawn[1])).replace("{2}",Integer.toString((int) objsDrawn[2])));
			int output = CalculateWindow2Problem.calculateWindowC2((int) objsDrawn[0], (int) objsDrawn[1], (int) objsDrawn[2] );
			
			writer.println("assertEquals({0}, output);".replace("{0}", Integer.toString(output)));
			writer.println("}");

			obj.add(objsDrawn);
		}
	    
	    writer.println();
	    
	    // Close class
	    writer.println("}");
	    writer.close();

	}
	

	
	public static boolean isInList(final List<Object[]> list, final Object[] candidate) {
		return list.stream().anyMatch(a -> Arrays.equals(a, candidate));

	}

}
