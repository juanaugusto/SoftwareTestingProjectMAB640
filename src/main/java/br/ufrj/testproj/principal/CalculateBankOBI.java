package br.ufrj.testproj.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class CalculateBankOBI {

	public static int calculateWrongBank(int C, int N, int[] T, int[] D) {

		int[][] tempos = new int[T.length][2];

		for (int i = 0; i < T.length; i++) {
			tempos[i][0] = T[i];
			tempos[i][1] = D[i];
		}
		
		System.out.print("1 ");
		// Number 1
		if (N <= C) {

			System.out.print("2 ");
			System.out.println();
			// Number 2
			return 0;
		}
		
		else {
			System.out.print("3 ");
			// Number 3 - else
		
			int cont = 0;
			List<Integer> termina = new ArrayList<Integer>();
			termina.add(tempos[0][0] + tempos[0][1]);
			int caixas = C - 1;
			
			System.out.print("4 ");
			// Number 4
			for (int i = 1; i < N; i++) {
				
				System.out.print("6 ");
				// Number 6
				Collections.sort(termina);
				
				System.out.print("7 ");
				// Number 7
				while (termina.get(0) <= tempos[i][0]) {
					
					System.out.print("8 ");
					// Number 8
					termina.remove(0);
					caixas = caixas + 1;
					if (termina.size() == 0) {
						
						System.out.print("9 ");
						// Number 9
						break;
					}
				}

				System.out.print("10 ");
				// Number 10
				if (caixas > 1) {
					
					System.out.print("11 ");
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
					
					System.out.print("12 ");
					// Number 12
					if (atendimento - tempos[i][0] > 20) {
						
						System.out.print("13 ");
						// Number 13
						cont = cont + 1;
					}
				}
				
				System.out.print("14 ");
				// Number 14
				// i = i + 1 (implicito do for)
			}
			
			System.out.print("5 ");
			System.out.println();
			// Number 5
			return cont;

		}
	}
}
