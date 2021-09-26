package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaUsuario extends JFrame implements ActionListener {

    private final JFrame janela = new JFrame("Lista de usuarios");
    private final JLabel titulo = new JLabel("Escolha seu usuario");
    private JList<String> listaClientesCadastrados;
    private JList<String> listaVendedoresCadastrados;
    private final JButton voltar = new JButton("Voltar");

    public TelaUsuario() {

        titulo.setFont(new Font("Arial", Font.BOLD, 15));
        titulo.setBounds(110, 30, 200, 30);
        voltar.setBounds(140, 100, 100, 30);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
