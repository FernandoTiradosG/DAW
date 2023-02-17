package Superheroe;

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(){

    }

    public String getNombreColeccion(){
        return this.nombreColeccion;
    }

    public void setNombreColeccion(String newNombreColeccion){
        this.nombreColeccion = newNombreColeccion;
    }

    public void anadirFigura(Figura fig){
        listaFiguras.add(fig);
    }

    public void masValioso(){
        Figura sustituto;
    }
}
