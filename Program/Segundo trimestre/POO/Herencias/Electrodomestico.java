package Herencias;

public class Electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;

    public Electrodomestico(String tipo, String marca, double potencia){
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String newtipo){
        this.tipo = newtipo;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String newmarca){
        this.marca = newmarca;
    }
    
    public double getPotencia(){
        return this.potencia;
    }

    public void setPotencia(double newpotencia){
        this.potencia = newpotencia;
    }

    public double getConsumo(int horas){
        return horas * this.potencia;
    }

    public double getCosteConsumo(int horas, double costehora){
        return getConsumo(horas) * costehora;
    }

    @Override
    public String toString(){
        return this.getTipo() + " de la marca " + this.getMarca() + " con una potencia de " + this.getPotencia() + "KW.";
    }
}
