package Polimorfismo;

public class Pajaro extends Animal implements Volador{

    public Pajaro(String nombre){
        super(nombre);
    }

    public void volar(){
        System.out.println("Me mantengo en el aire y tu no");
    }

    @Override
    public void saludar(){
        System.out.println("pio pio");
    }
}
