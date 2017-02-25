
import java.io.*;

public class P5_02 {

    public static void main(String[] args) throws IOException {

      int x, y, z;
      float nz;

      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

      InputStreamReader serge = new InputStreamReader(System.in);
      BufferedReader mme = new BufferedReader(serge);

      System.out.println("Hello\n");
      //  String lineaTeclado = mme.readLine();

      do {
          System.out.println("Arreglo => Escribe un el tamaño ->\n");
          int opE = Integer.parseInt(stdin.readLine());
          x = opE % 2;
          y = opE / 1;
          int[] mDIO = new int[opE];

          if (opE > 300 && opE < 0) {
              System.out.println("Debe ser un Numero entre 0 - 300");

          } else {
              System.out.println("Correcto, tu arreglo sera de: " + opE + " valores \n");

          }

      } while (x < 0 && x > 300);
      double[] eDIO = new double[y];
      double[] ar300 = new double[y];

      for (int j = 0; j < y; ++j) {

          double valor;
          int valor2;
          valor = Math.random() * 300 + 1;
          valor2 = (int) Math.random() * 300 + 1;
          eDIO[j] = valor;
      }

      System.out.println("Que numero quieres\n");

      String lineaTeclado2 = mme.readLine();
      int valorEN = Integer.parseInt(lineaTeclado2);

      int n = 0;
      int zAcum = 0;
      int[] eFINAL = new int[zAcum];
      for (int i = 0; i < y; ++i) {

          System.out.println(((int) eDIO[i]) + " -> " + (int) eDIO[i] % 10);
          n = (int) eDIO[i] % 10;

          if (n == valorEN) {
              zAcum = zAcum + 1;
          }

      }

      System.out.println("\n-----");

      int m = 0;
      for (int i = 0; i < y; i++) {
          if ((int) eDIO[i] % 10 == valorEN) {

              System.out.println((int) eDIO[i]);
          }

      }

  }

}
