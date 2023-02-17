package Superheroe;

public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;
    
    public Dimension(){
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    public Dimension(Double alto, Double ancho, Double profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundo;
    }

    public double getAlto(){
        return this.alto;
    }

    public void setAlto(Double newAlto){
        this.alto = newAlto;
    }

    public double getAncho(){
        return this.ancho;
    }

    public void setAncho(Double newAncho){
        this.ancho = newAncho;
    }

    public double getPrundidad(){
        return this.profundidad;
    }

    public void setPrundidad(Double newProfundo){
        this.profundidad = newProfundo;
    }

    public double getVolumen(){
        return this.alto * this.ancho * this.profundidad;
    }

    @Override
    public String toString(){
        return "Las medidas son: "+this.alto+" de alto, "+this.ancho+" de ancho y "+this.profundidad+" de profundidad.\n"+"Con un volumen de "+this.getVolumen();
    }
}
