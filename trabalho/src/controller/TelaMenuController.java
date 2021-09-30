package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.TelaMenu;
import view.TelaPessoa;

public class TelaMenuController {

    private final TelaMenu view;

    public TelaMenuController(TelaMenu view) {
        super();
        this.view = view;
    }

    public void EscolhaUsuario(ActionEvent e) {

        JButton botaoPressionado = (JButton) e.getSource();

       
    }

    public TelaMenu getView() {
        return view;
    }
}
