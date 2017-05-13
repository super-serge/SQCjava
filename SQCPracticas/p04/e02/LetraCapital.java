import java.io.*;
import java.util.*;

public class LetraCapital {

  static String printCapitalized (String Frase) {

    char[] caracteres = Frase.toCharArray();

    caracteres[0] = Character.toUpperCase(caracteres[0]);
    for (int i = 1; i < Frase.length() - 1; i++) {
          if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',') {
            caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
          }
        }  
        return new String(caracteres);
  }

  public static void main(String[]args) throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Letra Capital\n");
    System.out.println("Introduce Una Frase");
    String lineaTeclado1 = stdin.readLine();
    String lineaTeclado2 = lineaTeclado1.toLowerCase();

    System.out.println(printCapitalized(lineaTeclado2));

  }
}
