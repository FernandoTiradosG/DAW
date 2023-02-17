package Polimorfismo;

public class Perro extends Animal{

    public Perro(String nombre){
        super(nombre);
    }

    @Override
    public void saludar(){
        System.out.println("guau guau");
    }
}
