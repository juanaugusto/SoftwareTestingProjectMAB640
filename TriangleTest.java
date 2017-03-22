import org.junit.Assert

public class TriangleTest{

	public float x, y, z;
	public String type;
	
	public void testIsosceles12(){
		this.x = 3;
		this.y = 3;
		this.z = 4;

		assertEquals(typeTriangle(x,y,z), "isosceles");
	}

	public void testIsosceles23(){
		this.x = 4;
		this.y = 3;
		this.z = 3;

		assertEquals(typeTriangle(x,y,z), "isosceles");
	}

	public void testIsosceles13(){
		this.x = 3;
		this.y = 4;
		this.z = 3;

		assertEquals(typeTriangle(x,y,z), "isosceles");
	}

	public void testEquilatero(){
		x = 3;
		y = 3;
		z = 3;

		assertEquals(typeTriangle(x,y,z), "equilatero");
	}

	public void testEscaleno1(){
		this.x = 2;
		this.y = 3;
		this.z = 4;

		assertEquals(typeTriangle(x,y,z), "escaleno");
	}

	public void testEscaleno2(){
		this.x = 3;
		this.y = 2;
		this.z = 4;

		assertEquals(typeTriangle(x,y,z), "escaleno");
	}

	public void testEscaleno3(){
		this.x = 2;
		this.y = 4;
		this.z = 3;

		assertEquals(typeTriangle(x,y,z), "escaleno");
	}

	public void testEscaleno4(){
		this.x = 3;
		this.y = 4;
		this.z = 2;

		assertEquals(typeTriangle(x,y,z), "escaleno");
	}

	public void testEscaleno5(){
		this.x = 4;
		this.y = 3;
		this.z = 2;

		assertEquals(typeTriangle(x,y,z), "escaleno");
	}

	public void testEscaleno6(){
		this.x = 4;
		this.y = 2;
		this.z = 3;

		assertEquals(typeTriangle(x,y,z), "escaleno");
	}

	@Test(expected=ZeroSide.class)
	public void testAceitaZero1(){
		this.x = 0;
		this.y = 3;
		this.z = 4;

		this.type = typeTriangle(x,y,z)
	}

	@Test(expected=ZeroSide.class)
	public void testAceitaZero2(){
		this.x = 3;
		this.y = 0;
		this.z = 4;

		this.type = typeTriangle(x,y,z)
	}

	@Test(expected=ZeroSide.class)
	public void testAceitaZero3(){
		this.x = 3;
		this.y = 4;
		this.z = 0;

		this.type = typeTriangle(x,y,z)
	}

	@Test(expected=NegativeSide.class)
	public void testAceitaNegativo1(){
		this.x = -2;
		this.y = 3;
		this.z = 4;

		this.type = typeTriangle(x,y,z)
	}

	@Test(expected=NegativeSide.class)
	public void testAceitaNegativo2(){
		this.x = 3;
		this.y = -2;
		this.z = 4;

		this.type = typeTriangle(x,y,z)
	}

	@Test(expected=NegativeSide.class)
	public void testAceitaNegativo3(){
		this.x = 3;
		this.y = 4;
		this.z = -2;

		this.type = typeTriangle(x,y,z)
	}

	@Test(expected=TooBigSide.class)
	public void testLadoMuitoGrande1(){
		this.x = 7;
		this.y = 3;
		this.z = 4;

		this.type = typeTriangle(x,y,z)
	}

	@Test(expected=TooBigSide.class)
	public void testLadoMuitoGrande2(){
		this.x = 3;
		this.y = 7;
		this.z = 4;

		this.type = typeTriangle(x,y,z)
	}

	@Test(expected=TooBigSide.class)
	public void testLadoMuitoGrande3(){
		this.x = 3;
		this.y = 4;
		this.z = 7;

		this.type = typeTriangle(x,y,z)
	}

	@Test(expected=TooBigSide.class)
	public void testLadoMuitoGrande4(){
		this.x = 8;
		this.y = 3;
		this.z = 4;

		this.type = typeTriangle(x,y,z)
	}

	@Test(expected=TooBigSide.class)
	public void testLadoMuitoGrande5(){
		this.x = 3;
		this.y = 8;
		this.z = 4;

		this.type = typeTriangle(x,y,z)
	}

	@Test(expected=TooBigSide.class)
	public void testLadoMuitoGrande6(){
		this.x = 3;
		this.y = 4;
		this.z = 8;

		this.type = typeTriangle(x,y,z)
	}

	public void testNotInteger(){
		this.x = 4.57;
		this.y = 3.65;
		this.z = 2.9;

		this.type = typeTriangle(x,y,z);
		assertEquals(this.type, "escaleno")
	}

	@Test(expected=WrongArgsNumber.class)
	public void testLadoMuitoGrande6(){
		this.x = 3;
		this.y = 4;
		this.z = 5;
		this.w = 6;

		this.type = typeTriangle(x,y,z,w)
	}
}
