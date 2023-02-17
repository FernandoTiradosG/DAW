package Agua;

import java.util.List;

public class Sala {

    private String nombre;
    private int aforoTotal;
    private List<Tripulante> tripulacionDentro;
    private String[] rangoPermitido = new String[3];

    public Sala(String nombre, int aforoTotal, List<Tripulante> tripulacionDentro, String[] rangoPermitido){
        this.nombre = nombre;
        this.aforoTotal = aforoTotal;
        this.tripulacionDentro = tripulacionDentro;
        this.rangoPermitido = rangoPermitido;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public int getAforoTotal(){
        return this.aforoTotal;
    }

    public void setAforoTotal(int newAforoTotal){
        this.aforoTotal = newAforoTotal;
    }

    public List<Tripulante> getTripulacionDentro(){
        return this.tripulacionDentro;
    }

    public void setTripulacionDentro(List<Tripulante> newTripulacionDentro){
        this.tripulacionDentro = newTripulacionDentro;
    }

    public String[] getRangoPermitido(){
        return this.rangoPermitido;
    }

    public void setRangoPermitido(String[] newRangoPermitido){
        this.rangoPermitido = newRangoPermitido;
    }

    public void entran(Tripulante nuevo){
        for(String rango: rangoPermitido){
            if(rango.equals(nuevo.getClass().getSimpleName())){
                tripulacionDentro.add(nuevo);
                return;
            }
        }
        System.out.println("El tripulante no puede entrar");
    }
    
}
