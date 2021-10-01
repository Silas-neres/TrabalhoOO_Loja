package model;

public class Tenis extends Produto {
	
	Double alturaCano;
	String modelo;
    
	public Tenis() {
		
	}
    
    public double getAlturaCano() {
        return alturaCano;
    }

    public void setAlturaCano(double alturaCano) {
        this.alturaCano = alturaCano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

