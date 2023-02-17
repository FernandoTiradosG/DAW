package Clases;

import java.util.Date;

public class Jugador {
    private String nombre;
    private String dorsal;
    private String equipo;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private String nacionalidad;
    private Date fechaNacimiento;
    private String posicion;

    public Jugador(String nombre, Date fechaNacimiento, String nacionalidad, String posicion, String dorsal, String equipo){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.equipo = equipo;
    }

    //GET

    public String getNombre(){
        return this.nombre;
    }

    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public String getNacionalidad(){
        return this.nacionalidad;
    }

    public String getPosicion(){
        return this.posicion;
    }

    public String getDorsal(){
        return this.dorsal;
    }

    public String getEquipo(){
        return this.equipo;
    }

    public int getAmarilla(){
        return this.tarjetasAmarillas;
    }

    public int getRoja(){
        return this.tarjetasRojas;
    }

    //SET

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public void setFechaNacimiento(Date newFechaNacimiento){
        this.fechaNacimiento = newFechaNacimiento;
    }

    public void setNacionalidad(String newNacionalidad){
        this.nacionalidad = newNacionalidad;
    }

    public void setPosicion(String newPosicion){
        this.posicion = newPosicion;
    }

    public void setDorsal(String newDorsal){
        this.dorsal = newDorsal;
    }

    public void setEquipo(String newEquipo){
        this.equipo = newEquipo;
    }

    public void setEquipo(int newAmarilla){
        this.tarjetasAmarillas = newAmarilla;
    }

    public void setRoja(int newRoja){
        this.tarjetasRojas = newRoja;
    }

    //Impresor

    public String toString(){
        return "Jugador: " + this.getNombre() + ", nacido el " + this.getFechaNacimiento() + ", Jugador del " + this.getEquipo() + ", de nacionalidad " + this.getNacionalidad() + ".";
    }
}
