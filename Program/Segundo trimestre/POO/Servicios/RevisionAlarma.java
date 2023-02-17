package Servicios;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio {

    private int alarmaRevisar;

    public RevisionAlarma(LocalDate fechaRevision, String cliente, int alarmaRevisar){

        super("Revisor Especialista Contraincendios", 0, fechaRevision, cliente);
        this.alarmaRevisar = alarmaRevisar;
    }

    public int getAlarmaRevisar(){
        return this.alarmaRevisar;
    }

    public void setAlarmaRevisar(int newAlarmaRevisar){
        this.alarmaRevisar = newAlarmaRevisar;
    }

    @Override
    public double costeMaterial(){
        return 0; 
    }

    @Override
    public double costeManoObra(){
        return (this.getAlarmaRevisar()/3) * 40;        
    }

    @Override
    public double costeTotal(){
        return costeManoObra();
    }

    @Override
    public String detalleServicio(){
        return "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS" +
        "\nCliente: " + super.getCliente() +
        "\nFecha revisión: " + super.getFechaDeInicio() +
        "\n----------------------------------------" +
        "\nTOTAL: ....... " + this.costeTotal() +
        "\n----------------------------------------\n";
    }
    
}
