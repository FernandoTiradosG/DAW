package Logeador.Clases;

import java.util.ArrayList;

public class BBDD {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Comentario> comentarios;

    public BBDD(){
        this.usuarios = new ArrayList<Usuario>();
        this.comentarios = new ArrayList<Comentario>();
        usuarios.add(new Usuario(null, null));
    }
}
