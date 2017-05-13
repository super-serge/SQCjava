import java.io.*;
import java.util.*;

public class Anagrama {
  public static void main(String[]args)throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Anagrama\n");
    System.out.println("Introduce Una Palabra");
    String lineaTeclado1 = stdin.readLine();

    System.out.println("Introduce Otra Palabra");
    String lineaTeclado2 = stdin.readLine();

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

  }
}
