package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.DadoController;
import controller.TelaMenuController;

public class OpcaoVendedor extends JFrame implements ActionListener{
    private final JFrame janela = new JFrame("Opcao do vendedor");
	private final JLabel titulo = new JLabel("Escolha uma opcao");
	private final static JButton verEstoque = new JButton("Ver estoque");
    private final static JButton editarV = new JButton("Editar perfil");
    private final static JButton cadastraPro = new JButton("Castrar produto");
	public static DadoController dados;
    public static int posi;
    public static int x1;

    public OpcaoVendedor(DadoController d,int x, int pos){

        dados=d;
        posi=pos;
        x1=x;

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
            x1++;
           TelaOpcaoProduto tp = new TelaOpcaoProduto(dados, x1 ,posi);
        
        }else if(botaoPressionado == verEstoque){
            TelaLista lista = new TelaLista(dados,x1,0);
        }else{
            TelaEditarPessoa editar = new TelaEditarPessoa(dados,posi);
        }
        
    }
}
