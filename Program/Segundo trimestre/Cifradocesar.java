public class Cifradocesar {
    /*implemente una función que sirva para cifrar un texto
     * con el conocido método de César.
     * El criptosistema consiste en el desplazamiento de 3 caracteres
     * en la posición del caracter a cifrar,
     * es decir, la A se sustituye por la D,
     * la B por la E, ..., la X por la A, la Y por la B,
     * y la Z por la C. Por simplicidad, supondremos
     * que el texto a cifrar solo contiene caracteres alfabéticos.
     * Implementar la siguiente función:
     */
    public static void main(String[] args) {
        System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        System.out.println(cifradoCesar("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        System.out.println(descifradoCesar(cifradoCesar("ABCDEFGHIJKLMNOPQRSTUVWXYZ")));
    }

    public static String cifradoCesar(String cadenaACifrar){
        String cifrado = "";
        char[] cadena = new char[cadenaACifrar.length()];

        for(int i=0; i<cadenaACifrar.length(); i++){
            cadena[i] = cadenaACifrar.charAt(i);
        }

        for(int i=0; i<cadenaACifrar.length(); i++){
            int num = cadena[i];
            if(num!=32){
                num += 3;
                if(num>90 && num>120) num -= 24;
            } 
            
            cadena[i] = (char) num;
        }

        for(int i=0; i<cadenaACifrar.length(); i++){
            cifrado += cadena[i];
        }
        /*String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         * int posicion = 0;
         * String cadena = "";
         * 
         * for(int indice=0; indice<cadenaACifrar.length(); indice++){
         *      posicion = abc.indexOf(cadenaACifrar.charAt(indice));
         * 
         *      cadena += abc.charAt((posicion + 3) % abc.length())
         * }
         * 
         * return cadena
         */
        return cifrado;
    }

    public static String descifradoCesar(String cadenaADescifrar){
        String cifrado = "";
        char[] cadena = new char[cadenaADescifrar.length()];

        for(int i=0; i<cadenaADescifrar.length(); i++){
            cadena[i] = cadenaADescifrar.charAt(i);
        }

        for(int i=0; i<cadenaADescifrar.length(); i++){
            int num = cadena[i];
            if(num!=32){
                num -= 3;
                if(num>90 && num>120) num += 24;
            } 
            
            cadena[i] = (char) num;
        }

        for(int i=0; i<cadenaADescifrar.length(); i++){
            cifrado += cadena[i];
        }

        return cifrado;
    }
}
