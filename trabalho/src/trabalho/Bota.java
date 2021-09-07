package trabalho;

public class Bota extends Produto {

    Double circunferenciaCano;
    Double alturaSalto;

    int opcao;

    String recebeString;

    public Bota() {

    }

    public Bota(String nome, String marca, String cor, Double valorProduto, int tamanho, int opcaoProduto,
            int numProdutosCadas, double circunferenciaCano, double alturaSalto, String[] listaNome,
            String[] listaMarca, int[] listaTamanho, String[] listaCor, Double[] listaValorProduto,
            int[] listaCategoria, Double[] listaCircunferenciaCano, Double[] listaAlturaSalto) {

        setNome(nome);
        setMarca(marca);
        setCor(cor);
        setTamanho(tamanho);
        setValor(valorProduto);
        setCategoria(opcaoProduto);
        setNumProdutosCadastrados(numProdutosCadas);
        setCircunferenciaCano(circunferenciaCano);
        setAlturaSalto(alturaSalto);

        cadastrar(nome, marca, tamanho, cor, valorProduto, categoria, numProdutosCadas, listaMarca, listaNome,
                listaTamanho, listaCor, listaValorProduto, listaCategoria);

        completarCadastro(circunferenciaCano, alturaSalto, numProdutosCadas, listaCircunferenciaCano, listaAlturaSalto);
    }

    public Bota(String nome, int numProdutosCadas, int opcaoProduto, Double[] listaCircunferenciaCano,
            Double[] listaAlturaSalto, String[] listaNome, String[] listaMarca, int[] listaTamanho, String[] listaCor,
            Double[] listaValorProduto, int[] listaCategoria, int opcaoVendedor1) {
        setNome(nome);
        setNumProdutosCadastrados(numProdutosCadas);
        setCategoria(opcaoProduto);

        if (opcaoVendedor1 == 4) {
            editar(nome, numProdutosCadas, opcaoProduto, listaMarca, listaNome, listaTamanho, listaCor,
                    listaValorProduto, listaCategoria);
            completarEditar(nome, numProdutosCadas, opcaoProduto, listaNome, listaCircunferenciaCano, listaAlturaSalto);
        } else if (opcaoVendedor1 == 5) {
            apagar(nome, numProdutosCadas, opcaoProduto, listaNome, listaMarca, listaTamanho, listaCor,
                    listaValorProduto, listaCategoria);
            completarApagar(nome, numProdutosCadas, opcaoProduto, listaNome, listaCircunferenciaCano, listaAlturaSalto);
        }
    }

    private void completarEditar(String nome, int numProdutosCadas, int opcaoProduto, String[] listaNome,
            Double[] listaCircunferenciaCano, Double[] listaAlturaSalto) {
        int i, j = numProdutosCadas, checar = 0;

        for (i = 0; i < j; i++) {
            if (nome.equalsIgnoreCase(listaNome[i])) {

                switch (opcaoProduto) {
                    case 6:

                        System.out.println("Para qual a circunferencia do cano voce deseja mudar?");
                        recebeString = ler.nextLine().toUpperCase();
                        listaCircunferenciaCano[i] = Double.parseDouble(recebeString);

                        break;
                    case 7:
                        System.out.println("Para qual altura do cano voce deseja mudar?");
                        recebeString = ler.nextLine().toUpperCase();
                        listaAlturaSalto[i] = Double.parseDouble(recebeString);
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

    public void completarCadastro(double circunferenciaCano, double alturaSalto, int numProdutosCadas,
            Double[] listaCircunferenciaCano, Double[] listaAlturaSalto) {

        int i;
        int j = numProdutosCadas;

        for (i = j; i <= j; i++) {

            listaCircunferenciaCano[i] = circunferenciaCano;
            listaAlturaSalto[i] = alturaSalto;

        }

    }

    public void completarApagar(String nome, int numProdutosCadas, int opcaoProduto, String[] listaNome,
            Double[] listaCircunferenciaCano, Double[] listaAlturaSalto) {
        int i, j = numProdutosCadas, checar = 0, contador;

        for (i = 0; i < j; i++) {

            if (nome.equalsIgnoreCase(listaNome[i])) {

                listaCircunferenciaCano[i] = 0.0;
                listaAlturaSalto[i] = 0.0;

                for (contador = i; contador <= j; contador++) {
                    listaCircunferenciaCano[contador] = listaCircunferenciaCano[contador + 1];
                    listaAlturaSalto[contador] = listaAlturaSalto[contador + 1];
                }
            } else {

                checar++;

            }
        }
        if (checar == numProdutosCadas) {
            System.out.println("PRODUTO NAO ENCONTRADO");
        }
    }

    public Double getCircunferenciaCano() {
        return circunferenciaCano;
    }

    public void setCircunferenciaCano(Double circunferenciaCano) {
        this.circunferenciaCano = circunferenciaCano;
    }

    public Double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(Double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

}
