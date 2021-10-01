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
        return this.d.getListaTipoUsuario();
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

}
