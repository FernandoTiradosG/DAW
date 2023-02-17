package Agua;

import java.time.LocalDate;

public class GPS {
    
    private int ejex;
    private int ejey;
    private LocalDate fecha;

    public GPS(int ejex, int ejey, LocalDate fecha){
        this.ejex = ejex;
        this.ejey = ejey;
        this.fecha = fecha;
    }

    public int getEjex(){
        return this.ejex;
    }

    public void setEjex(int newEjex){
        this.ejex = newEjex;
    }

    public int getEjey(){
        return this.ejey;
    }

    public void setEjey(int newEjey){
        this.ejey = newEjey;
    }

    public LocalDate getFecha(){
        return LocalDate.now();
    }

    public void setFecha(){
        this.fecha = LocalDate.now();
    }
}
