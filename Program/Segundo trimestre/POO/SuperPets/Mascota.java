package SuperPets;

public class Mascota {
    private String nombre;
    private int vida;
    private int ataque;

    public Mascota(String nombre, int hp, int atk){
        this.nombre = nombre;
        this.vida = hp;
        this.ataque = atk;
    }

    //GET/SET

    public String getNombre(){
        return this.nombre;
    }

    public int getVida(){
        return this.vida;
    }

    public void setVida(int newVida){
        this.vida = newVida;
    }

    public int getAtaque(){
        return this.ataque;
    }

    public void setAtaque(int newAtaque){
        this.vida = newAtaque;
    }

    //Metodoss

    public void atacar(Mascota pet2){
        pet2.setVida(pet2.getVida() - this.ataque); 
        this.vida = this.vida - pet2.getAtaque();        
    }

    @Override
    public String toString(){
        return "(" + this.nombre + "," + this.vida + "," + this.ataque + ")";
    }
}
