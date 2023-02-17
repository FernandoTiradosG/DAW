package Polimorfismo;

public class Bulldog extends Perro {

    public Bulldog(String nombre){
        super(nombre);
    }

    @Override
    public void saludar(){
        System.out.println("GUAU GUAU");
    }
    
}
