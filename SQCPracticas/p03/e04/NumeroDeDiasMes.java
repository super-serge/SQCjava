import java.io.*;
import java.util.*;

public class NumeroDeDiasMes {
  public static void main(String args[]) {
    String Month = null;

    Scanner Valor = new Scanner(System.in);

      System.out.print("\nIntroduce the name of Month\n");
      Month = Valor.nextLine();

      switch (Month) {
        case  "january":
          System.out.println("has 31");
        break;
        case  "february":
          System.out.println("has 29 & 28");
        break;
        case  "march":
          System.out.println("has 31");
        break;
        case  "april":
          System.out.println("has 30");
        break;
        case  "may":
          System.out.println("has 31");
        break;
        case  "june":
          System.out.println("has 30");
        break;
        case  "july":
          System.out.println("has 31");
        break;
        case  "augost":
          System.out.println("has 31");
        break;
        case  "september":
          System.out.println("has 30");
        break;
        case  "october":
          System.out.println("has 31");
        break;
        case  "nobember":
          System.out.println("has 30");
        break;
        case  "december":
          System.out.println("has 31");
        break;

        default:
        System.out.println("Don't Exist your Answer");
        break;
      }
  }
}
