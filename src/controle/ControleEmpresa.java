package controle;

import modelo.*;
/**
 * Classe que controla Empresa
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 *	
 */

public class ControleEmpresa {
	private Empresa[] e;
	private int qtdEmpresa;

	/**
	 * 
	 * @param d, acessa os dados
	 */
	public ControleEmpresa(ControleDados d) {
		e = d.getEmpresa();
		qtdEmpresa = d.getQtdEmpresa();
	}

	/**
	 * Armazena os nomes em um vetor de String 
	 * @return String, um vetor de string com os nomes da empresa
	 */
	public String[] getNomeEmpresa() {
		String[] s = new String[qtdEmpresa];
		for (int i = 0; i < qtdEmpresa; i++) {
			s[i] = e[i].getNome();
		}
		return s;
	}
	

	public int getQtd() {
		return qtdEmpresa;
	}

	public void setQtd(int qtd) {
		this.qtdEmpresa = qtd;
	}

	public String getNome(int i) {
		return e[i].getNome();
	}

	public String getEndereco(int i) {
		return e[i].getEndereço();
	}

	public String getTelefone(int i) {
		return e[i].getTelefone();
	}

	public int getVagasEst(int i) {
		return e[i].getQtdEstagio();
	}
	
	public int getVagasClt(int i) {
		return e[i].getQtdClt();
	}
	
	public void setQtdEmpresa(int qtdEmpresa) {
		this.qtdEmpresa = qtdEmpresa;
	}
}
