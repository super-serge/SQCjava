import java.io.*;

public class Mediana {

    public static void main(String[] args) throws IOException {

        int x, y, z;
        float nz;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Valores Positivos\n");
        
        do {
            System.out.println("Valor 1");

            int inicioval = Integer.parseInt(br.readLine());
            
            if (incioval < 0 ) {
                System.out.println("Debe ser un Numero Positivo");
            }

        } while (inicioval < 0);

        do {
            System.out.println("Valor 2");

            int finalval = Integer.parseInt(br.readLine());
            
            if (finalval < 0 ) {
                System.out.println("Debe ser un Numero Positivo");
            }

        } while (finalval < 0);

        int resultado = 1;

        for (int j = inicioval; j < finalval; j++) {

        	if(j % 5 == 0) {
        		resultado = resultado * j;
        	}
            //resultado = resultado * j;
 
        }

        System.out.println("\n La suma de los Numero Multiplicados es: -> " + resultado);

    }    
}
