package br.ufrj.testproj.principal.calculator;

import br.ufrj.testproj.exceptions.NegativeSideException;
import br.ufrj.testproj.exceptions.TooBigSideException;
import br.ufrj.testproj.exceptions.WrongNumberOfArgumentsException;
import br.ufrj.testproj.exceptions.ZeroSideException;

public class ClassifyTriangles {

	public static String typeTriangle(double... args)
			throws TooBigSideException, ZeroSideException, NegativeSideException, WrongNumberOfArgumentsException {

		if (args.length != 3) {
			throw new WrongNumberOfArgumentsException();
		}

		double x = args[0];
		double y = args[1];
		double z = args[2];

		isTriangleValid(x, y, z);

		if (x == y && x == z && z == y) {
			return "equilatero";

		} else if (x != y && x != z && z != y) {
			return "escaleno";

		}
		return "isosceles";

	}

	private static void isTriangleValid(double x, double y, double z)
			throws TooBigSideException, ZeroSideException, NegativeSideException {

		if (x == 0 || y == 0 || z == 0) {
			throw new ZeroSideException();

		} else if (x < 0 || y < 0 || z < 0) {
			throw new NegativeSideException();

		} else if (!(Math.abs(y - z) < x && x < y + z && Math.abs(x - z) < y && y < x + z && Math.abs(x - y) < z
				&& z < x + y)) {
			throw new TooBigSideException();

		}

	}

}