import java.io.*;

public class TestUsuario {

  public static void main(String args[]) {

    Lectura Lector = new Lectura();

    Usuario caso_1 = new Usuario();
    Usuario caso_2 = new Usuario("Super Sergio" , "Mexico City" , "x@x.com" , "Super Serge" , "123" , "07/10/1985", 443L);
    Usuario caso_3 = new Usuario("Super Sergio" , "Mexico City" , "x@x.com" , "Super Serge" , "123" , "07/10/1985");

    //ENTRADA DE DATOS

    System.out.println("Usuario Input ");

    System.out.println("Nombre: -> ");
    caso_1.setNombre(Lector.readStr());

    System.out.println("Direccion: -> ");
    caso_1.setDireccion(Lector.readStr());

    System.out.println("Mail: -> ");
    caso_1.setMail(Lector.readStr());

    System.out.println("NickNamwe: -> ");
    caso_1.setNickname(Lector.readStr());

    System.out.println("Password: -> ");
    caso_1.setPassword(Lector.readStr());

    System.out.println("Fecha de Nacimiento: -> ");
    caso_1.setFechaNacimiento(Lector.readStr());

    System.out.println("Telefono: -> ");
    caso_1.setTelefono(Lector.readInt());

    System.out.println("Asi queda!");
    System.out.println();

    System.out.println(caso_1.toString());

    System.out.println("Usuario Datos Default");
    System.out.println(caso_2.toString());

    System.out.println("Usuario Telefono Default (0)");
    System.out.println(caso_3.toString());

  }
}
