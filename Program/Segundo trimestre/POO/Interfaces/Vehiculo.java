package Interfaces;

public class Vehiculo {
    private String marca;
    private String matricula;

    public Vehiculo(String marca, String matricula){
        this.marca = marca;
        this.matricula = matricula;
    }

    public Vehiculo(String marca){
        this.marca = marca;
        this.matricula = "Sin matricula";
    }

    
    
}
