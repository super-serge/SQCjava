import java.io.*;

public class TraductorSerge_P602{

  static final int maxWORDS = 100;

  public void crearDiccionario(String comparaCAD) throws IOException{
    String[] englishW = new String[maxWORDS];
    String[] spanishW = new String[maxWORDS];
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    String PEspanol;
    String PIngles;
    String pingVAL;
    int validacionARR = 0, contador = 0;
    int validacionPAL;

    do{
      System.out.println("Escribe la Palabra en Español - ");
  //    do{
        PEspanol = stdin.readLine();
  //      if (PEspanol.length > 40){
  //        System.out.println("La palabra debe de ser de menos de 40 caracteres");
  //      }
  //    }while(PEspanol.length > 40);

      System.out.println("Escribe la Palabra en Ingles - ");
      PIngles = stdin.readLine();

      spanishW[contador] = PEspanol;
      englishW[contador] = PIngles;

      contador ++;

      System.out.println("Quieres EScribir otra RElacion de palabras E-I\n 1 - PAra si");
      pingVAL = stdin.readLine();
      validacionPAL = Integer.parseInt(pingVAL);
    }while (validacionARR == 1 && contador <101 && contador > 1);

  }
  public static void main(String[]args)throws IOException{
    TraductorSerge_P602 Translate = new TraductorSerge_P602();
//    crearDiccionario();
  }

}
