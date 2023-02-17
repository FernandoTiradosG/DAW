package Agua;

public class Marinero extends Tripulante {

    private int captura;

    public Marinero(String numeroCarnet, int edad, String nombre, int captura){
        super(numeroCarnet, edad, nombre);
        this.captura = captura;
    }

    public Marinero(String numeroCarnet, int edad, String nombre){
        super(numeroCarnet, edad, nombre);
        this.captura = 0;
    } 

    @Override
    public double sueldo(){
        return 900 + captura;
    }

    @Override
    public String MostrarDatos(){
        return "Tripulante " + super.getNombre() + ", con carnet " + super.getNumeroCarnet() + " y de " + super.getEdad() + " años.\n Su sueldo es de " 
        + this.sueldo() + " que consite en 1000 de base mas " + super.getTiempoEmpresa() + " por las capturas";
    }
    
}
