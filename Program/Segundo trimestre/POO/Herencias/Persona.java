package Herencias;

public class Persona {
    private String nombre;
    protected int edad; //Con protected permites que los hijos accedan a esta variable, mientras private no le permites el acceso a otros, si no tiene nada todos dentro del package tienenn acceso y public todos tienen accesos.

    public Persona(){
        nombre = "";
        edad = 0;
    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    @Override
    public String toString(){
        return "Sujeto " + this.getNombre() + " de " + this.getEdad() + " años";
    }
}
