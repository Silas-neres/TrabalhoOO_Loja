package controller;

import model.Produto;

public class TelaProdutoController {
    
    private String[] p;
    private int qtdProdutosCadas;
    private String[] id;
    private String[] marc;
    private int[] tamanho;
    private Double[] valor;
    private String[] cor;
    private String[] cat;
    private String[] alturaCan;
    private String[] circfC;
    private String[] alturaSal;
    private String[] depart;
    private String[] tipoTrava;
    private String[] modelCadar;
    private String[] tipCorreia;
    private String[] estet;
    private String[] material;
    private String[] model;
    private int[] qtdProdutos;

    public TelaProdutoController(){
       
    }

    public int getQtdProdutosCadas() {
        return qtdProdutosCadas;
    }

    public void setQtdProdutosCadas(int qtdProdutosCadas) {
        this.qtdProdutosCadas = qtdProdutosCadas;
    }
}
