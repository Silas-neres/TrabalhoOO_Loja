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
}
