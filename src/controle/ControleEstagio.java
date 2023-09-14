package controle;

import modelo.*;
/**
 * Classe que controla Estagio
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 *	
 */

public class ControleEstagio {
	private Estagio[] estagios;
	private int qtdEst;
	
	/**
	 * 
	 * @param d, acessa os dados
	 */
	public ControleEstagio(ControleDados d) {
		estagios = d.getEstagio();
		qtdEst = d.getQtdEstagio();
	}
	
	/**
	 * Armazena as funcoes em um vetor de String
	 * 
	 * @return String, um vetor de string com as vagas de estagio
	 */
	public String[] getFuncaoEstagio() {
		String[] s = new String[qtdEst];
		for (int i = 0; i < qtdEst; i++) {
			s[i] = estagios[i].getFuncao();
		}
		return s;
	}
	
	public int getQtd() {
		return qtdEst;
	}
	
	public void setQtd(int qtd) {
		qtdEst = qtd;
	}
	
	public String getFuncao(int i) {
		return estagios[i].getFuncao();
	}
	
	public double getSalario(int i) {
		return estagios[i].getSalario();
	}
	
	public int getCargah(int i) {
		return estagios[i].getCargah();
	}
	
	public int getSemestre(int i) {
		return estagios[i].getSemestre();
	}
	
	public String getCurso(int i) {
		return estagios[i].getCurso();
	}
	
	public String getUni(int i) {
		return estagios[i].getUniversidade();
	}
	
	public void setQtdEstagio(int qtdEstagio) {
		qtdEst = qtdEstagio;
	}
	
	
}
