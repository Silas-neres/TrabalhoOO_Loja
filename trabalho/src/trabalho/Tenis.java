package trabalho;

public class Tenis extends Produto {
	
	Double alturaCano;
	String modelo;
    
	public Tenis() {
		
	}
	
	public Tenis(String nome, String marca, String cor, Double valorProduto, int tamanho, int opcaoProduto,
            int numProdutosCadas, double alturaCano,String modelo, String[] listaNome,
            String[] listaMarca, int[] listaTamanho, String[] listaCor, Double[] listaValorProduto,
            int[] listaCategoria, Double[] listaAlturaCano, String[] listaModelo,int quantidade, int[] listaQuantidade,String id, String[] listaId) {
		
		
		setNome(nome);
		setMarca(marca);
        setCor(cor);
        setTamanho(tamanho);
        setValor(valorProduto);
        setCategoria(opcaoProduto);
        setNumProdutosCadastrados(numProdutosCadas);
        setAlturaCano(alturaCano);
        setModelo(modelo);
        setQuantidade(quantidade);
        setId(id);
        
        cadastrar(nome, marca, tamanho, cor, valorProduto, categoria, numProdutosCadas, listaMarca, listaNome,
                listaTamanho, listaCor, listaValorProduto, listaCategoria, quantidade,listaQuantidade,id,listaId);
        
        completarCadastro(numProdutosCadas,alturaCano,modelo, listaAlturaCano, listaModelo);
    }

    public Tenis(String nome, int numProdutosCadas, int opcaoProduto, String[] listaNome, String[] listaMarca,
            int[] listaTamanho, String[] listaCor, Double[] listaValorProduto, int[] listaCategoria,
            Double[] listaAlturaCano, String[] listaModelo, int opcaoVendedor1,int[] listaQuantidade,String[] listaId) {

        setNome(nome);
        setNumProdutosCadastrados(numProdutosCadas);
        setCategoria(opcaoProduto);

        if (opcaoVendedor1 == 4) {
            editar(nome, numProdutosCadas, opcaoProduto, listaMarca, listaNome, listaTamanho, listaCor,
                    listaValorProduto, listaCategoria,listaQuantidade,listaId);
            completarEditar(nome, numProdutosCadas, opcaoProduto, listaNome,listaAlturaCano,listaModelo);
        } else if (opcaoVendedor1 == 5) {
            apagar(nome, numProdutosCadas, opcaoProduto, listaNome, listaMarca, listaTamanho, listaCor,
                    listaValorProduto, listaCategoria,listaQuantidade,listaId);
            completarApagar(nome, numProdutosCadas, opcaoProduto, listaNome, listaAlturaCano,listaModelo);
        }

    }

    public void completarCadastro(int numProdutosCadas,double alturaCano, String modelo,Double[] listaAlturaCano, String[] listaModelo) {

        int i;
        int j = numProdutosCadas;

        for (i = j; i <= j; i++) {

            listaAlturaCano[i] = alturaCano;
            listaModelo[i]= modelo;

        }

    }

    public void completarEditar(String nome, int numProdutosCadas, int opcaoProduto, String[] listaNome,
            Double[] listaAlturaCano ,String[] listaModelo) {
        int i, j = numProdutosCadas, checar = 0;
        String recebeString;

        for (i = 0; i < j; i++) {
            if (nome.equalsIgnoreCase(listaNome[i])) {

                switch (opcaoProduto) {
                    case 8:

                        System.out.println("Para qual modelo de tênis voce deseja mudar?");
                        listaModelo[i] = ler.nextLine().toUpperCase();

                        break;
                    case 9:
                        System.out.println("Para qual altura do cano você pretende mudar?");
                        recebeString = ler.nextLine();
                    	listaAlturaCano[i] = Double.parseDouble(recebeString);
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
            Double[] listaAlturaCano ,String[] listaModelo) {

                int i, j = numProdutosCadas, checar = 0, contador;
        for (i = 0; i < j; i++) {

            if (nome.equalsIgnoreCase(listaNome[i])) {

                listaAlturaCano[i] = 0.0;
                listaModelo[i]= null;

                for (contador = i; contador <= j; contador++) {
                    listaAlturaCano[contador] = listaAlturaCano[contador + 1];
                    listaModelo[contador] = listaModelo[contador +1];
                }
            } else {

                checar++;

            }
        }
        if (checar == numProdutosCadas) {
            System.out.println("PRODUTO NAO ENCONTRADO");
        }
    }
    
    public double getAlturaCano() {
        return alturaCano;
    }

    public void setAlturaCano(double alturaCano) {
        this.alturaCano = alturaCano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

