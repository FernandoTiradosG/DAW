import java.util.Scanner;

public class CifradoEnigma {
    public static void main(String[] args) {
        
        String [] rotores = {"BDFHJLCPRTXVZNYEIWGAKMUSQO",
            "AJDKSIRUXBLHWTMCQGZNPYFVOE",
            "EKMFLGDQVZNTOWYHXUSPAIBRCJ"};
            System.out.println(encode("AAAAAAAAAAAAAAAAAAAAAA", 4, rotores));
    }

    /*public static String Codificador(String cadenaACifrar) {
        Scanner console = new Scanner(System.in);

        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int posicion = 0;
        String cadena = "";

        System.out.println("Indica el valor del orden en que variará");
        int variacion = console.nextInt();
        
        for(int indice=0; indice<cadenaACifrar.length(); indice++){
            posicion = abc.indexOf(cadenaACifrar.charAt(indice));
        
            cadena += abc.charAt((posicion + variacion) % abc.length());
        }
        
        return cadena;

    }*/

    public static String encode(String message, int N, String[] rotors) {
        //Codificacion Caeser
        String messageEncoded = caeserEncode(message, N);
        //Aplicar rotores 3 veces
        for(int i=0; i<rotors.length; i++){
            messageEncoded = applyRotor(messageEncoded, rotors[i]);
        }
        return messageEncoded;
    }

    public static String decode(String message, int N, String[] rotors) {
        String messageEncoded;
        
        //Codificacion Caeser
        messageEncoded = caeserEncode(message, N);
        //Aplicar rotores 3 veces
        for(int i=0; i<rotors.length; i++){
            messageEncoded = applyRotor(messageEncoded, rotors[i]);
        }

        return messageEncoded;
    }

    public static String applyRotor(String message, String rotor) {
        String rotorMessage = "";
        for(int i=0; i<rotor.length(); i++){
            int index = message.charAt(i) - 'A';
            rotorMessage += rotor.charAt(index);
        }
        
        return rotorMessage;
    }

    public static String caeserEncode(String message, int shift) {
        String caeserMsgEncode = "";
        for(int i=0; i<message.length(); i++){
            char letter = (char) (message.charAt(i) + shift + i);
            while(letter > 90){
                letter -= 26;
            }
            caeserMsgEncode += letter;

            
        }
        return caeserMsgEncode;
    }
}
