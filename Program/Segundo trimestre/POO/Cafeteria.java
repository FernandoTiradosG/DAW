import Clases.Cafetera;

public class Cafeteria {
    public static void main(String[] args) {
        Cafetera italiana = new Cafetera();
        Cafetera italiana2 = new Cafetera(500);

        System.out.println(italiana.toString());
        italiana.llenarCafetera();
        System.out.println(italiana.toString());
        italiana.servirTaza(250);
        System.out.println(italiana.toString());
        italiana.servirTaza(780);
        System.out.println(italiana.toString());
        italiana.agregarCafe(1200);
        System.out.println(italiana.toString());
        System.out.println();
        System.out.println(italiana2.toString());
        italiana2.llenarCafetera();
        System.out.println(italiana2.toString());
        italiana2.servirTaza(250);
        System.out.println(italiana2.toString());
        italiana2.servirTaza(780);
        System.out.println(italiana2.toString());
        italiana2.agregarCafe(1200);
        System.out.println(italiana2.toString());


    }
}
