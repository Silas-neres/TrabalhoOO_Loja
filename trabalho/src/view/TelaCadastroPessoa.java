package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.*;
import model.*;

public class TelaCadastroPessoa extends JFrame implements ActionListener{

    private final JFrame janela = new JFrame("Cadastro de usuario");
    private final JLabel titulo = new JLabel("Cadastro");
    private final JButton confirmar = new JButton("Confirmar");
    private final JTextField eNome = new JTextField();
    private final JTextField eCpf = new JTextField();
    private final JTextField eDataNasc = new JTextField();
    private final JTextField eTelefone = new JTextField();
    private final JLabel nome = new JLabel("Nome: ");
    private final JLabel cpf = new JLabel("CPF: ");
    private final JLabel dataNasc = new JLabel("Data de nascimento (xx/xx/xx): ");
    private final JLabel telefone = new JLabel("Telefone: ");
    public static DadoController dados = new DadoController();
    public static int o;
    public static int y1;
    

    public TelaCadastroPessoa(DadoController d,int op,int y){
        super();

        dados = d;
        o = op;
        y1=y;

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(250, 30, 150, 30);
        nome.setFont(new Font("Arial", Font.BOLD, 15));
		nome.setBounds(10, 100, 100, 30);
        cpf.setFont(new Font("Arial", Font.BOLD, 15));
		cpf.setBounds(10, 150, 100, 30);
        dataNasc.setFont(new Font("Arial", Font.BOLD, 15));
        dataNasc.setBounds(10, 200, 250, 30);
        telefone.setFont(new Font("Arial", Font.BOLD, 15));
        telefone.setBounds(10, 250, 100, 30);

        eNome.setBounds(250, 100, 250, 30);
        eCpf.setBounds(250, 150, 250, 30);
        eDataNasc.setBounds(250, 200, 250, 30);
        eTelefone.setBounds(250, 250, 250, 30);

        confirmar.setBounds(450, 350, 100, 30);

        janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(nome);
		janela.add(cpf);
        janela.add(dataNasc);
        janela.add(telefone);
        janela.add(eNome);
		janela.add(eCpf);
        janela.add(eDataNasc);
        janela.add(eTelefone);
        janela.add(confirmar);
        
        eNome.addActionListener(this);
		eCpf.addActionListener(this);
        eDataNasc.addActionListener(this);
		eTelefone.addActionListener(this);
        confirmar.addActionListener(this);
		
		janela.setSize(600, 450);
		janela.setVisible(true);

    }

    public JFrame getJanela() {
        return janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        JButton botaoPressionado = (JButton) e.getSource();
    
        if(botaoPressionado == confirmar){
        String nomePessoa = eNome.getText().toUpperCase();
        String cpf = eCpf.getText().toUpperCase();
        String dataNasc = eDataNasc.getText().toUpperCase();
        String telefone = eTelefone.getText().toUpperCase();
        int qtdPessoa = dados.getQtdPessoas();

        TelaCadastroController telaCadastroController = new TelaCadastroController(dados,o, qtdPessoa, nomePessoa, cpf, dataNasc, telefone, y1);
        janela.setVisible(false);
        
        }
        
        
    }

    public JButton getConfirmar() {
        return confirmar;
    }

    public JTextField getENome() {
        return eNome;
    }

    public JTextField getECpf() {
        return eCpf;
    }

    public JTextField getEDataNasc() {
        return eDataNasc;
    }

    public JTextField getETelefone() {
        return eTelefone;
    }

    public JLabel getNome() {
        return nome;
    }

    public JLabel getCpf() {
        return cpf;
    }

    public JLabel getDataNasc() {
        return dataNasc;
    }

    public JLabel getTelefone() {
        return telefone;
    }

}
