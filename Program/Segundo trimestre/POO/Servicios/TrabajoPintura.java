package Servicios;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {

    private double superficie;
    private double precioPintura;
    private double costeAdicional;
    private double costetotal = 0;

    public TrabajoPintura(String nombre, int edad, LocalDate fechaDeInicio, String cliente, double superficie, double precioPintura){
        super(nombre, edad, fechaDeInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public double getSuperficie(){
        return this.superficie;
    }

    public void setSuperficie(double newSuperficie){
        this.superficie = newSuperficie;
    }

    public double getPrecioPintura(){
        return this.precioPintura;
    }

    public void setPrecioPintura(double newPrecioPintura){
        this.precioPintura = newPrecioPintura;
    }

    @Override
    public double costeMaterial(){
        return (this.getSuperficie()/7.8) * this.precioPintura; 
    }

    @Override
    public double costeManoObra(){
        costetotal = (this.getSuperficie()/10) * 9.5;
        
        if(superficie < 50){
            costeAdicional =  costetotal * 0.15;
            return costetotal;
        }else{
            return costetotal;
        }
        
    }

    @Override
    public double costeTotal(){
        return costeManoObra() + costeMaterial() + costeAdicional;
    }

    @Override
    public String detalleServicio(){
        return "TRABAJO DE PINTURA" +
        "\nCliente: " + super.getCliente() +
        "\nFecha de inicio: " + super.getFechaDeInicio() +
        "\n----------------------------------------" +
        "\nPintor: " + super.getTrabajador().getNombre() +
        "\nCoste Material..... " + this.costeMaterial() +
        "\nCoste Mano Obra.... " + this.costeManoObra() +
        "\nCoste Adicional.... " + this.costeAdicional +
        "\nTOTAL: ............ " + this.costeTotal() + "\n";
    }
    
}
