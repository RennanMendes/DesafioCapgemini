package desafio1;

// @brief -> Esta fun??o ? respons?vel pelo recebimento de um n?mero inteiro informado pelo o usu?rio.
// Ap?s a entrada, o algoritmo imprimir? uma escada com o caracter "*" organizado ? direita. 

// @param -> O usu?rio ? respons?vel por informar o valor de "n" que ? correspondente a quantidade de caracteres na base da escada.
// Ser? verificado se o n?mero informado pelo usu?rio ? um numero v?lido (inteiro e positivo) e imprimira uma escada de "*"
// utilizando o caractere "espa?o" para organiza-la no lado direito do console.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = 0;

		try {
			System.out.print("Digite o valor da base do triangulo ");
			n = in.nextInt();
			in.close();

			if (n < 0)
				System.out.println("Entrada inv?lida, digite um n?mero inteiro!");

		} catch (InputMismatchException e) {
			System.out.println("Entrada inv?lida, digite um n?mero inteiro!");
		}

		System.out.println();
		for (int cont = 1; cont <= n; cont++) {

			for (int espaco = n - cont; espaco >= 0; espaco--) {
				System.out.print(" ");
			}

			for (int imprime = cont; imprime > 0; imprime--) {
				System.out.print("*");
			}

			System.out.print("\n");
		}

	}

}
