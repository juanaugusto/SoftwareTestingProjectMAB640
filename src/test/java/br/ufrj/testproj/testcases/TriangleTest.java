package br.ufrj.testproj.testcases;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

import br.ufrj.testproj.exceptions.NegativeSideException;
import br.ufrj.testproj.exceptions.TooBigSideException;
import br.ufrj.testproj.exceptions.ZeroSideException;
import br.ufrj.testproj.principal.ClassifyTriangles;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TriangleTest extends TestCase {

	private double x, y, z, w;
	private String type;

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public TriangleTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(TriangleTest.class);
	}

	public void testIsosceles12() throws Exception {
		this.x = 3;
		this.y = 3;
		this.z = 4;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "isosceles");
	}

	public void testIsosceles23() throws Exception {
		this.x = 4;
		this.y = 3;
		this.z = 3;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "isosceles");
	}

	public void testIsosceles13() throws Exception {
		this.x = 3;
		this.y = 4;
		this.z = 3;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "isosceles");
	}

	public void testEquilatero() throws Exception {
		this.x = 3;
		this.y = 3;
		this.z = 3;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "equilatero");
	}

	public void testEscaleno1() throws Exception {
		this.x = 2;
		this.y = 3;
		this.z = 4;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "escaleno");
	}

	public void testEscaleno2() throws Exception {
		this.x = 3;
		this.y = 2;
		this.z = 4;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "escaleno");
	}

	public void testEscaleno3() throws Exception {
		this.x = 2;
		this.y = 4;
		this.z = 3;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "escaleno");
	}

	public void testEscaleno4() throws Exception {
		this.x = 3;
		this.y = 4;
		this.z = 2;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "escaleno");
	}

	public void testEscaleno5() throws Exception {
		this.x = 4;
		this.y = 3;
		this.z = 2;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "escaleno");
	}

	public void testEscaleno6() throws Exception {
		this.x = 4;
		this.y = 2;
		this.z = 3;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "escaleno");
	}

	public void testAceitaZero1() {
		this.x = 0;
		this.y = 3;
		this.z = 4;

		this.exception.expect(ZeroSideException.class);
		try {
			ClassifyTriangles.typeTriangle(x, y, z);
		} catch (TooBigSideException | ZeroSideException | NegativeSideException e) {
			// TODO Auto-generated catch block
		}
	}

	public void testAceitaZero2() {
		this.x = 3;
		this.y = 0;
		this.z = 4;

		this.exception.expect(ZeroSideException.class);
		try {
			ClassifyTriangles.typeTriangle(x, y, z);
		} catch (TooBigSideException | ZeroSideException | NegativeSideException e) {
			// TODO Auto-generated catch block
		}
	}

	public void testAceitaZero3() {
		this.x = 3;
		this.y = 4;
		this.z = 0;

		this.exception.expect(ZeroSideException.class);
		try {
			ClassifyTriangles.typeTriangle(x, y, z);
		} catch (TooBigSideException | ZeroSideException | NegativeSideException e) {
			// TODO Auto-generated catch block
		}
	}

	public void testAceitaNegativo1() {
		this.x = -2;
		this.y = 3;
		this.z = 4;

		this.exception.expect(NegativeSideException.class);
		try {
			ClassifyTriangles.typeTriangle(x, y, z);
		} catch (TooBigSideException | ZeroSideException | NegativeSideException e) {
			// TODO Auto-generated catch block
		}
	}

	public void testAceitaNegativo2() {
		this.x = 3;
		this.y = -2;
		this.z = 4;

		this.exception.expect(NegativeSideException.class);
		try {
			ClassifyTriangles.typeTriangle(x, y, z);
		} catch (TooBigSideException | ZeroSideException | NegativeSideException e) {
			// TODO Auto-generated catch block
		}
	}

	public void testAceitaNegativo3() {
		this.x = 3;
		this.y = 4;
		this.z = -2;

		this.exception.expect(NegativeSideException.class);
		try {
			ClassifyTriangles.typeTriangle(x, y, z);
		} catch (TooBigSideException | ZeroSideException | NegativeSideException e) {
			// TODO Auto-generated catch block
		}
	}

	public void testLadoMuitoGrande1() {
		this.x = 7;
		this.y = 3;
		this.z = 4;

		this.exception.expect(TooBigSideException.class);
		try {
			ClassifyTriangles.typeTriangle(x, y, z);
		} catch (TooBigSideException | ZeroSideException | NegativeSideException e) {
			// TODO Auto-generated catch block
		}
	}

	public void testLadoMuitoGrande2() {
		this.x = 3;
		this.y = 7;
		this.z = 4;

		this.exception.expect(TooBigSideException.class);
		try {
			ClassifyTriangles.typeTriangle(x, y, z);
		} catch (TooBigSideException | ZeroSideException | NegativeSideException e) {
			// TODO Auto-generated catch block
		}
	}

	public void testLadoMuitoGrande3() {
		this.x = 3;
		this.y = 4;
		this.z = 7;

		this.exception.expect(TooBigSideException.class);
		try {
			ClassifyTriangles.typeTriangle(x, y, z);
		} catch (TooBigSideException | ZeroSideException | NegativeSideException e) {
			// TODO Auto-generated catch block
		}
	}

	public void testLadoMuitoGrande4() {
		this.x = 8;
		this.y = 3;
		this.z = 4;

		this.exception.expect(TooBigSideException.class);
		try {
			ClassifyTriangles.typeTriangle(x, y, z);
		} catch (TooBigSideException | ZeroSideException | NegativeSideException e) {
			// TODO Auto-generated catch block
		}
	}

	public void testLadoMuitoGrande5() {
		this.x = 3;
		this.y = 8;
		this.z = 4;

		this.exception.expect(TooBigSideException.class);
		try {
			ClassifyTriangles.typeTriangle(x, y, z);
		} catch (TooBigSideException | ZeroSideException | NegativeSideException e) {
			// TODO Auto-generated catch block
		}
	}

	public void testLadoMuitoGrande6() {
		this.x = 3;
		this.y = 4;
		this.z = 8;

		this.exception.expect(TooBigSideException.class);
		try {
			ClassifyTriangles.typeTriangle(x, y, z);
		} catch (TooBigSideException | ZeroSideException | NegativeSideException e) {
			// TODO Auto-generated catch block
		}
	}

	public void testNotInteger() throws Exception {
		this.x = 4.57;
		this.y = 3.65;
		this.z = 2.9;

		this.type = ClassifyTriangles.typeTriangle(x, y, z);
		assertEquals(this.type, "escaleno");
	}

}
