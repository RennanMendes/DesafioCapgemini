package desafio2;

import java.util.Scanner;

public class senhaForte {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int faltaCaracter = 0, contVerdadeiro = 0;
		char charSenha[];
		String senha;
		boolean digitoOk = false, minusculoOk = false, maiusculoOk = false, especialOk = false;

		System.out.println("Digite a senha: ");
		senha = in.nextLine();

		charSenha = senha.toCharArray();
		for (int i = 0; i < charSenha.length; i++) {

			if (charSenha[i] >= 48 && charSenha[i] <= 57)
				digitoOk = true;

			if (charSenha[i] >= 97 && charSenha[i] <= 122)
				minusculoOk = true;

			if (charSenha[i] >= 65 && charSenha[i] <= 90)
				maiusculoOk = true;

			if ((charSenha[i] >= 33 && charSenha[i] <= 47) || charSenha[i] >= 58 && charSenha[i] <= 64) {
				especialOk = true;
			}

		}

		if (charSenha.length < 6) {
			faltaCaracter = 6 - charSenha.length;
			System.out.println(faltaCaracter);
		}

		else {

			if (!digitoOk)
				contVerdadeiro++;

			if (!minusculoOk)
				contVerdadeiro++;

			if (!maiusculoOk)
				contVerdadeiro++;

			if (!especialOk)
				contVerdadeiro++;

			System.out.println(contVerdadeiro);

			if (contVerdadeiro == 0)
				System.out.println("Sua senha � forte!");
		}
		in.close();
	}


}
