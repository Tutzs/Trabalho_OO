package testeJUnit;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import controle.ControleDados;
/**
 * Implementa os teste unitarios
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 *	
 */

class TestesJUnit {
	ControleDados dados = new ControleDados();
	String[] novoDado = new String[13];
	
	/**
	 * verifica se novoDado, representa novos dados para o objeto
	 * O objeto em questao e estagio
	 * @return void
	 */
	@Test
	void testInserirEditarEstagio() {
		novoDado[0] = "0";
		novoDado[1] = "Cargo 1";
		novoDado[2] = "1500.0";
		novoDado[3] = "4";
		novoDado[4] = "3";
		novoDado[5] = "Engenharia";
		novoDado[6] = "UnB";
		assertTrue(dados.inserirEditarEstagio(novoDado));
	}

	/**
	 * Verifica se o metodo em questao esta funcionando corretamente 
	 * @return void
	 */
	@Test
	void testEncontrarEmpresa() {
		assertEquals(0, dados.encontrarEmpresa("Empresa1"));
	}
	
	/**
	 * Verifica se o parametro 1, representa a uma empresa do array
	 * funciona para o metodo em questao
	 * @return void
	 */
	@Test
	void testRemoverEmpresa() {
		assertTrue(dados.removerEmpresa(1));
	}
}
