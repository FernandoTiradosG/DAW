import Herencias.*;

public class Electrodo {

    
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora ("Bosh", 159.90, 20, false);
        Lavadora lavadora2 = new Lavadora ("Philips", 200.90, 20, true);

        System.out.println(lavadora);
        System.out.println(lavadora2);

        System.out.println(lavadora.getConsumo(1));
        System.out.println(lavadora2.getConsumo(1));

        System.out.println(lavadora.getCosteConsumo(8, 14));
        System.out.println(lavadora2.getCosteConsumo(6, 31));
    }
}
