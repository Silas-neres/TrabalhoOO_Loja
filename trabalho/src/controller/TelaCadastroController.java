package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.*;
import controller.*;
import model.*;

public class TelaCadastroController {
    
   public TelaCadastroController(DadoController d, int o, int pos, String nP, String c, String dN, String tel, int y){
        
        d.getPessoas()[d.getNumPessoasCad()+y] = nP;
        d.getCpf()[d.getNumPessoasCad()+y] = c;
        d.getTipoDatNas()[d.getNumPessoasCad()+y] = dN;
        d.getTel()[d.getNumPessoasCad()+y] = tel;
        if(o == 1){
            d.getTipoUser()[d.getNumPessoasCad()+y] = "CLIENTE";
        }else{
            d.getTipoUser()[d.getNumPessoasCad()+y] = "VENDEDOR";
        }
    }
    public TelaCadastroController(DadoController d, int pos, String nP, String c, String dN, String tel){
        
        if(nP.equals(null)){
        }else{
            d.getPessoas()[pos] = nP;
        }
        if(c.equals(null)){
        }else{
            d.getCpf()[pos] = c;
        }
        if(dN.equals(null)){
        }else{
            d.getTipoDatNas()[pos] = dN;
        }
        if(tel.equals(null)){
        }else{
            d.getTel()[pos] = tel;
        }
    }
}
