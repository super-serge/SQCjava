import java.io.*;
import java.util.*;

public class P701_try01{
private  int dia;
private int mes;
private  int anio;

  public InputStreamReader isr = new InputStreamReader(System.in);
  public BufferedReader br = new BufferedReader(isr);

static int[] diaMEs = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

public void asignarFecha(){
    Calendar current_day = new GregorianCalendar();
    this.dia = current_day.get(Calendar.DAY_OF_MONTH);
    this.mes = current_day.get(Calendar.MONTH);
    this.anio = current_day.get(Calendar.YEAR);
}
public void asignarFecha(int mes_param){
    this.asignarFecha();
    this.mes = mes_param;
}
//this
public void asignarFecha(int dia_param, int mes_param, int anio_param){
    this.dia = dia_param;
    this.mes = mes_param;
    this.anio = anio_param;
}

public int[] obtenerFecha(int[] fecha){
    fecha[0] = this.dia;
    fecha[1] = this.mes;
    fecha[2] = this.anio;

    return fecha;
}

public int menu() {
  System.out.println("Bienvenido al programa Fecha\n menu:");
  System.out.println(" 1.-suma\n 2.-resta \n 3.-multiplicar \n 4.-dividir \n 5.-salir");
  System.out.println("Elige una opcion:");
  return this.readInt();
}

private int readInt() {
  try{
    return Integer.parseInt(br.readLine());
  }catch(IOException ex){
  }
  return 0;
}

private int pedirFECHA(){
    System.out.println("Introducir FEcha");
    int anolec;
    do{
      System.out.println("Año");
      anolec = this.readInt();
      if(anolec < 1582 || anolec >2018){
        System.out.println("\nEl Año no es Valido, Try Again");
      }
    }while(anolec < 1582 || anolec > 2018);


    return 0;
}

public static void main (String[]args){

//  P701_try01 FechaME = new P701_try01();
  System.out.println("Fechas Serge");



  P701_try01 FechaME = new P701_try01();
  FechaME.pedirFECHA();

  FechaME.asignarFecha(7,10,1985);
  int[]fecha = new int[3];
  System.out.println(FechaME.obtenerFecha(fecha));
  Fecha.amdFecha(fecha); //formato

}
}