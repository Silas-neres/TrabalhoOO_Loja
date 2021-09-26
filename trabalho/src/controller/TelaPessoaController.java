package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.TelaPessoa;

import view.TelaCadastroPessoa;

public class TelaPessoaController {
    
    private final TelaPessoa view;
    

    public TelaPessoaController(TelaPessoa view) {
        super();
        this.view = view;
    }

    public void verificacaoCadastro(ActionEvent e){

        JButton botaoPressionado = (JButton) e.getSource();

        if(botaoPressionado == view.getSim()){
            
        } else {
            TelaCadastroPessoa telaCadastro = new TelaCadastroPessoa();
        }

    }

    public TelaPessoa getView() {
        return view;
    }
}
