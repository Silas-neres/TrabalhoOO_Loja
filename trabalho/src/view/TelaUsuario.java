package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import controller.*;
import javax.swing.event.*;
import view.*;

public class TelaUsuario extends JFrame implements ActionListener, ListSelectionListener {

    private final JFrame janela = new JFrame("Lista de usuarios");
    private final JLabel titulo = new JLabel("Escolha seu usuario");
    private JList<String> listaUsuariosCadastrados;
    private final JButton cadastrarV = new JButton("Cadastrar");
    private final JButton cadastrarC = new JButton("Cadastrar");
    private final JButton atualizarV = new JButton("Atualizar");
    private final JButton atualizarC = new JButton("Atualizar");
    String[] nomePessoa = new String[100];
    private static DadoController dados = new DadoController();
    private static int y1;
    private static int o;
    private static int x1;

    public void telaUsuario(DadoController d,int x,int y, int op) {
        dados = d;
        o = op;
        x1=x;
        y1 = y;

        switch (op) {
            case 1:

                titulo.setFont(new Font("Arial", Font.BOLD, 15));
                titulo.setBounds(110, 30, 200, 30);
                cadastrarC.setBounds(200, 177, 100, 30);
                atualizarC.setBounds(80, 177, 100, 30);

                nomePessoa = new TelaUsuarioController(dados).getNomeP(1, y);

                listaUsuariosCadastrados = new JList<String>(nomePessoa);
                listaUsuariosCadastrados.setBounds(20, 50, 350, 120);
                listaUsuariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaUsuariosCadastrados.setVisibleRowCount(10);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(listaUsuariosCadastrados);
                janela.add(cadastrarC);
                janela.add(atualizarC);

                janela.setSize(400, 250);
                janela.setVisible(true);

                cadastrarC.addActionListener(this);
                atualizarC.addActionListener(this);
                listaUsuariosCadastrados.addListSelectionListener(this);

                break;
            case 0:

                titulo.setFont(new Font("Arial", Font.BOLD, 15));
                titulo.setBounds(110, 30, 200, 30);
                cadastrarV.setBounds(200, 177, 100, 30);
                atualizarV.setBounds(80, 177, 100, 30);

                nomePessoa = new TelaUsuarioController(dados).getNomeP(0, y);

                listaUsuariosCadastrados = new JList<String>(nomePessoa);
                listaUsuariosCadastrados.setBounds(20, 50, 350, 120);
                listaUsuariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaUsuariosCadastrados.setVisibleRowCount(10);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(listaUsuariosCadastrados);
                janela.add(cadastrarV);
                janela.add(atualizarV);

                janela.setSize(400, 250);
                janela.setVisible(true);

                cadastrarV.addActionListener(this);
                atualizarV.addActionListener(this);
                listaUsuariosCadastrados.addListSelectionListener(this);
                break;
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == cadastrarC) {
            TelaCadastroPessoa telaCadastroPessoa = new TelaCadastroPessoa(dados, 1, y1);
            y1++;
        } else if (src == cadastrarV) {
            TelaCadastroPessoa telaCadastroPessoa = new TelaCadastroPessoa(dados, 0, y1);
            y1++;
        } else if (src == atualizarC) {

            listaUsuariosCadastrados.setListData(new TelaUsuarioController(dados).getNomeP(1, y1));
            listaUsuariosCadastrados.updateUI();
        } else if (src == atualizarV) {
            listaUsuariosCadastrados.setListData(new TelaUsuarioController(dados).getNomeP(0, y1));
            listaUsuariosCadastrados.updateUI();
        }
        System.out.println(dados.getPessoas()[3]);
        System.out.println(dados.getTipoUser()[3]);

    }

    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaUsuariosCadastrados && o == 1) {
            OpcaoCliente opcao = new OpcaoCliente(dados,x1,listaUsuariosCadastrados.getSelectedIndex());
        } else if (e.getValueIsAdjusting() && src == listaUsuariosCadastrados && o == 0) {
            OpcaoVendedor opcao = new OpcaoVendedor(dados,x1, listaUsuariosCadastrados.getSelectedIndex());
        }
    }

}
