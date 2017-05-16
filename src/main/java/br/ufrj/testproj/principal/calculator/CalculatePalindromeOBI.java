package br.ufrj.testproj.principal.calculator;

import java.util.ArrayList;

public class CalculatePalindromeOBI extends CalculateGeneral {
	
	String returnedValue;
	
	private static void noop() {

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
		j = contador_texto - 1;
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
