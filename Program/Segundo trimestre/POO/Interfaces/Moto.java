package Interfaces;

public class Moto extends Vehiculo implements Imoto {
    public Moto(String marca, String matricula){
        super(marca, matricula);
    }

    public void conducir(){
        
    }
    public int repostar(){
        return 100;
    }
    
    public boolean para(){
        return true;
    }
    
    public boolean sostener(){
        boolean pata = true;
        if (!para()){
            pata = false;
        }
        return pata;
    }

    @Override
    public String toString(){
        return "Moto de la marca " + super.marca + " con matricula " + this.matricula;
    }
}
