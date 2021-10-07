package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import controller.*;
import javax.swing.event.*;
import view.*;

public class TelaEditarProduto implements ActionListener {

    private final JFrame janela = new JFrame("Cadastro de Produto");
    private final JLabel titulo = new JLabel("Cadastro");
    private final JButton confirmar = new JButton("Confirmar");
    private final JButton apagar = new JButton("Apagar");
    private final JTextField eMarca;
    private final JTextField eNome;
    private final JTextField eId;
    private final JTextField eTamanho;
    private final JTextField eCor;
    private final JTextField eValorProduto;
    private final JTextField eQuantidade;
    private final JTextField eTipoBico;
    private final JTextField eMaterial;
    private final JTextField eCircun;
    private final JTextField eAlturaSalto;
    private final JTextField eDepart;
    private final JTextField eTipoTrava;
    private final JTextField eModelCadar;
    private final JTextField eTipoCorreia;
    private final JTextField eEstet;
    private final JTextField eAlturaCano;
    private final JTextField eModelo;
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
    public static DadoController dados;
    public static int op;
    public static int posi;
    String recebeString;

    public TelaEditarProduto(DadoController d, int pos) {

        dados = d;
        posi = pos;

        titulo.setFont(new Font("Arial", Font.BOLD, 15));
        titulo.setBounds(120, 30, 150, 30);

        nome.setFont(new Font("Arial", Font.BOLD, 13));
        nome.setBounds(10, 60, 100, 30);
        eNome = new JTextField(dados.getNomePro()[pos]);
        eNome.setBounds(101, 60, 200, 30);

        id.setFont(new Font("Arial", Font.BOLD, 13));
        id.setBounds(10, 90, 200, 30);
        eId = new JTextField(dados.getId()[pos]);
        eId.setBounds(101, 90, 200, 30);

        marca.setFont(new Font("Arial", Font.BOLD, 13));
        marca.setBounds(10, 120, 200, 30);
        eMarca = new JTextField(dados.getMarca()[pos]);
        eMarca.setBounds(101, 120, 200, 30);

        tamanho.setFont(new Font("Arial", Font.BOLD, 13));
        tamanho.setBounds(10, 150, 200, 30);
        recebeString = String.valueOf(dados.getTamanho()[pos]);
        eTamanho = new JTextField(recebeString);
        eTamanho.setBounds(101, 150, 200, 30);

        valorProduto.setFont(new Font("Arial", Font.BOLD, 13));
        valorProduto.setBounds(10, 180, 200, 30);
        recebeString = String.valueOf(dados.getValor());
        eValorProduto = new JTextField(recebeString);
        eValorProduto.setBounds(101, 180, 200, 30);

        cor.setFont(new Font("Arial", Font.BOLD, 13));
        cor.setBounds(10, 210, 200, 30);
        eCor = new JTextField(dados.getCor()[pos]);
        eCor.setBounds(101, 210, 200, 30);

        quantidade.setFont(new Font("Arial", Font.BOLD, 13));
        quantidade.setBounds(10, 240, 200, 30);
        recebeString = String.valueOf(dados.getQTdProEst()[pos]);
        eQuantidade = new JTextField(recebeString);
        eQuantidade.setBounds(101, 240, 200, 30);

        tipoBico.setFont(new Font("Arial", Font.BOLD, 13));
        tipoBico.setBounds(400, 90, 200, 30);
        eTipoBico = new JTextField(dados.getTipBico()[pos]);
        eTipoBico.setBounds(500, 90, 200, 30);

        material.setFont(new Font("Arial", Font.BOLD, 13));
        material.setBounds(400, 120, 200, 30);
        eMaterial = new JTextField(dados.getMat()[pos]);
        eMaterial.setBounds(500, 120, 200, 30);

        circunfer.setFont(new Font("Arial", Font.BOLD, 13));
        circunfer.setBounds(400, 90, 210, 30);
        recebeString = String.valueOf(dados.getCircunfCano()[pos]);
        eCircun = new JTextField(recebeString);
        eCircun.setBounds(500, 90, 210, 30);

        alturaSalto.setFont(new Font("Arial", Font.BOLD, 13));
        alturaSalto.setBounds(400, 120, 200, 30);
        recebeString = String.valueOf(dados.getAltSalto()[pos]);
        eAlturaSalto = new JTextField(recebeString);
        eAlturaSalto.setBounds(500, 120, 200, 30);

        departamento.setFont(new Font("Arial", Font.BOLD, 13));
        departamento.setBounds(400, 90, 200, 30);
        eDepart = new JTextField(dados.getDepart()[pos]);
        eDepart.setBounds(500, 90, 200, 30);

        tipoTrava.setFont(new Font("Arial", Font.BOLD, 13));
        tipoTrava.setBounds(400, 120, 200, 30);
        eTipoTrava = new JTextField(dados.getTipoTrava()[pos]);
        eTipoTrava.setBounds(500, 120, 200, 30);

        modeloCadar.setFont(new Font("Arial", Font.BOLD, 13));
        modeloCadar.setBounds(400, 150, 200, 30);
        eModelCadar = new JTextField(dados.getModelCadarco()[pos]);
        eModelCadar.setBounds(500, 150, 200, 30);

        tipoCorreia.setFont(new Font("Arial", Font.BOLD, 13));
        tipoCorreia.setBounds(400, 90, 200, 30);
        eTipoCorreia = new JTextField(dados.getTipoCorrreia()[pos]);
        eTipoCorreia.setBounds(500, 90, 200, 30);

        estetica.setFont(new Font("Arial", Font.BOLD, 13));
        estetica.setBounds(400, 120, 200, 30);
        eEstet = new JTextField(dados.getEstet()[pos]);
        eEstet.setBounds(500, 120, 200, 30);

        alturaCano.setFont(new Font("Arial", Font.BOLD, 13));
        alturaCano.setBounds(400, 90, 200, 30);
        recebeString = String.valueOf(dados.getAltCano()[pos]);
        eAlturaCano = new JTextField(recebeString);
        eAlturaCano.setBounds(500, 90, 200, 30);

        modelo.setFont(new Font("Arial", Font.BOLD, 13));
        modelo.setBounds(400, 120, 200, 30);
        eModelo = new JTextField(dados.getModel()[pos]);
        eModelo.setBounds(500, 120, 200, 30);

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

        op = dados.getCategoria()[pos];

        if (op == 1) {
            janela.add(tipoBico);
            janela.add(material);
            janela.add(eMaterial);
            janela.add(eTipoBico);

        } else if (op == 2) {
            janela.add(circunfer);
            janela.add(alturaSalto);
            janela.add(eAlturaSalto);
            janela.add(eCircun);

        } else if (op == 3) {
            janela.add(departamento);
            janela.add(tipoTrava);
            janela.add(modeloCadar);
            janela.add(eDepart);
            janela.add(eTipoTrava);
            janela.add(eModelCadar);

        } else if (op == 4) {
            janela.add(tipoCorreia);
            janela.add(estetica);
            janela.add(eTipoCorreia);
            janela.add(eEstet);

        } else {
            janela.add(alturaCano);
            janela.add(modelo);
            janela.add(eAlturaCano);
            janela.add(eModelo);
        }

        confirmar.setBounds(500, 350, 100, 30);
        apagar.setBounds(200, 350, 100, 30);

        janela.add(confirmar);
        janela.add(apagar);

        janela.setSize(800, 450);
        janela.setVisible(true);

        confirmar.addActionListener(this);
        apagar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        String recebeString;

        if (src == confirmar) {
            String nomeProduto = eNome.getText().toUpperCase();
            String marca = eMarca.getText().toUpperCase();
            String id = eId.getText().toUpperCase();
            recebeString = eTamanho.getText();
            int tamanho = Integer.parseInt(recebeString);
            String cor = eCor.getText().toUpperCase();
            recebeString = eValorProduto.getText();
            Double valorProduto = Double.parseDouble(recebeString);
            recebeString = eQuantidade.getText();
            int quantidade = Integer.parseInt(recebeString);
            String tipoBico = null;
            String material = null;
            Double circunferenciaC = 0.0;
            Double alturaS = 0.0;
            String departamento = null;
            String tipoTrava = null;
            String modeloCadarco = null;
            String tipoCorreia = null;
            String estetica = null;
            Double alturaCano = 0.0;
            String modelo = null;

            if (op == 1) {
                tipoBico = eTipoBico.getText().toUpperCase();
                material = eMaterial.getText().toUpperCase();

            } else if (op == 2) {
                recebeString = eCircun.getText();
                circunferenciaC = Double.parseDouble(recebeString);
                recebeString = eAlturaSalto.getText();
                alturaS = Double.parseDouble(recebeString);

            } else if (op == 3) {
                departamento = eDepart.getText().toUpperCase();
                tipoTrava = eTipoTrava.getText().toUpperCase();
                modeloCadarco = eModelCadar.getText().toUpperCase();

            } else if (op == 4) {
                tipoCorreia = eTipoCorreia.getText().toUpperCase();
                estetica = eEstet.getText().toUpperCase();

            } else {
                recebeString = eAlturaCano.getText();
                alturaCano = Double.parseDouble(recebeString);
                modelo = eModelo.getText().toUpperCase();
            }

            TelaCadastroController telaCadastroController = new TelaCadastroController(dados, posi, op, nomeProduto,
                    marca, id, tamanho, cor, valorProduto, quantidade, tipoBico, material, circunferenciaC, alturaS,
                    departamento, tipoTrava, modeloCadarco, tipoCorreia, estetica, alturaCano, modelo);
            janela.setVisible(false);
        } else {
            TelaCadastroController telaCadastroController = new TelaCadastroController(dados, posi, op);
            janela.setVisible(false);
        }

    }
}
