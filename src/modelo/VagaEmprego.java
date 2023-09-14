package modelo;

/**
 * Classe que representa vaga de emprego
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 * 
 */

public abstract class VagaEmprego {
	protected String funcao;
	protected double salario;
	protected int cargah; 

	/**
	 * Construtor VagaEmprego
	 * 
	 * @param f, recebe a funcao da vaga
	 * @param sal, recebe salario
	 * @param ch, recebe carga horaria
	 */
	public VagaEmprego(String f, double sal, int ch) {
		funcao = f;
		salario = sal;
		cargah = ch;
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
