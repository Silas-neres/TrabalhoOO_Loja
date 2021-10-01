package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.DadoController;
import controller.TelaMenuController;

public class OpcaoVendedor extends JFrame implements ActionListener{
    private final JFrame janela = new JFrame("Opcao do cliente");
	private final JLabel titulo = new JLabel("Escolha uma opcao");
	private final static JButton verEstoque = new JButton("verEstoque");
    private final static JButton editarV = new JButton("Editar perfil");
    private final static JButton cadastraPro = new JButton("Castrar produto");
	public static DadoController dados = new DadoController();
    public static int posi;
    public static int x = 0;

    public OpcaoVendedor(DadoController d, int pos){

        dados=d;
        posi=pos;

		titulo.setFont(new Font("Arial", Font.BOLD, 15));
		titulo.setBounds(120, 30, 150, 30);
		verEstoque.setBounds(120, 150, 150, 30);
        editarV.setBounds(120, 200, 150, 30);
        cadastraPro.setBounds(120, 100, 150, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(verEstoque);
        janela.add(editarV);
        janela.add(cadastraPro);

		verEstoque.addActionListener(this);
        editarV.addActionListener(this);
        cadastraPro.addActionListener(this);

		janela.setSize(400, 300);
		janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botaoPressionado = e.getSource();

		if(botaoPressionado == cadastraPro){
           TelaOpcaoProduto tp = new TelaOpcaoProduto(dados, posi);
        
        }else if(botaoPressionado == verEstoque){
            TelaLista lista = new TelaLista(dados);
        }else{
            TelaEditarPessoa editar = new TelaEditarPessoa(dados,posi);
        }
        
    }
}
