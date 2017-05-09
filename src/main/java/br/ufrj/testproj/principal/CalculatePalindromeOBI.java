package br.ufrj.testproj.principal;

public class CalculatePalindromeOBI {
	private static void noop() {

	}

	public static String calculateWrongPalindrome(char[] letras) {
		//Numero 1
		System.out.print("1 ");
		noop();
		String retorno;
		int contador_texto, i, j;
		char texto[] = new char[11];
		int palindromo;
		noop();
		contador_texto = 0;
		noop();
		
		//Numero 2
		System.out.print("2 ");
		for (char letra : letras) {
			
			//Numero 3
			System.out.print("3 ");
			if (letra != ' ') {
				
				//Numero 4
				System.out.print("4 ");
				texto[contador_texto] = letra;
				contador_texto++;
			}
			
			//Numero 5
			System.out.print("5 ");
			noop();
			noop();
		}
		
		//Numero 6
		System.out.print("6 ");
		i = 0;
		j = contador_texto - 1;
		palindromo = 1;
		
		//Numero 7
		System.out.print("7 ");
		while (j > i) {
			
			//Numero 8
			System.out.print("8 ");
			if (texto[i] != texto[j]) {
			
				//Numero 9
				System.out.print("9 ");
				palindromo = 0;
			}
			
			//Numero 10
			System.out.print("10 ");
			i = i + 1;
			j = j - 1;
		}
		
		//Numero 11
		System.out.print("11 ");
		if (palindromo == 1) {
			
			//Numero 12
			System.out.print("12 ");
			retorno = "SIM";
		} else {
			
			//Numero 13
			System.out.print("13 ");
			retorno = "NAO";
		}
		
		//Numero 14
		System.out.print("14 ");
		System.out.println();
		return retorno;
	}

}
