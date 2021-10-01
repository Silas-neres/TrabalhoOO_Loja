package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.*;
import model.*;


public class TelaCadastroProduto extends JFrame implements ActionListener{
	
	

    private final JFrame janela = new JFrame("Cadastro de Produto");
    private final JLabel titulo = new JLabel("Cadastro");
    private final JButton confirmar = new JButton("Confirmar");
    private final JTextField eMarca= new JTextField();
    private final JTextField eNome = new JTextField();
    private final JTextField eId = new JTextField();
    private final JTextField eTamanho = new JTextField();
    private final JTextField eCor= new JTextField();
    private final JTextField eValorProduto= new JTextField();
    private final JTextField eCategoria = new JTextField();
    private final JTextField eQuantidade = new JTextField();
    private final JTextField eTipoBico= new JTextField();
    private final JTextField eMaterial= new JTextField();
    private final JTextField eCircun= new JTextField();
    private final JTextField eAlturaSalto= new JTextField();
    private final JTextField eDepart= new JTextField();
    private final JTextField eTipoTrava= new JTextField();
    private final JTextField eModelCadar= new JTextField();
    private final JTextField eTipoCorreia= new JTextField();
    private final JTextField eEstet= new JTextField();
    private final JTextField eAlturaCano= new JTextField();
    private final JTextField eModelo= new JTextField();
    private final JLabel marca = new JLabel("Marca: ");
    private final JLabel nome = new JLabel("Nome: ");
    private final JLabel id = new JLabel("ID: ");
    private final JLabel tamanho = new JLabel("Tamanho: ");
    private final JLabel cor = new JLabel("Cor: ");
    private final JLabel valorProduto = new JLabel("Valor: ");
    private final JLabel quantidade = new JLabel("Quantidade: ");
    private final JLabel tipoBico = new JLabel("Tipo de bico: ");
    private final JLabel material = new JLabel("Material: ");
    private final JLabel circunfer = new JLabel("Cicunfe. do cano: ");
    private final JLabel departamento = new JLabel("Departamento: ");
    private final JLabel alturaSalto = new JLabel("Altura do salto: ");
    private final JLabel tipoTrava = new JLabel("Tipo de trava: ");
    private final JLabel modeloCadar = new JLabel("Modelo do cadarco: ");
    private final JLabel tipoCorreia = new JLabel("Tipode de correia: ");
    private final JLabel estetica = new JLabel("Estetica: ");
    private final JLabel alturaCano = new JLabel("Altura do cano: ");
    private final JLabel modelo = new JLabel("Modelo: ");
    public static DadoController dados = new DadoController();
    public static int x1;
    public static int y;
    

    public TelaCadastroProduto (DadoController d,int x){

        dados = d;
        x1 =x;


        titulo.setFont(new Font("Arial", Font.BOLD, 15));
		titulo.setBounds(120, 30, 150, 30);

        nome.setFont(new Font("Arial", Font.BOLD, 13));
		nome.setBounds(10, 60, 100, 30);
        eNome.setBounds(101, 60, 400, 30);

        id.setFont(new Font("Arial", Font.BOLD, 13));
		id.setBounds(10, 90, 200, 30);
        eId.setBounds(101, 90, 200, 30);

        marca.setFont(new Font("Arial", Font.BOLD, 13));
		marca.setBounds(10, 120, 200, 30);
        eMarca.setBounds(101, 120, 200, 30);

        tamanho.setFont(new Font("Arial", Font.BOLD, 13));
		tamanho.setBounds(10, 150, 200, 30);
        eTamanho.setBounds(101, 150, 200, 30);

        valorProduto.setFont(new Font("Arial", Font.BOLD, 13));
		valorProduto.setBounds(10, 180, 200, 30);
        eValorProduto.setBounds(101, 180, 200, 30);

        cor.setFont(new Font("Arial", Font.BOLD, 13));
		cor.setBounds(10, 210, 200, 30);
        eCor.setBounds(101, 210, 200, 30);

        tipoBico.setFont(new Font("Arial", Font.BOLD, 13));
		tipoBico.setBounds(300, 90, 200, 30);
        eTipoBico.setBounds(350, 90, 200, 30);

        material.setFont(new Font("Arial", Font.BOLD, 13));
		material.setBounds(300, 120, 200, 30);
        eMaterial.setBounds(350, 120, 200, 30);

        circunfer.setFont(new Font("Arial", Font.BOLD, 13));
		circunfer.setBounds(300, 90, 210, 30);
        eCircun.setBounds(350, 90, 210, 30);

        alturaSalto.setFont(new Font("Arial", Font.BOLD, 13));
        alturaSalto.setBounds(300, 120, 200, 30);
        eAlturaSalto.setBounds(350, 120, 200, 30);

        departamento.setFont(new Font("Arial", Font.BOLD, 13));
		departamento.setBounds(300, 90, 200, 30);
        eDepart.setBounds(350, 90, 200, 30);

        tipoTrava.setFont(new Font("Arial", Font.BOLD, 13));
		tipoTrava.setBounds(300, 120, 200, 30);
        eTipoTrava.setBounds(350, 120, 200, 30);

        modeloCadar.setFont(new Font("Arial", Font.BOLD, 13));
		modeloCadar.setBounds(300, 150, 200, 30);
        eModelCadar.setBounds(350, 150, 200, 30);

        tipoCorreia.setFont(new Font("Arial", Font.BOLD, 13));
	    tipoCorreia.setBounds(300, 90, 200, 30);
        eTipoCorreia.setBounds(350, 90, 200, 30);

        estetica.setFont(new Font("Arial", Font.BOLD, 13));
		estetica.setBounds(300, 120, 200, 30);
        eEstet.setBounds(350, 120, 200, 30);

        alturaCano.setFont(new Font("Arial", Font.BOLD, 13));
		alturaCano.setBounds(300, 90, 200, 30);
        eAlturaCano.setBounds(350, 90, 200, 30);

        modelo.setFont(new Font("Arial", Font.BOLD, 13));
		modelo.setBounds(300, 120, 200, 30);
        eModelo.setBounds(350, 120, 200, 30);
       

        confirmar.setBounds(500, 450, 100, 30);

        janela.setLayout(null);
		
		janela.setLayout(null);
        janela.add(titulo);
		janela.add(nome);
        janela.add(id);
        janela.add(marca);
        janela.add(tamanho);
        janela.add(valorProduto);
        janela.add(cor);
        janela.add(quantidade);

		janela.add(eNome);
        janela.add(eId);
        janela.add(eMarca);
        janela.add(eTamanho);
        janela.add(eValorProduto);
        janela.add(eCor);
        janela.add(eQuantidade);

        if(y==1){
            janela.add(tipoBico);
            janela.add(material);
            janela.add(eMaterial);
            janela.add(eTipoBico);

        }else if(y==2){
            janela.add(circunfer);
            janela.add(alturaSalto);
            janela.add(eAlturaSalto);
            janela.add(eCircun);

        }else if(y==3){
            janela.add(departamento);
            janela.add(tipoTrava);
            janela.add(modeloCadar);
            janela.add(eDepart);
            janela.add(eTipoTrava);
            janela.add(eModelCadar);

        }else if(y==4){
            janela.add(tipoCorreia);
            janela.add(estetica);
            janela.add(eTipoCorreia);
            janela.add(eEstet);

        }else{
            janela.add(alturaCano);
            janela.add(modelo);
            janela.add(eAlturaCano);
            janela.add(eModelo);
        }
        

        confirmar.setBounds(200, 180, 150, 30);

        janela.setSize(400, 250);
        janela.setVisible(true);

        janela.add(confirmar);
		
		janela.setSize(800 , 450);
		janela.setVisible(true);

    }

    public JFrame getJanela() {
        return janela;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
    
        JButton botaoPressionado = (JButton) e.getSource();
    
        if(botaoPressionado == confirmar){
        String marca = eMarca.getText().toUpperCase();
        String nome = eNome.getText().toUpperCase();
        String  id = eId.getText().toUpperCase();
        String sTamanho = eTamanho.getText().toUpperCase();
        int tamanho = Integer.parseInt(sTamanho);
        String cor = eCor.getText().toUpperCase();
        String sValorProduto = eValorProduto.getText().toUpperCase();
        Double valorProduto = Double.parseDouble(sValorProduto);
        String sQuantidade = eQuantidade.getText().toUpperCase();
        int quantidade = Integer.parseInt(sQuantidade);

        if(y==1){
            String tipoBico = eTipoBico.getText().toUpperCase();
            String material = eMaterial.getText().toUpperCase();
            TelaCadastroController cP = new TelaCadastroController(x1,y,dados,nome,marca,id,tamanho,cor,valorProduto,quantidade,tipoBico,material);
            x1++;
        }else if(y==2){
            String sCircunfe = eCircun.getText();
            Double circunfe = Double.parseDouble(sCircunfe);
            String sAlturaSalto = eAlturaSalto.getText();
            Double alturaSalto = Double.parseDouble(sAlturaSalto);
            TelaCadastroController cP = new TelaCadastroController(x1,y,dados,nome,marca,id,tamanho,cor,valorProduto,quantidade,circunfe,alturaSalto);
            x1++;
        }else if(y==3){
            String departamento = eDepart.getText().toUpperCase();
            String tipoTrava = eTipoBico.getText().toUpperCase();
            String modeloCadar = eModelCadar.getText().toUpperCase();
            TelaCadastroController cP = new TelaCadastroController(x1,y,dados,nome,marca,id,tamanho,cor,valorProduto,quantidade,departamento,tipoTrava,modeloCadar);
            x1++;
        }else if(y==4){
            String tipoCorreia = eTipoCorreia.getText().toUpperCase();
            String estetica = eEstet.getText().toUpperCase();
            TelaCadastroController cP = new TelaCadastroController(x1,y,dados,nome,marca,id,tamanho,cor,valorProduto,quantidade,tipoCorreia,estetica);
            x1++;
        }else{
            String sAlturaCano = eAlturaCano.getText();
            Double alturaCano = Double.parseDouble(sAlturaCano);
            String modelo = eModelo.getText().toUpperCase();
            TelaCadastroController cP = new TelaCadastroController(x1,y,dados,nome,marca,id,tamanho,cor,valorProduto,quantidade,alturaCano,modelo);
            x1++;
        }
        
        janela.setVisible(false);
        
        }
        
        
    }

    public JButton getConfirmar() {
        return confirmar;
    }
    
    public JTextField getEMarca() {
    	   return eMarca;
    }

    public JTextField getENome() {
        return eNome;
    }

    public JTextField getEId() {
        return eId;
    }

    public JTextField getETamanho() {
        return eTamanho;
    }
    public JTextField getECor() {
        return eCor;
    }
    public JTextField getEValorProduto() {
        return eValorProduto;
    }
    
    public JTextField getECategoria() {
        return eCategoria;
    }
    public JTextField getEQuantidade() {
        return eQuantidade;
    }
    public JLabel getMarca() {
        return marca;
    }

    public JLabel getNome() {
        return nome;
    }

    public JLabel getId() {
        return id;
    }

    public JLabel getTamanho() {
        return tamanho;
    }
    public JLabel getCor() {
        return cor;
    }
    public JLabel getValorProduto() {
        return valorProduto;
    }
    public JLabel getQuantidade() {
        return quantidade;
    }
  

}

