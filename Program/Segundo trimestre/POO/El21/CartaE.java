package El21;

public class CartaE {
    private int valor;
    private String palo;

    //CONSTRUCTORES
    public CartaE(int valor, String palo){
        this.valor = valor;
        this.palo = palo;
    }

    //GET

    public int getValor(){
        return this.valor;
    }

    public String getPalo(){
        return this.palo;
    }

    @Override
    public String toString(){
        return "[" + this.getValor() + " de " + this.getPalo() + "]";
    }
}
