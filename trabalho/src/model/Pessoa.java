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
 

    public Pessoa(String nomePessoa, String cpf, String dataNasc, String telefone, String tipoUsuario,
            int numPessoasCadas, ArrayList<String> listaNomePessoa, ArrayList<String> listaDataNasc,
            ArrayList<String> listaCpf, ArrayList<String> listaTelefone, ArrayList<String> listaTipoUsuario) {

        setNomePessoa(nomePessoa);
        setDataNasc(dataNasc);
        setCpf(cpf);
        setTipoUsuario(tipoUsuario);
        setNumPessoasCadastradas(numPessoasCadas);

        cadastrar(nomePessoa, cpf, dataNasc, telefone, tipoUsuario, numPessoasCadas, listaNomePessoa, listaDataNasc,
                listaCpf, listaTelefone, listaTipoUsuario);
    }

    public Pessoa(int opcaoEditarPessoa, String[] listaNomePessoa, String[] listaDataNasc, String[] listaCpf,
            String[] listaTelefone, int numPessoasCadas, int identificador2, String[] listaTipoUsuario) {
        editar(opcaoEditarPessoa, listaNomePessoa, listaDataNasc, listaCpf, listaTelefone, numPessoasCadas,
                identificador2);
    }

    public Pessoa(String[] listaNomePessoa, String[] listaDataNasc, String[] listaCpf, String[] listaTelefone,
            int numPessoasCadas, int identificador2, String[] listaTipoUsuario) {

        apagar(listaNomePessoa, listaDataNasc, listaCpf, listaTelefone, numPessoasCadas, identificador2,
                listaTipoUsuario);
        System.out.println("USUARIO APAGADO!");
    }

    public void cadastrar(String nomePessoa, String cpf, String dataNasc, String telefone, String tipoUsuario,
            int numPessoasCadas, ArrayList<String> listaNomePessoa, ArrayList<String> listaDataNasc,
            ArrayList<String> listaCpf, ArrayList<String> listaTelefone, ArrayList<String> listaTipoUsuario) {

        listaNomePessoa.add(nomePessoa);
        listaCpf.add(cpf);
        listaDataNasc.add(dataNasc);
        listaTelefone.add(telefone);
        listaTipoUsuario.add(tipoUsuario);

    }

    public void editar(int opcaoEditarPessoa, String[] listaNomePessoa, String[] listaDataNasc, String[] listaCpf,
            String[] listaTelefone, int numPessoasCadas, int identificador2) {
        Scanner ler = new Scanner(System.in);
        String recebeString;

        switch (opcaoEditarPessoa) {
            case 1:
                System.out.println("PARA QUAL NOME DESEJA TROCAR?");
                recebeString = ler.nextLine().toUpperCase();
                listaNomePessoa[identificador2] = recebeString;
                break;
            case 2:
                System.out.println("PARA QUAL DATA DE NASCIMENTO DESEJA TROCAR?");
                recebeString = ler.nextLine().toUpperCase();
                listaDataNasc[identificador2] = recebeString;
                break;
            case 3:
                System.out.println("PARA QUAL CPF DESEJA TROCAR?");
                recebeString = ler.nextLine().toUpperCase();
                listaCpf[identificador2] = recebeString;
                break;
            case 4:
                System.out.println("PARA QUAL TELEFONE DESEJA TROCAR?");
                recebeString = ler.nextLine().toUpperCase();
                listaTelefone[identificador2] = recebeString;
                break;
            case 5:
                System.out.println("PARA QUAL NOME DESEJA TROCAR?");
                recebeString = ler.nextLine().toUpperCase();
                listaNomePessoa[identificador2] = recebeString;
                break;

        }
    }

    public void apagar(String[] listaNomePessoa, String[] listaDataNasc, String[] listaCpf, String[] listaTelefone,
            int numPessoasCadas, int identificador2, String[] listaTipoUsuario) {

        int i;

        listaNomePessoa[identificador2] = null;
        listaDataNasc[identificador2] = null;
        listaCpf[identificador2] = null;
        listaTelefone[identificador2] = null;
        listaTipoUsuario[identificador2] = null;

        for (i = identificador2; i < numPessoasCadas; i++) {
            listaNomePessoa[i] = listaNomePessoa[i + 1];
            listaDataNasc[i] = listaDataNasc[i + 1];
            listaCpf[i] = listaCpf[i + 1];
            listaTelefone[i] = listaTelefone[i + 1];
            listaTipoUsuario[i] = listaTipoUsuario[i + 1];
        }

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
