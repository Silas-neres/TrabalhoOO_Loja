package controller;

import model.*;
import view.*;

public class TelaUsuarioController {
    private String[] a;
    private int qtdPessoa;


   public TelaUsuarioController(DadoController d){
       a = d.getPessoas();
       qtdPessoa = d.getQtdPessoas();
   }

    public int getQtdPessoa() {
        return qtdPessoa;
    }
    public void setQtdPessoa(int qtdPessoa) {
        this.qtdPessoa = qtdPessoa;
    }
    public String[] getNomeP(){
        String[] s = new String[qtdPessoa];
        for(int i = 0; i < qtdPessoa; i++){
            s[i] = a[i].getNomePessoa();
        } 
        return s;
    }
    
}
