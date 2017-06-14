package br.ufrj.testproj.window;

public class CalculateWindow3Problem {

	public static int calculateWindow2(int p1, int p2, int p3) {
		int i, soma = 0;
		int[] centimetros = new int[600];

		for (i = 0; i < 600; i++) {
			centimetros[i] = 0;
		}

		for (i = p1; i < p1 + 200; i++) {
			centimetros[i] = 1;
		}

		for (i = p2; i <= p2 + 200; i++) {
			centimetros[i] = 1;
		}

		for (i = p3; i < p3 + 200; i++) {
			centimetros[i] = 1;
		}

		for (i = 1; i < 600; i++) {
			if (centimetros[i] == 1)
				soma++;
		}

		return soma * 100;
	}

}
