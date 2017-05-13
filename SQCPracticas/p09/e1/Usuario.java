import java.util.*;

public class Usuario {
  private String nombre;
  private String direccion;
  private String mail;
  private String nickname;
  private String password;
  private String FechaNacimiento;
  private long  telefono;

//costructor
//reserva espacio de memorio
  public Usuario() { //alojar espacio de memoria siempre publico sin tipo de retorno y nombre de la classe

    this.nombre = " ";
    this.direccion = " ";
    this.mail = " ";
    this.nickname = " ";
    this.password = " ";
    this.fechaNacimiento = " ";
    this.telefono = 0;
  }

  public Usuario(String nombreAux, String direccionAux, String mailAux, String nicknameAux, String passwordAux, String fechaNacimientoAux, long telefonoAux) {

    this.nombre = nombreAux;
    this.direccion = direccionAux;
    this.mail = mailAux;
    this.nickname = nicknameAux;
    this.password = passwordAux;
    this.fechaNacimiento = fechaNacimientoAux;
    this.telefono = telefonoAux;

  }

  public Usuario(String nombreAux, String direccionAux, String mailAux, String nicknameAux, String passwordAux, String fechaNacimientoAux) {

    this.nombre = nombreAux;
    this.direccion = direccionAux;
    this.mail = mailAux;
    this.nickname = nicknameAux;
    this.password = passwordAux;
    this.fechaNacimiento = fechaNacimientoAux;
    this.telefono = 0;

  }

  public void setNombre(String nombreAux2) {
    this.nombre = nombreAux2;
  }

  public String getNombre() {
    return "El Nombre es => " + nombreAux2;
  }

  public void setDireccion(String direccionAux2) {
    this.direccion = direccionAux2;
  }

  public String getDireccion() {
    return "La direccion es => " + direccionAux2
  }

  public void setMail(String mailAux2) {
    this.mail = mailAux2;
  }

  public String getMail() {
    return "El mail es => " + mailAux2;
  }

  public void setNickname(String nicknameAux2) {
    this.nickname = nicknameAux2;
  }

  public String getNickname() {
    return "El Nickname es => " + nicknameAux2;
  }

  public void setPassword(String passwordAux2) {
    this.password = passwordAux2;
  }

  public String getPassword() {
    return "El password es => " + passwordAux2;
  }

  public void setFechaNacimiento(String fechaNacimientoAux2) {
    this.fechaNacimiento = fechaNacimientoAux2;
  }

  public String getFechaNacimiento() {
    return fechaNacimientoAux2;
  }

  public void setTelefono(long telefonoAux2) {
    this.telefono = telefonoAux2;
  }

  public long getTelefono() {
    return telefonoAux2;
  }

  public String toString() {
    return ("Nombre ===> (" + this.nombre ")\n") +
           ("Direccion ===> (" + this.direccion ")\n") +
           ("Mail ===> (" + this.mail ")\n") +
           ("Nickname ===> (" + this.nickname ")\n") +
           ("Password ===> (" + this.password ")\n") +
           ("Fecha de Nacimiento ===> (" + this.fechaNacimiento ")\n") +
           ("Telefono ===> (" + this.telefono ")\n");
  }
}
