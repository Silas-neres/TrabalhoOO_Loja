package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import controller.*;
import javax.swing.event.*;
import view.*;

public class TelaBusca extends JFrame implements ActionListener, ListSelectionListener {

    private final JFrame janela = new JFrame("Busca");
    private final JLabel titulo = new JLabel("Escreva o nome do produto");
    private final JButton confirmar = new JButton("Confirmar");
    private final JTextField eNome = new JTextField();
    private JList<String> listaProdutosCadastrados;
    String[] nomeProduto = new String[100];
    private static DadoController dados;
    private static String nomePro = null;

    public TelaBusca(DadoController d) {

        eNome.setBounds(40, 180, 250, 30);
        listaProdutosCadastrados.setBounds(20, 50, 350, 120);
        confirmar.setBounds(10, 180, 80, 30);

        janela.setLayout(null);

        nomeProduto = new TelaListaController(dados).getNomePro(nomePro);

        listaProdutosCadastrados = new JList<String>(nomeProduto);

        listaProdutosCadastrados.setBounds(20, 50, 350, 120);
        listaProdutosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaProdutosCadastrados.setVisibleRowCount(10);

        janela.add(listaProdutosCadastrados);
        janela.add(eNome);
        janela.add(confirmar);

        janela.setSize(600, 450);
		janela.setVisible(true);

        listaProdutosCadastrados.addListSelectionListener(this);
        eNome.addActionListener(this);
        confirmar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if(src == confirmar){
            nomePro = eNome.getText().toUpperCase();
            listaProdutosCadastrados.setListData(new TelaListaController(dados).getNomePro(nomePro));			
            listaProdutosCadastrados.updateUI();
        }

    }

    public void valueChanged(ListSelectionEvent e) {
        // TODO Auto-generated method stub

    }

}
