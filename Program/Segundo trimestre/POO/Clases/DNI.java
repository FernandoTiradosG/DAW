package Clases;

public class DNI {
    private int numero;
    private String letra;

    public DNI(){
        this.numero = 0;
        this.letra = "";
    }

    public DNI(int numero){
        this.numero = numero;
        this.letra = leer(numero);
    }

    public String leer(int numero){
        return calcularletra(numero);
    }

    private String calcularletra(int numero){
        String[] letras = new String[]{
            "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",};
        
        int resto = numero % 23;

        return letras[resto];
    }

    @Override
    public String toString(){
        return this.numero + " " + this.letra;
    }

}
