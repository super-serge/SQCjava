
import java.io.*;

public class P5_03 {

    static final int xMod = 10;

    public static void main(String[] args) throws IOException {

        int x, y, z;
        float nz;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        InputStreamReader serge = new InputStreamReader(System.in);
        BufferedReader mme = new BufferedReader(serge);

        System.out.println("Hello");
        System.out.println("Escribe El Nombre de 10 Alumnos y su Calificacion correspondiente: ");

        int[] eDIO = new int[xMod];
        double[] dbeDIO = new double[eDIO.length];
        String[] eNAME = new String[xMod];

        String nameAL;
        double valor;
        String lineaTeclado;

        for (int i = 0, j = 1; i < xMod; ++i, ++j) {
            System.out.println("\nFull Name: <" + j + ">");

            nameAL = stdin.readLine();

            do {
                System.out.println("Calificacion (valores del 0-10) : <" + j + ">");
                lineaTeclado = mme.readLine();
                valor = Double.parseDouble(lineaTeclado);
                if (valor < 0 || valor > 10) {
                    System.out.println("Calificacion no Valida, trt again!");

                }
            } while (valor < 0 || valor > 10);

            dbeDIO[i] = valor;
            eNAME[i] = nameAL;
        }

        String[] alFIN = new String[xMod];
        String[] alFIN2 = new String[xMod];
        //
        //();
        for (int i = 0; i < xMod; ++i) {

            if (dbeDIO[i] >= 0 && dbeDIO[i] < 5) {
                alFIN2[i] = eNAME[i].concat(", Calif. [" + String.valueOf(dbeDIO[i]).concat("], Reprobado."));

            } else if (dbeDIO[i] >= 5 && dbeDIO[i] < 7) {
                alFIN2[i] = eNAME[i].concat(", Calif. [" + String.valueOf(dbeDIO[i]).concat("], Bien."));

            } else if (dbeDIO[i] >= 7 && dbeDIO[i] < 9) {
                alFIN2[i] = eNAME[i].concat(", Calif. [" + String.valueOf(dbeDIO[i]).concat("], Notable."));

            } else if (dbeDIO[i] >= 9 && dbeDIO[i] <= 10) {
                alFIN2[i] = eNAME[i].concat(", Calif. [" + String.valueOf(dbeDIO[i]).concat("], Sobresaliente!!."));
            }

            System.out.println("\nlas Calificaciones son: \n");

        }
        for (int k = 0; k < xMod; ++k) {
            System.out.println(alFIN2[k]);

        }
        System.out.println("\n ----------------------- \n");

    }

}
