package SuperPets;

import java.util.ArrayList;

public class Equipo {
    public String nombre;
    ArrayList<Mascota> mascotas;

    public Equipo(String nombre, ArrayList<Mascota> mascota){
        this.nombre = nombre;
        this.mascotas = mascota;
    }

    public String getName(){
        return this.nombre;
    }

    public int mascotasSize(){
        return this.mascotas.size();
    }

    public boolean addMascota(Mascota mascota){
        if (mascotas.size() < 5){
            return mascotas.add(mascota);
        }

        return false;
    }

    public Mascota getNexMascota(){
        return mascotas.get(0);
    }

    public void printMascota(){
        System.out.println(this.nombre+": "+this.mascotas);
    }
}
