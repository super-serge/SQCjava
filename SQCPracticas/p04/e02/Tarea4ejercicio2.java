import java.util.Scanner;

public class Tarea4ejercicio2 {

 public static void main(String[] args) {
  String line;
  Scanner scanner = new Scanner(System.in);
  System.out.println("Type a statement.");
  line = scanner.nextLine();
  System.out.println();
  System.out.println("Capitalized version:");
  printCapitalized( line );
}


static void printCapitalized( String str ) {
  char caracter;
  char caracterprevio;
  int i;
  caracterprevio = '.';
  for ( i = 0;  i < str.length();  i++ ) {
   caracter = str.charAt(i);
   if ( Character.isLetter(caracter)  &&  ! Character.isLetter(caracterprevio) )
    System.out.print( Character.toUpperCase(caracter) );
  else
    System.out.print( caracter );
  caracterprevio = caracter;
}
System.out.println();
}

} 
