package tela;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import controle.*;

/**
 * Tela para listagem
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 * 
 */

public class TelaListar implements ActionListener, ListSelectionListener {
	private JFrame janela = new JFrame("Listar");
	private JLabel titulo;
	private JLabel tituloEst, tituloClt;
	private JList<String> vC;
	private JList<String> vE;
	private JList<String> emp;
	private JButton cademp, cadClt, cadEst;
	private JButton refreshemp, refreshC, refreshEst;
	private JButton bemp, best, bclt;
	private static ControleDados dados;
	private String[] listaEmpresa = new String[50];
	private String[] listaEstagio = new String[50];
	private String[] listaClt = new String[50];

	/**
	 * Mostra o que cadastramos pela JList
	 * 
	 * @param op, representa a opcao escolhida
	 * @param d,  acessa os dados
	 */
	public void mostrarDados(int op, ControleDados d) {
		dados = d;

		switch (op) {
		case 1:// mostrar dados da empresa
			listaEmpresa = new ControleEmpresa(dados).getNomeEmpresa();
			emp = new JList<String>(listaEmpresa);
			janela = new JFrame("Empresa");
			titulo = new JLabel("Listar Empresas");
			cademp = new JButton("Cadastrar");
			bemp = new JButton("Buscar");
			refreshemp = new JButton("Atualizar");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(185, 10, 250, 30);

			emp.setBounds(20, 70, 490, 120);
			emp.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			emp.setVisibleRowCount(10);

			cademp.setBounds(40, 216, 125, 30);
			refreshemp.setBounds(210, 216, 125, 30);
			bemp.setBounds(375, 216, 125, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(cademp);
			janela.add(refreshemp);
			janela.add(bemp);
			janela.add(emp);

			janela.setBounds(10, 10, 550, 300);
			janela.setVisible(true);
			janela.setResizable(false);

			cademp.addActionListener(this);
			refreshemp.addActionListener(this);
			bemp.addActionListener(this);
			emp.addListSelectionListener(this);

			break;

		case 2: // mostra dados das vagas
			listaEstagio = new ControleEstagio(dados).getFuncaoEstagio();
			vE = new JList<String>(listaEstagio);
			listaClt = new ControleCLT(dados).getFuncaoCLT();
			vC = new JList<String>(listaClt);
			cadClt = new JButton("Cadastrar CLT");
			cadEst = new JButton("Cadastrar Estagio");
			bclt = new JButton("Buscar CLT");
			best = new JButton("Buscar Estagio");
			refreshC = new JButton("Atualizar");
			refreshEst = new JButton("Atualizar");
			janela = new JFrame("Vagas");

			tituloEst = new JLabel("Estagio");
			tituloEst.setFont(new Font("Arial", Font.ITALIC, 15));
			tituloEst.setBounds(80, 25, 250, 30);

			tituloClt = new JLabel("CLT");
			tituloClt.setFont(new Font("Arial", Font.ITALIC, 15));
			tituloClt.setBounds(395, 25, 250, 30);

			titulo = new JLabel("Listar Vagas");
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(200, 5, 250, 30);

			vE.setBounds(20, 50, 200, 120);
			vE.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			vE.setVisibleRowCount(10);

			vC.setBounds(305, 50, 200, 120);
			vC.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			vC.setVisibleRowCount(10);

			cadEst.setBounds(10, 186, 140, 30);
			refreshEst.setBounds(153, 186, 100, 30);
			best.setBounds(75, 219, 120, 30);

			cadClt.setBounds(287, 186, 140, 30);
			refreshC.setBounds(430, 186, 100, 30);
			bclt.setBounds(365, 219, 120, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(tituloClt);
			janela.add(tituloEst);
			janela.add(vC);
			janela.add(vE);
			janela.add(cadClt);
			janela.add(cadEst);
			janela.add(refreshEst);
			janela.add(refreshC);
			janela.add(best);
			janela.add(bclt);

			janela.setBounds(10, 420, 550, 300);
			janela.setVisible(true);
			janela.setResizable(false);

			cadClt.addActionListener(this);
			cadEst.addActionListener(this);
			bclt.addActionListener(this);
			best.addActionListener(this);
			refreshEst.addActionListener(this);
			refreshC.addActionListener(this);
			vC.addListSelectionListener(this);
			vE.addListSelectionListener(this);

			break;

		default:
			JOptionPane.showMessageDialog(null, "Opcao nao encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * Acao voltada para os botoes
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == cademp) {
			new TelaDetalhe().inserirEditar(1, dados, this, 0);
		}
		if (src == cadEst) {
			new TelaDetalhe().inserirEditar(2, dados, this, 0);
		}
		if (src == cadClt) {
			new TelaDetalhe().inserirEditar(3, dados, this, 0);
		}
		if (src == bemp) {
			new TelaBuscar().mostrarTela(1, dados);
		}
		if (src == best) {
			new TelaBuscar().mostrarTela(2, dados);
		}
		if (src == bclt) {
			new TelaBuscar().mostrarTela(3, dados);
		}
		if (src == refreshemp) {
			emp.setListData(new ControleEmpresa(dados).getNomeEmpresa());
			emp.updateUI();
		}
		if (src == refreshEst) {
			vE.setListData(new ControleEstagio(dados).getFuncaoEstagio());
			vE.updateUI();
		}
		if (src == refreshC) {
			vC.setListData(new ControleCLT(dados).getFuncaoCLT());
			vC.updateUI();
		}

	}

	/**
	 * Acao voltada para JList
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == emp) {
			new TelaDetalhe().inserirEditar(4, dados, this, emp.getSelectedIndex());
		}
		if (e.getValueIsAdjusting() && src == vE) {
			new TelaDetalhe().inserirEditar(5, dados, this, vE.getSelectedIndex());
		}
		if (e.getValueIsAdjusting() && src == vC) {
			new TelaDetalhe().inserirEditar(6, dados, this, vC.getSelectedIndex());
		}

	}

}
