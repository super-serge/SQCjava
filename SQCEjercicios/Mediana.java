import java.io.*;

public class Mediana {

    public static void main(String[] args) throws IOException {

        int x, y, z;
        float nz;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Escribe un Numero Impar->");
            int opE = Integer.parseInt(br.readLine());
            x = opE % 2;
            y = opE / 1;
            int[] mDIO = new int[opE];

            if (opE % 2 == 0) {
                System.out.println("Debe de Ser PAR");
            } else {
                System.out.println("Correcto, Escribe " + opE + " valores a continuacion\n");
            }
        } while (x == 0);

        int[] eDIO = new int[y];

        for (int j = 0; j < y; ++j) {

            int valor = Integer.parseInt(br.readLine());

            eDIO[j] = valor;
        }
        int zBYE = eDIO.length / 2;
        int pri_1, pri_2, tempAX = 0;

        for (pri_1 = 0; pri_1 < eDIO.length; pri_1++) {
            for (pri_2 = pri_1 + 1; pri_2 < eDIO.length; pri_2++) {
                if (eDIO[pri_1] < eDIO[pri_2]) {
                    tempAX = eDIO[pri_1];
                    eDIO[pri_1] = eDIO[pri_2];
                    eDIO[pri_2] = tempAX;
                }
            }
        }
 
        for (int k = 0; k < eDIO.length; k++) {
            System.out.println(k + "-> " + eDIO[k]);

        }
        System.out.println("La mediana es: -> " + eDIO[zBYE]);
    }

}
