package br.ufrj.testproj.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class CalculatePalindromeOBI {
	private static void noop() {

	}

	public static String calculateWrongPalindrome(char[] letras) {
		List<Integer> list = new ArrayList<Integer>();
		
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
		
		//Number 2
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
			
			if (list.get(list.size()-1) != 2){
				list.add(2);
			}
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
			
			if (list.get(list.size()-1) != 7){
				list.add(7);
			}
		}
		
		// Number 11
		list.add(11);
		if (palindromo == 1) {
			
			// Number 12
			list.add(12);
			retorno = "SIM";
		} else {
			
			// Number 13
			list.add(13);
			retorno = "NAO";
		}
		
		// Number 14
		list.add(14);
		
		System.out.println("Entrada: "+Arrays.toString(letras));
		System.out.println("Saída: "+retorno);
		System.out.println("Caminho Percorrido: " + list.toString());
		System.out.println("Nós atingidos: " + new TreeSet<Integer>(list));
		System.out.print("Arcos atingidos: ");
		int k = 0;
		while(true){
			if(k < list.size() - 1 ){
				int[] bak = {list.get(k), list.get(k+1)};
				System.out.print(Arrays.toString(bak) + ", ");
				k++;
			}else{
				break;
			}
		}
		System.out.println();
		System.out.print("Pares de Arcos atingidos: ");
		k = 0;
		while(true){
			if(k < list.size() - 2 ){
				int[] bak = {list.get(k), list.get(k+1), list.get(k+2)};
				System.out.print(Arrays.toString(bak) + ", ");
				k++;
			}else{
				break;
			}
		}
		System.out.println();
		//System.out.println("Caminhos Primos atingidos: ");
		return retorno;
	}

}
