import java.time.LocalDate;

import Servicios.*;

public class Trabajos {

    public static void main(String[] args) {
    
        TrabajoPintura deportista = new TrabajoPintura("Silvestre", 24, LocalDate.now() ,"Telepizza", 24, 8.99);
        RevisionAlarma informatico = new RevisionAlarma(LocalDate.now(), "Kora", 5);
        Servicio d1 = new TrabajoPintura("Francisco", 34, LocalDate.now() ,"Residencia Tornos", 100, 5.99);
        Servicio d2 = new TrabajoPintura("Carola", 34, LocalDate.now() ,"WOW", 5, 8.99);
        Servicio d3 = new TrabajoPintura("Felisa", 19, LocalDate.now() ,"Crash", 24, 8.99);
        Servicio i1 = new RevisionAlarma(LocalDate.now(), "Maria", 10);
        Servicio i2 = new RevisionAlarma(LocalDate.now(), "Marcos", 15);

        Servicio[] Servicios = {
            deportista,
            informatico,
            d1,d2,d3,i1,i2
        };

        for (Servicio p : Servicios) {
            System.out.println(p.detalleServicio());
        }
    }
}

