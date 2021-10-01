package model;

public class Chuteira extends Produto {

    String departamento;
    String tipoTrava;
    String modeloCadarco;

    public Chuteira() {

    }

    public String getDepartamentDouble() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTipoTrava() {
        return tipoTrava;
    }

    public void setTipoTrava(String tipoTrava) {
        this.tipoTrava = tipoTrava;
    }

    public String getModeloCadarco() {
        return modeloCadarco;
    }

    public void setModeloCadarco(String modeloCadarco) {
        this.modeloCadarco = modeloCadarco;
    }
}
