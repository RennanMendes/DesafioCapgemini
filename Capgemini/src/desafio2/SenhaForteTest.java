package desafio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SenhaForteTest {

	@Test
	@DisplayName("retorna 3")
	void retornaTres() {
		String senha = "Ya3";
		SenhaForteAux senhaOk = new SenhaForteAux();
		assertEquals(3, senhaOk.verifica(senha));
	}

	@Test
	@DisplayName("retorna 3")
	void retornaDois() {
		String senha = "1998";
		SenhaForteAux senhaOk = new SenhaForteAux();
		assertEquals(3, senhaOk.verifica(senha));
	}

	@Test
	@DisplayName("retorna 0")
	void retornaZero() {
		String senha = "Abc@12";
		SenhaForteAux senhaOk = new SenhaForteAux();
		assertEquals(0, senhaOk.verifica(senha));
	}

	@Test
	@DisplayName("retorna 2")
	void retornoDois() {
		String senha = "Ab1!";
		SenhaForteAux senhaOk = new SenhaForteAux();
		assertEquals(2, senhaOk.verifica(senha));
	}

}
