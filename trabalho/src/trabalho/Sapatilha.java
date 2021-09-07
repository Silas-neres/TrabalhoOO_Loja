package trabalho;

import java.util.Scanner;

public class Sapatilha extends Produto {

    private String tipoBico;
    private String material;

    Scanner ler = new Scanner(System.in);

    int opcao;

    String recebeString;

    public Sapatilha() {

    }

    public Sapatilha(String nome, String marca, String cor, Double valorProduto, int tamanho, int opcaoProduto,
            int numProdutosCadas, String tipoBico, String material, String[] listaNome, String[] listaMarca,
            int[] listaTamanho, String[] listaCor, Double[] listaValorProduto, int[] listaCategoria,
            String[] listaTipoBico, String[] listaMaterial) {
        setNome(nome);
        setMarca(marca);
        setCor(cor);
        setTamanho(tamanho);
        setValor(valorProduto);
        setCategoria(opcaoProduto);
        setNumProdutosCadastrados(numProdutosCadas);
        setTipoBico(tipoBico);
        setMaterial(material);

        cadastrar(nome, marca, tamanho, cor, valorProduto, categoria, numProdutosCadas, listaMarca, listaNome,
                listaTamanho, listaCor, listaValorProduto, listaCategoria);
        completarCadastro(tipoBico, material, numProdutosCadas, listaTipoBico, listaMaterial);

    }

    public Sapatilha(String nome, int numProdutosCadas, int opcaoProduto, String[] listaNome, String[] listaMarca,
            int[] listaTamanho, String[] listaCor, Double[] listaValorProduto, int[] listaCategoria,
            String[] listaTipoBico, String[] listaMaterial, int opcaoVendedor1) {

        setNome(nome);
        setNumProdutosCadastrados(numProdutosCadas);
        setCategoria(opcaoProduto);

        if (opcaoVendedor1 == 4) {
            editar(nome, numProdutosCadas, opcaoProduto, listaMarca, listaNome, listaTamanho, listaCor,
                    listaValorProduto, listaCategoria);
            completarEditar(nome, numProdutosCadas, opcaoProduto, listaNome, listaTipoBico, listaMaterial);
        } else if (opcaoVendedor1 == 5) {
            apagar(nome, numProdutosCadas, opcaoProduto, listaNome, listaMarca, listaTamanho, listaCor,
                    listaValorProduto, listaCategoria);
            completarApagar(nome, numProdutosCadas, opcaoProduto, listaNome, listaTipoBico, listaMaterial);
        }

    }

    public void completarCadastro(String tipoBico, String material, int numProdutosCadas, String listaTipoBico[],
            String listaMaterial[]) {

        int i;
        int j = numProdutosCadas;

        for (i = j; i <= j; i++) {

            listaTipoBico[i] = tipoBico;
            listaMaterial[i] = material;

        }

    }

    public void completarEditar(String nome, int numProdutosCadas, int opcaoProduto, String listaNome[],
            String listaTipoBico[], String listaMaterial[]) {

        int i, j = numProdutosCadas, checar = 0;

        for (i = 0; i < j; i++) {
            if (nome.equalsIgnoreCase(listaNome[i])) {

                switch (opcaoProduto) {
                    case 6:

                        System.out.println("Para qual tipo de bico deseja mudar?");
                        recebeString = ler.nextLine().toUpperCase();
                        listaTipoBico[i] = recebeString;

                        break;
                    case 7:
                        System.out.println("Para qual material deseja mudar?");
                        recebeString = ler.nextLine().toUpperCase();
                        listaMaterial[i] = recebeString;
                        break;
                }
            } else {

                checar++;
            }
        }
        if (checar == numProdutosCadas) {
            System.out.println("PRODUTO NAO ENCONTRADO");
        }
    }

    public void completarApagar(String nome, int numProdutosCadas, int opcaoProduto, String listaNome[],
            String listaTipoBico[], String listaMaterial[]) {
        int i, j = numProdutosCadas, checar = 0, contador;

        for (i = 0; i < j; i++) {

            if (nome.equalsIgnoreCase(listaNome[i])) {

                listaTipoBico[i] = null;
                listaMaterial[i] = null;

                for (contador = i; contador <= j; contador++) {
                    listaTipoBico[contador] = listaTipoBico[contador + 1];
                    listaMaterial[contador] = listaMaterial[contador + 1];
                }

            } else {

                checar++;

            }
        }
        if (checar == numProdutosCadas) {
            System.out.println("PRODUTO NAO ENCONTRADO");
        }

    }

    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
