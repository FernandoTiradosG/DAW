import java.util.Scanner;

public class Leervocal {
    public static void main(String[] args) {
        String caracter = leerCaracter();

        while(!caracter.equals(" ")){
            if(esVocal(caracter)){
                System.out.println("Es VOCAL");
            }else{
                System.out.println("No es VOCAL");
            }
            caracter = leerCaracter();
        }
    }

    public static boolean esVocal(String letra) {
        
        letra = letra.toUpperCase();

        String vocales ="AEIOU";

        boolean valor = vocales.contains(letra);
        
        return valor;

        //Se puede resumir en return "AEIOU".contains(caracter)
    }

    public static String leerCaracter(){
        Scanner console = new Scanner(System.in);
        String caracter = console.nextLine();

        while(caracter.length() != 1){
            System.out.println("Solo puedes meter un solo caracter");
            caracter = console.nextLine();
        }
        return caracter;
    }
    
}
