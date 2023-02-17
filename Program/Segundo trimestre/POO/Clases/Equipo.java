package Clases;

public class Equipo {
    private String nombre;
    private String temporada;
    private int partidosJugados;
    private int partidosGanados;
    private int PartidosPerdidos;

    public Equipo(String nombre, String temporada){
        this.nombre = nombre;
        this.temporada = temporada;
    }

    //GET

    public String getNombre(){
        return this.nombre;
    }

    public String getTemporada(){
        return this.temporada;
    }

    public int getPartidos(){
        return this.partidosJugados;
    }

    public int getGanados(){
        return this.partidosGanados;
    }

    public int getPerdidos(){
        return this.PartidosPerdidos;
    }

    //SET

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    public void setTemporada(String newTemporada){
        this.temporada = newTemporada;
    }

    public void setPartidos(int newpartidos){
        this.partidosJugados = newpartidos;
    }

    public void setGanados(int newganados){
        this.partidosGanados = newganados;
    }

    public void setPerdidos(int newperdidos){
        this.PartidosPerdidos = newperdidos;
    }
}
