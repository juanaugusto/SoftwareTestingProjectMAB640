package principal;

public class ClassifyTriangles {
	
	public static String typeTriangle(float x, float y, float z){
	
		isTriangleValid(x, y, z);
		
		if ( x == y && x == z && z == y){
			
			return "equilatero";
			
		}else if(x != y && x != z && z != y){
			
			return "escaleno";
		}
		
		return "isosceles";
	}

	private static boolean isTriangleValid(float x, float y, float z) {
		// TODO checar casos como numeros negativos, zero ou soma de dois lados maior que a de outro lado
		// Caso nao seja válido, lançar exceções que criamos lá nos casos de teste ou arrumar outra saída
		
		return true;
	}

}
