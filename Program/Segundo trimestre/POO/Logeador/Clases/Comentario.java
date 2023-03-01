package Logeador.Clases;

import java.util.Date;

public class Comentario {
    private String usuarioIP;
    private String texto;
    private Date fecha;

    public Comentario(String usuarioIP, String texto){
        this.texto = texto;
        this.usuarioIP = usuarioIP;
        this.fecha = new Date();
    }


}
