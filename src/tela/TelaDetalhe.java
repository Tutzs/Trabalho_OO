package tela;

import java.awt.event.*;
import javax.swing.*;

import controle.*;

/**
 * Tela para detalhes, cadastro e editar
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 * 
 */
public class TelaDetalhe implements ActionListener {
	private JFrame j;
	private JLabel nomeEmp = new JLabel("Nome: ");
	private JTextField nome = new JTextField();
	private JLabel end = new JLabel("Endereco: ");
	private JTextField endereco = new JTextField();
	private JLabel telefone = new JLabel("Telefone: ");
	private JTextField tel = new JTextField();
	private JLabel qtdEst = new JLabel("Qtd de vagas Estagio: ");
	private JTextField qtdv = new JTextField();
	private JLabel qtdClt = new JLabel("Qtd de vagas CLT");
	private JTextField qtdC = new JTextField();
	private JLabel cargo = new JLabel("Cargo: ");
	private JTextField carg = new JTextField();
	private JLabel salario = new JLabel("Salario: ");
	private JTextField sal = new JTextField();
	private JLabel cargah = new JLabel("Carga horaria: ");
	private JTextField ch = new JTextField();
	private JLabel semestre = new JLabel("Semestre: ");
	private JTextField sem = new JTextField();
	private JLabel universidade = new JLabel("Universidade: ");
	private JTextField uni = new JTextField();
	private JLabel curso = new JLabel("Curso: ");
	private JTextField crs = new JTextField();
	private JLabel habilidade = new JLabel("Habilidade: ");
	private JTextField hab = new JTextField();
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[50];
	private ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	/**
	 * Metodo para cadastrar ou editar
	 * 
	 * @param op,  opcao selecionada
	 * @param d,   acessa os dados
	 * @param l,   permite acesso aos dados da tela listar
	 * @param pos, posicao no JList
	 */
	public void inserirEditar(int op, ControleDados d, TelaListar l, int pos) {
		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Empresa";
		if (op == 2)
			s = "Cadastro de Vaga Estagio";
		if (op == 3)
			s = "Cadastro de Vaga CLT";
		if (op == 4)
			s = "Detalhe de Empresa";
		if (op == 5)
			s = "Detalhe de Vaga Estagio";
		if (op == 6)
			s = "Detalhe de Vaga CLT";

		j = new JFrame(s);

		// Preenche dados com dados da empresa clicada
		if (op == 4) {
			nome = new JTextField(d.getEmpresa()[pos].getNome(), 200);
			endereco = new JTextField(d.getEmpresa()[pos].getEndereço(), 200);
			tel = new JTextField(d.getEmpresa()[pos].getTelefone(), 200);
			qtdv = new JTextField(String.valueOf(d.getEmpresa()[pos].getQtdEstagio()), 200);
			qtdC = new JTextField(String.valueOf(d.getEmpresa()[pos].getQtdClt()), 200);
		}

		// Preenche dados com dados do Estagio clicado
		if (op == 5) {
			carg = new JTextField(d.getEstagio()[pos].getFuncao(), 200);
			sal = new JTextField(String.valueOf(d.getEstagio()[pos].getSalario()), 200);
			ch = new JTextField(String.valueOf(d.getEstagio()[pos].getCargah()), 200);
			sem = new JTextField(String.valueOf(d.getEstagio()[pos].getSemestre()), 200);
			uni = new JTextField(d.getEstagio()[pos].getUniversidade(), 200);
			crs = new JTextField(d.getEstagio()[pos].getCurso(), 200);
		}

		// Preenche dados com dados do CLT clicado
		if (op == 6) {
			carg = new JTextField(d.getClt()[pos].getFuncao(), 200);
			sal = new JTextField(String.valueOf(d.getClt()[pos].getSalario()), 200);
			ch = new JTextField(String.valueOf(d.getClt()[pos].getCargah()), 200);
			hab = new JTextField(d.getClt()[pos].getHabilidade(), 200);
		}

		if (op == 4 || op == 5 || op == 6) {
			botaoExcluir.setBounds(330, 250, 150, 30);
			botaoSalvar.setBounds(200, 250, 150, 30);
			this.j.add(botaoExcluir);
		}

		j.setSize(600, 350);
		j.setVisible(true);
		j.setLocationRelativeTo(null);
		j.setLayout(null);
		j.setResizable(false);

		nomeEmp.setBounds(10, 10, 150, 30);
		nome.setBounds(150, 10, 330, 30);
		end.setBounds(10, 40, 150, 30);
		endereco.setBounds(150, 40, 330, 30);
		telefone.setBounds(10, 70, 150, 30);
		tel.setBounds(150, 70, 330, 30);
		qtdEst.setBounds(10, 100, 150, 30);
		qtdv.setBounds(150, 100, 330, 30);
		qtdClt.setBounds(10, 130, 150, 30);
		qtdC.setBounds(150, 130, 330, 30);

		cargo.setBounds(10, 10, 150, 30);
		carg.setBounds(150, 10, 330, 30);
		salario.setBounds(10, 40, 150, 30);
		sal.setBounds(150, 40, 330, 30);
		cargah.setBounds(10, 70, 150, 30);
		ch.setBounds(150, 70, 330, 30);

		universidade.setBounds(10, 100, 150, 30);
		uni.setBounds(150, 100, 330, 30);
		curso.setBounds(10, 130, 150, 30);
		crs.setBounds(150, 130, 330, 30);
		semestre.setBounds(10, 160, 150, 30);
		sem.setBounds(150, 160, 330, 30);

		habilidade.setBounds(10, 100, 150, 30);
		hab.setBounds(150, 100, 330, 30);

		botaoSalvar.setBounds(300, 265, 150, 30);
		botaoExcluir.setBounds(100, 265, 150, 30);

		if (op == 3 || op == 6) {
			this.j.add(habilidade);
			this.j.add(hab);
		}
		if (op == 2 || op == 5) {
			this.j.add(universidade);
			this.j.add(uni);
			this.j.add(curso);
			this.j.add(crs);
			this.j.add(semestre);
			this.j.add(sem);
		}
		if (op == 1 || op == 4) {
			this.j.add(nomeEmp);
			this.j.add(nome);
			this.j.add(end);
			this.j.add(endereco);
			this.j.add(telefone);
			this.j.add(tel);
			this.j.add(qtdEst);
			this.j.add(qtdv);
			this.j.add(qtdClt);
			this.j.add(qtdC);
			this.j.add(botaoSalvar);
			this.j.add(botaoExcluir);
		} else {
			this.j.add(cargo);
			this.j.add(carg);
			this.j.add(salario);
			this.j.add(sal);
			this.j.add(cargah);
			this.j.add(ch);
			this.j.add(botaoSalvar);
			this.j.add(botaoExcluir);
		}

		this.j.setSize(550, 350);
		this.j.setVisible(true);
		this.j.setLocationRelativeTo(null);
		this.j.setLayout(null);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);

	}

	/**
	 * Acao voltada para os botoes
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res = false;
				if (opcao == 1) {
					novoDado[0] = Integer.toString(dados.getQtdEmpresa());
				} else if (opcao == 2) {
					novoDado[0] = Integer.toString(dados.getQtdEstagio());
				} else if (opcao == 3) {
					novoDado[0] = Integer.toString(dados.getQtdClt());
				} else {
					novoDado[0] = Integer.toString(posicao);
				}

				if (opcao == 1 || opcao == 4) {
					novoDado[1] = nome.getText();
					novoDado[2] = end.getText();
					novoDado[3] = tel.getText();
					novoDado[4] = qtdv.getText();
					novoDado[5] = qtdC.getText();
					res = dados.inserirEditarEmpresa(novoDado);
				} else if (opcao == 2 || opcao == 5) {
					novoDado[1] = carg.getText();
					novoDado[2] = sal.getText();
					novoDado[3] = ch.getText();
					novoDado[4] = sem.getText();
					novoDado[5] = crs.getText();
					novoDado[6] = uni.getText();
					res = dados.inserirEditarEstagio(novoDado);
				} else {
					novoDado[1] = carg.getText();
					novoDado[2] = sal.getText();
					novoDado[3] = ch.getText();
					novoDado[4] = hab.getText();
					res = dados.inserirEditarCLT(novoDado);
				}

				if (res) {
					mensagemSucessoCadastro();
				} else
					mensagemErroCadastro();
			} catch (NumberFormatException exc1) {
				mensagemErroCadastro();
			}
		}

		if (src == botaoExcluir) {
			boolean res = false;
			if (opcao == 4) {
				res = dados.removerEmpresa(posicao);
				if (res) {
					mensagemSucessoExclusao();
				} else {
					mensagemErroExclusao();
				}
			}
			if (opcao == 5) {
				res = dados.removerVagaEstagio(posicao);
				if (res) {
					mensagemSucessoExclusao();
				} else {
					mensagemErroExclusao();
				}
			}
			if (opcao == 6) {
				res = dados.removerVagaClt(posicao);
				if (res) {
					mensagemSucessoExclusao();
				} else {
					mensagemErroExclusao();
				}

			}

		}

	}

	/**
	 * Mensagem de sucesso
	 */
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		j.dispose();
	}

	/**
	 * Mensagem de erro
	 */
	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null, "ERRO AO SALVAR OS DADOS!\n ", null, JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Mensagem de sucesso
	 */
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		j.dispose();
	}

	/**
	 * Mensagem de erro
	 */
	public void mensagemErroExclusao() {
		JOptionPane.showMessageDialog(null, "OCORREU UM ERRO AO EXCLUIR OS DADOS!", null, JOptionPane.ERROR_MESSAGE);
	}

}
