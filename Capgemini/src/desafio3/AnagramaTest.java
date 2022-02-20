package desafio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnagramaTest {

	@Test
	@DisplayName("retorna 2")
	void retornaDois() {
		AnagramaAux anagrama = new AnagramaAux();
		String palavra = "ovo";
		assertEquals(2, anagrama.contador(anagrama.subString(palavra)));
	}

	@Test
	@DisplayName("retorna 2")
	void retornoDois() {
		AnagramaAux anagrama = new AnagramaAux();
		String palavra = "Ovo";
		assertEquals(2, anagrama.contador(anagrama.subString(palavra)));
	}

	@Test
	@DisplayName("retorna 3")
	void retornaTres() {
		AnagramaAux anagrama = new AnagramaAux();
		String palavra = "ifailuhkqq";
		assertEquals(3, anagrama.contador(anagrama.subString(palavra)));
	}

}
