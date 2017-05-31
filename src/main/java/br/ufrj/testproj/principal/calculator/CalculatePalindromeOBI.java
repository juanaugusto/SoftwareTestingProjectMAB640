package br.ufrj.testproj.principal.calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculatePalindromeOBI extends CalculateGeneral {
	
	String returnedValue;
	
	private static void noop() {

	}
	
	public static String calculateWrongPalindromeForLogicCoverage(char[] letras) {
		
		System.out.println(Arrays.toString(letras));
		int contador_entrada, contador_texto, i, j;
		char texto[] = new char[11];
		int palindromo;
		contador_entrada = 0;
		contador_texto = 0;
		
		System.out.println("P1 - A: "+(letras[contador_entrada] != '\u001a') + " B: "+(letras[contador_entrada] != '\n') + " C: "+ (contador_entrada <= 10));
		while(letras[contador_entrada] != '\u001a' && 
				letras[contador_entrada] != '\n' && 
				contador_entrada <= 10){
			
			
			System.out.println("P2 - D: "+(letras[contador_entrada] != ' ')); 
			if (letras[contador_entrada] != ' '){
				texto[contador_texto] = letras[contador_entrada];
				contador_texto++;
			}
			contador_entrada++;
			
			System.out.println("P1 - A: "+(letras[contador_entrada] != '\u001a') + " B: "+(letras[contador_entrada] != '\n') + " C: "+ (contador_entrada <= 10));

		}

		i = 0;
		j = contador_texto;
		// j = contador_texto - 1; -- Replaced by above
		palindromo = 1;
		
		System.out.println("P3 - E: "+(j > i)); 
		while (j > i) {
			
			System.out.println("P4 - F: "+(texto[i] != texto[j])); 

			if (texto[i] != texto[j]) {

				palindromo = 0;
			}
			
			i = i + 1;
			j = j - 1;
			
			System.out.println("P3 - E: "+(j > i)); 
	
		}
		
		System.out.println("P5 - G: "+(palindromo == 1));

		if (palindromo == 1) {
			return "SIM\n";

		} else {
			return "NAO\n";
		}

		
	}
	
	public static void main(String[] args){
		
		
		// Cobertura de Predicados
		System.out.println(calculateWrongPalindromeForLogicCoverage(new char[]{'\n'}));
		System.out.println(calculateWrongPalindromeForLogicCoverage(new char[]{'a', 'a', ' ', 'a',  'a', '\u001a'}));
		
		// Cobertura de Cláusulas
		System.out.println(calculateWrongPalindromeForLogicCoverage(new char[]{'a', 'i', 'b','o', 'f', 'o', 'b', 'i', 'a', '\n'}));


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
