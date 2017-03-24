import java.io.*;
import java.util.*;

public class Fecha_P701{
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
    int anolec, meslec, dialec, biciesto = 0, flagdia;
    do{
      System.out.println("Año");
      anolec = this.readInt();
      if(anolec < 1582 || anolec >2018){
        System.out.println("\nEl Año no es Valido, Try Again");
      }
    }while(anolec < 1582 || anolec > 2018);
    do{
      System.out.println("Mes");
      meslec = this.readInt();
      if(anolec < 1 || meslec > 12){
        System.out.println("\nEl Mes no es Valido, Try Again");
      }
    }while(meslec < 1 || meslec > 12);
    do{
      flagdia = 0;
      System.out.println("Dia");
      dialec = this.readInt();
      if(meslec == 2 && (anolec % 4) != 0){
        if(dialec < 1 || dialec > 28){
          System.out.println("\nEl Dia no es Valido, Try Again");
          flagdia = 1;
        }
      }
      if(meslec == 2 && (anolec % 4) == 0){
        if(dialec < 1 || dialec > 29){
          System.out.println("\nEl Dia no es Valido, Try Again");
          flagdia = 1;
        }
      }
      if(meslec == 1 || meslec == 3 || meslec == 5 || meslec == 7 || meslec == 8 || meslec == 10 || meslec == 12){
        if(dialec < 1 || dialec > 31){
          System.out.println("\nEl Dia no es Valido, Try Again");
          flagdia = 1;
        }
      }
      if(meslec == 4 || meslec == 6 || meslec == 9 || meslec == 11){
        if(dialec < 1 || dialec > 30){
          System.out.println("\nEl Dia no es Valido, Try Again");
          flagdia = 1;
        }
      }
    }while(flagdia != 0);


    return 0;
}

public static void amdFecha(int[] fecha){
    System.out.println(fecha[0] + "-" + fecha[1] + "-" + fecha[2]);

}

public static void main (String[]args){

//  P701_try01 FechaME = new P701_try01();
  System.out.println("Fechas Serge");



  Fecha_P701 FechaME = new Fecha_P701();
  FechaME.pedirFECHA();

  FechaME.asignarFecha(7,10,1985);
  int[]fecha = new int[3];
  System.out.println(FechaME.obtenerFecha(fecha));
  Fecha_P701.amdFecha(fecha); //formato

}
}
