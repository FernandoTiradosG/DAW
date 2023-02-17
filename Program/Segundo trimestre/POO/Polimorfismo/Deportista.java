package Polimorfismo;

public class Deportista extends Persona {
    
    public Deportista(String nombre, int edad){
        super(nombre, edad);
    }

    

    @Override
    public int correr(){
        return 7;
    }
}
