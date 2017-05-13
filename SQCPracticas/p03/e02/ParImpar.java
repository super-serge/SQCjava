import java.util.*;

public class ParImpar {

  public static void main(String args[]) {

    int Valor;
    Scanner entero = new Scanner(System.in);

    do {
      System.out.print("\nIntroduzca un número entero: Entre 1 Y 1000\n");
      Valor = entero.nextInt();

      if (Valor < 0 || Valor > 1000) {
        System.out.println("Try Again");
      }

    }while (Valor < 0 || Valor > 1000);

    if((Valor % 2) != 0 ) {
        System.out.println(" " + Valor + ", it is odd\n");
      }else{
        System.out.println(" " + Valor + ", it is Even\n");
      }
  }
}
