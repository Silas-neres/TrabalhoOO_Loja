package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.DadoController;
import controller.TelaMenuController;

public class OpcaoCliente extends JFrame implements ActionListener{
    private final JFrame janela = new JFrame("Opcao do cliente");
	private final JLabel titulo = new JLabel("Escolha uma opcao");
	private final static JButton buscaN = new JButton("Buscar por nome");
	private final static JButton buscaV = new JButton("Buscar por valor maximo");
    private final static JButton lista = new JButton("Lista de produtos");
    private final static JButton editar = new JButton("Editar");
	public static DadoController dados;
    public static int posi;
    public static int x1;

	public OpcaoCliente(DadoController d,int x, int pos) {

        dados=d;
        posi=pos;
		x1 = x;

		titulo.setFont(new Font("Arial", Font.BOLD, 15));
		titulo.setBounds(120, 30, 150, 30);
		lista.setBounds(100, 150, 200, 30);
        buscaN.setBounds(100, 200, 200, 30);
        editar.setBounds(100, 100, 200, 30);
		buscaV.setBounds(100, 250, 200, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(lista);
        janela.add(buscaN);
        janela.add(editar);
		janela.add(buscaV);

		lista.addActionListener(this);
        buscaN.addActionListener(this);
        editar.addActionListener(this);
		buscaV.addActionListener(this);

		janela.setSize(400, 400);
		janela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object botaoPressionado = e.getSource();

		if(botaoPressionado == buscaN){
            TelaBusca busca = new TelaBusca(dados,x1);
        
        }else if(botaoPressionado == lista){
            TelaLista lista = new TelaLista(dados,x1,1);
        }else if(botaoPressionado == editar){
            TelaEditarPessoa editar = new TelaEditarPessoa(dados,posi);
        }else{
			TelaBuscaValor buscaValor = new TelaBuscaValor(dados,x1);
		}

	}


}
