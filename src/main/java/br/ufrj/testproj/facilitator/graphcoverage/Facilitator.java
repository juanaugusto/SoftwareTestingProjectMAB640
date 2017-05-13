package br.ufrj.testproj.facilitator.graphcoverage;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

import org.apache.commons.lang3.ArrayUtils;

import com.google.common.primitives.Ints;

public class Facilitator {
	
	protected int[] nodeRequirements;
	protected int[][] edgeRequirements;
	protected int[][] edgePairRequirements;
	protected int[][] primePathsRequirements;
	
	protected ArrayList<Integer> nodesReached;
	protected ArrayList<int[]> edgesReached;
	protected ArrayList<int[]> edgePairsReached;
	protected ArrayList<int[]> primePathsReached;
	
	protected ArrayList<int[]> infeasibleNodes;
	protected ArrayList<int[]> infeasibleEdges;
	protected ArrayList<int[]> infeasibleEdgePairs;
	protected ArrayList<int[]> infeasiblePrimePaths;
	
	public Facilitator() {
		super();
		
		this.nodesReached = new ArrayList<Integer>();
		this.edgesReached = new ArrayList<int[]>();
		this.edgePairsReached = new ArrayList<int[]>();
		this.primePathsReached = new ArrayList<int[]>();
		
		this.infeasiblePrimePaths = new ArrayList<int[]>();

	}
		
	public void calculateReachedForCriterias(ArrayList<Integer> pathTraveled){
		System.out.println("Path traveled: "+pathTraveled);
		
		// Node Coverage
		System.out.print("Node coverage: ");
		for(int nodeRequirement: nodeRequirements){
			
			List<Integer> listNodeRequirements = Arrays.asList(ArrayUtils.toObject(new int[] {nodeRequirement}));
			if(Collections.indexOfSubList(pathTraveled, 
					listNodeRequirements) >= 0){
				System.out.print(nodeRequirement + " ");

				if(!nodesReached.contains(nodeRequirement)){
					nodesReached.add(nodeRequirement);
				}
				
			}
		}
		System.out.println();
					
		// Edge Coverage
		System.out.print("Edge coverage: ");
		for(int[] edgeRequirement: edgeRequirements){
		
			List<Integer> listEdgeRequirements = Arrays.asList(ArrayUtils.toObject(edgeRequirement));
			if(Collections.indexOfSubList(pathTraveled, 
					listEdgeRequirements) >= 0){
				System.out.print(Arrays.toString(edgeRequirement) + " ");

				if(!edgesReached.contains(edgeRequirement)){
					edgesReached.add(edgeRequirement);
				}
			
			}
		}
		System.out.println();
		
		// Edge-Pair Coverage
		System.out.print("Edge Pair coverage: ");
		for(int[] edgePairRequirement: edgePairRequirements){
			
			List<Integer> listEdgePairRequirements = Arrays.asList(ArrayUtils.toObject(edgePairRequirement));
			if(Collections.indexOfSubList(pathTraveled, 
					listEdgePairRequirements) >= 0){
				System.out.print(Arrays.toString(edgePairRequirement) + " ");
				
				if(!edgePairsReached.contains(edgePairRequirement)){
					edgePairsReached.add(edgePairRequirement);
				}
				
			
			}
		}
		System.out.println();

		// Prime Path Coverage
		System.out.print("Prime Path coverage: ");
		for(int[] primePathRequirement: primePathsRequirements){

			List<Integer> listPrimePathRequirements = Arrays.asList(ArrayUtils.toObject(primePathRequirement));
			if(Collections.indexOfSubList(pathTraveled, 
					listPrimePathRequirements) >= 0){
				System.out.print(Arrays.toString(primePathRequirement) + " ");
				
				if(!primePathsReached.contains(primePathRequirement)){
					primePathsReached.add(primePathRequirement);
				}
			
			}
		}
		System.out.println();

		
		System.out.println();
	}
	
	public void showStatistics(){
		
		System.out.print("\nPrinting General Statistics\n\n");
		
		System.out.println("Nodes not reached: ");
		for(int s: nodeRequirements){
			if(!nodesReached.contains(s)){
				System.out.println(s);
			}
		}
		System.out.println("How many Nodes reached: "+ nodesReached.size());
		System.out.println();
		
		System.out.println("Edges not reached: ");
		for(int[] s: edgeRequirements){

			if(!edgesReached.contains(s)){
				System.out.println(Arrays.toString(s));
			}
		}
		System.out.println("How many Edges reached: "+ edgesReached.size());
		System.out.println();
		
		System.out.println("Edge-Pairs not reached: ");
		for(int[] s: edgePairRequirements){

			if(!edgePairsReached.contains(s)){
				System.out.println(Arrays.toString(s));
			}
		}
		System.out.println("How many Edge-Pairs reached: "+ edgePairsReached.size());
		System.out.println();
		
		System.out.println("Prime Paths not already reached: ");
		for(int[] s: primePathsRequirements){

			if(!primePathsReached.contains(s)){
				System.out.println(Arrays.toString(s));
			}
		}
		System.out.println("How many Prime Paths reached: "+ primePathsReached.size());
		System.out.println();
		
	}
	
	
	

}
