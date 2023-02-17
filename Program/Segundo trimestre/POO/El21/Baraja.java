package El21;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    final int numCartasPorPalo = 13;
    final String[] palos = {"picas", "corazones", "treboles", "diamantes"};
    private ArrayList<CartaE> cartas;

    public Baraja(){
        this.resetear();
    }

    public ArrayList<CartaE> getCArtas(){
        return this.cartas;
    }

    public boolean cartaEsValida(CartaE carta){
        if(carta.getValor() <= 0 || carta.getValor() > numCartasPorPalo){
            return false;
        }
        for(int i=0; i<palos.length; i++){
            if(carta.getPalo().equals(palos[i])){
                return true;
            }
        }
        return false;
    }

    public void metrCarta (CartaE carta){
        if(this.cartas.size() >= numCartasPorPalo*palos.length){
            System.out.println("La baraja esta llena");
            return;
        }
        if(!cartaEsValida(carta)){
            System.out.println("La carta no es valida");
            return;
        }
        this.cartas.add(carta);
    }
    
    public void resetear(){
        int numCartasPorPalo = 13;
        String[] palos = {"picas", "corazones", "treboles", "diamantes"};
        this.cartas = new ArrayList<CartaE>();

        for(int i=0; i<palos.length; i++){
            for(int j=0; j<numCartasPorPalo; j++){
                this.metrCarta(new CartaE(j+i, palos[i]));
            }
        }
    }

    public void barajar(){
        Collections.shuffle(this.cartas);
    }

    @Override
    public String toString(){
        String listaCartas = "";
        for(CartaE carta : this.cartas){
            listaCartas += "- " + carta.getValor() + " de " + carta.getPalo() + ".";
         }
         return listaCartas;
    }
}
