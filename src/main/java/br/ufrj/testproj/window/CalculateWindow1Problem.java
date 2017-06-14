package br.ufrj.testproj.window;

public class CalculateWindow1Problem {

	public static int calculateWindowCorrect(int p1, int p2, int p3) {
		int t;

		if (p3 < p2) {
			t = p3;
			p3 = p2;
			p2 = t;
		}
		if (p2 < p1) {
			t = p2;
			p2 = p1;
			p1 = t;
		}
		if (p3 < p2) {
			t = p3;
			p3 = p2;
			p2 = t;
		}
		if (p1 > p2 || p2 > p3)
			return 1;

		if (p3 - p1 <= 200) {
			return 100 * (400 - p3 + p1);
		} else if (p2 - p1 <= 200 && p3 - p2 <= 200) {
			return 100 * (400 - p3 + p1);
		} else if (p2 - p1 <= 200 && p3 - p2 > 200) {
			return 100 * (200 - p2 + p1);
		} else if (p3 - p2 <= 200 && p2 - p1 > 200) {
			return 100 * (200 - p3 + p2);
		} else {
			return 0;
		}

	}

}
