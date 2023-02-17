package Superheroe;

public class Figura {
    private double precio;
    private double cantidad;
    private String idCodigo;
    private Superheroe personaje;
    private Dimension dimensiones;

    public Figura (String idCodigo, double precio, Dimension dimensiones, Superheroe personaje){
        this.precio = precio;
        this.idCodigo = idCodigo;
        this.dimensiones = dimensiones;
        this.personaje = personaje;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(Double newPecio){
        this.precio = newPecio;
    }
    
    public String getIdCodigo(){
        return this.idCodigo;
    }

    public void setIdCodigo(String newIdCodigo){
        this.idCodigo = newIdCodigo;
    }

    public Superheroe getPersonaje(){
        return this.personaje;
    }

    public void setPersonaje(Superheroe newPersonaje){
        this.personaje = newPersonaje;
    }
    
    public Dimension getDimension(){
        return this.dimensiones;
    }

    public void setDimensiones(Dimension newDimensiones){
        this.dimensiones = newDimensiones;
    }

    public void subirPrecio(double subida){
        this.precio += cantidad;
    }

    @Override
    public String toString(){
        return "";
    }
}
