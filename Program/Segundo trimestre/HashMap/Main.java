import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Introduce los numeros que quieras con un espacio al final");
        String numeros = console.nextLine();
        String[] numerosSpliteados = numeros.split(" ");
        Integer[] numerosEnteros = new Integer[numerosSpliteados.length];

        for(int v=0; v< numerosEnteros.length; v++){
            numerosEnteros[v] = Integer.parseInt(numerosSpliteados[v]);
        }

        HashMap<Integer, Integer> coleccion = new HashMap<Integer, Integer>();

        for(int i=0; i<numerosEnteros.length; i++){
            if(coleccion.containsKey(numerosEnteros[i])){
                coleccion.put(numerosEnteros[i], coleccion.get(numerosEnteros[i])+1);
            }else{
                coleccion.put(numerosEnteros[i], 1);
            }
        }

        System.out.println(coleccion.entrySet());
        
    }
    
}