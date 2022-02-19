package desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagrama {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> anagramas = new ArrayList<String>();

		char charPalavra[];
		String palavra;
		int tamanhoString = 0, contador=0;

//------------------------------------------------------Entrada de dados ------------------------------------------------------------------------------------------
//Responsavel por receber os dados e verificar quantos caracteres existe dentro da String;

		System.out.println("Digite uma palavra:");
		palavra = in.nextLine();

		tamanhoString = palavra.length();
		in.close();
//-----------------------------------------------------Cria subStrings----------------------------------------------------------------------------------------------
//Responsavel por criar e armazenar as sub strings em um array list	

//Cira sub strings----------------------------------------------------------------------------------------------------------------------------------------------------
		for (int inicio = 0; inicio < tamanhoString; inicio++) {
			anagramas.addAll(new ArrayList<String>(inicio));
			for (int fim = inicio + 1; fim < tamanhoString + 1; fim++) {

//Organiza Palavra------------------------------------------------------------------------------------------------------------------------------------------------
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

//Transforma array char em String-------------------------------------------------------------------------------------------------------------------------------------

				anagramas.add(String.valueOf(charPalavra));

			}
		}		
		
		int i = 0;
		while(i < anagramas.size()) {
			int j = i + 1;
			while(j < anagramas.size()) {
				if (anagramas.get(i).equals(anagramas.get(j))) {
					contador++;
					break;
				}
				j++;
			}
			i++;
		}
		System.out.println(contador);
	}


}
