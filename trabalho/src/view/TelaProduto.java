package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import controller.*;
import javax.swing.event.*;
import view.*;

public class TelaProduto extends JFrame implements ActionListener {

    private final JFrame janela = new JFrame("Perfil do produto");
    private final JLabel titulo = new JLabel("Prefil do produto");
    private final JLabel nome ;
    private final JLabel id ;
    private final JLabel marca ;
    private final JLabel tamanho;
    private final JLabel valor ;
    private final JLabel cor ;
    private final JLabel categoria ;
    private final JLabel tipoBico ;
    private final JLabel material ;
    private final JLabel circunfCano ;
    private final JLabel alturaSalto ;
    private final JLabel departamento ;
    private final JLabel tipoTrava ;
    private final JLabel modeloCadarco ;
    private final JLabel tipoCorreia  ;
    private final JLabel estetica ;
    private final JLabel alturaCano ;
    private final JLabel modelo ;
    private final JLabel quantidade;
    public static DadoController dados;
    private final JButton comprar = new JButton("Comprar");
    public static int posi;
    

    public TelaProduto(DadoController d,int pos){

        dados=d;
        posi=pos;

        nome = new JLabel("Nome: "+  dados.getNomePro()[pos]);
        id = new JLabel("Id: "+  dados.getId()[pos]);
        marca= new JLabel("Marc: "+  dados.getMarca()[pos]);
        tamanho = new JLabel("Tamanho: "+  dados.getTamanho()[pos]);
        valor = new JLabel("Valor: R$"+  dados.getValor()[pos]);
        cor = new JLabel("Cor: "+  dados.getCor()[pos]);
        categoria = new JLabel("Categoria: "+  dados.getCategoria()[pos]);
        quantidade = new JLabel("Quantidade: "+  dados.getQTdProEst()[pos]);
        tipoBico = new JLabel("Tipo de bico: "+  dados.getTipBico()[pos]);
        material = new JLabel("Material: "+  dados.getMat()[pos]);
        circunfCano = new JLabel("Circunferencia do cano: "+  dados.getCircunfCano()[pos]+" cm");
        alturaSalto = new JLabel("Altura do salto: "+  dados.getAltSalto()[pos]+" cm");
        departamento = new JLabel("Departamento: "+  dados.getDepart()[pos]);
        tipoTrava = new JLabel("Tipo de trava: "+  dados.getTipoTrava()[pos]);
        modeloCadarco = new JLabel("Modelo de cadarco: "+  dados.getModelCadarco()[pos]);
        tipoCorreia = new JLabel("Tipo de correia: "+  dados.getTipoCorrreia()[pos]);
        estetica = new JLabel("Estetica: "+  dados.getEstet()[pos]);
        alturaCano = new JLabel("Altura do cano: "+  dados.getAltCano()[pos]+" cm");
        modelo = new JLabel("Modelo: "+  dados.getModel()[pos]);
        

        titulo.setFont(new Font("Arial", Font.BOLD, 15));
		titulo.setBounds(120, 30, 150, 30);
        nome.setFont(new Font("Arial", Font.BOLD, 13));
		nome.setBounds(10, 60, 400, 30);
        id.setFont(new Font("Arial", Font.BOLD, 13));
		id.setBounds(10, 90, 200, 30);
        marca.setFont(new Font("Arial", Font.BOLD, 13));
		marca.setBounds(10, 120, 200, 30);
        tamanho.setFont(new Font("Arial", Font.BOLD, 13));
		tamanho.setBounds(10, 150, 200, 30);
        valor.setFont(new Font("Arial", Font.BOLD, 13));
		valor.setBounds(10, 180, 200, 30);
        cor.setFont(new Font("Arial", Font.BOLD, 13));
		cor.setBounds(10, 210, 200, 30);
        categoria.setFont(new Font("Arial", Font.BOLD, 13));
		categoria.setBounds(10, 240, 200, 30);

        tipoBico.setFont(new Font("Arial", Font.BOLD, 13));
		tipoBico.setBounds(170, 90, 200, 30);
        material.setFont(new Font("Arial", Font.BOLD, 13));
		material.setBounds(170, 120, 200, 30);

        circunfCano.setFont(new Font("Arial", Font.BOLD, 13));
		circunfCano.setBounds(170, 90, 210, 30);
        alturaSalto.setFont(new Font("Arial", Font.BOLD, 13));
        alturaSalto.setBounds(170, 120, 200, 30);

        departamento.setFont(new Font("Arial", Font.BOLD, 13));
		departamento.setBounds(170, 90, 200, 30);
        tipoTrava.setFont(new Font("Arial", Font.BOLD, 13));
		tipoTrava.setBounds(170, 120, 200, 30);
        modeloCadarco.setFont(new Font("Arial", Font.BOLD, 13));
		modeloCadarco.setBounds(170, 150, 200, 30);

        tipoCorreia.setFont(new Font("Arial", Font.BOLD, 13));
	    tipoCorreia.setBounds(170, 90, 200, 30);
        estetica.setFont(new Font("Arial", Font.BOLD, 13));
		estetica.setBounds(170, 120, 200, 30);

        alturaCano.setFont(new Font("Arial", Font.BOLD, 13));
		alturaCano.setBounds(170, 90, 200, 30);
        modelo.setFont(new Font("Arial", Font.BOLD, 13));
		modelo.setBounds(170, 120, 200, 30);

        janela.setLayout(null);
        janela.add(titulo);
		janela.add(nome);
        janela.add(id);
        janela.add(marca);
        janela.add(tamanho);
        janela.add(valor);
        janela.add(cor);
        janela.add(categoria);
        janela.add(quantidade);

        if(dados.getCategoria()[pos]==1){
            janela.add(tipoBico);
            janela.add(material);

        }else if(dados.getCategoria()[pos]==2){
            janela.add(circunfCano);
            janela.add(alturaSalto);

        }else if(dados.getCategoria()[pos]==3){
            janela.add(departamento);
            janela.add(tipoTrava);
            janela.add(modeloCadarco);

        }else if(dados.getCategoria()[pos]==4){
            janela.add(tipoCorreia);
            janela.add(estetica);

        }else{
            janela.add(alturaCano);
            janela.add(modelo);
        }

        comprar.setBounds(200, 180, 150, 30);

        janela.add(comprar);
        janela.setSize(400, 250);
        janela.setVisible(true);

        comprar.addActionListener(this);
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public JLabel getNome() {
        return nome;
    }

    public JLabel getId() {
        return id;
    }

    public JLabel getMarca() {
        return marca;
    }

    public JLabel getTamanho() {
        return tamanho;
    }

    public JLabel getValor() {
        return valor;
    }

    public JLabel getCor() {
        return cor;
    }

    public JLabel getCategoria() {
        return categoria;
    }

    public JLabel getTipoBico() {
        return tipoBico;
    }

    public JLabel getMaterial() {
        return material;
    }

    public JLabel getCircunfCano() {
        return circunfCano;
    }

    public JLabel getAlturaSalto() {
        return alturaSalto;
    }

    public JLabel getDepartamento() {
        return departamento;
    }

    public JLabel getTipoTrava() {
        return tipoTrava;
    }

    public JLabel getModeloCadarco() {
        return modeloCadarco;
    }

    public JLabel getTipoCorreia() {
        return tipoCorreia;
    }

    public JLabel getEstetica() {
        return estetica;
    }

    public JLabel getAlturaCano() {
        return alturaCano;
    }

    public JLabel getModelo() {
        return modelo;
    }

    public static DadoController getDados() {
        return dados;
    }

    public static void setDados(DadoController dados) {
        TelaProduto.dados = dados;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if(src == comprar){
            JOptionPane.showMessageDialog(null,"Compra efetivada!");
        }


    }

}
