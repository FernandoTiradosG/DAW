import java.util.Arrays;
import java.util.Scanner;

public class Cuentaletras {
    public static void main(String[] args) {
        String prueba = Pedirpalabra();
        char[] comprobar = Pedirletras();
        contador(prueba, comprobar);
        System.out.println(Arrays.toString(comprobar));
    }

    public static void contador(String palabra, char[] letra){
        int letras = palabra.length();
        char[] resultado = new char[letras];
        int[] cantidad = new int[letra.length];
        int suma=0;

        for(int x=0; x<letra.length; x++){
            
            for(int i=0; i<letras; i++){
                resultado[i] = palabra.charAt(i);
                if(letra[x] == resultado[i]) suma++;
            }
                cantidad[x]=suma;
            suma=0;
        }
        System.out.println(Arrays.toString(resultado));
        System.out.println(Arrays.toString(cantidad));
        
    }

    public static String Pedirpalabra(){
        Scanner console = new Scanner(System.in);
        System.out.println("Que palabra quieres identificar:");
        String palabra = console.nextLine();
        return palabra;
    }
    
    public static char[] Pedirletras(){
        Scanner console = new Scanner(System.in);

        System.out.println("Cuantas letras quieres comprobar:");
        int cantidad = console.nextInt();
        char[] aComprobar = new char[cantidad];

        for(int i=0; i<cantidad; i++){
            System.out.println("Letra numero "+(i+1)+" a comprobar");
            String letra1 = console.nextLine();
            while(letra1.length()!=1) {
                System.out.println("Debes escribir solo una letra");
                letra1 = console.nextLine();
            }
            char letra2 = letra1.charAt(0);
            aComprobar[i]=letra2;
        }

        return aComprobar;
    }
}
