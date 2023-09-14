package modelo;

/**
 * Classe que representa CLT e herda de VagaEmprego
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 * 
 */

public class CLT extends VagaEmprego {
	private String habilidade;

	/**
	 * Construtor CLT
	 * 
	 * @param funcao,  recebe funcao da vaga de CLT
	 * @param salario, recebe salario
	 * @param cargah,  recebe carga horaria
	 * @param h,       recebe habilidade
	 */
	public CLT(String funcao, double salario, int cargah, String h) {
		super(funcao, salario, cargah);
		habilidade = h;
	}

	/**
	 * Sobrescreve metodo toString () das classes Objetc e VagaEmprego. Constroi uma
	 * String contendo o valor de todas as variaveis da classe CLT
	 * 
	 * @return String
	 */

	@Override
	public String toString() {
		return "Cargo: " + funcao + "Salario: " + salario + "Carga horaria: " + cargah + "Habilidade: " + habilidade;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCargah() {
		return cargah;
	}

	public void setCargah(int hrs) {
		cargah = hrs;
	}
}
