package trabalho;

import java.util.Scanner;
import java.util.Arrays;

public class Produto {

    String marca;
    String nome;
    int tamanho;
    String cor;
    Double valorProduto;
    int categoria;
    int totalProdutos;

    Scanner ler = new Scanner(System.in);
    private int i;

    public String getNome() {
        return nome;
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

    public void cadastrar(String nome, String marca, int tamanho, String cor, double valorProduto, int categoria,
            int numProdutosCadas, String listaMarca[], String listaNome[], int listaTamanho[], String listaCor[],
            Double listaValorProduto[], int listaCategoria[]) {
        int i;
        int j = numProdutosCadas;

        for (i = j; i <= j; i++) {

            listaNome[i] = nome;
            listaMarca[i] = marca;
            listaTamanho[i] = tamanho;
            listaCor[i] = cor;
            listaValorProduto[i] = valorProduto;
            listaCategoria[i] = categoria;
            System.out.println("Nome:" + listaNome[i]);
            System.out.println("Marca:" + listaMarca[i]);
            System.out.println("Tamanho:" + listaTamanho[i]);
            System.out.println("Cor:" + listaCor[i]);
            System.out.println("Valor:" + listaValorProduto[i]);
            System.out.println("Categoria:" + listaCategoria[i]);

        }
    }

    public void editar(String nome, int numProdutosCadas, int opcaoProduto, String[] listaMarca, String[] listaNome,
            int[] listaTamanho, String[] listaCor, Double[] listaValorProduto, int[] listaCategoria) {

        int i, j = numProdutosCadas, checar = 0;
        String recebeString;

        for (i = 0; i < j; i++) {

            if (nome.equalsIgnoreCase(listaNome[i])) {

                switch (opcaoProduto) {
                    case 1:

                        System.out.println("Para qual nome deseja mudar?");
                        recebeString = ler.nextLine().toUpperCase();
                        listaNome[i] = recebeString;

                        break;
                    case 2:
                        System.out.println("Para qual marca deseja mudar?");
                        recebeString = ler.nextLine().toUpperCase();
                        listaMarca[i] = recebeString;
                        break;
                    case 3:
                        System.out.println("Para qual cor deseja mudar?");
                        recebeString = ler.nextLine().toUpperCase();
                        listaCor[i] = recebeString;
                        break;
                    case 4:
                        System.out.println("Para qual valor deseja mudar?");
                        recebeString = ler.nextLine().toUpperCase();
                        listaValorProduto[i] = Double.parseDouble(recebeString);
                        break;
                    case 5:

                        System.out.println("Para qual tamanho deseja mudar?");
                        recebeString = ler.nextLine().toUpperCase();
                        listaTamanho[i] = Integer.parseInt(recebeString);
                        break;
                    default:
                }
            } else {

                checar++;

            }
        }
        if (checar == numProdutosCadas) {
            System.out.println("PRODUTO NAO ENCONTRADO");
        }

    }

    public void apagar(String nome, int numProdutosCadas, int opcaoProduto, String[] listaNome, String[] listaMarca,
            int[] listaTamanho, String[] listaCor, Double[] listaValorProduto, int[] listaCategoria) {

        int i, j = numProdutosCadas, checar = 0, contador;
        String recebeString;

        for (i = 0; i < j; i++) {

            if (nome.equalsIgnoreCase(listaNome[i])) {

                listaCategoria[i] = 0;
                listaCor[i] = null;
                listaMarca[i] = null;
                listaNome[i] = null;
                listaTamanho[i] = 0;
                listaValorProduto[i] = 0.0;

                for (contador = i; contador <= j; contador++) {
                    listaCategoria[contador] = listaCategoria[contador + 1];
                    listaCor[contador] = listaCor[contador + 1];
                    listaMarca[contador] = listaMarca[contador + 1];
                    listaNome[contador] = listaNome[contador + 1];
                    listaTamanho[contador] = listaTamanho[contador] + 1;
                    listaValorProduto[contador] = listaValorProduto[contador + 1];
                }

            } else {

                checar++;

            }
        }
        if (checar == numProdutosCadas) {
            System.out.println("PRODUTO NAO ENCONTRADO");
        }

    }
}
