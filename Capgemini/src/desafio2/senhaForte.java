package desafio2;

import java.util.Scanner;

// @brief ->  Esta fun��o � respons�vel pelo recebimento de dados e chamar 
// sua subfun��o "verifica" que far� a verifica��o dos dados.

// @param -> O usu�rio � respons�vel pela entrada de dados que s�o armazenados na vari�vel "senha" do tipo String. 
// Estes dados ser�o enviados para a subfun��o �verifica�, respons�vel por verificar os elementos da senha e informar
// se a senha � forte ou quantos caracteres faltam para que seja.

public class SenhaForte {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SenhaForteAux forte = new SenhaForteAux();

		String senha;

		System.out.println("Digite a senha: ");
		senha = in.nextLine();
		in.close();

		System.out.println(forte.verifica(senha));

	}
}
