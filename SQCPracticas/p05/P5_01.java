import java.io.*;

public class P5_01 {

    public static void main(String[] args) throws IOException {

        int x, y, z;
        float nz;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        InputStreamReader serge = new InputStreamReader(System.in);
        BufferedReader mme = new BufferedReader(serge);

        System.out.println("Hello");

        do {
            System.out.println("Escribe un Numero Impar->");
            int opE = Integer.parseInt(stdin.readLine());
            x = opE % 2;
            y = opE / 1;
            int[] mDIO = new int[opE];

            if (opE % 2 == 0) {
                System.out.println("Debe ser un Numero par please");
            } else {
                System.out.println("Correcto, Escribe " + opE + " valores a continuacion\n");
            }
        } while (x == 0);

        int[] eDIO = new int[y];

        for (int j = 0; j < y; ++j) {

            String lineaTeclado = mme.readLine();
            int valor = Integer.parseInt(lineaTeclado);

            eDIO[j] = valor;
        }
        //      z = (y / 2) + 1;
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
        System.out.println("---> " + eDIO.length + " Numeros Ordenados de mayor a menor \n");

        for (int k = 0; k < eDIO.length; k++) {
            System.out.println(k + "-> " + eDIO[k]);

        }
        System.out.println("La mediana es: -> " + eDIO[zBYE]);
    }

}
