package controller;

import model.*;

public class DadoController {
    private Dado d = new Dado();


    public DadoController(){
        d.Dado();
    }

    public Dado getDados() {
        return d;
    }

    public void setDados(Dado d) {
        this.d = d;
    }

    public String[] getPessoas(){
        return this.d.getListaNomePessoa();
    }
    public int getQtdPessoas(){
        return this.d.numPessoasCadas;
    }
    public String[] getCpf(){
        return this.d.getListaCpf();
    }
    public String[] getTipoDatNas(){
        return this.d.getListaDataNasc();
    }
    public String[] getTel(){
        return this.d.getListaTelefone();
    }
    public String[] getTipoUser(){
        return this.d.getListaTipoUsuario();
    }
    public int getNumPessoasCad(){
        return this.d.getNumPessoasCadas();
    }
    public String[] getNomePro(){
        return this.d.getListaNome();
    }
    public int getQtdPro(){
        return this.d.getNumProdutosCadas();
    }
    public String[] getTipBico(){
        return this.d.getListaTipoBico();
    }
    public String[] getMat(){
        return this.d.getListaMaterial();
    }
    public Double[] getCircunfCano(){
        return this.d.getListaCircunferenciaCano();
    }
    public Double[] getAltSalto(){
        return this.d.getListaAlturaSalto();
    }
    public String[] getDepart(){
        return this.d.getListaDepartamento();
    }
    public String[] getTipoTrava(){
        return this.d.getListaTipoTrava();
    }
    public String[] getModelCadarco(){
        return this.d.getListaModeloCadarco();
    }
    public String[] getTipoCorrreia(){
        return this.d.getListaTipoCorreia();
    }
    public String[] getEstet(){
        return this.d.getListaEstetica();
    }
    public Double[] getAltCano(){
        return this.d.getListaAlturaCano();
    }
    public String[] getModel(){
        return this.d.getListaModelo();
    }
    public String[] getId(){
        return this.d.getListaId();
    }
    public String[] getMarca(){
        return this.d.getListaMarca();
    }
    public Double[] getValor(){
        return this.d.getListaValorProduto();
    }
    public String[] getCor(){
        return this.d.getListaCor();
    }
    public int[] getTamanho(){
        return this.d.getListaTamanho();
    }
    public int[] getCategoria(){
        return this.d.getListaCategoria();
    }
    public int[] getQTdProEst(){
        return this.d.getListaQuantidade();
    }



}
