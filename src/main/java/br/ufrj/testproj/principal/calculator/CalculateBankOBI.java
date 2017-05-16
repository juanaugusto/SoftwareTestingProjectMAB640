package br.ufrj.testproj.principal.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import com.google.common.primitives.Ints;

public class CalculateBankOBI extends CalculateGeneral {
	
	private int returnedValue;

	public CalculateBankOBI calculateWrongBank(int C, int N, int[] T, int[] D) {
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
			
			this.pathPercurred = list;
			this.returnedValue = 0;
			return this;
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
						termina.remove(atendimento);
						termina.add(atendimento + tempos[i][1]);
					}catch(NoSuchElementException e){
						atendimento = -1;
						
						termina.remove(atendimento);
						
						atendimento = 0;
						termina.add(atendimento + tempos[i][1]);
					}
					
					
					
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

			this.pathPercurred = list;
			this.returnedValue = cont;
			return this;

		}
	}
	
	public int getReturnedValue() {
		return returnedValue;
	}

	public void setReturnedValue(int returnedValue) {
		this.returnedValue = returnedValue;
	}
}
