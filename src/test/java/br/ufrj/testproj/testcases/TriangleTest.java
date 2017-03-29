package br.ufrj.testproj.testcases;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;
import br.ufrj.testproj.exceptions.NegativeSideException;
import br.ufrj.testproj.exceptions.TooBigSideException;
import br.ufrj.testproj.exceptions.WrongNumberOfArgumentsException;
import br.ufrj.testproj.exceptions.ZeroSideException;
import br.ufrj.testproj.principal.ClassifyTriangles;

public class TriangleTest {

	private double x, y, z, w;
	private String type;

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testEscaleno1() throws Exception {
		this.x = 2;
		this.y = 3;
		this.z = 4;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "escaleno");
	}

	@Test
	public void testEscaleno2() throws Exception {
		this.x = 3;
		this.y = 2;
		this.z = 4;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "escaleno");
	}

	@Test
	public void testEscaleno3() throws Exception {
		this.x = 2;
		this.y = 4;
		this.z = 3;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "escaleno");
	}

	@Test
	public void testEscaleno4() throws Exception {
		this.x = 3;
		this.y = 4;
		this.z = 2;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "escaleno");
	}

	@Test
	public void testEscaleno5() throws Exception {
		this.x = 4;
		this.y = 3;
		this.z = 2;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "escaleno");
	}

	@Test
	public void testEscaleno6() throws Exception {
		this.x = 4;
		this.y = 2;
		this.z = 3;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "escaleno");
	}

	@Test
	public void testEquilatero() throws Exception {
		this.x = 3;
		this.y = 3;
		this.z = 3;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "equilatero");
	}

	@Test
	public void testIsosceles12() throws Exception {
		this.x = 3;
		this.y = 3;
		this.z = 4;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "isosceles");
	}

	@Test
	public void testIsosceles23() throws Exception {
		this.x = 4;
		this.y = 3;
		this.z = 3;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "isosceles");
	}

	@Test
	public void testIsosceles13() throws Exception {
		this.x = 3;
		this.y = 4;
		this.z = 3;

		assertEquals(ClassifyTriangles.typeTriangle(x, y, z), "isosceles");
	}

	@Test
	public void testAcceptsZeroNumbers1()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 0;
		this.y = 3;
		this.z = 4;

		this.exception.expect(ZeroSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testAcceptsZeroNumbers2()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 3;
		this.y = 0;
		this.z = 4;

		this.exception.expect(ZeroSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testAcceptsZeroNumbers3()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 3;
		this.y = 4;
		this.z = 0;

		this.exception.expect(ZeroSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testAcceptsNegativeNumbers1()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = -2;
		this.y = 3;
		this.z = 4;

		this.exception.expect(NegativeSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testAcceptsNegativeNumbers2()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 3;
		this.y = -2;
		this.z = 4;

		this.exception.expect(NegativeSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testAcceptsNegativeNumbers3()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 3;
		this.y = 4;
		this.z = -2;

		this.exception.expect(NegativeSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testVeryLargeSide1()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 7;
		this.y = 3;
		this.z = 4;

		this.exception.expect(TooBigSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testVeryLargeSide2()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 3;
		this.y = 7;
		this.z = 4;

		this.exception.expect(TooBigSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testVeryLargeSide3()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 3;
		this.y = 4;
		this.z = 7;

		this.exception.expect(TooBigSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testVeryLargeSide4()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 8;
		this.y = 3;
		this.z = 4;

		this.exception.expect(TooBigSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testVeryLargeSide5()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 3;
		this.y = 8;
		this.z = 4;

		this.exception.expect(TooBigSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testVeryLargeSide6()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 3;
		this.y = 4;
		this.z = 8;

		this.exception.expect(TooBigSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testAcceptsAllZero()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 0;
		this.y = 0;
		this.z = 0;

		this.exception.expect(ZeroSideException.class);
		ClassifyTriangles.typeTriangle(x, y, z);
	}

	@Test
	public void testAcceptsDoubleValues()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 4.57;
		this.y = 3.65;
		this.z = 2.9;

		this.type = ClassifyTriangles.typeTriangle(x, y, z);
		assertEquals(this.type, "escaleno");
	}

	@Test
	public void testAcceptsLargerNumberOfArguments()
			throws WrongNumberOfArgumentsException, TooBigSideException, ZeroSideException, NegativeSideException {
		this.x = 2;
		this.y = 3;
		this.z = 4;
		this.w = 8;

		this.exception.expect(WrongNumberOfArgumentsException.class);
		ClassifyTriangles.typeTriangle(x, y, z, w);
	}

}
