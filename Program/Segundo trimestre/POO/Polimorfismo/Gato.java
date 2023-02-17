package Polimorfismo;

public class Gato extends Animal{
    
    public Gato(String nombre){
        super(nombre);
    }

    @Override
    public void saludar(){
        System.out.println("miau miau");
    }
}
