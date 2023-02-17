package Polimorfismo;

public class Dragon extends Animal implements Volador {
    public Dragon(String nombre){
        super(nombre);
    }

    public void volar(){
        System.out.println("Me mantengo en el aire y soy mas grande que tu");
    }

    @Override
    public void saludar(){
        System.out.println("pio pio");
    }
}
