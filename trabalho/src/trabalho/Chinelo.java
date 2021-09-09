package trabalho;

public class Chinelo extends Produto {

    String tipoCorreia;
    String estetica;

    public Chinelo() {

    }

    public Chinelo(String nome, String marca, String cor, Double valorProduto, int tamanho, int opcaoProduto,
            int numProdutosCadas, String tipoCorreia, String estetica, String[] listaNome, String[] listaMarca,
            int[] listaTamanho, String[] listaCor, Double[] listaValorProduto, int[] listaCategoria,
            String[] listaTipoCorreia, String[] listaEstetica, int quantidade, int[] listaQuantidade, String id,
            String[] listaId) {

        setNome(nome);
        setMarca(marca);
        setCor(cor);
        setTamanho(tamanho);
        setValor(valorProduto);
        setCategoria(opcaoProduto);
        setNumProdutosCadastrados(numProdutosCadas);
        setTipoCorreia(tipoCorreia);
        setEstetica(estetica);
        setQuantidade(quantidade);
        setId(id);

        cadastrar(nome, marca, tamanho, cor, valorProduto, categoria, numProdutosCadas, listaMarca, listaNome,
                listaTamanho, listaCor, listaValorProduto, listaCategoria, quantidade, listaQuantidade, id, listaId);

        completarCadastro(numProdutosCadas, tipoCorreia, estetica, listaTipoCorreia, listaEstetica);
    }

    public Chinelo(String nome, int numProdutosCadas, int opcaoProduto, String[] listaNome, String[] listaMarca,
            int[] listaTamanho, String[] listaCor, Double[] listaValorProduto, int[] listaCategoria,
            String[] listaTipoCorreia, String[] listaEstetica, int opcaoVendedor1, int[] listaQuantidade,String[] listaId) {

        setNome(nome);
        setNumProdutosCadastrados(numProdutosCadas);
        setCategoria(opcaoProduto);

        if (opcaoVendedor1 == 4) {
            editar(nome, numProdutosCadas, opcaoProduto, listaMarca, listaNome, listaTamanho, listaCor,
                    listaValorProduto, listaCategoria, listaQuantidade,listaId);
            completarEditar(nome, numProdutosCadas, opcaoProduto, listaNome, listaTipoCorreia, listaEstetica);
        } else if (opcaoVendedor1 == 5) {
            apagar(nome, numProdutosCadas, opcaoProduto, listaNome, listaMarca, listaTamanho, listaCor,
                    listaValorProduto, listaCategoria, listaQuantidade,listaId);
            completarApagar(nome, numProdutosCadas, opcaoProduto, listaNome, listaTipoCorreia, listaEstetica);
        }

    }

    public void completarCadastro(int numProdutosCadas, String tipoCorreia, String estetica, String[] listaTipoCorreia,
            String[] listaEstetica) {

        int i;
        int j = numProdutosCadas;

        for (i = j; i <= j; i++) {

            listaTipoCorreia[i] = tipoCorreia;
            listaEstetica[i] = estetica;

        }

    }

    public void completarEditar(String nome, int numProdutosCadas, int opcaoProduto, String[] listaNome,
            String[] listaTipoCorreia, String[] listaEstetica) {
        int i, j = numProdutosCadas, checar = 0;

        for (i = 0; i < j; i++) {
            if (nome.equalsIgnoreCase(listaNome[i])) {

                switch (opcaoProduto) {
                    case 8:

                        System.out.println("Para qual departamento voce deseja mudar?");
                        listaTipoCorreia[i] = ler.nextLine().toUpperCase();

                        break;
                    case 9:
                        System.out.println("Para qual tipo de trava voce deseja mudar?");
                        listaEstetica[i] = ler.nextLine().toUpperCase();
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

    public void completarApagar(String nome, int numProdutosCadas, int opcaoProduto, String[] listaNome,
            String[] listaTipoCorreia, String[] listaEstetica) {

        int i, j = numProdutosCadas, checar = 0, contador;
        for (i = 0; i < j; i++) {

            if (nome.equalsIgnoreCase(listaNome[i])) {

                listaTipoCorreia[i] = null;
                listaEstetica[i] = null;

                for (contador = i; contador <= j; contador++) {
                    listaTipoCorreia[contador] = listaTipoCorreia[contador + 1];
                    listaEstetica[contador] = listaEstetica[contador + 1];
                }
            } else {

                checar++;

            }
        }
        if (checar == numProdutosCadas) {
            System.out.println("PRODUTO NAO ENCONTRADO");
        }
    }

    public String getTipoCorreia() {
        return tipoCorreia;
    }

    public void setTipoCorreia(String tipoCorreia) {
        this.tipoCorreia = tipoCorreia;
    }

    public String getEstetica() {
        return estetica;
    }

    public void setEstetica(String estetica) {
        this.estetica = estetica;
    }

}
