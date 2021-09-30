package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import controller.*;
import view.*;

public class TelaUsuario extends JFrame implements ActionListener {

    private final JFrame janela = new JFrame("Lista de usuarios");
    private final JLabel titulo = new JLabel("Escolha seu usuario");
    private JList<String> listaUsuariosCadastrados;
    private final JButton cadastrar = new JButton("Cadastrar");
    String [] nomePessoa = new String[100];
    private static DadoController dados;

    public TelaUsuario(DadoController d, int op) {

        dados = d;
        switch(op){
            case 1:
        titulo.setFont(new Font("Arial", Font.BOLD, 15));
        titulo.setBounds(110, 30, 200, 30);
        cadastrar.setBounds(140, 100, 100, 30);

           nomePessoa = new TelaCadastroPessoaController(dados).

        break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
