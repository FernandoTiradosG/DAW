import java.util.ArrayList;
import SuperPets.Mascota;
import SuperPets.Equipo;

public class JuegoMascotas {
    public static void main(String[] args) {
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("perro", 5, 3));
        mascotas.add(new Mascota("gato", 3, 3));

        ArrayList<Mascota> mascotasB = new ArrayList<Mascota>();
        mascotas.add(new Mascota("pajaro", 2, 1));
        mascotas.add(new Mascota("serpiente", 3, 5));

        Equipo teamA = new Equipo("Equipo A", mascotas);
        Equipo teamB = new Equipo("Equipo B", mascotasB);

    }

    public static Equipo startRound(Equipo teamA, Equipo teamB){
        while(teamA.mascotasSize() > 0 && teamB.mascotasSize() > 0){
            teamA.printMascota();
            teamB.printMascota();

            Mascota m1 = teamA.getNexMascota();
            Mascota m2 = teamB.getNexMascota();
            fight(m1, m2);
            if(m1.getVida() > 0) return teamA;
            if(m2.getVida() > 0) return teamB;
        }
    }

    public static void fight(Mascota pet1, Mascota pet2){
        
    }
}
