package Herencias;

public class Lavadora extends Electrodomestico{
    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia){
        super("Lavadora", marca, potencia);
        this.precio = 0;
        this.aguaCaliente = false;
    }

    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente){
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double newprecio){
        this.precio = newprecio;
    }

    public boolean getaguaCaliente(){
        return this.aguaCaliente;
    }

    public void setaguaCaliente(boolean newaguaCaliente){
        this.aguaCaliente = newaguaCaliente;
    }

    public double getConsumo(int horas){
        if (!this.aguaCaliente){
            return getConsumo(horas);
        }else{
            return horas * (super.getPotencia() + super.getPotencia() * 0.20);
        }
    }

    public double getCosteConsumo(int horas, double costehora){
        return super.getCosteConsumo(horas, costehora);
    }

    @Override
    public String toString(){
        if(aguaCaliente){
            return super.toString() + "\nTiene un precio de " + this.getPrecio() + " euros y lavado de agua caliente.";
        }else{
            return super.toString() + "\nTiene un precio de " + this.getPrecio() + " y lavado de agua fria.";
        }
        
    }
}
