package model;

import java.util.Scanner;

public class Sapatilha extends Produto {

    private String tipoBico;
    private String material;    

    public Sapatilha() {

    }
    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
