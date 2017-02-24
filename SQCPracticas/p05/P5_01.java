
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
                System.out.println("Correcto, Escribe " + opE + " valore a continuacion\n");

            }

        } while (x == 0);
        int[] eDIO = new int[y];

        for (int j = 0; j < y; ++j) {

            String lineaTeclado = mme.readLine();
            int valor = Integer.parseInt(lineaTeclado);

            eDIO[j] = valor;

        }

        z = (y / 2) + 1;

        int f1 = 0;
        int xCount, yCount, tempAX = 0;

        for (xCount = y; xCount > 0 && f1 == 0; xCount--) {
            f1 = 1;
            for (yCount = 0; yCount < xCount; yCount++) {
                if (eDIO[yCount] > eDIO[xCount + 1]) {
                    tempAX = eDIO[yCount];
                }
                eDIO[yCount] = eDIO[xCount + 1];
                eDIO[yCount + 1] = tempAX;
                f1 = 0;

            }
        }

        System.out.println("La mediana es: -> " + eDIO[z]);
    }

}
