package model;

public class Vender {

    double valorPago;
    int quantidadeCompra;
    String idProdutoCompra;

    public Vender() {

    }

    public Vender(String id, int quantidadeCompra, String[] listaNome, int[] listaQuantidade, Double rendaTotal,
            String[] listaId, Double[] listaValorProduto, int numPessoasCadas) {

        fazerCompra(id, quantidadeCompra, listaNome, listaQuantidade, rendaTotal, listaId, listaValorProduto,
                numPessoasCadas);

    }

    public void fazerCompra(String id, int quantidadeCompra, String[] listaNome, int[] listaQuantidade,
            Double rendaTotal, String[] listaId, Double[] listaValorProduto, int numPessoasCadas) {

        int i;

        setValorPago(quantidadeCompra);
        setIdProdutoCompra(id);

        for (i = 0; i < numPessoasCadas; i++) {
            if (id.equalsIgnoreCase(listaId[i])) {
                if (listaQuantidade[i] >= quantidadeCompra) {
                    valorPago = listaValorProduto[i];
                    rendaTotal = rendaTotal + valorPago;
                    listaQuantidade[i] = listaQuantidade[i] - quantidadeCompra;
                }
            }
        }
    }

    public void setValorPago(int quantidadeCompra) {
        this.quantidadeCompra = quantidadeCompra;
    }

    public int getValorPago() {
        return quantidadeCompra;
    }

    public void setIdProdutoCompra(String id) {
        this.idProdutoCompra = id;
    }

    public String getProdutoCompra() {
        return idProdutoCompra;
    }
}
