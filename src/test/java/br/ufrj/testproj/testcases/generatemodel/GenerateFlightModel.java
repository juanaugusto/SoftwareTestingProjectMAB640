package br.ufrj.testproj.testcases.generatemodel;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

import com.google.common.primitives.Ints;

public class GenerateFlightModel {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub

		PrintWriter writer = new PrintWriter("flight_input.txt", "UTF-8");

		List<Integer> rangeDuracao = Ints.asList(IntStream.rangeClosed(2, 718).toArray());
		List<Integer> rangeDiferencaFuso = Ints.asList(IntStream.rangeClosed(-10, 11).toArray());

		Collections.shuffle(rangeDuracao);
		Collections.shuffle(rangeDiferencaFuso);

		writer.print("DURACAO: 1, 719, ");

		Iterator<Integer> iterator = rangeDuracao.iterator();

		while (iterator.hasNext()) {

			// Get the next element.
			writer.print("{0}".replace("{0}", Integer.toString(iterator.next())));

			// If there is another element add a comma.
			if (iterator.hasNext()) {
				writer.print(" | ");
			}
		}

		writer.println();

		writer.print("DIFERENCAFUSO: -11, 12, ");

		iterator = rangeDiferencaFuso.iterator();

		while (iterator.hasNext()) {

			// Get the next element.
			writer.print("{0}".replace("{0}", Integer.toString(iterator.next())));

			// If there is another element add a comma.
			if (iterator.hasNext()) {
				writer.print(" | ");
			}
		}

		writer.println();

		writer.close();

	}

}
