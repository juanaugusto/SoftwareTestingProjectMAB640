package br.ufrj.testproj.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculateBankOBI {

	public static int calculateWrongBank(int C, int N, int[] T, int[] D) {
		
		int[][] tempos = new int[T.length][2];

		for (int i = 0; i < T.length; i++){
			tempos[i][0] = T[i];
			tempos[i][1] = D[i];
		}
		
		if (N <= C) {
			return 0;
		} else {
			int cont = 0;
			List<Integer> termina = new ArrayList<Integer>();
			termina.add(tempos[0][0] + tempos[0][1]);
			int caixas = C - 1;

			for (int i = 1; i < N; i++) {
				
				Collections.sort(termina);
				while (termina.get(0) <= tempos[i][0]) {
					termina.remove(0);
					caixas = caixas + 1;
					if (termina.size() == 0) {
						break;
					}
				}

				if (caixas > 1) {
					caixas = caixas - 1;
					termina.add(tempos[i][0] + tempos[i][1]);

				} else {
					Integer atendimento = Collections.min(termina);
					termina.remove(atendimento);
					termina.add(atendimento + tempos[i][1]);
					if (atendimento - tempos[i][0] > 20) {
						cont = cont + 1;
					}
				}
			}
			return cont;

		}
	}
}
