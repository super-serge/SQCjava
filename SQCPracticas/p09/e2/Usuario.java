import java.util.*;

public class Usuario {
  private String nombre;
  private String direccion;
  private String mail;
  private String nickname;
  private String password;
  private String FechaNacimiento;
  private long telefono;

//costructor
//reserva espacio de memorio
  public Usuario() { //alojar espacio de memoria siempre publico sin tipo de retorno y nombre de la classe

    this.nombre = " ";
    this.direccion = " ";
    this.mail = " ";
    this.nickname = " ";
    this.password = " ";
    this.FechaNacimiento = " ";
    this.telefono = 0;
  }

  public Usuario(String nombreAux, String direccionAux, String mailAux, String nicknameAux, String passwordAux, String fechaNacimientoAux, long telefonoAux) {

    this.nombre = nombreAux;
    this.direccion = direccionAux;
    this.mail = mailAux;
    this.nickname = nicknameAux;
    this.password = passwordAux;
    this.FechaNacimiento = fechaNacimientoAux;
    this.telefono = telefonoAux;

  }

  public Usuario(String nombreAux, String direccionAux, String mailAux, String nicknameAux, String passwordAux, String fechaNacimientoAux) {

    this.nombre = nombreAux;
    this.direccion = direccionAux;
    this.mail = mailAux;
    this.nickname = nicknameAux;
    this.password = passwordAux;
    this.FechaNacimiento = fechaNacimientoAux;
    this.telefono = 0L;

  }

  public void setNombre(String nombreAux) {
    this.nombre = nombreAux;
  }

  public String getNombre() {
    return "El Nombre es => " + this.nombre;
  }

  public void setDireccion(String direccionAux) {
    this.direccion = direccionAux;
  }

  public String getDireccion() {
    return "La direccion es => " + this.direccion;
  }

  public void setMail(String mailAux) {
    this.mail = mailAux;
  }

  public String getMail() {
    return "El mail es => " + this.mail;
  }

  public void setNickname(String nicknameAux) {
    this.nickname = nicknameAux;
  }

  public String getNickname() {
    return "El Nickname es => " + this.nickname;
  }

  public void setPassword(String passwordAux) {
    this.password = passwordAux;
  }

  public String getPassword() {
    return "El password es => " + this.password;
  }

  public void setFechaNacimiento(String fechaNacimientoAux) {
    this.FechaNacimiento = fechaNacimientoAux;
  }

  public String getFechaNacimiento() {
    return "El Fechas de Nacimiento es => " + this.FechaNacimiento;
  }

  public void setTelefono(long telefonoAux) {
    this.telefono = telefonoAux;
  }

  public String getTelefono() {
    return "El telefono es => " + this.telefono;
  }

  public String toString() {
    return ("Nombre ===> (" + this.nombre + ")\n") +
           ("Direccion ===> (" + this.direccion + ")\n") +
           ("Mail ===> (" + this.mail + ")\n") +
           ("Nickname ===> (" + this.nickname + ")\n") +
           ("Password ===> (" + this.password + ")\n") +
           ("Fecha de Nacimiento ===> (" + this.FechaNacimiento + ")\n") +
           ("Telefono ===> (" + this.telefono + ")\n");
  }
}
