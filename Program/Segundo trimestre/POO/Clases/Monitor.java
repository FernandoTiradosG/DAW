package Clases;

public class Monitor {
    private String marca;
    private int refresco;
    private int[] resolucion;
    private boolean estado;

    //CONSTRUCTOR
    
    public Monitor(String marca, int refresco, int resolucionH, int resolucionV){
        this.marca = marca;
        this.refresco = refresco;
        this.estado = false;
        this.resolucion = new int[2];
        resolucion[0] = resolucionH;
        resolucion[1] = resolucionV;
    }

    //GET/SET

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String newmarca){
        this.marca =newmarca;
    }
    
    public int getRefresco(){
        return this.refresco;
    }
    public void setRefresco(int newrefresco){
        this.refresco =newrefresco;
    }

    public int[] getResolucion(){
        return this.resolucion;
    }

    public String isEncendido(){
        
        if(this.estado){
           return "Encendido";
        }else{
            return "Apagado";
        }
    }

    //Metodos propios

    public void encender(){
        this.estado = true;
    }

    public void apagar(){
        this.estado = false;
    }

    @Override
    public String toString(){
        return "Monitor: " + this.getMarca() + " de " + this.resolucion[0] + "X" + this.resolucion[1] + " de resolucion, con una tasa de refresco de" + this.getRefresco() + " Hz.\n Esta " + this.isEncendido();
    }
}
