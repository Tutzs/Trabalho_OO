package controle;

import modelo.*;


/**
 * Classe que controla dados
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 * 
 */
public class ControleDados {
	private Dados d = new Dados();

	/**
	 *  chamando o metodo addDados da modelo
	 */
	public ControleDados() {
		d.addDados();
	}

	public Dados getDados() {
		return d;
	}

	public void setDados(Dados d) {
		this.d = d;
	}

	public Empresa[] getEmpresa() {
		return this.d.getEmpresa();
	}

	public int getQtdEmpresa() {
		return this.d.getQtdEmpresa();
	}

	public CLT[] getClt() {
		return this.d.getClt();
	}

	public int getQtdClt() {
		return this.d.getQtdCLT();
	}

	public Estagio[] getEstagio() {
		return this.d.getEstagio();
	}

	public int getQtdEstagio() {
		return this.d.getqtdE();
	}

	/**
	 * Cadastra nova Empresa ou edita uma ja existente
	 * 
	 * @param dadosEmpresa que contem a empresa a ser inserida ou criada
	 * @return boolean, true indicando que a operacao foi bem sucedida
	 */
	public boolean inserirEditarEmpresa(String[] dadosEmpresa) {

		Empresa emp = new Empresa(dadosEmpresa[1], dadosEmpresa[2], dadosEmpresa[3], Integer.parseInt(dadosEmpresa[4]),
				Integer.parseInt(dadosEmpresa[5]));
		d.inserirEditarEmpresa(emp, Integer.parseInt(dadosEmpresa[0]));
		return true;
	}

	/**
	 * Cadastra nova vaga de Estagio ou edita uma ja existente
	 * 
	 * @param dadosVagasEstagio que contem a vaga de estagio a ser inserida ou
	 *                          criada
	 * @return boolean, true indicando que a operacao foi bem sucedida
	 */
	public boolean inserirEditarEstagio(String[] dadosVagasEstagio) {
		Estagio e = new Estagio(dadosVagasEstagio[1], Double.parseDouble(dadosVagasEstagio[2]),
				Integer.parseInt(dadosVagasEstagio[3]), Integer.parseInt(dadosVagasEstagio[4]), dadosVagasEstagio[5],
				dadosVagasEstagio[6]);
		d.inserirEditarEstagio(e, Integer.parseInt(dadosVagasEstagio[0]));
		return true;
	}

	/**
	 * Cadastra nova vaga de CLT ou edita uma ja existente
	 * 
	 * @param dadosVagasCLT que contem a vaga de CLT a ser inserida ou criada
	 * @return boolean, true indicando que a operacao foi bem sucedida
	 */
	public boolean inserirEditarCLT(String[] dadosVagasCLT) {
		CLT c = new CLT(dadosVagasCLT[1], Double.parseDouble(dadosVagasCLT[2]), Integer.parseInt(dadosVagasCLT[3]),
				dadosVagasCLT[4]);
		d.inserirEditarCLT(c, Integer.parseInt(dadosVagasCLT[0]));
		return true;
	}

	/**
	 * Deleta a Empresa escolhida
	 * 
	 * @param i, que indica a posicao da empresa no array
	 * @return true, indicando que a operacao foi bem sucedida
	 */
	public boolean removerEmpresa(int i) {
		String empresaRemovida = d.getEmpresa()[i].getNome();
		if (i == (d.getQtdEmpresa() - 1)) {
			d.setQtdEmpresa(d.getQtdEmpresa() - 1);
			d.getEmpresa()[d.getQtdEmpresa()] = null;
			return true;
		} else {
			int check = 0;
			while (d.getEmpresa()[check].getNome().compareTo(empresaRemovida) != 0) {
				check++;
			}
			for (int j = check; j < d.getQtdEmpresa() - 1; j++) {
				d.getEmpresa()[j] = null;
				d.getEmpresa()[j] = d.getEmpresa()[j + 1];
			}
			d.getEmpresa()[d.getQtdEmpresa()] = null;
			d.setQtdEmpresa(d.getQtdEmpresa() - 1);
			return true;
		}
	}

	/**
	 * Deleta a vaga de Estagio escolhida
	 * 
	 * @param i, que indica a posicao da vaga de Estagio no array
	 * @return true, indicando que a operacao foi bem sucedida
	 */
	public boolean removerVagaEstagio(int i) {
		String estagioRemovida = d.getEstagio()[i].getFuncao();
		if (i == (d.getqtdE() - 1)) {
			d.setqtdE(d.getqtdE() - 1);
			d.getEstagio()[d.getqtdE()] = null;
			return true;
		} else {
			int check = 0;
			while (d.getEstagio()[check].getFuncao().compareTo(estagioRemovida) != 0) {
				check++;
			}
			for (int j = check; j < d.getqtdE() - 1; j++) {
				d.getEstagio()[j] = null;
				d.getEstagio()[j] = d.getEstagio()[j + 1];
			}
			d.getEstagio()[d.getqtdE()] = null;
			d.setqtdE(d.getqtdE() - 1);
			return true;
		}

	}

	/**
	 * Deleta a vaga de CLT escolhida
	 * 
	 * @param i, que indica a posicao da vaga de CLT no array
	 * @return true, indicando que a operacao foi bem sucedida
	 */
	public boolean removerVagaClt(int i) {
		String cltRemovida = d.getClt()[i].getFuncao();
		if (i == (d.getQtdCLT() - 1)) {
			d.setQtdCLT(d.getQtdCLT() - 1);
			d.getClt()[d.getQtdCLT()] = null;
			return true;
		} else {
			int check = 0;
			while (d.getClt()[check].getFuncao().compareTo(cltRemovida) != 0) {
				check++;
			}
			for (int j = check; j < d.getQtdCLT() - 1; j++) {
				d.getClt()[j] = null;
				d.getClt()[j] = d.getClt()[j + 1];
			}
			d.getClt()[d.getQtdCLT()] = null;
			d.setQtdCLT(d.getQtdCLT() - 1);
			return true;
		}
	}

	/**
	 * Compara o nome recebido com os cadastrados para achar a empresa
	 * 
	 * @param nome, representa o nome digitado pelo usuario
	 * @return int, indica a posicao da empresa com o nome indicada
	 */
	public int encontrarEmpresa(String nome) {
		int empresaSelecionada = 0;
		for (int i = 0; i < d.getQtdEmpresa(); i++) {
			if (d.getEmpresa()[i].getNome().equals(nome)) {
				empresaSelecionada = i;
				return empresaSelecionada;
			}
		}
		return 99999;
	}

	/**
	 * Compara o nome recebido com os cadastrados para achar a vaga de Estagio
	 * 
	 * @param nome, representa o nome digitado pelo usuario
	 * @return int, indica a posicao da vaga de estagio com o nome indicada
	 */
	public int encontrarEstagio(String nome) {
		int estagioSelecionada = 0;
		for (int i = 0; i < d.getqtdE(); i++) {
			if (d.getEstagio()[i].getFuncao().equals(nome)) {
				estagioSelecionada = i;
				return estagioSelecionada;
			}
		}
		return 99999;
	}

	/**
	 * Compara o nome recebido com os cadastrados para achar a vaga de CLT
	 * 
	 * @param nome, representa o nome digitado pelo usuario
	 * @return int, indica a posicao da vaga de CLT com o nome indicada
	 */
	public int encontrarClt(String nome) {
		int cltSelecionada = 0;
		for (int i = 0; i < d.getQtdCLT(); i++) {
			if (d.getClt()[i].getFuncao().equals(nome)) {
				cltSelecionada = i;
				return cltSelecionada;
			}
		}
		return 99999;
	}
}
