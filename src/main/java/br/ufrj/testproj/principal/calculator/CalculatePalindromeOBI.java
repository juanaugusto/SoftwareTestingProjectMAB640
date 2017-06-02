package br.ufrj.testproj.principal.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CalculatePalindromeOBI extends CalculateGeneral {

	String returnedValue;

	ArrayList<String> list;

	private static void noop() {

	}

	public void addToList(String element) {
		if (!this.list.contains(element)) {
			this.list.add(element);
		}

	}

	public String calculateWrongPalindromeForLogicCoverage(char[] letras) {

		int contador_entrada, contador_texto, i, j;
		char texto[] = new char[11];
		int palindromo;
		contador_entrada = 0;
		contador_texto = 0;

		this.list = new ArrayList<String>();

		addToList("P1 - A: " + (letras[contador_entrada] != '\u001a') + " B: " + (letras[contador_entrada] != '\n')
				+ " C: " + (contador_entrada <= 10));

		while (letras[contador_entrada] != '\u001a' && letras[contador_entrada] != '\n' && contador_entrada <= 10) {

			addToList("P2 - D: " + (letras[contador_entrada] != ' '));

			if (letras[contador_entrada] != ' ') {
				texto[contador_texto] = letras[contador_entrada];
				contador_texto++;
			}
			contador_entrada++;

			addToList("P1 - A: " + (letras[contador_entrada] != '\u001a') + " B: " + (letras[contador_entrada] != '\n')
					+ " C: " + (contador_entrada <= 10));

		}

		i = 0;
		j = contador_texto;
		// j = contador_texto - 1; -- Replaced by above
		palindromo = 1;

		addToList("P3 - E: " + (j > i));
		while (j > i) {
			addToList("P4 - F: " + (texto[i] != texto[j]));

			if (texto[i] != texto[j]) {

				palindromo = 0;
			}

			i = i + 1;
			j = j - 1;

			addToList("P3 - E: " + (j > i));

		}

		addToList("P5 - G: " + (palindromo == 1));

		if (palindromo == 1) {
			return "SIM";

		} else {
			return "NAO";
		}

	}

	public static void printResult(char[] input) {
		System.out.println(Arrays.toString(input));

		CalculatePalindromeOBI cp = new CalculatePalindromeOBI();

		try {
			System.out.println(cp.calculateWrongPalindromeForLogicCoverage(input));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException lançada");

		} finally {
			Collections.sort(cp.list);

			for (String s : cp.list) {
				System.out.println(s);
			}

			System.out.println();

		}
	}

	public static void main(String[] args) {

		System.out.println("Cobertura de Predicados:");
		printResult(new char[] { '\n' });
		printResult(new char[] { 'a', 'a', ' ', 'a', 'a', '\u001a' });

		System.out.println("Cobertura de Cláusulas:");
		printResult(new char[] { 'a', 'i', 'b', 'o', 'f', 'o', 'b', 'i', 'a', '\n' });
		printResult(new char[] { 'x', 'x', 'x', ' ', 'x', 'x', 'x', '\u001a' });
		printResult(new char[] { 'b', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'b', '\u001a' });
		printResult(new char[] { '\n' });

		System.out.println("Cobertura por Combinação:");
		printResult(new char[] { 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', '\n' });
		printResult(new char[] { 'x', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', '\u001a' });
		printResult(new char[] { 'y', 'a', 'a', 'a', 'z', 'a', 'z', 'a', 'a', 'x', 'a', 'a', 'a', 'a', 'a', '\u001a' });
		printResult(new char[] { 'x', 'x', 'x', ' ', 'x', 'x', 'x', '\u001a' });
		printResult(new char[] { '\n' });

		System.out.println("Cobertura por GACC. CACC, RACC:");
		printResult(new char[] { 'x', 'a', 'a', 'a', 'z', 'a', 'z', ' ', 'a', 'x', 'a', 'a', 'a', 'a', 'a', '\u001a' });
		printResult(new char[] { 'x', 'x', 'x', ' ', 'x', 'x', 'x', '\u001a' });
		printResult(new char[] { 'y', 'x', 'x', 'x', 'x', 'x', 'y', '\n' });

	}

	public CalculatePalindromeOBI calculateWrongPalindrome(char[] letras) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Number 1
		list.add(1);
		noop();
		String retorno;
		int contador_texto, i, j;
		char texto[] = new char[11];
		int palindromo;
		noop();
		contador_texto = 0;
		noop();

		// Number 2
		list.add(2);

		for (char letra : letras) {

			// Number 3
			list.add(3);
			if (letra != ' ') {

				// Number 4
				list.add(4);
				texto[contador_texto] = letra;
				contador_texto++;
			}

			// Number 5
			list.add(5);
			noop();
			noop();

			// Number 2
			list.add(2);

		}

		// Number 6
		list.add(6);
		i = 0;
		j = contador_texto;
		// j = contador_texto - 1; -- Replaced by above
		palindromo = 1;

		// Number 7
		list.add(7);
		while (j > i) {

			// Number 8
			list.add(8);
			if (texto[i] != texto[j]) {

				// Number 9
				list.add(9);
				palindromo = 0;
			}

			// Number 10
			list.add(10);
			i = i + 1;
			j = j - 1;

			// Number 7
			list.add(7);

		}

		// Number 11
		list.add(11);
		if (palindromo == 1) {

			// Number 12
			list.add(12);
			retorno = "SIM";
			this.returnedValue = retorno;
			this.pathPercurred = list;

		} else {

			// Number 13
			list.add(13);
			retorno = "NAO";
			this.returnedValue = retorno;
			this.pathPercurred = list;
		}

		// Number 14
		list.add(14);

		return this;
	}

	public String getReturnedValue() {
		return returnedValue;
	}

	public void setReturnedValue(String returnedValue) {
		this.returnedValue = returnedValue;
	}

}
