package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.TelaMenu;
import view.TelaPessoa;

public class TelaMenuController {

    private final TelaMenu view;
    int op;

    public TelaMenuController(TelaMenu view) {
        super();
        this.view = view;
    }

    public void EscolhaUsuario(ActionEvent e) {

        JButton botaoPressionado = (JButton) e.getSource();

        if (botaoPressionado == view.getVendedor()) {
            TelaPessoa telaPessoa = new TelaPessoa();
            op=0;
        } else {
            TelaPessoa telaPessoa = new TelaPessoa();
            op=1;
        }
    }

    public TelaMenu getView() {
        return view;
    }
}
