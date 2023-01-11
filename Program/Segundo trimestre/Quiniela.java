public class Quiniela {
    public static void main(String[] args) {
        int partidos = 15;
        int columnas = 5;
        construir(partidos, columnas);
        System.out.println(dibujar(construir(partidos, columnas)));
     
    }

    public static String[][] construir(int partidos, int columnas){
        String[][] quiniela = new String[partidos][columnas];
        for(int x=0; x<quiniela.length; x++){
            for(int y=0; y<quiniela[x].length; y++){
                int resultado = (int) (Math.random()*100+1);

                quiniela[x][y] = probabilidad(resultado);
                
            }
        }
        return quiniela;
    }

    public static String probabilidad(int valor){
        String resultado = "";
        if(valor>49){
           resultado = "1";
        }else if(valor<=49 && valor>=19){
            resultado = "X";
        }else if(valor<=19){
            resultado = "2";
        }

        return resultado;
    }

    public static String dibujar(String[][] quiniela){
        String resultado = "";
        for(int x=0; x < quiniela.length; x++){
            resultado += "Partido " + (x+1) + ": ";
            for(int y=0; y < quiniela[x].length; y++){
                resultado += quiniela[x][y] + " ";
            }
            resultado += "\n";
        }

        return resultado;
    }
}
