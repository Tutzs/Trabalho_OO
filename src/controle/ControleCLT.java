package controle;

import modelo.*;
/**
 * Classe que controla CLT
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 *	
 */

public class ControleCLT {
	private CLT[] c;
	private int qtdCLT;

	/**
	 * 
	 * @param d, acessa os dados
	 */
	public ControleCLT(ControleDados d) {
		c = d.getClt();
		qtdCLT = d.getQtdClt();
	}

	/**
	 * Armazena as vagas em um vetor de String 
	 * 
	 * @return String, um vetor de string com as vagas de CLT
	 */
	public String[] getFuncaoCLT() {
		String[] s = new String[qtdCLT];
		for (int i = 0; i < qtdCLT; i++) {
			s[i] = c[i].getFuncao();
		}
		return s;
	}

	public int getQtd() {
		return qtdCLT;
	}

	public void setQtd(int qtd) {
		qtdCLT = qtd;
	}

	public String getFuncao(int i) {
		return c[i].getFuncao();
	}

	public double getSalario(int i) {
		return c[i].getSalario();
	}

	public int getCargah(int i) {
		return c[i].getCargah();
	}

	public String getHabilidade(int i) {
		return c[i].getHabilidade();
	}

	public void setQtdClt(int qtdClt) {
		this.qtdCLT = qtdClt;
	}

}
