package modelo;

/**
 * Classe que representa Estagio e herda de VagaEmprego
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 * 
 */

public class Estagio extends VagaEmprego {
	private int semestre;
	private String curso;
	private String universidade;

	/**
	 * Construtor Estagio
	 * 
	 * @param f, recebe funcao da vaga de estagio
	 * @param sal, recebe salario
	 * @param ch, recebe carga horaria
	 * @param s, recebe semestre
	 * @param c, recebe curso
	 * @param uni, recebe universidade
	 */
	public Estagio(String f, double sal, int ch, int s, String c, String uni) {
		super(f, sal, ch);
		semestre = s;
		curso = c;
		universidade = uni;
	}

	/**
	 * Sobrescreve metodo toString () das classes Objetc e VagaEmprego. 
	 * Constroi uma String contendo o valor de todas as variaveis da classe Estagio
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Cargo: " + funcao + "Salario: " + salario + "Carga horaria: " + cargah + "Universidade: " + universidade
				+ "Curso: " + curso + "Semestre: " + semestre;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setfuncao(String funcao) {
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

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

}
