package br.ufrj.testproj.facilitators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.ufrj.testproj.facilitator.graphcoverage.Facilitator;

public class PalindromeFacilitator extends Facilitator {

	char[][] inputs;
	
	public void createPalindromeFacilitator(){
		this.nodeRequirements = new int [] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14 };
		this.edgeRequirements = new int [][] { 
			{1, 2}, {2, 3}, {2, 6}, {3, 4}, {3, 5}, {4, 5}, {5, 2}, {6, 7}, 
			{7, 8}, {7, 11}, {8, 9}, {8, 10}, {9, 10}, {10, 7}, {11, 12}, {11, 13},
			{12, 14}, {13, 14}
		};
		this.edgePairRequirements = new int [][] {
			{1, 2, 3}, {1, 2, 6}, {2, 3, 4}, {2, 3, 5}, {2, 6, 7}, {3, 5, 2}, 
			{3, 4, 5}, {4, 5, 2}, {5, 2, 3}, {5, 2, 6}, {6, 7, 8}, {6, 7, 11}, 
			{7, 8, 9}, {7, 8, 10},  {7, 11, 12}, {7, 11, 13}, {8, 9, 10}, {8, 10, 7}, 
			{9, 10, 7}, {10, 7, 8}, {10, 7, 11}, {11, 12, 14}, {11, 13, 14}};
		
		this.primePathsRequirements = new int [][] {
			{3,4,5,2,6,7,8,9,10},  {3,4,5,2,6,7,11,12,14}, 
			{3,4,5,2,6,7,11,13,14}, {3,5,2,6,7,8,9,10}, {3,4,5,2,6,7,8,10}, 
			{3,5,2,6,7,11,12,14}, {3,5,2,6,7,11,13,14}, {3,5,2,6,7,8,10}, 
			{1,2,6,7,11,12,14}, {1,2,6,7,8,9,10}, {1,2,6,7,11,13,14}, 
			{8,9,10,7,11,12,14}, {8,9,10,7,11,13,14}, {1,2,6,7,8,10}, 
			{8,10,7,11,12,14},  {8,10,7,11,13,14}, {3,4,5,2,3}, 
			{4,5,2,3,4}, {5,2,3,4,5}, {1,2,3,4,5}, {2,3,4,5,2}, 
			{9,10,7,8,9}, {10,7,8,9,10}, {7,8,9,10,7},  {8,9,10,7,8},  
			{3,5,2,3}, {5,2,3,5}, {1,2,3,5}, {2,3,5,2}, {10,7,8,10}, 
			{8,10,7,8}, {7,8,10,7}
		};
		
		this.infeasiblePrimePaths.add(new int[] {3, 4, 5, 2, 6, 7, 11, 13, 14});
		this.infeasiblePrimePaths.add(new int[] {1, 2, 6, 7, 8, 10});
		this.infeasiblePrimePaths.add(new int[] {1, 2, 6, 7, 11, 13, 14});
		this.infeasiblePrimePaths.add(new int[] {1, 2, 6, 7, 8, 9, 10});
		this.infeasiblePrimePaths.add(new int[] {3, 5, 2, 6, 7, 11, 13, 14});
		this.infeasiblePrimePaths.add(new int[] {8, 9, 10, 7, 11, 12, 14});
		
		// Node Coverage
//		inputs = new char[][] {
//			{'a', ' ', 'a'},
//			{'b', 'x'},
//		};
		
		// Edge Coverage
//		inputs = new char[][] {
//			{'a', ' ', 'a'},
//			{'b', 'x'},
//		};
		
		// Edge Pair Coverage
//		inputs = new char[][] {
//			{'a', 'a', ' ', 'a', 'a',},
//			{'b', 'x'},
//			{}
//		};
		
//		// Prime Path Coverage
//		inputs = new char[][] {
//			{'b', 'y', 'b', 'y', 'b', 'y', 'a', 'b'},
//			{'a', 'a', ' ', 'a', 'a'},
//			{'a', 'a', 'a', 'a', 'a'},
//			{'a'},
//			{'a','a'},
//			{'b', 'x'},
//			{},
//			{' '},
//		};
		
		inputs = new char[][] {
			{'a', 'b', 'b', 'b', 'a', 'a'},
			{'b', 'y', 'b', 'y', 'b', 'y', 'a', 'c', ' '},
			{'a', 'a', ' ', 'a', 'a'},
			{' ', 'a', ' ','a', ' '},
			{'b', 'x'},
			{'a'},
			{},
			{' '},
		};
		
		for(char[] input: inputs){
			ArrayList<Integer> pathTraveled = calculateWrongPalindrome(input);
			
			calculateReachedForCriterias(pathTraveled);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromeFacilitator pf = new PalindromeFacilitator();
		pf.createPalindromeFacilitator();
		pf.showStatistics();
					
	}
	
	private static void noop() {

	}

	public static ArrayList<Integer> calculateWrongPalindrome(char[] letras) {
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
			System.out.println("Output: "+retorno);

		} else {
			
			// Number 13
			list.add(13);
			retorno = "NAO";
			System.out.println("Output: "+retorno);
		}
		
		// Number 14
		list.add(14);
		
		return list;
	}

}
