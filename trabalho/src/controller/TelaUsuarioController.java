package controller;

import model.*;
import view.*;

public class TelaUsuarioController {
    private String[] a;
    private int qtdPessoa;
    private String[] tipoUser;

    public TelaUsuarioController(DadoController d) {
        a = d.getPessoas();
        qtdPessoa = d.getQtdPessoas();
        tipoUser = d.getTipoUser();
    }

    public int getQtdPessoa() {
        return qtdPessoa;
    }

    public void setQtdPessoa(int qtdPessoa) {
        this.qtdPessoa = qtdPessoa;
    }

    public String[] getNomeP(int x, int y) {
        String[] s = new String[qtdPessoa+y];
        if (x == 1) {    
            for (int i = 0; i < qtdPessoa+y; i++) {
                if(tipoUser[i].equalsIgnoreCase("CLIENTE"))
                s[i] = a[i].toString();
            }
        }else{
            for (int i = 0; i < qtdPessoa+y; i++) {
                if(tipoUser[i].equalsIgnoreCase("VENDEDOR"))
                s[i] = a[i].toString();
            }
        }
        return s;
    }

}
