package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.TelaMenuController;

public class TelaMenu extends JFrame implements ActionListener {

	private final JFrame janela = new JFrame("Controle de usuarios");
	private final JLabel titulo = new JLabel("Escolha seu usuario");
	private final JButton vendedor = new JButton("Vendedor");
	private final JButton cliente = new JButton("Cliente");
	private final TelaMenuController controller;

	public TelaMenu() {

		super();
		this.controller = new TelaMenuController(this);
		titulo.setFont(new Font("Arial", Font.BOLD, 15));
		titulo.setBounds(120, 30, 150, 30);
		vendedor.setBounds(140, 100, 100, 30);
		cliente.setBounds(140, 150, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(vendedor);
		janela.add(cliente);

		vendedor.addActionListener(this);
		cliente.addActionListener(this);

		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.controller.EscolhaUsuario(e);

	}

	public JButton getVendedor() {
		return vendedor;
	}

	public JButton getCliente() {
		return cliente;
	}

	public TelaMenuController getController() {
		return controller;
	}

}
