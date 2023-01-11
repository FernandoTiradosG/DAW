/*
 * Reto #17
 * LA CARRERA DE OBSTÁCULOS
 * Fecha publicación enunciado: 25/04/22
 * Fecha publicación resolución: 02/05/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo) o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla) será correcto y no
 *        variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Carrera {
    public static void main(String[] args) {
        String[] moves1 = {"run","run","run","run","run"};
        String field1 = "_____";
        boolean result1 = pass(moves1, field1); //true
        if(!result1){
            System.out.println(" No conseguido");
        }else{
            System.out.println(" Superado");
        }

        String[] moves2 = {"run","run","jump","run","run"};
        String field2 = "_____";
        boolean result2 = pass(moves2, field2); //false
        if(!result2){
            System.out.println(" No conseguido");
        }else{
            System.out.println(" Superado");
        }

        String[] moves3 = {"run","jump","run","jump","run"};
        String field3 = "_|_|_";
        boolean result3 = pass(moves3, field3); //true
        if(!result3){
            System.out.println(" No conseguido");
        }else{
            System.out.println(" Superado");
        }

        String[] moves4 = {"run","jump","run","jump","run"};
        String field4 = "|_|_|";
        boolean result4 = pass(moves4, field4); //false
        if(!result4){
            System.out.println(" No conseguido");
        }else{
            System.out.println(" Superado");
        }
        
    }
    
    public static boolean pass(String[] moves, String field){
        boolean resultado = true;
        for(int i=0; i<moves.length; ++i){
            char path = field.charAt(i);
            if(moves[i].equals("run")){
                if(path == '|'){
                    resultado = false;
                    path = '/';
                }
                
            }else{
                if(path == '_'){
                    resultado = false;
                    path = 'x';
                }
            }
            System.out.print(path);
        }
        return resultado;
    }
}
