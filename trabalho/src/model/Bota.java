package model;

/**
 * Dados da bota
 * @author acer
 * @Version 1.0(Out 2021)
 */

public class Bota extends Produto {
    
    /**
	 * Guarda os dados cadastrais da bota, sendo ela:
	 * (1)circuferencia do cano
	 * (2)altura do salto
	 * @param Bota
	 * @return CircuferenciaCano, AlturaSalto
	 */

    Double circunferenciaCano;
    Double alturaSalto;

    public Bota() {

    }

    public Double getCircunferenciaCano() {
        return circunferenciaCano;
    }

    public void setCircunferenciaCano(Double circunferenciaCano) {
        this.circunferenciaCano = circunferenciaCano;
    }

    public Double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(Double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

}
