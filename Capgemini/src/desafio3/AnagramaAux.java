package desafio3;

import java.util.ArrayList;
import java.util.List;

public class AnagramaAux {

// @brief -> Respons?vel por gerar substrings e organiz?-las em ordem alfab?tica.

// @param -> Recebe e guarda uma string na vari?vel "palavra". A partir desta string ser?o cridas 
// substrings as quais ser?o transformadas em um vetor do tipo char, organizadas em ordem alfab?tica e armazenadas em um ArrayList.

// @returt -> O algoritmo retornar? um ArrayList contendo as substrings geradas.

	public List<String> subString(String palavra) {
// Responsavel por criar e armazenar as sub strings em um array list

		List<String> anagramas = new ArrayList<String>();

		int tamanhoString = palavra.length();
		char charPalavra[];

// Cira substrings
		for (int inicio = 0; inicio < tamanhoString; inicio++) {
			anagramas.addAll(new ArrayList<String>(inicio));
			for (int fim = inicio + 1; fim < tamanhoString + 1; fim++) {

// Organiza string em ordem alfabetica
				charPalavra = palavra.substring(inicio, fim).toCharArray();

				for (int r = 0; r < tamanhoString; r++) {
					for (int o = 0; o < tamanhoString; o++) {

						char x = ' ';
						char y = ' ';

						if (o < palavra.substring(inicio, fim).length() - 1) {
							if (charPalavra[o] > charPalavra[o + 1]) {

								x = charPalavra[o];
								y = charPalavra[o + 1];

								charPalavra[o + 1] = x;
								charPalavra[o] = y;

							}
						}
					}
				}
				anagramas.add(String.valueOf(charPalavra));
			}
		}

		return anagramas;
	}

// @brief -> Respons?vel por contar a quantidade de anagramas pares dentro do ArrayList.

// @param -> Recebe um ArrayList contendo as substrings de uma palavra. O algoritmo contar? os anagramas pares e armazenar?
// a quantidade na vari?vel contador.

// @returt -> O algoritmo retornar? a quantidade m?xima de anagramas pares.

	public int contador(List<String> anagramas) {
		int i = 0, contador = 0;

		while (i < anagramas.size()) {
			int j = i + 1;
			while (j < anagramas.size()) {
				if (anagramas.get(i).equals(anagramas.get(j))) {
					contador++;
					break;
				}
				j++;
			}
			i++;
		}
		return contador;
	}

}
