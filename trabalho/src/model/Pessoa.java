package model;

import java.util.Scanner;

import controller.DadoController;

import java.util.List;
import java.util.ArrayList;
import model.Dado;

public class Pessoa extends Dado {

    protected String nomePessoa;
    protected String dataNasc;
    protected String cpf;
    protected String telefone;
    protected String tipoUsuario;
    protected int totalPessoas;

    public Pessoa() {
        super();

        setNomePessoa(nomePessoa);
        setDataNasc(dataNasc);
        setCpf(cpf);

    }
    public Pessoa(DadoController d, int o, int pos, String nP, String c, String dN, String tel) {
        
        nomePessoa = nP;
        dataNasc = dN;
        cpf = c;
        telefone = tel;
        totalPessoas = pos;
       
    }
    public String toString(){
        
        return nomePessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getNumPessoasCadastradas() {
        return totalPessoas;
    }

    public void setNumPessoasCadastradas(int numPessoasCadas) {
        this.totalPessoas = numPessoasCadas;
    }

}
