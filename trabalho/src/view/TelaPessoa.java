package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.TelaPessoaController;

import view.*;

public class TelaPessoa extends JFrame implements ActionListener {

    private final JFrame janela = new JFrame("Controle de usuarios");
    private final JLabel titulo = new JLabel("Voce ja e cadastrado?");
    private final JButton sim = new JButton("Sim");
    private final JButton nao = new JButton("Nao");
	private final TelaPessoaController controller;

    public TelaPessoa(){
        super();
		this.controller = new TelaPessoaController(this);
        titulo.setFont(new Font("Arial", Font.BOLD, 15));
        titulo.setBounds(110, 30, 200, 30);
		sim.setBounds(140, 100, 100, 30);
		nao.setBounds(140, 150, 100, 30);

        janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(sim);
		janela.add(nao);

		sim.addActionListener(this);
		nao.addActionListener(this);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(HIDE_ON_CLOSE);
		janela.setVisible(true);
    }

    public JButton getSim() {
        return sim;
    }

    public JButton getNao() {
        return nao;
    }

    public TelaPessoaController getController() {
        return controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.controller.verificacaoCadastro(e);
        
    }
    
}
