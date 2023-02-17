package Polimorfismo;

public class Informatico extends Persona {

    public Informatico(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public int correr(){
        return 2;
    }
}
