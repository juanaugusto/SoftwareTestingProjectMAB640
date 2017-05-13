package br.ufrj.testproj.principal;

public class CalculatePalindromeOBI {
	private static void noop() {

	}

	public static String calculateWrongPalindrome(char[] letras) {
		
		// Number 1
		noop();
		String retorno;
		int contador_texto, i, j;
		char texto[] = new char[11];
		int palindromo;
		noop();
		contador_texto = 0;
		noop();
		
		//Number 2
		for (char letra : letras) {
			
			// Number 3
			if (letra != ' ') {
				
				// Number 4
				texto[contador_texto] = letra;
				contador_texto++;
			}
			
			// Number 5
			noop();
			noop();
			
			// Number 2
		}
		
		// Number 6
		i = 0;
		j = contador_texto - 1;
		palindromo = 1;
		
		// Number 7
		while (j > i) {
			
			// Number 8
			if (texto[i] != texto[j]) {
			
				// Number 9
				palindromo = 0;
			}
			
			// Number 10
			i = i + 1;
			j = j - 1;
			
			// Number 7
		}
		
		// Number 11
		if (palindromo == 1) {
			
			// Number 12
			retorno = "SIM";
		} else {
			
			// Number 13
			retorno = "NAO";
		}
		
		// Number 14
		return retorno;
	}

}
