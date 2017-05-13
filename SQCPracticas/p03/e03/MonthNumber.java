import java.io.*;
import java.util.*;

public class MonthNumber {

  public static void main(String args[]) {
    int NoMonth;

    Scanner Valor = new Scanner(System.in);
    do {
      System.out.print("\nIntroduzca un número entero: Entre 1 Y 12\n");
      NoMonth = Valor.nextInt();
      if (NoMonth < 1 || NoMonth >= 13) {
        System.out.println("try Again");
      }  
    } while(NoMonth < 1 || NoMonth >= 13);
      if (NoMonth == 1)
        System.out.println("january");
      if (NoMonth == 2)
        System.out.println("february");
      if (NoMonth == 3)
        System.out.println("march");
      if (NoMonth == 4)
        System.out.println("april");
      if (NoMonth == 5)
        System.out.println("may");
      if (NoMonth == 6)
        System.out.println("june");
      if (NoMonth == 7)
        System.out.println("july");
      if (NoMonth == 8)
        System.out.println("augost");
      if (NoMonth == 9)
        System.out.println("september");
      if (NoMonth == 10)
        System.out.println("octuber");
      if (NoMonth == 11)
        System.out.println("nobember");
      if (NoMonth == 12)
        System.out.println("december");

  }
}
