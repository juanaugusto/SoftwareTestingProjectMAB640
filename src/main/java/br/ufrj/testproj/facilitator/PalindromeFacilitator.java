package br.ufrj.testproj.facilitator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.ufrj.testproj.facilitator.graphcoverage.Facilitator;
import br.ufrj.testproj.principal.CalculatePalindromeOBI;

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
//			{'a', 'b', 'b', 'b', 'a', 'a'},
//			{'b', 'y', 'b', 'y', 'b', 'y', 'a', 'c', ' '},
//			{'a', 'a', ' ', 'a', 'a'},
//			{' ', 'a', ' ','a', ' '},
//			{'b', 'x'},
//			{'a'},
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
			ArrayList<Integer> pathTraveled = new CalculatePalindromeOBI()
					.calculateWrongPalindrome(input)
					.getPathPercurred();
			
			calculateReachedForCriterias(pathTraveled);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromeFacilitator pf = new PalindromeFacilitator();
		pf.createPalindromeFacilitator();
		pf.showStatistics();
					
	}
	
	

}
