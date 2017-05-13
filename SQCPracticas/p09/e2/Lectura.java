import java.io.*;

public class Lectura {

  private BufferedReader lineaTeclado = new BufferedReader(new InputStreamReader(System.in));
  private String stdin = " ";

  public String readStr() {
    try {
      this.stdin = lineaTeclado.readLine();
    }catch(IOException ex){}
    return this.stdin;
  }

  public int readInt() {
    try {
      return Integer.parseInt(lineaTeclado.readLine());
    } catch(IOException ex) {
    }
    return 0;
  }

}
