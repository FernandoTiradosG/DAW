package Clases;

public class Cafetera {
    private int cantidadMax;
    private int cantidadActual;

    public Cafetera(){
        this.cantidadMax = 1000;
        this.cantidadActual = 0;
    }
    public Cafetera(int cantidadMax){
        this.cantidadMax = cantidadMax;
        this.cantidadActual = cantidadMax;
    }

    public int getMax(){
        return this.cantidadMax;
    }

    public int getActual(){
        return this.cantidadActual;
    }

    //Metodos

    public void llenarCafetera(){
        this.cantidadActual = this.cantidadMax; 
    }

    public void servirTaza(int taza){
        this.cantidadActual -= taza;
        if (this.cantidadActual < 0){
            this.cantidadActual = 0;
            System.out.println("La taza no se ha llenado del todo ya que falta cafe");
        }
    }

    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }

    public void agregarCafe(int llenar){
        this.cantidadActual += llenar;

        if(this.cantidadActual > this.cantidadMax){
            int quitar = this.cantidadActual - this.cantidadMax;
            this.cantidadActual -= quitar;
            System.out.println("La maquina ya eta al maximo, te sobran: " + quitar + " de cafe");
        }
    }

    @Override
    public String toString(){
        return "Tu cafetera tiene " + this.getActual() + " de cafe.";
    }
}
