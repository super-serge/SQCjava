import java.io.*;
import java.util.*;

public class IndiceDePalabras {
  public static void main(String args[]) throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Primer Palbra de un Frase\n");
    System.out.println("Introduce Una Frase");
    String lineaTeclado1 = stdin.readLine();
    int PrimerEspacio = lineaTeclado1.indexOf(' ');
    System.out.println("Primer Palabra => " + lineaTeclado1.substring(0,PrimerEspacio));

  }
}
