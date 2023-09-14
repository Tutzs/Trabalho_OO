package modelo;

/**
 * Classe dados
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 * 
 */

public class Dados {
	private Empresa[] empresa = new Empresa[50];
	private int qtdEmpresa;
	private Estagio[] estagio = new Estagio[50];
	private int qtdE;
	private CLT[] clt = new CLT[50];
	private int qtdCLT;

	/**
	 * Atribui uma informacao a cada iteracao do for
	 */
	public void addDados() {
		for (int i = 0; i < 5; i++) {
			empresa[i] = new Empresa("Empresa" + (1 + i), "Brasilia" + (1 + i), "619876543" + i, 1 + i, 3 + i);
			estagio[i] = new Estagio("Cargo" + (1 + i), 2500 + (100 * i), 4, 3 + i, "Curso" + i, "UnB");
			clt[i] = new CLT("Cargo" + (1 + i), 5000.0 + (250 * i), 8, "Habilidade" + i);
		}
		qtdEmpresa = 5;
		qtdE = 5;
		qtdCLT = 5;
	}

	/**
	 * Metodo para inserir e editar empresa
	 * 
	 * @param emp, recebe uma empresa
	 * @param pos, posicao que vou editar ou inserir
	 */
	public void inserirEditarEmpresa(Empresa emp, int pos) {
		this.empresa[pos] = emp;
		if (pos == qtdEmpresa)
			qtdEmpresa++;
	}

	public Empresa[] getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa[] empresa) {
		this.empresa = empresa;
	}

	public int getQtdEmpresa() {
		return qtdEmpresa;
	}

	public void setQtdEmpresa(int qtdEmpresa) {
		this.qtdEmpresa = qtdEmpresa;
	}

	/**
	 * Metodo para inserir editar Estagio
	 * 
	 * @param e,   recebe uma vaga de estagio
	 * @param pos, posicao que vou editar ou inserir
	 */
	public void inserirEditarEstagio(Estagio e, int pos) {
		this.estagio[pos] = e;
		if (pos == qtdE)
			qtdE++;
	}

	public Estagio[] getEstagio() {
		return estagio;
	}

	public void setEstagio(Estagio[] estagio) {
		this.estagio = estagio;
	}

	public int getqtdE() {
		return qtdE;
	}

	public void setqtdE(int qtdE) {
		this.qtdE = qtdE;
	}

	/**
	 * Metodo para inserir e editar CLT
	 * 
	 * @param c,   recebe uma vaga de CLT
	 * @param pos, posicao que vou editar ou inserir
	 */
	public void inserirEditarCLT(CLT c, int pos) {
		this.clt[pos] = c;
		if (pos == qtdCLT)
			qtdCLT++;
	}

	public CLT[] getClt() {
		return clt;
	}

	public void setClt(CLT[] clt) {
		this.clt = clt;
	}

	public int getQtdCLT() {
		return qtdCLT;
	}

	public void setQtdCLT(int qtdCLT) {
		this.qtdCLT = qtdCLT;
	}

}
