package Clases;

public class Camiseta {

    //VARIABLES
    private String color;
    private char talla;
    private String marca;
    private String tejido;

    //CONSTRUCTOR
    public Camiseta(String color, String marca, char talla, String tejido){
        this.color = color;
        this.marca = marca;
        this.talla = talla;
        this.tejido = tejido;
    }

    //GET

    public String getColor(){
        return this.color;
    }

    public String getMarca(){
        return this.marca;
    }

    public char getTalla(){
        return this.talla;
    }

    public String getTejido(){
        return this.tejido;
    }

    //SET
    
    public void setColor(String newcolor){
        this.color = newcolor;
    }

    public void setMarca(String newmarca){
        this.marca = newmarca;
    }

    public void setTalla(char newtalla){
        this.talla = newtalla;
    }

    public void setTejido(String newtejido){
        this.tejido = newtejido;
    }
}
