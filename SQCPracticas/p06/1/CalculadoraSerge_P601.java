import java.io.*;

public class CalculadoraSerge_P601 {

    private int nuOP;
    private int opcion_OPE;
    public double resultado = 0;
    public float primer_val, segundo_val;
    public InputStreamReader serge = new InputStreamReader(System.in);
    public BufferedReader br = new BufferedReader(serge);

    public int opcion_menu() {

        String valor;

        //  do{
        System.out.println("<--Calculadora Aritmetica-->\n");
        System.out.println("1 - sumar");
        System.out.println("2 - restar");
        System.out.println("3 - multiplicar");
        System.out.println("4 - dividir");
        System.out.println("5 - salir");
///((()))
        System.out.println("\nQue Operacion Quieres realizar=? \n");

        return readInt();
    }
////(((())))
    public int readInt() {
      try {
        return Integer.parseInt(br.readLine());
      } catch(IOException ex) {
      }
      return 0;
    }

    private float readFloat() {
      try {
        return Float.parseFloat(br.readLine());
      }catch(NumberFormatException ex) {
        System.out.println("default 0");
        return 0.0F;
      }
      catch(IOException ex) {
      }
      return 0.0F;
    }

    private float readFloatTuneado() {
        System.out.println("Da un numero");
        return this.readFloat();
    }
    private float readFloatTuneadoDiv() {
      float validacion = 0;
      do {
      validacion = this.readFloat();
      if (validacion == 0) {
          System.out.println("El Numero debe de ser Diferente de Cero (0) ");
          System.out.println("Da un numero");
        }
    }while(validacion == 0);

        return validacion;
    }

    private double sumar(float valor01, float valor02) {
        return valor01 + valor02;
    }

    public double restar(float valor01, float valor02) {
        return valor01 - valor02;
    }

    public double multiplicar(float valor01, float valor02) {
        return valor01 * valor02;
    }

    public double dividir(double valor01, double valor02) {
        return valor01 / valor02;
    }

    public void calcular(int opcion_menu) {
      switch (opcion_menu) {

          case 1:
              System.out.println("\nIngresa valor 1 ->");
                this.resultado = this.sumar(this.readFloatTuneado(),this.readFloatTuneado());
              break;

          case 2:
            System.out.println("\nIngresa valor 1 ->");
              this.resultado = this.restar(this.readFloatTuneado(),this.readFloatTuneado());
            break;
          case 3:
            System.out.println("\nIngresa valor 1 ->");
              this.resultado = this.multiplicar(this.readFloatTuneado(),this.readFloatTuneado());
            break;
          case 4:
            System.out.println("\nDivision ->");
              this.resultado = this.dividir(this.readFloatTuneado(),this.readFloatTuneadoDiv());
            break;

          case 5:
              System.out.println("Salir >>");
              break;

          default:
              break;
      }
    }
    public void Display() {
  		System.out.println("Resultado es: " + this.resultado);
  	}
    public static void main(String[] args) {

        CalculadoraSerge_P601 Calcus = new CalculadoraSerge_P601();

        System.out.println("Calculadora Serge");
        Calcus.calcular(Calcus.opcion_menu());
        Calcus.Display();

    }
}
