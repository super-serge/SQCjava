import java.io.*;
import java.util.*;


public class MultplosTuneado {
    private int inicioval;
    private int finalval;
    private int valorPrueba;

    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public MultplosTuneado() {}

    private int readInt() {
      try{
        return Integer.parseInt(br.readLine());
        }catch(IOException ex){
      }
      return 0;
    }

    public void asignarValores(){
       int auxIntercambio;
       System.out.println("Valor 1.1");
       this.inicioval = this.ValidacionPositivo();
       System.out.println("Valor 2.1");
       this.finalval = this.ValidacionPositivo();
       validacionMenor();
    }

    public int validacionMenor() {
      int auxIntercambio;
      if(this.finalval < this.inicioval) {
        System.out.println("El valor 2 es mas pequeño, Se intercambiaran por el Valor 1");
        auxIntercambio = this.inicioval;
        this.inicioval = this.finalval;
        this.finalval = auxIntercambio;
      }
      return 0;
    }

    public int[] obtenerValores(int[] rango){
      rango[0] = this.inicioval;
      rango[1] = this.finalval;
      return rango;
    }

    public int ValidacionPositivo(){

       do{
          this.valorPrueba = this.readInt();
          if (this.valorPrueba < 0 ) {
              System.out.println("Debe ser un Numero Positivo");
          }
       }while(this.valorPrueba < 0);
       return this.valorPrueba;
    }

    public static void OperacionSumaMult(int []rango) {
       int resultado = 0;
       for (int j = rango[0]; j < rango[1]; j++) {
         if(j % 5 == 0) {
           resultado = resultado + j;
           System.out.println("\n La suma de " + j + " los Numero Multiplicados es: -> " + resultado);
         }
       }
    }

    public static void formatoValores(int[] rango) {
        System.out.println("El Rango de la Sumatoria es : " + rango[0] + "-" + rango[1]);
    }

    public static void main(String[] args) {

        MultplosTuneado Multiplos = new MultplosTuneado();
        int[]rango = new int[2];
        Multiplos.asignarValores();
        Multiplos.obtenerValores(rango);
        Multiplos.formatoValores(rango);
        Multiplos.OperacionSumaMult(rango);

    }
}
