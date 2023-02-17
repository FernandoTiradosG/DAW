import java.util.Scanner;

public class Palotes {
    public static void main(String[] args) {
        System.out.println(ConvertirEnPalotes(PedirNumero()));
        
    }

    public static String ConvertirEnPalotes(int numero){

        String converso = Integer.toString(numero);
        int[] separado = new int[converso.length()];
        String palotes = "";
        for(int x=0; x<converso.length(); x++){
            int terminado = Character.getNumericValue(converso.charAt(x));
            separado[x] = terminado;
        }
        for(int i=0; i<converso.length(); i++){
            if(separado[i] == 0 && i==(converso.length()-1)) palotes += "-";
            for(int y=0; y<separado[i]; y++){
                
                palotes += "|";
            }
            if(i<(converso.length()-1)) palotes += "-";
        }

        return palotes;
    }

    public static int PedirNumero(){
        Scanner console = new Scanner(System.in);

        System.out.println("Dame un numero para convertirlo en una serie de palos:");
        int numero = console.nextInt();

        return numero;
    }
}
