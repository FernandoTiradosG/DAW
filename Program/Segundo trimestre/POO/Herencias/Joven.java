package Herencias;

public class Joven extends Persona{
    String pelo;
    public Joven (String nombre, int edad){
        super(nombre, edad);
        this.pelo = "corto";
    }

    @Override
    public String toString(){
        return super.toString() + ", con pelo " + this.pelo; //el this te dara el valor que tenga dentro de la clase, con el super accedera al valor que provenga del padre
    }
}
