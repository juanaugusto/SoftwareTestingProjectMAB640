package br.ufrj.testproj.principal;

import br.ufrj.testproj.exceptions.NegativeSideException;
import br.ufrj.testproj.exceptions.TooBigSideException;
import br.ufrj.testproj.exceptions.ZeroSideException;

public class ClassifyTriangles {

	public static String typeTriangle(double x, double y, double z)
			throws TooBigSideException, ZeroSideException, NegativeSideException {

		isTriangleValid(x, y, z);

		if (x == y && x == z && z == y) {

			return "equilatero";

		} else if (x != y && x != z && z != y) {

			return "escaleno";
		}

		return "isosceles";

	}

	private static boolean isTriangleValid(double x, double y, double z)
			throws TooBigSideException, ZeroSideException, NegativeSideException {
		// TODO checar casos como numeros negativos, zero ou soma de dois lados
		// maior que a de outro lado
		// Caso nao seja válido, lançar exceções que criamos lá nos casos de
		// teste ou arrumar outra saída

		if (!(Math.abs(y - z) < x && x < y + z && Math.abs(x - z) < y && y < x + z && Math.abs(x - y) < z && z < x + y)) {

			throw new TooBigSideException("Too Big Side Exception!");

		} else if (x == 0 || y == 0 || z == 0) {

			throw new ZeroSideException("Too Big Side Exception!");

		} else if (x < 0 || y < 0 || z < 0) {
			throw new NegativeSideException("Too Big Side Exception!");
		}

		return true;
	}

}