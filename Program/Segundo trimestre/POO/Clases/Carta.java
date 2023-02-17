package Clases;

public class Carta {
    private int valor;
    private String palo;
    private boolean jugada;

    //CONSTRUCTORES
    public Carta(int valor, String palo){
        this.valor = valor;
        this.palo = palo;
    }

    public Carta(){
        this(7, "picas");
    }

    public Carta(int valor){
        this(valor, "trebol");
    }

    public Carta(String palo){
        this(8, palo);
    }

    //GET

    public int getValor(){
        return this.valor;
    }

    public String getPalo(){
        return this.palo;
    }

    public boolean isJugada(){//Los buleanos es mejor que se inicien con "is..." ya que solo te van a indicar dos posibilidades de como esta lo que pidas
        return this.jugada;
    }

    //SET
    public void setValor(int newvalor){
        this.valor = newvalor;
    }

    public void setPalo(String newpalo){
        this.palo = newpalo;
    }

    @Override
    public String toString(){
        return "[" + this.getValor() + " de " + this.getPalo() + "]";
    }
}