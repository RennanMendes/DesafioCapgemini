package desafio2;

// @brief -> Responsável por verificar se a string recebida atende aos padrões mínimos para que a senha seja considerada segura.

// @param -> Recebe e guarda uma string na variável "senha". Em seguida a transforma em um vetor de char para verificar se os
// elementos contidos na senha atendem as exigências mínimas de uma senha segura.

// @returt -> O algoritmo retornará um dado do tipo int informando quantos caracteres faltam para uma senha segura.

public class SenhaForteAux {

	public int verifica(String senha) {

		int faltaCaracter = 0, contVerdadeiro = 0;
		char charSenha[];
		boolean digitoOk = false, minusculoOk = false, maiusculoOk = false, especialOk = false;

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

		faltaCaracter = 6 - charSenha.length;

		if (!digitoOk)
			contVerdadeiro++;

		if (!minusculoOk)
			contVerdadeiro++;

		if (!maiusculoOk)
			contVerdadeiro++;

		if (!especialOk)
			contVerdadeiro++;

		if (contVerdadeiro > 0 || faltaCaracter != 0) {
			if (contVerdadeiro >= faltaCaracter) {
				return contVerdadeiro;
			} else {
				return faltaCaracter;
			}
		} else {
			return contVerdadeiro;
		}

	}

}
