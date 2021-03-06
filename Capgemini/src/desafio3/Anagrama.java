package desafio3;

// @brief ->  Esta fun??o ? respons?vel pelo recebimento de dados e chamar 
// suas subfun??es  subString e contador, que ir?o realizar o tratamento dos dados.

// @param -> O usu?rio ? respons?vel pela entrada de dados que s?o armazenados na vari?vel palavra do tipo String. 
// Estes dados ser?o enviados para a subfun??o ?subString? respons?vel por trat?-los. Os mesmos 
// ser?o retornados em um ArrayList e enviados para a subfun??o ?contador?, a qual retornar? o maior 
// n?mero poss?vel de anagramas pares.

import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		AnagramaAux sub = new AnagramaAux();

		String palavra;

		System.out.println("Digite uma palavra:");
		palavra = in.nextLine();
		in.close();

		sub.subString(palavra);
		if (sub.subString(palavra).isEmpty()) {
			System.out.println("Entrada inv?lida, digite uma palavra v?lida!");
		} else {
			System.out.println(sub.contador(sub.subString(palavra)));
		}

	}

}
