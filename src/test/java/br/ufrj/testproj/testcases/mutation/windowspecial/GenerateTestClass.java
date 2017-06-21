package br.ufrj.testproj.testcases.mutation.windowspecial;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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

//		for (int i = 0; i < MAXLEN; i++) {
//			Object[] objsDrawn = new Object[] { ThreadLocalRandom.current().nextInt(min1, max1 + 1),
//					ThreadLocalRandom.current().nextInt(min1, max1 + 1),
//					ThreadLocalRandom.current().nextInt(min1, max1 + 1) };
//
//			while (isInList(obj, objsDrawn)) {
//				objsDrawn = new Object[] { ThreadLocalRandom.current().nextInt(min1, max1 + 1),
//						ThreadLocalRandom.current().nextInt(min1, max1 + 1),
//						ThreadLocalRandom.current().nextInt(min1, max1 + 1) };
//			}
//			
//			writer.println("");
//			writer.println("@Test");
//			writer.println("public void testNumber{0}() {".replace("{0}",Integer.toString(i)));
//			
//			writer.println("int output = CalculateWindow2Problem.calculateWindowC2({0}, {1}, {2});".replace("{0}",Integer.toString((int) objsDrawn[0])).replace("{1}",Integer.toString((int) objsDrawn[1])).replace("{2}",Integer.toString((int) objsDrawn[2])));
//			int output = CalculateWindow2Problem.calculateWindowC2((int) objsDrawn[0], (int) objsDrawn[1], (int) objsDrawn[2] );
//			
//			writer.println("assertEquals({0}, output);".replace("{0}", Integer.toString(output)));
//			writer.println("}");
//
//			obj.add(objsDrawn);
//		}
		int limit = 400;
		int contador = 0;
		boolean gera = false;
		
		Random r = new Random();
		for (int p1 = 0; p1 < limit + 1; p1++){
			for (int p2 = 0; p2 < limit + 1; p2++){
				for (int p3 = 0; p3 < limit + 1; p3++){

					if( (p2 - p1 < 200 && p3 - p2 > 200) &&  
						!(p2 - p1 <= 200 && p3 - p2 >= 200)){
						gera = true;
					}
					
					if( (p3 - p2 < 200 && p2 - p1 > 200) &&  
						!(p3 - p2 <= 200 && p2 - p1 >= 200)){
						gera = true;
					}
					
					if( !(p2 - p1 < 200 && p3 - p2 > 200) &&  
							(p2 - p1 <= 200 && p3 - p2 >= 200)){
							System.out.println("#1 - Orig=False and Mod=True: " + 
						                   p1+"-"+p2+"-"+p3);
						
						gera = true;

							
					}
					
					if( !(p3 - p2 < 200 && p2 - p1 > 200) &&  
						(p3 - p2 <= 200 && p2 - p1 >= 200)){
						System.out.println("#2 - Orig=False and Mod=True: " + 
						                   p1+"-"+p2+"-"+p3);
						gera = true;
				
					}
					boolean continua =  r.nextBoolean();
					if (gera && continua && contador <= 1000){
						writer.println("");
						writer.println("@Test");
						writer.println("public void testNumber{0}() {".replace("{0}",Integer.toString(contador)));
						
						writer.println("int output = CalculateWindow2Problem.calculateWindowC2({0}, {1}, {2});".replace("{0}",Integer.toString(p1)).replace("{1}",Integer.toString(p2)).replace("{2}",Integer.toString(p3)));
						int output = CalculateWindow2Problem.calculateWindowC2( p1, p2, p3 );
						
						writer.println("assertEquals({0}, output);".replace("{0}", Integer.toString(output)));
						writer.println("}");
						contador++;

					}
					
					gera = false;
				}
				
			}
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
