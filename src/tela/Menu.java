package tela;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controle.*;

/**
 * Classe Menu que inicializa o projeto.
 * 
 * @author Arthur da Silveira Sousa e Maria Eduarda Vieira Monteiro
 * @since 2023
 * @version 1.0
 * 
 */

public class Menu implements ActionListener {
	private static JFrame f = new JFrame("Menu principal"); // nome da janela
	private static JLabel l = new JLabel("Menu"); // titulo do frame
	private static JButton emp = new JButton("Empresa"); // listar empresa
	private static JButton vaga = new JButton("Vaga"); // listar vaga
	public static ControleDados dados = new ControleDados();

	public Menu() {
		f.setSize(470, 250);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setVisible(true);

		l.setFont(new Font("Arial", Font.BOLD, 20));
		l.setBounds(200, 10, 150, 30);
		emp.setBounds(50, 100, 120, 40);
		vaga.setBounds(285, 100, 120, 40);

		f.add(l);
		f.add(emp);
		f.add(vaga);

		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Main que inicializa a tela principal
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Menu menu = new Menu();
		emp.addActionListener(menu);
		vaga.addActionListener(menu);
	}

	/**
	 * Acao voltada aos botoes
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == emp) {
			new TelaListar().mostrarDados(1, dados);
		}
		if (src == vaga) {
			new TelaListar().mostrarDados(2, dados);
		}
	}
}
