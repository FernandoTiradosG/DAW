package Clases;

public class Persona {
    private String nombre;
    private int edad;
    private char talla;
    private Camiseta camiseta;

    public Persona(String nombre, int edad, char talla){
        this.nombre = nombre;
        this.edad = edad;
        this.talla = talla;
    }

    //GET

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public char getTalla(){
        return this.talla;
    }

    public Camiseta getCamiseta(){
        return this.camiseta;
    }

    //SET

    public void setNombre(String newnombre){
        this.nombre = newnombre;
    }

    public void setEdad(int newedad){
        this.edad = newedad;
    }

    public void setTalla(char newtalla){
        this.talla = newtalla;
    }

    public void ponerCamiseta(Camiseta newcamiseta){
        this.camiseta = newcamiseta;
    }

    //

    public void quitarCamiseta(){
        this.camiseta = null;
    }
    
    public boolean probarCamiseta(){
        return this.camiseta.getTalla() == this.talla;
    }
}
