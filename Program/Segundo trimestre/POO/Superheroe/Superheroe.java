package Superheroe;

public class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;

    public Superheroe(String nombre){
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String newdescripcion){
        this.descripcion = newdescripcion;
    }

    public boolean getCapa(){
        return this.capa;
    }

    public void setCapa(boolean newCapa){
        this.capa = newCapa;
    }

    @Override
    public String toString(){
        return this.getNombre() + ": " + this.getDescripcion() + ".\nAunque la existencia de su capa es " + this.capa;
    }
}
