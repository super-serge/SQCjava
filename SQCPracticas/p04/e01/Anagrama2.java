import java.io.*;
import java.util.*;

public class Anagrama2 {
  public static void main(String[]args) throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    //InputStreamReader serge = new InputStreamReader(System.in);
    //BufferedReader mme = new BufferedReader(serge);

    System.out.println("Anagrama\n");
    System.out.println("Introduce una Palabra");

    String lineaTeclado1 = stdin.readLine();
    String lineaTeclado2 = stdin.readLine();

//    int inChar;
//    inChar = System.in.read();
//    System.out.print("You entered ");
//    System.out.println(inChar);

  //  int a = lineaTeclado1.length();
  //  int no = lineaTeclado1.charAt(0);
  //  char nc = (char)lineaTeclado1.charAt(0);
  //  System.out.println(a);
  //  System.out.println(no);
  //  System.out.println(nc);


    int Compara = lineaTeclado1.compareTo(lineaTeclado2);
    System.out.println(Compara);

    long ContadorLetra1 = 1;
    long ContadorLetra2 = 1;

    for (int j = 0; j < lineaTeclado1.length(); ++j) {
        ContadorLetra1 = ContadorLetra1 * lineaTeclado1.charAt(j);
    }

    for (int j = 0; j < lineaTeclado2.length(); ++j) {
        ContadorLetra2 = ContadorLetra2 * lineaTeclado2.charAt(j);
    }

    if (ContadorLetra1 == ContadorLetra2) {
      System.out.println("Es un Anagrama");
    }else{
      System.out.println("NO es Anagrama");
    }
//    System.out.println(ContadorLetra1);
//    System.out.println(ContadorLetra2);

  }
}
