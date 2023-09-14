package tela;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controle.*;

/**
 * Tela para fazer as buscas
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 * 
 */

public class TelaBuscar implements ActionListener {
	private JFrame j;
	private JLabel t;
	private JTextField b;
	private JButton botao;
	private ControleDados dados;
	private TelaListar d;
	private int x;
	int opcao;
	String s;

	/**
	 * Mostra a tela de busca
	 * 
	 * @param op, opcao selecionada
	 * @param d,  acessa os dados
	 */
	public void mostrarTela(int op, ControleDados d) {
		opcao = op;
		dados = d;

		if (op == 1) {
			s = "Busca de Empresa";
		}
		if (op == 2) {
			s = "Busca de Vaga Estagio";
		}
		if (op == 3) {
			s = "Busca de Vaga CLT";
		}

		j = new JFrame(s);

		if (op == 1) {
			t = new JLabel("Digite o nome da empresa que deseja buscar: ");
			b = new JTextField();
			botao = new JButton("Buscar");

			t.setBounds(30, 10, 400, 30);
			b.setBounds(165, 75, 90, 25);
			botao.setBounds(310, 115, 90, 30);
			t.setFont(new Font("Arial", Font.BOLD, 16));

			j.setLayout(null);

			j.add(t);
			j.add(b);
			j.add(botao);

			j.setSize(430, 200);
			j.setVisible(true);
			j.setLocationRelativeTo(null);
			j.setResizable(false);
			botao.addActionListener(this);
		}
		if (op == 2) {
			t = new JLabel("Digite o nome da vaga estagio que deseja buscar: ");
			b = new JTextField();
			botao = new JButton("Buscar");

			t.setBounds(20, 10, 400, 30);
			b.setBounds(165, 75, 90, 25);
			botao.setBounds(310, 115, 90, 30);
			t.setFont(new Font("Arial", Font.BOLD, 16));

			j.setLayout(null);

			j.add(t);
			j.add(b);
			j.add(botao);

			j.setSize(430, 200);
			j.setVisible(true);
			j.setLocationRelativeTo(null);
			j.setResizable(false);
			botao.addActionListener(this);
		}
		if (op == 3) {
			t = new JLabel("Digite o nome da vaga CLT que deseja buscar: ");
			b = new JTextField();
			botao = new JButton("Buscar");

			t.setBounds(30, 10, 400, 30);
			b.setBounds(165, 75, 90, 25);
			botao.setBounds(310, 115, 90, 30);
			t.setFont(new Font("Arial", Font.BOLD, 16));

			j.setLayout(null);

			j.add(t);
			j.add(b);
			j.add(botao);

			j.setSize(430, 200);
			j.setVisible(true);
			j.setLocationRelativeTo(null);
			j.setResizable(false);
			botao.addActionListener(this);
		}

	}

	/**
	 * Acao voltada para os botoes
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botao) {
			if (opcao == 1) {
				String nomeEmpresa = b.getText();
				x = dados.encontrarEmpresa(nomeEmpresa);
				if (x < 1000) {
					new TelaDetalhe().inserirEditar(4, dados, d, x);
				} else {
					mensagemErroemp();
				}
			}
			if (opcao == 2) {
				String nomeVaga = b.getText();
				x = dados.encontrarEstagio(nomeVaga);
				if (x < 99999) {
					new TelaDetalhe().inserirEditar(5, dados, d, x);
				} else {
					mensagemErrovaga();
				}
			}
			if (opcao == 3) {
				String nomeVaga = b.getText();
				x = dados.encontrarClt(nomeVaga);
				if (x < 99999) {
					new TelaDetalhe().inserirEditar(6, dados, d, x);
				} else {
					mensagemErrovaga();
				}

			}

		}
	}

	/**
	 * Mensagem de erro
	 */
	public void mensagemErroemp() {
		JOptionPane.showMessageDialog(null, "Empresa não cadastrado\n ", null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErrovaga() {
		JOptionPane.showMessageDialog(null, "Vaga não cadastrado\n ", null, JOptionPane.ERROR_MESSAGE);
	}
}
