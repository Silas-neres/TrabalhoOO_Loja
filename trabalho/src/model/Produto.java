package model;

import java.util.Scanner;

import javax.swing.Spring;

public abstract class Produto {

    String marca;
    String nome;
    String id;
    int tamanho;
    String cor;
    Double valorProduto;
    int categoria;
    int quantidade;
    int totalProdutos;

    private int i;

    public String getNome() {
        return nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valorProduto;
    }

    public void setValor(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer opcaoProduto) {
        this.categoria = opcaoProduto;
    }

    public int getNumProdutosCadastrados() {
        return totalProdutos;
    }

    public void setNumProdutosCadastrados(Integer numProdutosCadas) {
        this.totalProdutos = numProdutosCadas;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String toString(){
        return nome;
    }
    public Double parseDouble(){
        return valorProduto;
    }
}
