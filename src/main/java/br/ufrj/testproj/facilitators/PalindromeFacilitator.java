package br.ufrj.testproj.facilitators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PalindromeFacilitator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nodeRequirements;
		Integer[][] edgeRequirements;
		Integer[][] edgePairRequirements;
		Integer[][] primePathsRequirements;
		char[][] inputs;
		
		Set<Integer> nodesReached;
		Set<int[]> edgesReached;
		Set<int[]> edgePairsReached;
		Set<int[]> primePathsReached;
		
		nodeRequirements = new int [] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14 };
		edgeRequirements = new Integer [][] { 
			{1, 2}, {2, 3}, {2, 6}, {3, 4}, {3, 5}, {4, 5}, {5, 2}, {6, 7}, 
			{7, 8}, {7, 11}, {8, 9}, {8, 10}, {9, 10}, {10, 7}, {11, 12}, {11, 13},
			{12, 14}, {13, 14}
		};
		edgePairRequirements = new Integer [][] {
			{1, 2, 3}, {1, 2, 6}, {2, 3, 4}, {2, 3, 5}, {2, 6, 7}, {3, 5, 2}, 
			{3, 4, 5}, {4, 5, 2}, {5, 2, 3}, {5, 2, 6}, {6, 7, 8}, {6, 7, 11}, 
			{7, 8, 9}, {7, 8, 10},  {7, 11, 12}, {7, 11, 13}, {8, 9, 10}, {8, 10, 7}, 
			{9, 10, 7}, {10, 7, 8}, {10, 7, 11}, {11, 12, 14}, {11, 13, 14}};
		
		primePathsRequirements = new Integer[][] {
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
		
		inputs = new char[][] {
			{'b', 'y', 'b', 'y', 'b', 'y', 'a', 'b'},
			{'a', 'a', ' ', 'a', 'a'},
			{'a', 'a', 'a', 'a', 'a'},
			{'a'},
			{'a','a'},
			{'b', 'x'},
			{},
			{' '},
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
		
		System.out.println("Printing Paths:");
		for(char[] input: inputs){
			ArrayList<Integer> pathTraveled = calculateWrongPalindrome(input);
			System.out.println(pathTraveled);
			
			// Node Coverage
			nodesReached.addAll(pathTraveled);
			
			// Edge Coverage
			for(Integer[] edgeRequirement: edgeRequirements){
				// check if pathTraveled contains primePathRequirement
				
				if(Collections.indexOfSubList(pathTraveled, 
						Arrays.asList(edgeRequirement)) >= 0){
					int[] intArray = Arrays.stream(edgeRequirement).mapToInt(Integer::intValue).toArray();
					edgesReached.add(
						intArray
					);
				
				}
			}
			
			// Edge-Pair Coverage
			for(Integer[] edgePairRequirement: edgePairRequirements){
				// check if pathTraveled contains primePathRequirement
				
				if(Collections.indexOfSubList(pathTraveled, 
						Arrays.asList(edgePairRequirement)) >= 0){
					int[] intArray = Arrays.stream(edgePairRequirement).mapToInt(Integer::intValue).toArray();
					edgePairsReached.add(
						intArray
					);
				
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
		for(Integer[] s: edgeRequirements){
			int[] intArray = Arrays.stream(s).mapToInt(Integer::intValue).toArray();

			if(!edgesReached.contains(intArray)){
				System.out.println(Arrays.toString(s));
			}
		}
		System.out.println("How many Edges reached: "+ edgesReached.size());
		System.out.println();
		
		System.out.println("Edge-Pairs not reached: ");
		for(Integer[] s: edgePairRequirements){
			int[] intArray = Arrays.stream(s).mapToInt(Integer::intValue).toArray();

			if(!edgePairsReached.contains(intArray)){
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

}
