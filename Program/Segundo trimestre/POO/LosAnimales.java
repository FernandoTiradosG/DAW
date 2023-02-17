import Polimorfismo.*;

public class LosAnimales {

    public static void main(String[] args) {
    
        //Animal leon = new Animal("Rey"); No se puede crear ya que "Animal" es un objeto abstracto
        Gato gato = new Gato("Silvestre");
        Perro perro = new Perro("Kora");
        Pajaro pajaro = new Pajaro("Piolin");
        Bulldog bulldog = new Bulldog("Toreto");
        Dragon dragon = new Dragon("Azeroth");

        Animal[] animales = {
            perro,
            gato,
            pajaro,
            bulldog
        };

        Volador[] voladores = {
            pajaro,
            dragon
        };

        for (Animal a : animales) {
            a.saludar();
        }

        for (Volador v : voladores){
            v.volar();
        }
    }
}
