package br.ufrj.testproj.facilitators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class BankFacilitator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nodeRequirements;
		Integer[][] edgeRequirements;
		Integer[][] edgePairRequirements;
		Integer[][] primePathsRequirements;
		int[][] inputs;
		
		Set<Integer> nodesReached;
		Set<int[]> edgesReached;
		Set<int[]> edgePairsReached;
		Set<int[]> primePathsReached;
		
		nodeRequirements = new int [] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14 };
		edgeRequirements = new Integer [][] { 
			{1, 2}, {1, 3}, {3, 4}, {4, 5}, {4, 6}, {6, 7}, {7, 8}, {7, 10}, 
			{8, 7}, {8, 9}, {9, 10}, {10, 11}, {10, 12}, {11, 14}, {12, 13}, 
			{12, 14}, {13, 14}, {14, 4}
		};
		edgePairRequirements = new Integer [][] {
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
		
		
		// C, N , T[] and D[]	
		
		// meet Node Requirements
		inputs = new int[][] {
			{1}, {1}, {0}, {1},
			{1}, {10}, {0,5,10,15,20,25,30,30,30,30}, {4,5,6,6,5,4,10,10,10,10},
		};
		
		// meet Edge Requirements
//		inputs = new int[][] {
//			{2}, {2}, {0, 0}, {1, 1},
//			{1}, {10}, {0,5,10,15,20,25,30,30,30,30}, {1,2,3,4,5,6,7,8,9,10},
//			{3}, {4}, {0,2,4,4}, {3,1,1,1}
//		};
		
		// meet Edge-Pair Requirements
//		inputs = new int[][] {
//			{2}, {2}, {0, 0}, {1, 1},
//			{1}, {10}, {0,5,10,15,20,25,30,30,30,30}, {1,2,3,4,5,6,7,8,9,10},
//			{3}, {10}, {0,3,6,9,12,15,18,21,24,27}, {9,9,9,9,9,9,9,9,9,9},
//			{3}, {4}, {0,2,4,4}, {3,1,1,1},
//			{3}, {4}, {0,2,4,4}, {3,3,3,1}
//		};		
		
		// meet Prime Path Requirements
//		inputs = new int[][] {
//			{2}, {2}, {0, 0}, {1, 1},
//			{1}, {10}, {0,5,10,15,20,25,30,30,30,30}, {1,2,3,4,5,6,7,8,9,10},
//			{3}, {10}, {0,3,6,9,12,15,18,21,24,27}, {9,9,9,9,9,9,9,9,9,9},
//			{3}, {4}, {0,2,4,4}, {3,1,1,1},
//			{3}, {4}, {0,2,4,4}, {3,3,3,1}
//		};	
		
//		inputs = new int[][] {
//			{2}, {2}, {0, 0}, {1, 1},
//			{1}, {10}, {0,5,10,15,20,25,30,30,30,30}, {1,2,3,4,5,6,7,8,9,10},
//			{3}, {10}, {0,3,6,9,12,15,18,21,24,27}, {9,9,9,9,9,9,9,9,9,9},
//			{3}, {4}, {0,2,4,4}, {3,1,1,1}
//		};
		
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
		for(int i = 0; i < inputs.length; i=i+4){
			ArrayList<Integer> pathTraveled = calculateWrongBank(inputs[i][0], 
																inputs[i+1][0],
																inputs[i+2],
																inputs[i+3]);
			System.out.println("Path traveled: "+ pathTraveled);
			
			// Node Coverage
			nodesReached.addAll(pathTraveled);
			System.out.println("Nodes reached: "+ new TreeSet<Integer>(pathTraveled));
			
			// Edge Coverage
			System.out.print("Edges Reached: ");
			for(Integer[] edgeRequirement: edgeRequirements){
				// check if pathTraveled contains primePathRequirement				
				if(Collections.indexOfSubList(pathTraveled, 
						Arrays.asList(edgeRequirement)) >= 0){
					int[] intArray = Arrays.stream(edgeRequirement).mapToInt(Integer::intValue).toArray();
					System.out.print(Arrays.asList(edgeRequirement)+" ");
					edgesReached.add(
						intArray
					);
				
				}
			}
			System.out.println();			
			
			// Edge-Pair Coverage
			System.out.print("Edge-Pairs Reached: ");
			for(Integer[] edgePairRequirement: edgePairRequirements){
				// check if pathTraveled contains primePathRequirement			
				if(Collections.indexOfSubList(pathTraveled, 
						Arrays.asList(edgePairRequirement)) >= 0){
					int[] intArray = Arrays.stream(edgePairRequirement).mapToInt(Integer::intValue).toArray();
					System.out.print(Arrays.asList(edgePairRequirement)+" ");
					edgePairsReached.add(
						intArray
					);
				
				}
			}
			System.out.println();			

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
			System.out.println();
			
		}
		
		System.out.println("\n\nPrinting General Statistics");
		
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
		
		System.out.println("Prime Paths not already reached: ");
		for(Integer[] s: primePathsRequirements){
			int[] intArray = Arrays.stream(s).mapToInt(Integer::intValue).toArray();

			if(!primePathsReached.contains(intArray)){
				System.out.println(Arrays.toString(s));
			}
		}
		System.out.println("How many Prime Paths reached: "+ primePathsReached.size());
		System.out.println();
		
		
		
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
			System.out.println("Output: "+0);
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
					Integer atendimento;
					try{
						atendimento = Collections.min(termina);
					}catch(NoSuchElementException e){
						atendimento = -1;
					}
					
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
			
			list.add(5);
			// Number 5
			System.out.println("Output: "+cont);
			return list;

		}
	}

}
