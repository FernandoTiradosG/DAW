package Agua;

import java.util.ArrayList;

public class Barco {

    private String nombre;
    private String tipo;
    private int capacidad;
    private ArrayList<Tripulante> tripulacion;
    private GPS localizador;

    public Barco(String nombre, String tipo, int capacidad, int ejex, int ejey){
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        localizador.setEjex(ejex);
        localizador.setEjey(ejey);
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String newTipo){
        this.tipo = newTipo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public int getCapacidad(){
        return this.capacidad;
    }

    public void setCapacidad(int newCapacidad){
        this.capacidad = newCapacidad;
    }

    public GPS getLocalizador(){
        return this.localizador;
    }

    public void setLocalizador(GPS newLocalizador){
        this.localizador = newLocalizador;
    }

    public void añadirTripulacion(int tipo, String nombre, int edad, String numeroCarnet){
        
        if(tripulacion.size()<=capacidad){
            Tripulante t = new Capitan(null, 0, null);

            /*if(tipo == 1) t = new Capitan(numeroCarnet, edad, nombre);
            if(tipo == 2) t = new Marinero(numeroCarnet, edad, nombre);
            if(tipo == 2) t = new JefeFlota(numeroCarnet, edad, nombre);

            return t;*/
            
            switch (tipo) {
                case 1:
                    t = new Capitan(numeroCarnet, edad, nombre);
                    break;
                
                case 2:
                    t = new Marinero(numeroCarnet, edad, nombre);
                    break;

                case 3:
                    t = new JefeFlota(numeroCarnet, edad, nombre);
                    break;

                default:
                    break;
            }

            tripulacion.add(t);
        }else{
            System.out.println("No cabe mas tripulantes");
        }
    }

}
