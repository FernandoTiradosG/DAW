package Agua;

public abstract class Tripulante {

    private String numeroCarnet;
    private int edad;
    private int tiempoEmpresa;
    private String nombre;

    public Tripulante(String numeroCarnet, int edad, int tiempoEmpresa, String nombre){
        this.numeroCarnet = numeroCarnet;
        this.edad = edad;
        this.tiempoEmpresa = tiempoEmpresa;
        this.nombre = nombre;
    }

    public Tripulante(String numeroCarnet, int edad, String nombre){
        this.numeroCarnet = numeroCarnet;
        this.edad = edad;
        this.tiempoEmpresa = 0;
        this.nombre = nombre;
    }

    public String getNumeroCarnet(){
        return this.numeroCarnet;
    }

    public void setNumeroCarnet(String newNumeroCarnet){
        this.numeroCarnet = newNumeroCarnet;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public int getTiempoEmpresa(){
        return this.tiempoEmpresa;
    }

    public void setTiempoEmpresa(int newTiempoEmpresa){
        this.tiempoEmpresa = newTiempoEmpresa;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int newEdad){
        this.edad = newEdad;
    }

    public abstract double sueldo();

    public abstract String MostrarDatos();
}
