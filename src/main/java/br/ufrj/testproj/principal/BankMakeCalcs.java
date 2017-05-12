package br.ufrj.testproj.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BankMakeCalcs {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nodeRequirements;
		int[][] edgeRequirements;
		int[][] edgePairRequirements;
		Integer[][] primePathsRequirements;
		int[][] inputs;
		
		Set<Integer> nodesReached;
		Set<int[]> edgesReached;
		Set<int[]> edgePairsReached;
		Set<int[]> primePathsReached;
		
		nodeRequirements = new int [] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14 };
		edgeRequirements = new int [][] { 
			{1, 2}, {1, 3}, {3, 4}, {4, 5}, {4, 6}, {6, 7}, {7, 8}, {7, 10}, 
			{8, 7}, {8, 9}, {9, 10}, {10, 11}, {10, 12}, {11, 14}, {12, 13}, 
			{12, 14}, {13, 14}, {14, 4}
		};
		edgePairRequirements = new int [][] {
			{1, 2}, {1, 3, 4}, {3, 4, 5}, {3, 4, 6}, {4, 6, 7}, {6, 7, 8},
			{6, 7, 10}, {7, 8, 7}, {7, 8, 9}, {7, 10, 11}, {7, 10, 12}, 
			{8, 7, 8}, {8, 7, 10}, {8, 9, 10}, {9, 10, 11}, {9, 10, 12}, 
			{10, 11, 14}, {10, 12, 13}, {10, 12, 14}, {11, 14, 4}, {12, 13, 14}, 
			{12, 14, 4}, {13, 14, 4}, {14, 4, 5}, {14, 4, 6}
		};
		
		primePathsRequirements = new Integer[][] {
			{1, 3, 4, 6, 7, 8, 9, 10, 12, 13, 14}, {6, 7, 8, 9, 10, 12, 13, 14, 4, 5}, 
			{4, 6, 7, 8, 9, 10, 12, 13, 14, 4}, {6, 7, 8, 9, 10, 12, 13, 14, 4, 6}, 
			{7, 8, 9, 10, 12, 13, 14, 4, 6, 7}, {1, 3, 4, 6, 7, 8, 9, 10, 11, 14}, 
			{1, 3, 4, 6, 7, 8, 9, 10, 12, 14}, {8, 9, 10, 12, 13, 14, 4, 6, 7, 8}, 
			{12, 13, 14, 4, 6, 7, 8, 9, 10, 12}, {13, 14, 4, 6, 7, 8, 9, 10, 12, 13}, 
			{14, 4, 6, 7, 8, 9, 10, 12, 13, 14}, {12, 13, 14, 4, 6, 7, 8, 9, 10, 11}, 
			{9, 10, 12, 13, 14, 4, 6, 7, 8, 9}, {10, 12, 13, 14, 4, 6, 7, 8, 9, 10}, 
			{11, 14, 4, 6, 7, 8, 9, 10, 12, 13}, {6, 7, 8, 9, 10, 12, 14, 4, 5}, 
			{6, 7, 8, 9, 10, 11, 14, 4, 6}, {6, 7, 8, 9, 10, 11, 14, 4, 5}, {6, 7, 8, 9, 10, 12, 14, 4, 6}, 
			{7, 8, 9, 10, 12, 14, 4, 6, 7}, {7, 8, 9, 10, 11, 14, 4, 6, 7}, {4, 6, 7, 8, 9, 10, 12, 14, 4}, 
			{1, 3, 4, 6, 7, 10, 12, 13, 14}, {4, 6, 7, 8, 9, 10, 11, 14, 4}, {8, 9, 10, 11, 14, 4, 6, 7, 8}, 
			{12, 14, 4, 6, 7, 8, 9, 10, 11}, {12, 14, 4, 6, 7, 8, 9, 10, 12}, {14, 4, 6, 7, 8, 9, 10, 12, 14},
			{14, 4, 6, 7, 8, 9, 10, 11, 14}, {11, 14, 4, 6, 7, 8, 9, 10, 11}, {9, 10, 11, 14, 4, 6, 7, 8, 9}, 
			{8, 9, 10, 12, 14, 4, 6, 7, 8}, {9, 10, 12, 14, 4, 6, 7, 8, 9}, {10, 12, 14, 4, 6, 7, 8, 9, 10}, 
			{10, 11, 14, 4, 6, 7, 8, 9, 10}, {6, 7, 10, 12, 13, 14, 4, 6}, {6, 7, 10, 12, 13, 14, 4, 5},
			{7, 10, 12, 13, 14, 4, 6, 7}, {8, 7, 10, 12, 13, 14, 4, 5}, {1, 3, 4, 6, 7, 10, 12, 14}, 
			{1, 3, 4, 6, 7, 10, 11, 14}, {4, 6, 7, 10, 12, 13, 14, 4}, {8, 7, 10, 12, 13, 14, 4, 6}, 
			{12, 13, 14, 4, 6, 7, 10, 11}, {12, 13, 14, 4, 6, 7, 10, 12}, {11, 14, 4, 6, 7, 10, 12, 13}, 
			{14, 4, 6, 7, 10, 12, 13, 14}, {13, 14, 4, 6, 7, 10, 12, 13}, {10, 12, 13, 14, 4, 6, 7, 10}, 
			{6, 7, 10, 12, 14, 4, 6}, {6, 7, 10, 12, 14, 4, 5}, {6, 7, 10, 11, 14, 4, 5}, {6, 7, 10, 11, 14, 4, 6}, 
			{8, 7, 10, 11, 14, 4, 5}, {8, 7, 10, 11, 14, 4, 6}, {7, 10, 12, 14, 4, 6, 7}, {7, 10, 11, 14, 4, 6, 7}, 
			{4, 6, 7, 10, 12, 14, 4}, {4, 6, 7, 10, 11, 14, 4}, {8, 7, 10, 12, 14, 4, 5}, {12, 14, 4, 6, 7, 10, 11}, 
			{11, 14, 4, 6, 7, 10, 11}, {12, 14, 4, 6, 7, 10, 12}, {14, 4, 6, 7, 10, 11, 14}, {14, 4, 6, 7, 10, 12, 14},
			{10, 12, 14, 4, 6, 7, 10}, {8, 7, 10, 12, 14, 4, 6}, {10, 11, 14, 4, 6, 7, 10}, 
			{1, 3, 4, 5}, {7, 8, 7}, {8, 7, 8}, {1, 2}
		};
		
		
		// C N , T[] and D[]
		inputs = new int[][] {
			
		};
		
		nodesReached = new TreeSet<Integer>();
		edgesReached = new TreeSet<int[]>(new Comparator<int[]>() {
	        @Override
	        public int compare(int[] o1, int[] o2) {
	        	return Arrays.equals(o1, o2)? 0 : Arrays.hashCode(o1) - Arrays.hashCode(o2);
	        }
	    });
		edgePairsReached = new TreeSet<int[]>(new Comparator<int[]>() {
	        @Override
	        public int compare(int[] o1, int[] o2) {
	        	return Arrays.equals(o1, o2)? 0 : Arrays.hashCode(o1) - Arrays.hashCode(o2);
	        }
	    });
		primePathsReached = new TreeSet<int[]>(new Comparator<int[]>() {
	        @Override
	        public int compare(int[] o1, int[] o2) {
	        	return Arrays.equals(o1, o2)? 0 : Arrays.hashCode(o1) - Arrays.hashCode(o2);
	        }
	    });
		
		for(char[] input: inputs){
			ArrayList<Integer> pathTraveled = calculateWrongPalindrome(input);
			
			// Node Coverage
			nodesReached.addAll(pathTraveled);
			
			// Edge Coverage
			int k = 0;
			while(true){
				if(k < pathTraveled.size() - 1 ){
					edgesReached.add(
						new int[] {pathTraveled.get(k), pathTraveled.get(k+1)}
					);
					k++;
				}else{
					break;
				}
			}
			
			// Edge-Pair Coverage
			k = 0;
			while(true){
				if(k < pathTraveled.size() - 2 ){
					edgePairsReached.add(
						new int[] {pathTraveled.get(k), pathTraveled.get(k+1), pathTraveled.get(k+2)}
					);
					k++;
				}else{
					break;
				}
			}
			
			// Prime Path Coverage
			for(Integer[] primePathRequirement: primePathsRequirements){
				// check if pathTraveled contains primePathRequirement
				
				if(Collections.indexOfSubList(pathTraveled, 
						Arrays.asList(primePathRequirement)) >= 0){
					int[] intArray = Arrays.stream(primePathRequirement).mapToInt(Integer::intValue).toArray();
					primePathsReached.add(
						intArray
					);
				
				}
			}
			
			
		}
		
		System.out.println("Nodes not reached: ");
		for(int s: nodeRequirements){
			if(!nodesReached.contains(s)){
				System.out.println(s);
			}
		}
		System.out.println("How many Nodes reached: "+ nodesReached.size());
		System.out.println();
		
		System.out.println("Edges not reached: ");
		for(int[] s: edgesReached){
			if(!edgesReached.contains(s)){
				System.out.println(Arrays.toString(s));
			}
		}
		
		System.out.println("How many Edges reached: "+ edgesReached.size());
		System.out.println();
		
		System.out.println("Edge-Pairs reached: ");
		for(int[] s: edgePairsReached){
			if(!edgePairsReached.contains(s)){
				System.out.println(Arrays.toString(s));
			}
		}
		System.out.println("How many Edge-Pairs reached: "+ edgePairsReached.size());
		System.out.println();
		
		System.out.println("Prime Paths not reached: ");
		for(Integer[] s: primePathsRequirements){
			int[] intArray = Arrays.stream(s).mapToInt(Integer::intValue).toArray();

			if(!primePathsReached.contains(intArray)){
				System.out.println(Arrays.toString(s));
			}
		}
		System.out.println("How many Prime Paths reached: "+ primePathsReached.size());
		System.out.println();
		
		
		
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
		
		return list;
	}
	
	public static ArrayList<Integer> calculateWrongBank(int C, int N, int[] T, int[] D) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		int[][] tempos = new int[T.length][2];

		for (int i = 0; i < T.length; i++) {
			tempos[i][0] = T[i];
			tempos[i][1] = D[i];
		}
		
		list.add(1);
		// Number 1
		if (N <= C) {

			list.add(2);
			// Number 2
			return list;
		}
		
		else {
			list.add(3);
			// Number 3 - else
		
			int cont = 0;
			List<Integer> termina = new ArrayList<Integer>();
			termina.add(tempos[0][0] + tempos[0][1]);
			int caixas = C - 1;
			
			list.add(4);
			// Number 4
			for (int i = 1; i < N; i++) {
				
				list.add(6);
				// Number 6
				Collections.sort(termina);
				
				list.add(7);
				// Number 7
				while (termina.get(0) <= tempos[i][0]) {
					
					list.add(8);
					// Number 8
					termina.remove(0);
					caixas = caixas + 1;
					if (termina.size() == 0) {
						
						list.add(9);
						// Number 9
						break;
					}
					
					list.add(7);
					// Number 7
					
				}

				list.add(10);
				// Number 10
				if (caixas > 1) {
					
					list.add(11);
					// Number 11
					caixas = caixas - 1;
					termina.add(tempos[i][0] + tempos[i][1]);

				} 

				else {
					Integer atendimento = Collections.min(termina);
					termina.remove(atendimento);
					termina.add(atendimento + tempos[i][1]);
					
					list.add(12);
					// Number 12
					if (atendimento - tempos[i][0] > 20) {
						
						list.add(13);
						// Number 13
						cont = cont + 1;
					}
				}
				
				list.add(14);
				// Number 14
				// i = i + 1 (implicito do for)
				
				list.add(4);
				// Number 4
			}
			
			System.out.print("5 ");
			System.out.println();
			// Number 5
			return list;

		}
	}

}
