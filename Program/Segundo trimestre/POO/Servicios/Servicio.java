package Servicios;

import java.time.LocalDate;

public abstract class Servicio {
    private Persona trabajador;
    private LocalDate fechaDeInicio;
    private String cliente;

    public Servicio(String nombre, int edad, LocalDate fechaDeInicio, String cliente){
       Persona nuevo = new Persona(nombre, edad);
       this.trabajador = nuevo;
       this.fechaDeInicio = fechaDeInicio;
       this.cliente = cliente;
    }

    public Persona getTrabajador(){
        return this.trabajador;
    }

    public void setTrabajador(Persona newTrabajador){
        this.trabajador = newTrabajador;
    }

    public LocalDate getFechaDeInicio(){
        return this.fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate newFechaDeInicio){
        this.fechaDeInicio = newFechaDeInicio;
    }

    public String getCliente(){
        return this.cliente;
    }

    public void setCliente(String newCliente){
        this.cliente = newCliente;
    }

    public abstract double costeMaterial();

    public abstract double costeManoObra();

    public abstract double costeTotal();

    public abstract String detalleServicio();
}
