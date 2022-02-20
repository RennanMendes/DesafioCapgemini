package desafio1;

// @brief -> Esta função é responsável pelo recebimento de um número inteiro informado pelo o usuário.
// Após a entrada, o algoritmo imprimirá uma escada com o caracter "*" organizado à direita. 

// @param -> O usuário é responsável por informar o valor de "n" que é correspondente a quantidade de caracteres na base da escada.
// Será verificado se o número informado pelo usuário é um numero válido (inteiro e positivo) e imprimira uma escada de "*"
// utilizando o caractere "espaço" para organiza-la no lado direito do console.

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
				System.out.println("Entrada inválida, digite um número inteiro!");

		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida, digite um número inteiro!");
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
