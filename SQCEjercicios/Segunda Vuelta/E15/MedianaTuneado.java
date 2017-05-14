import java.io.*;
import java.util.*;
import java.lang.*;

public class MedianaTuneado {

    private int longitudConjunto;
    private int flagMediana;
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public int[] ConjuntoValores;

    public MedianaTuneado() {}

    private int readInt() {
      try{
        return Integer.parseInt(br.readLine());
        }catch(IOException ex){
      }
      return 0;
    }

    public int[] pedirConjunto(){
      this.pedirLongitud();
      int[] eDIO = new int[longitudConjunto];

      for (int j = 0; j < eDIO.length; j++) {
          eDIO[j] = this.readInt();
      }
      this.flagMediana = eDIO.length / 2;
      return eDIO;
    }

    public void setConjunto(int[] arreglo) {
      this.ConjuntoValores = Arrays.copyOf(arreglo, arreglo.length);
      OrdenarCojunto();
    }

    public void OrdenarCojunto(){
      int pri_1, pri_2, tempAX = 0;
    for (pri_1 = 0; pri_1 < this.ConjuntoValores.length; pri_1++) {
      for (pri_2 = pri_1 + 1; pri_2 < ConjuntoValores.length; pri_2++) {
        if (this.ConjuntoValores[pri_1] < this.ConjuntoValores[pri_2]) {
           tempAX = this.ConjuntoValores[pri_1];
           this.ConjuntoValores[pri_1] = this.ConjuntoValores[pri_2];
           this.ConjuntoValores[pri_2] = tempAX;
          }
        }
      }
    }

    public int pedirLongitud(){
      int aux;
      do {
          System.out.println("Escribe un Numero Impar->");
          aux = this.readInt();

          if (aux % 2 == 0) {
              System.out.println("Debe de Ser IMPAR");
          } else {
              System.out.println("Correcto, Escribe " + aux + " valores a continuacion\n");
          }
      } while (aux % 2 == 0);
      this.longitudConjunto = aux;
      return 0;
    }

    public int getElemeto(int index){
      return ConjuntoValores[index];
    }

    public void getConjunto(){

      for (int k = 0; k < ConjuntoValores.length; k++) {
          System.out.println(k + "-> " + this.ConjuntoValores[k]);
      }
      System.out.println("La mediana es: -> " + this.ConjuntoValores[this.flagMediana]);
    }

    public static void main(String args[])throws IOException {
      MedianaTuneado Mediana = new MedianaTuneado();
      Mediana.setConjunto(Mediana.pedirConjunto());
      Mediana.getConjunto();
    }
}
