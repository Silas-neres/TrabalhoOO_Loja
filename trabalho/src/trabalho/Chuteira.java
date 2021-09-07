package trabalho;

public class Chuteira extends Produto {

    String departamento;
    String tipoTrava;
    String modeloCadarco;

    public Chuteira() {

    }

    public Chuteira(String nome, String marca, String cor, Double valorProduto, int tamanho, int opcaoProduto,
            int numProdutosCadas, String departamento, String tipoTrava, String modeloCadarco, String[] listaNome,
            String[] listaMarca, int[] listaTamanho, String[] listaCor, Double[] listaValorProduto,
            int[] listaCategoria, String[] listaDepartamento, String[] listaTipoTrava, String[] listaModeloCadarco) {

        setNome(nome);
        setMarca(marca);
        setCor(cor);
        setTamanho(tamanho);
        setValor(valorProduto);
        setCategoria(opcaoProduto);
        setNumProdutosCadastrados(numProdutosCadas);
        setDepartamento(departamento);
        setTipoTrava(tipoTrava);
        setModeloCadarco(modeloCadarco);

        cadastrar(nome, marca, tamanho, cor, valorProduto, categoria, numProdutosCadas, listaMarca, listaNome,
                listaTamanho, listaCor, listaValorProduto, listaCategoria);
        completarCadastro(numProdutosCadas, departamento, tipoTrava, modeloCadarco, listaDepartamento, listaTipoTrava,
                listaModeloCadarco);

    }

    public Chuteira(String nome, int numProdutosCadas, int opcaoProduto, String[] listaNome, String[] listaMarca,
            int[] listaTamanho, String[] listaCor, Double[] listaValorProduto, int[] listaCategoria,
            String[] listaDepartamento, String[] listaTipoTrava, String[] listaModeloCadarco, int opcaoVendedor1) {

        setNome(nome);
        setNumProdutosCadastrados(numProdutosCadas);
        setCategoria(opcaoProduto);

        if (opcaoVendedor1 == 4) {
            editar(nome, numProdutosCadas, opcaoProduto, listaMarca, listaNome, listaTamanho, listaCor,
                    listaValorProduto, listaCategoria);
            completarEditar(nome, numProdutosCadas, opcaoProduto, listaNome, listaDepartamento, listaTipoTrava, listaModeloCadarco);
        } else if (opcaoVendedor1 == 5) {
            apagar(nome, numProdutosCadas, opcaoProduto, listaNome, listaMarca, listaTamanho, listaCor,
                    listaValorProduto, listaCategoria);
            completarApagar(nome, numProdutosCadas, opcaoProduto, listaNome, listaDepartamento, listaTipoTrava, listaModeloCadarco);
        }

    }

    public void completarCadastro(int numProdutosCadas, String departamento, String tipoTrava, String modeloCadarco,
            String[] listaDepartamento, String[] listaTipoTrava, String[] listaModeloCadarco) {

        int i;
        int j = numProdutosCadas;

        for (i = j; i <= j; i++) {

            listaDepartamento[i] = departamento;
            listaTipoTrava[i] = tipoTrava;
            listaModeloCadarco[i] = modeloCadarco;

        }

    }

    public void completarEditar(String nome, int numProdutosCadas, int opcaoProduto, String[] listaNome,
            String[] listaDepartamento, String[] listaTipoTrava, String[] listaModeloCadarco) {
        int i, j = numProdutosCadas, checar = 0;

        for (i = 0; i < j; i++) {
            if (nome.equalsIgnoreCase(listaNome[i])) {

                switch (opcaoProduto) {
                    case 6:

                        System.out.println("Para qual departamento voce deseja mudar?");
                        listaDepartamento[i] = ler.nextLine().toUpperCase();

                        break;
                    case 7:
                        System.out.println("Para qual tipo de trava voce deseja mudar?");
                        listaTipoTrava[i] = ler.nextLine().toUpperCase();
                        break;
                    case 8:
                        System.out.println("Para qual modelo de cadarco voce deseja mudar?");
                        listaModeloCadarco[i] = ler.nextLine().toUpperCase();
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

    public void completarApagar(String nome, int numProdutosCadas,int opcaoProduto,String [] listaNome,String [] listaDepartamento,String [] listaTipoTrava,String [] listaModeloCadarco){
        int i, j = numProdutosCadas, checar = 0, contador;

        for (i = 0; i < j; i++) {

            if (nome.equalsIgnoreCase(listaNome[i])) {

                listaDepartamento[i] = null;
                listaTipoTrava[i] = null;
                listaModeloCadarco[i] = null;

                for (contador = i; contador <= j; contador++) {
                    listaDepartamento[contador] = listaDepartamento[contador + 1];
                    listaTipoTrava[contador] = listaTipoTrava[contador + 1];
                    listaModeloCadarco[contador] =  listaModeloCadarco[contador + 1];
                }
            } else {

                checar++;

            }
        }
        if (checar == numProdutosCadas) {
            System.out.println("PRODUTO NAO ENCONTRADO");
        }
    }

    public String getDepartamentDouble() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTipoTrava() {
        return tipoTrava;
    }

    public void setTipoTrava(String tipoTrava) {
        this.tipoTrava = tipoTrava;
    }

    public String getModeloCadarco() {
        return modeloCadarco;
    }

    public void setModeloCadarco(String modeloCadarco) {
        this.modeloCadarco = modeloCadarco;
    }
}
