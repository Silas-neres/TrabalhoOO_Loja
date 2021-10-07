package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import controller.*;
import javax.swing.event.*;
import view.*;

public class TelaLista extends JFrame implements ActionListener, ListSelectionListener {

    private final JFrame janela = new JFrame("Lista de produtos");
    private final JLabel titulo = new JLabel("Lista de produtos");
    private final JButton atualizar = new JButton("Atualizar");
    private JList<String> listaProdutosCadastrados;
    String[] nomeProduto = new String[100];
    private static DadoController dados;
    private static int x1;
    private static int o;

    public TelaLista(DadoController d, int x, int op) {
        dados = d;
        x1 = x;
        o = op;

        titulo.setFont(new Font("Arial", Font.BOLD, 15));
        titulo.setBounds(250, 30, 150, 30);
        atualizar.setBounds(700, 550, 100, 30);

        nomeProduto = new TelaListaController(dados).getNomePr(x1);

        listaProdutosCadastrados = new JList<String>(nomeProduto);
        listaProdutosCadastrados.setBounds(20, 50, 550, 350);
        listaProdutosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaProdutosCadastrados.setVisibleRowCount(10);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(atualizar);
        janela.add(listaProdutosCadastrados);

        janela.setSize(800, 650);
        janela.setVisible(true);

        atualizar.addActionListener(this);
        listaProdutosCadastrados.addListSelectionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == atualizar) {
            listaProdutosCadastrados.setListData(new TelaListaController(dados).getNomePr(x1));
            listaProdutosCadastrados.updateUI();
        }
        System.out.println(x1);
        System.out.println(dados.getNomePro()[15]);
        System.out.println(dados.getPessoas()[3]);
        System.out.println(dados.getTipoUser()[3]);

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (o == 1) {
            if (e.getValueIsAdjusting() && src == listaProdutosCadastrados) {
                TelaProduto produto = new TelaProduto(dados, listaProdutosCadastrados.getSelectedIndex());
            }
        } else if(o == 0){
            if (e.getValueIsAdjusting() && src == listaProdutosCadastrados) {
                TelaEditarProduto editProduto = new TelaEditarProduto(dados, listaProdutosCadastrados.getSelectedIndex());
            }
        }
        janela.setVisible(false);

    }
}
