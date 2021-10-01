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
    public TelaCadastroController(DadoController dados, int posi) {
        
            dados.getPessoas()[posi]="x";
            dados.getCpf()[posi]="x";
            dados.getTipoDatNas()[posi]="x";
            dados.getTel()[posi]="x";
        
    }

    public TelaCadastroController(int x,int y,DadoController d, String nome, String marca, String id, int tamanho, String cor,
            Double valorProduto, int quantidade, String tipoBico, String material) {

                d.getNomePro()[d.getQtdPro()+x] = nome;
                d.getMarca()[d.getQtdPro()+x] = marca;
                d.getId()[d.getQtdPro()+x] = id;
                d.getTamanho()[d.getQtdPro()+x] = tamanho;
                d.getCor()[d.getQtdPro()+x] = cor;
                d.getValor()[d.getQtdPro()+x] = valorProduto;
                d.getQTdProEst()[d.getQtdPro()+x] = quantidade;
                if(y==1){
                d.getTipBico()[d.getQtdPro()+x] = tipoBico;
                d.getMat()[d.getQtdPro()+x] = material;
                }else{
                    d.getTipoCorrreia()[d.getQtdPro()+x] = tipoBico;
                    d.getEstet()[d.getQtdPro()+x] = material;
                }
    }
    public TelaCadastroController(int x,int y,DadoController d, String nome, String marca, String id, int tamanho, String cor,
            Double valorProduto, int quantidade, Double circunfe, Double alturaSalto) {
                d.getNomePro()[d.getQtdPro()+x] = nome;
                d.getMarca()[d.getQtdPro()+x] = marca;
                d.getId()[d.getQtdPro()+x] = id;
                d.getTamanho()[d.getQtdPro()+x] = tamanho;
                d.getCor()[d.getQtdPro()+x] = cor;
                d.getValor()[d.getQtdPro()+x] = valorProduto;
                d.getQTdProEst()[d.getQtdPro()+x] = quantidade;
                d.getCircunfCano()[d.getQtdPro()+x] = circunfe;
                d.getAltSalto()[d.getQtdPro()+x] = alturaSalto;
    }
    public TelaCadastroController(int x,int y,DadoController d, String nome, String marca, String id, int tamanho, String cor,
            Double valorProduto, int quantidade, String departamento, String tipoTrava, String modeloCadar) {
                d.getNomePro()[d.getQtdPro()+x] = nome;
                d.getMarca()[d.getQtdPro()+x] = marca;
                d.getId()[d.getQtdPro()+x] = id;
                d.getTamanho()[d.getQtdPro()+x] = tamanho;
                d.getCor()[d.getQtdPro()+x] = cor;
                d.getValor()[d.getQtdPro()+x] = valorProduto;
                d.getQTdProEst()[d.getQtdPro()+x] = quantidade;
                d.getDepart()[d.getQtdPro()+x] = departamento;
                d.getTipoTrava()[d.getQtdPro()+x] = tipoTrava;
                d.getModelCadarco()[d.getQtdPro()+x] = modeloCadar;
    }
    public TelaCadastroController(int x,int y,DadoController d, String nome, String marca, String id, int tamanho, String cor,
            Double valorProduto, int quantidade, Double alturaCano, String modelo) {
                d.getNomePro()[d.getQtdPro()+x] = nome;
                d.getMarca()[d.getQtdPro()+x] = marca;
                d.getId()[d.getQtdPro()+x] = id;
                d.getTamanho()[d.getQtdPro()+x] = tamanho;
                d.getCor()[d.getQtdPro()+x] = cor;
                d.getValor()[d.getQtdPro()+x] = valorProduto;
                d.getQTdProEst()[d.getQtdPro()+x] = quantidade;
                d.getAltCano()[d.getQtdPro()+x] = alturaCano;
                d.getModel()[d.getQtdPro()+x] = modelo;

 
    }
}
