import java.io.*;

public class Multplos {

    public static void main(String[] args) throws IOException {

        int x, y, z;
        float nz;
        int inicioval;
        int finalval;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Valores Positivos\n");

        do {
            System.out.println("Valor 1");

            inicioval = Integer.parseInt(br.readLine());

            if (inicioval < 0 ) {
                System.out.println("Debe ser un Numero Positivo");
            }

        } while (inicioval < 0);

        do {
            System.out.println("Valor 2");

            finalval = Integer.parseInt(br.readLine());

            if (finalval < 0 ) {
                System.out.println("Debe ser un Numero Positivo");
            }

        } while (finalval < 0);
        int aux;

        if(finalval < inicioval) {
          aux = finalval;
          finalval = inicioval;
          inicioval = aux;
        }




        int resultado = 0;

        for (int j = inicioval; j < finalval; j++) {

        	if(j % 5 == 0) {
        		resultado = resultado + j;
            System.out.println("\n La suma de " + j + " los Numero Multiplicados es: -> " + resultado);
        	}
            //resultado = resultado * j;

        }

//        System.out.println("\n La suma de los Numero Multiplicados es: -> " + resultado);

    }
}
