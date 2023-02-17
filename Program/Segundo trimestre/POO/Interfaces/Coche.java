package Interfaces;

public class Coche extends Vehiculo implements Ivehiculo{
    public Coche(String marca, String matricula){
        super(marca, matricula);

    }
    public void conducir(){
        
    }
    public int repostar(){
        return 100;
    }
}
