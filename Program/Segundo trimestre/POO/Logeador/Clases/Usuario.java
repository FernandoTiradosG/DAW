package Logeador.Clases;

public class Usuario {
    private String nombre;
    private String contraseña;

    public Usuario(String nombre, String contraseña){
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;        
    }

    public String getContraseña(){
        return this.contraseña;
    }

    public void setContraseña(String newContraseña){
        this.contraseña = newContraseña;        
    }

    //Metodo
    public String publicarComentario(){
        return "hola";
    }
}
