public class Contraseña{
    public static void main(String[] args) {
        int longitud = (int) (8 + Math.random()*8);
        
        String contraseña = "";

        for(int i=0; i<longitud; i++){
            int valor = (int) (33 + Math.random()*92);
            char letra = (char) valor;
            contraseña += letra;
        }

        System.out.println("Su contraseña es '" + contraseña + "'");
    }
}