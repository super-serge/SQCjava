//import java.io.*;
//import java.util.*;

public class TestFecha_P801_2{

  public static void main (String[]args){

      System.out.println("Fechas Serge");

      Fecha_P801_2 FechaME = new Fecha_P801_2();
      int[]fecha = new int[3];
      FechaME.pedirFECHA();
      FechaME.obtenerFecha(fecha);
      FechaME.amdFecha(fecha); //formato

      Fecha_P801_2 FechaME4 = new Fecha_P801_2();
      FechaME4.asignarFecha(7,10,1985);
      int[]fecha4 = new int[3];
      FechaME4.obtenerFecha(fecha4);
      FechaME4.amdFecha(fecha4); //formato

      Fecha_P801_2 FechaME2 = new Fecha_P801_2();
      FechaME2.asignarFecha();
      int[]return_fecha2 = new int[3];
      FechaME2.obtenerFecha(return_fecha2);
      FechaME2.amdFecha(return_fecha2); //formato

      Fecha_P801_2 FechaME3 = new Fecha_P801_2();
      FechaME3.asignarFecha(4);
      int []return_fecha3 = new int[3];
      FechaME3.obtenerFecha(return_fecha3);
      FechaME3.amdFecha(return_fecha3); //formato

      Fecha_P801_2 FechaME5 = new Fecha_P801_2();
      FechaME5.asignarFecha(11,10,1985);
      int[]fecha5 = new int[3];
      FechaME5.obtenerFecha(fecha5);
      FechaME5.amdFecha(fecha5); //formato

      FechaME5.finalize();
      FechaME5 = null;

      if(FechaME5 == null){
        System.out.println("YA no extste!!");
      }
      System.gc();

      //FechaME2.PasarGarbageCollector();
      //

  }

}
