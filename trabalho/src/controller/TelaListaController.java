package controller;

import model.*;
import view.*;

public class TelaListaController {
    private String[] p;
    private int qtdPro;

    public TelaListaController(DadoController d) {
        p = d.getNomePro();
        qtdPro = d.getQtdPro();
    }

    public int getQtdPro() {
        return qtdPro;
    }
    public void setQtdPro(int qtdPro) {
        this.qtdPro = qtdPro;
    }
    public String[] getNomePr() {
        String[] s = new String[qtdPro];    
            for (int i = 0; i < qtdPro; i++) {
                s[i] = p[i].toString();
            }
        return s;
    }
    public String[] getNomePro(String nome) {
        String[] s = new String[qtdPro];    
            for (int i = 0; i < qtdPro; i++) {
                if(nome.equalsIgnoreCase(p[i].toString())){
                s[i] = p[i].toString();
                }
            }
        return s;
    }
}
