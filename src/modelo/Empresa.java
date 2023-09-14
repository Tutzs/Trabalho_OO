package modelo;

/**
 * Classe que representa Empresa
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 * 
 */

public class Empresa {
	private String nome;
	private String endereco;
	private String telefone;
	private int qtdClt, qtdEstagio;

	/**
	 * Construtor Empresa
	 * 
	 * @param n,        recebe nome da empresa
	 * @param e,        recebe endereco
	 * @param telefone, recebe telefone
	 * @param vest,     recebe vagas de estagio
	 * @param vclt,     recebe vaga de CLT
	 */
	public Empresa(String n, String e, String telefone, int vest, int vclt) {
		nome = n;
		endereco = e;
		this.telefone = telefone;
		qtdClt = vclt;
		qtdEstagio = vest;
	}

	/**
	 * Sobrescreve metodo toString () das classes Objetc. 
	 * Constroi uma String contendo o valor de todas as variaveis da classe Empresa
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Nome da empresa: " + nome + "\nEndereco: " + endereco + "\n" + "Telefone: " + telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getQtdClt() {
		return qtdClt;
	}

	public void setQtdClt(int qtdClt) {
		this.qtdClt = qtdClt;
	}

	public int getQtdEstagio() {
		return qtdEstagio;
	}

	public void setQtdEstagio(int qtdEstagio) {
		this.qtdEstagio = qtdEstagio;
	}
}