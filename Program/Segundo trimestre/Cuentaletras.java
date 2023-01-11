public class Cuentaletras {
    public static void main(String[] args) {
        String prueba = "Hola";
        char[] comprobar = {'H', 'j'};
        contador(prueba, comprobar);
    }

    public static void contador(String palabra, char[] letra){
        int letras = palabra.length();
        char[] resultado = new char[letras];
        int suma=0;

        for(int i=0; i<letras; i++){
            resultado[i] = palabra.charAt(i);
            for(int x=0; x<letra.length; x++)
            if(letra[x] == resultado[i]) suma++;
        }
        System.out.println(resultado);
        System.out.println(suma);
        
    }
    
}
