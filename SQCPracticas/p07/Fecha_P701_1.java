import java.io.*;
import java.util.*;

public class Fecha_P701_1{
private int dia;
private int mes;
private int anio;

private int flagdia;

  public InputStreamReader isr = new InputStreamReader(System.in);
  public BufferedReader br = new BufferedReader(isr);

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

private int readInt() {
  try{
    return Integer.parseInt(br.readLine());
    }catch(IOException ex){
  }
  return 0;
}
private void FechaCorrecta(){
//año
  if(this.anio < 1582 || this.anio >2018){
    System.out.println("\nEl Año no es Valido, Try Again");
  }
  if(this.mes < 1 || this.mes > 12){
    System.out.println("\nEl Mes no es Valido, Try Again");
  }
//mes
  if(this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12){
    if(this.dia < 1 || this.dia > 31){
      System.out.println("\nEl Dia no es Valido, Try Again");
      this.flagdia = 1;
    }
  }
//dia sin febrero
  if(this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11){
    if(this.dia < 1 || this.dia > 30){
      System.out.println("\nEl Dia no es Valido, Try Again");
      this.flagdia = 1;
    }
  }
// dia con febrero
  if(this.mes == 2 && (this.Biciesto(anio)) == false){
    if(this.dia < 1 || this.dia > 28){
      System.out.println("\nEl Dia no es Valido, EL AÑO NO es Biciesto Try Again");
      this.flagdia = 1;
    }
  }
  if(this.mes == 2 && (this.Biciesto(anio)) == true){
    if(this.dia < 1 || this.dia > 29){
      System.out.println("\nEl Dia no es Valido, EL AÑO es Biciesto, Try Again");
      this.flagdia = 1;
    }
  }
}
//comprobacion de Biciesto
private boolean Biciesto(int biciesto){
  if (this.anio % 4 ==0 ){
    return true;
  }else{
    return false;
  }


}

private void pedirFECHA(){
    System.out.println("Introducir FEcha");
    int biciesto = 0, flagdia;

    do{
      System.out.println("Año");
      this.anio = this.readInt();
      this.FechaCorrecta();

    }while(this.anio < 1582 || this.anio > 2018);
    do{
      System.out.println("Mes");
      this.mes = this.readInt();
      this.FechaCorrecta();

    }while(this.mes < 1 || this.mes > 12);

    do{
      this.flagdia = 0;
      System.out.println("Dia");
      this.dia = this.readInt();
      this.FechaCorrecta();

    }while(this.flagdia != 0);

}

public static void amdFecha(int[] fecha){
    System.out.println(fecha[0] + "-" + fecha[1] + "-" + fecha[2]);
}

public static void main (String[]args){

    System.out.println("Fechas Serge");

    Fecha_P701_1 FechaME = new Fecha_P701_1();
    int[]fecha = new int[3];
    FechaME.pedirFECHA();
    FechaME.obtenerFecha(fecha);
    Fecha_P701_1.amdFecha(fecha); //formato

    }
}
