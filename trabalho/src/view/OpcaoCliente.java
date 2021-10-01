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
    private final static JButton lista = new JButton("lista de produtos");
    private final static JButton editar = new JButton("Editar");
	public static DadoController dados = new DadoController();
    public static int posi;
    

	public OpcaoCliente(DadoController d, int pos) {

        dados=d;
        posi=pos;


		titulo.setFont(new Font("Arial", Font.BOLD, 15));
		titulo.setBounds(120, 30, 150, 30);
		lista.setBounds(140, 150, 100, 30);
        buscaN.setBounds(140, 200, 100, 30);
        editar.setBounds(140, 100, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(lista);
        janela.add(buscaN);
        janela.add(editar);

		lista.addActionListener(this);
        buscaN.addActionListener(this);
        editar.addActionListener(this);

		janela.setSize(400, 300);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object botaoPressionado = e.getSource();

		if(botaoPressionado == buscaN){
            
        
        }else if(botaoPressionado == lista){
            TelaLista lista = new TelaLista(dados);
        }else{
            TelaEditarPessoa editar = new TelaEditarPessoa(dados,posi);
        }

	}


}
