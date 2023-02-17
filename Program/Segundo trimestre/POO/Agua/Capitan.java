package Agua;

public class Capitan extends Tripulante {
 
    public Capitan(String numeroCarnet, int edad, String nombre){
        super(numeroCarnet, edad, nombre);
    }

    @Override
    public double sueldo(){
        return 1000 + super.getTiempoEmpresa();
    }

    @Override
    public String MostrarDatos(){
        return "Tripulante " + super.getNombre() + ", con carnet " + super.getNumeroCarnet() + " y de " + super.getEdad() + " años.\n Su sueldo es de " 
        + this.sueldo() + " que consite en 1000 de base mas " + super.getTiempoEmpresa() + " de los dias trabajados";
    }
    
}
