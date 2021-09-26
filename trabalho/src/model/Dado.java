package model;

import java.util.List;
import java.util.ArrayList;

public class Dado {

        ArrayList<String> listaMarca = new ArrayList<>();
        ArrayList<String> listaNome = new ArrayList<>();
        ArrayList<Integer> listaTamanho = new ArrayList<>();
        ArrayList<String> listaCor = new ArrayList<>();
        ArrayList<Double> listaValorProduto = new ArrayList<>();
        ArrayList<Integer> listaCategoria = new ArrayList<>();
        ArrayList<String> listaTipoBico = new ArrayList<>();
        ArrayList<String> listaMaterial = new ArrayList<>();
        ArrayList<Double> listaCircunferenciaCano = new ArrayList<>();
        ArrayList<Double> listaAlturaSalto = new ArrayList<>();
        ArrayList<String> listaDepartamento = new ArrayList<>();
        ArrayList<String> listaTipoTrava = new ArrayList<>();
        ArrayList<String> listaModeloCadarco = new ArrayList<>();
        ArrayList<String> listaTipoCorreia = new ArrayList<>();
        ArrayList<String> listaEstetica = new ArrayList<>();
        ArrayList<Double> listaAlturaCano = new ArrayList<>();
        ArrayList<String> listaModelo = new ArrayList<>();
        ArrayList<String> listaNomePessoa = new ArrayList<>();
        ArrayList<String> listaDataNasc = new ArrayList<>();
        ArrayList<String> listaCpf = new ArrayList<>();
        ArrayList<String> listaTelefone = new ArrayList<>();
        ArrayList<String> listaTipoUsuario = new ArrayList<>();
        ArrayList<Integer> listaQuantidade = new ArrayList<>();
        ArrayList<String> listaId = new ArrayList<>();
        int numPessoasCadas=listaNomePessoa.size();


    public Dado(){

        // Sapatilhas
        listaNome.add("SAPATILHA MOLECA LISTRADA");
        listaId.add("S1");
        listaMarca.add("MOLECA");
        listaTamanho.add(38);
        listaCor.add("BRANCO");
        listaValorProduto.add(62.91);
        listaTipoBico.add("FINO");
        listaMaterial.add("BORRACHA");
        listaQuantidade.add(5);

        listaNome.add("SAPATILHA FEMININA PICCADILLY 250132");
        listaId.add("S2");
        listaMarca.add("PICCADILLY");
        listaTamanho.add(37);
        listaCor.add("PRETO");
        listaValorProduto.add(109.99);
        listaTipoBico.add("QUADRADO");
        listaMaterial.add("COURO");
        listaQuantidade.add(3);

        listaNome.add("SAPATILHA FEMININA LAÇO NOBUNK");
        listaId.add("S3");
        listaMarca.add("TORRICELLA");
        listaTamanho.add(37);
        listaCor.add("BRANCO");
        listaValorProduto.add(160.19);
        listaTipoBico.add("FINO");
        listaMaterial.add("BORRACHA");
        listaQuantidade.add(6);

        // BOTA
        listaNome.add("COTURNO PEGADA TRATORADO SHERPA");
        listaId.add("B1");
        listaMarca.add("PEGADA");
        listaTamanho.add(38);
        listaCor.add("PRETO");
        listaValorProduto.add(299.90);
        listaCircunferenciaCano.add(25.0);
        listaAlturaSalto.add(7.0);
        listaQuantidade.add(5);

        listaNome.add("BOTA PICCADILLY CANO CURTO");
        listaId.add("B2");
        listaMarca.add("PICCADILY");
        listaTamanho.add(36);
        listaCor.add("MARROM");
        listaValorProduto.add(159.90);
        listaCircunferenciaCano.add(20.0);
        listaAlturaSalto.add(5.0);
        listaQuantidade.add(4);

        listaNome.add("BOTA MISSISSIPI CANO CURTO");
        listaId.add("B3");
        listaMarca.add("MISSISSIPI");
        listaTamanho.add(38);
        listaCor.add("MARROM");
        listaValorProduto.add(164.50);
        listaCircunferenciaCano.add(25.0);
        listaAlturaSalto.add(5.0);
        listaQuantidade.add(8);

        // CHUTEIRAS
        listaNome.add("CHUTEIRA SOCIETY NIKE BECO 2 TF");
        listaId.add("C1");
        listaMarca.add("NIKE");
        listaTamanho.add(41);
        listaCor.add("VERMALHO");
        listaValorProduto.add(140.00);
        listaQuantidade.add(8);
        listaDepartamento.add("ESPORTE");
        listaTipoTrava.add("PEQUENA");
        listaModeloCadarco.add("TRADICINAL");

        listaNome.add("CHUTEIRA BOTINHA SOCIETY");
        listaId.add("C2");
        listaMarca.add("FRONTINNI");
        listaTamanho.add(40);
        listaCor.add("LARANJA");
        listaValorProduto.add(109.90);
        listaQuantidade.add(8);
        listaDepartamento.add("ESPORTE");
        listaTipoTrava.add("PEQUENA");
        listaModeloCadarco.add("SEM");

        listaNome.add("CHUTEIRA FUTSAL MIZUNO MORELIA CLUB IN N");
        listaId.add("C3");
        listaMarca.add("MIZUNO");
        listaTamanho.add(40);
        listaCor.add("PRETO");
        listaValorProduto.add(110.0);
        listaQuantidade.add(8);
        listaDepartamento.add("ESPORTE");
        listaTipoTrava.add("SEM TRAVA");
        listaModeloCadarco.add("TRADICINAL");

        // CHINELO

        listaNome.add("CHINELO HOKA ONE ONE ORA RECOVERY SLIDE");
        listaId.add("CH1");
        listaMarca.add("HOKA ONE ONE");
        listaTamanho.add(38);
        listaCor.add("BRANCO");
        listaValorProduto.add(400.0);
        listaQuantidade.add(8);
        listaTipoCorreia.add("TIRA LARGA");
        listaEstetica.add("LISO");

        listaNome.add("SANDALIA FEMENINO MODARE SENSE FLEX");
        listaId.add("CH2");
        listaMarca.add("MODARE");
        listaTamanho.add(37);
        listaCor.add("VINHO");
        listaValorProduto.add(70.0);
        listaQuantidade.add(5);
        listaTipoCorreia.add("TRADICINAL");
        listaEstetica.add("LISO");

        listaNome.add("HAVAIANAS CONSERVAÇAO INTERNACIONAL");
        listaId.add("CH3");
        listaMarca.add("HAVAIANAS");
        listaTamanho.add(41);
        listaCor.add("AZUL");
        listaValorProduto.add(44.90);
        listaQuantidade.add(8);
        listaTipoCorreia.add("TRADICIONAL");
        listaEstetica.add("ESTAMPADA");

        // TENIS

        listaNome.add("TENIS NIKE PRECISION V");
        listaId.add("T1");
        listaMarca.add("NIKE");
        listaTamanho.add(41);
        listaCor.add("BRANCO");
        listaValorProduto.add(269.99);
        listaQuantidade.add(10);
        listaAlturaCano.add(0.0);
        listaModelo.add("ESPORTIVO");

        listaNome.add("TENIS ALL STAR CONVERSE CHUCK TAYLOR");
        listaId.add("T2");
        listaMarca.add("ALL STAR CONVERSE");
        listaTamanho.add(40);
        listaCor.add("BRANCO");
        listaValorProduto.add(179.99);
        listaQuantidade.add(8);
        listaAlturaCano.add(0.0);
        listaModelo.add("CANO BAIXO");

        listaNome.add("TENIS DIVERSAO CANVAS HI ZIPER");
        listaId.add("T3");
        listaMarca.add("DIVERSAO");
        listaTamanho.add(30);
        listaCor.add("AZUL");
        listaValorProduto.add(139.90);
        listaQuantidade.add(8);
        listaAlturaCano.add(22.1);
        listaModelo.add("CANO ALTO");

        // PESSOAS

        listaNomePessoa.add("SAMUEL VICTOR");
        listaCpf.add("11111111111");
        listaDataNasc.add("10/05/1999");
        listaTelefone.add("(61)98564-1546");
        listaTipoUsuario.add("VENDEDOR");

        listaNomePessoa.add("GABRIEL CARDOSO");
        listaCpf.add("22222222222");
        listaDataNasc.add("25/01/2000");
        listaTelefone.add("(61)999147586");
        listaTipoUsuario.add("CLIENTE");

        listaNomePessoa.add("CARLOS EDUARDO");
        listaCpf.add("33333333333");
        listaDataNasc.add("02/12/1998");
        listaTelefone.add("(61)983054789");
        listaTipoUsuario.add("CLIENTE");

    }


    public ArrayList<String> getListaMarca() {
        return listaMarca;
    }


    public void setListaMarca(ArrayList<String> listaMarca) {
        this.listaMarca = listaMarca;
    }


    public ArrayList<String> getListaNome() {
        return listaNome;
    }


    public void setListaNome(ArrayList<String> listaNome) {
        this.listaNome = listaNome;
    }


    public ArrayList<Integer> getListaTamanho() {
        return listaTamanho;
    }


    public void setListaTamanho(ArrayList<Integer> listaTamanho) {
        this.listaTamanho = listaTamanho;
    }


    public ArrayList<String> getListaCor() {
        return listaCor;
    }


    public void setListaCor(ArrayList<String> listaCor) {
        this.listaCor = listaCor;
    }


    public ArrayList<Double> getListaValorProduto() {
        return listaValorProduto;
    }


    public void setListaValorProduto(ArrayList<Double> listaValorProduto) {
        this.listaValorProduto = listaValorProduto;
    }


    public ArrayList<Integer> getListaCategoria() {
        return listaCategoria;
    }


    public void setListaCategoria(ArrayList<Integer> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }


    public ArrayList<String> getListaTipoBico() {
        return listaTipoBico;
    }


    public void setListaTipoBico(ArrayList<String> listaTipoBico) {
        this.listaTipoBico = listaTipoBico;
    }


    public ArrayList<String> getListaMaterial() {
        return listaMaterial;
    }


    public void setListaMaterial(ArrayList<String> listaMaterial) {
        this.listaMaterial = listaMaterial;
    }


    public ArrayList<Double> getListaCircunferenciaCano() {
        return listaCircunferenciaCano;
    }


    public void setListaCircunferenciaCano(ArrayList<Double> listaCircunferenciaCano) {
        this.listaCircunferenciaCano = listaCircunferenciaCano;
    }


    public ArrayList<Double> getListaAlturaSalto() {
        return listaAlturaSalto;
    }


    public void setListaAlturaSalto(ArrayList<Double> listaAlturaSalto) {
        this.listaAlturaSalto = listaAlturaSalto;
    }


    public ArrayList<String> getListaDepartamento() {
        return listaDepartamento;
    }


    public void setListaDepartamento(ArrayList<String> listaDepartamento) {
        this.listaDepartamento = listaDepartamento;
    }


    public ArrayList<String> getListaTipoTrava() {
        return listaTipoTrava;
    }


    public void setListaTipoTrava(ArrayList<String> listaTipoTrava) {
        this.listaTipoTrava = listaTipoTrava;
    }


    public ArrayList<String> getListaModeloCadarco() {
        return listaModeloCadarco;
    }


    public void setListaModeloCadarco(ArrayList<String> listaModeloCadarco) {
        this.listaModeloCadarco = listaModeloCadarco;
    }


    public ArrayList<String> getListaTipoCorreia() {
        return listaTipoCorreia;
    }


    public void setListaTipoCorreia(ArrayList<String> listaTipoCorreia) {
        this.listaTipoCorreia = listaTipoCorreia;
    }


    public ArrayList<String> getListaEstetica() {
        return listaEstetica;
    }


    public void setListaEstetica(ArrayList<String> listaEstetica) {
        this.listaEstetica = listaEstetica;
    }


    public ArrayList<Double> getListaAlturaCano() {
        return listaAlturaCano;
    }


    public void setListaAlturaCano(ArrayList<Double> listaAlturaCano) {
        this.listaAlturaCano = listaAlturaCano;
    }


    public ArrayList<String> getListaModelo() {
        return listaModelo;
    }


    public void setListaModelo(ArrayList<String> listaModelo) {
        this.listaModelo = listaModelo;
    }


    public ArrayList<String> getListaNomePessoa() {
        return listaNomePessoa;
    }


    public void setListaNomePessoa(ArrayList<String> listaNomePessoa) {
        this.listaNomePessoa = listaNomePessoa;
    }


    public ArrayList<String> getListaDataNasc() {
        return listaDataNasc;
    }


    public void setListaDataNasc(ArrayList<String> listaDataNasc) {
        this.listaDataNasc = listaDataNasc;
    }


    public ArrayList<String> getListaCpf() {
        return listaCpf;
    }


    public void setListaCpf(ArrayList<String> listaCpf) {
        this.listaCpf = listaCpf;
    }


    public ArrayList<String> getListaTelefone() {
        return listaTelefone;
    }


    public void setListaTelefone(ArrayList<String> listaTelefone) {
        this.listaTelefone = listaTelefone;
    }


    public ArrayList<String> getListaTipoUsuario() {
        return listaTipoUsuario;
    }


    public void setListaTipoUsuario(ArrayList<String> listaTipoUsuario) {
        this.listaTipoUsuario = listaTipoUsuario;
    }


    public ArrayList<Integer> getListaQuantidade() {
        return listaQuantidade;
    }


    public void setListaQuantidade(ArrayList<Integer> listaQuantidade) {
        this.listaQuantidade = listaQuantidade;
    }


    public ArrayList<String> getListaId() {
        return listaId;
    }


    public void setListaId(ArrayList<String> listaId) {
        this.listaId = listaId;
    }


    public int getNumPessoasCadas() {
        return numPessoasCadas;
    }


    public void setNumPessoasCadas(int numPessoasCadas) {
        this.numPessoasCadas = numPessoasCadas;
    }


}
