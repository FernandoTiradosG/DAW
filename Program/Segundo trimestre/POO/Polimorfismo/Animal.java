package Polimorfismo;

public abstract class Animal { //Al ser abstracto no permite en el mein crearlo, obligando que se tenga que crear un hijo y que este tenga obligatorio el metodo que tambien contenga abstract
    private String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    abstract public void saludar();
    
}
