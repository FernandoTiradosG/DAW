package Clases;

public class Punto {
    private double x; //Con el preivate no permites que sea llamado desde otro sitio, solo desde el mismo archivo.
    private double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setX(double newX){
        this.x = newX;
    }

    public void setY(double newY){
        this.x = newY;
    }

    public String toString(){
        return "(" + this.getX() + ", " + this.getY() + ")"; 
    }
}
