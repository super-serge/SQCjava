import java.io.*;

public class TraductorSerge_P602{

  static final int maxWORDS = 100;
  String[] englishW = new String[maxWORDS];
  String[] spanishW = new String[maxWORDS];

  public void crearDiccionario() throws IOException{
//    String[] englishW = new String[maxWORDS];
//    String[] spanishW = new String[maxWORDS];
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    String PEspanol;
    String PIngles;
    String pingVAL;
    int validacionARR = 0, contador = 0;
    int validacionPAL;

    do{
      System.out.println(contador + " Escribe la Palabra en Español - ");
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

      ++contador;

      System.out.println("Quieres EScribir otra RElacion de palabras E-I\n 1 - PAra si\2 - No");
      pingVAL = stdin.readLine();
      validacionPAL = Integer.parseInt(pingVAL);
    }while (validacionPAL == 1 && contador < 101);

  }
  String traducir(String ixARR){
    int indice = 0;

    for(int i = 0; i < maxWORDS; ++i){
      if (ixARR.compareTo(englishW[i]) == 0){
        indice = i;
      }
    }
//    String[] englishW = new String[maxWORDS];
//    String[] spanishW = new String[maxWORDS];
    return spanishW[indice];

    //return indice;
  }
  public static void main(String[]args)throws IOException{
    TraductorSerge_P602 Translate = new TraductorSerge_P602();
    BufferedReader traduce = new BufferedReader(new InputStreamReader(System.in));
    String lineaTeclado, opcionTraduce;
    int opcionSW;
    int continuar;
    do{
      System.out.println("Diccionario en Ingles - ESpañol\n");
      System.out.println("Selecciona una Opcion\n1 -Crea Diccionario");
      System.out.println("\n2 -Traducir");

      opcionTraduce = traduce.readLine();
      opcionSW = Integer.parseInt(opcionTraduce);

      switch(opcionSW){
          case 1:
          Translate.crearDiccionario();

          break;
          case 2:

          System.out.println("Introduce un palabra en Ingles - ");
          lineaTeclado = traduce.readLine();
          System.out.println("\nSu traduccuin en español es- " + Translate.traducir(lineaTeclado));

          break;
          default:
          break;
      }
      System.out.println("Otra OPeracion => 1");
      lineaTeclado = traduce.readLine();
      continuar = Integer.parseInt(lineaTeclado);
    }while(continuar == 1);

}
}
