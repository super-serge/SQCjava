
import java.io.*;

public class CalculadoraSerge_P601 {

    private int nuOP;
    private int opcion_OPE;

    public int opcion_menu() throws IOException {
        InputStreamReader serge = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(serge);
        String valor;

        //  do{
        System.out.println("<--Calculadora Aritmetica-->\n");
        System.out.println("1 - sumar");
        System.out.println("2 - restar");
        System.out.println("3 - multiplicar");
        System.out.println("4 - dividir");
        System.out.println("5 - salir");
        System.out.println("\nQue Operacion Quieres realizar=? \n");

        valor = br.readLine();
        opcion_OPE = Integer.parseInt(valor);
        int nuOP = Integer.valueOf(valor);

        //}while(opcion_OPE < 1 || opcion_OPE >= 6);
        return opcion_OPE;
    }

    public double sumar(double valor01, double valor02) {
        return valor01 + valor02;
    }

    public double restar(double valor01, double valor02) {
        return valor01 - valor02;
    }

    public double multiplicar(double valor01, double valor02) {
        return valor01 * valor02;
    }

    public double dividir(double valor01, double valor02) {
        return valor01 / valor02;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader valor_comodin = new BufferedReader(new InputStreamReader(System.in));
        String teclado;
        double primer_val, segundo_val;

        CalculadoraSerge_P601 Calcus = new CalculadoraSerge_P601();

        switch (Calcus.opcion_menu()) {

            case 1:
                System.out.println("\nIngresa valor 1 ->");
                teclado = valor_comodin.readLine();
                primer_val = Double.parseDouble(teclado);

                System.out.println("Ingresa valor 2 ->");
                teclado = valor_comodin.readLine();
                segundo_val = Double.parseDouble(teclado);

                System.out.println("La suma es: ");
                System.out.println(Calcus.sumar(primer_val, segundo_val));
                break;

            case 2:
                System.out.println("\nIngresa valor 1 ->");
                teclado = valor_comodin.readLine();
                primer_val = Double.parseDouble(teclado);

                System.out.println("Ingresa valor 2 ->");
                teclado = valor_comodin.readLine();
                segundo_val = Double.parseDouble(teclado);

                System.out.println("La resta es: ");
                System.out.println(Calcus.restar(primer_val, segundo_val));
                break;

            case 3:
                System.out.println("\nIngresa valor 1 ->");
                teclado = valor_comodin.readLine();
                primer_val = Double.parseDouble(teclado);

                System.out.println("Ingresa valor 2 ->");
                teclado = valor_comodin.readLine();
                segundo_val = Double.parseDouble(teclado);

                System.out.println("La multiplicacion es: ");
                System.out.println(Calcus.multiplicar(primer_val, segundo_val));
                break;

            case 4:
                System.out.println("\nDato 1 ->");
                teclado = valor_comodin.readLine();
                primer_val = Double.parseDouble(teclado);

                do {
                    System.out.println("Dato 2 ->");
                    teclado = valor_comodin.readLine();
                    segundo_val = Double.parseDouble(teclado);
                    if (segundo_val == 0) {
                        System.out.println("Vuelve a capturaar dato 2 que sea diferente de cero (0)");
                    }
                } while (segundo_val == 0);
                System.out.println("La division es: ");
                System.out.println(Calcus.dividir(primer_val, segundo_val));
                break;

            case 5:
                System.out.println("Salir >>");
                break;

            default:
                break;
        }

    }
}
