public class CuentaBancaria {
    private double tipoDeInteres;
    private double saldo;
  public void EstablecerTipoDeInteres(double ti) {
      if (ti < 0) {
        System.out.println("El tipo de interes no puede ser negativo");
        return;
      }
        tipoDeInteres = ti;
    }
  public void IngresarDinero(double ingreso) {
    saldo += ingreso;
  }
  public void RetirarDinero(double cantidad) {
    if ( saldo - cantidad < 0) {
      System.out.println("No tiene saldo suficiente");
      return;
    }
    saldo -= cantidad;
  }
  public double SaldoAcual() {
    return saldo;
  }
  public void AbonarIntereses() {
    saldo += saldo * tipoDeInteres /100;
 }
  public static void main (String[] args) {
    CuentaBancaria Cuenta01 = new CuentaBancaria();
    Cuenta01.IngresarDinero(1000000);
    Cuenta01.EstablecerTipoDeInteres(2);
    System.out.println(Cuenta01.SaldoAcual());
    Cuenta01.IngresarDinero(500000);
    Cuenta01.RetirarDinero(200000);
    System.out.println(Cuenta01.SaldoAcual());
    Cuenta01.AbonarIntereses();
    System.out.println(Cuenta01.SaldoAcual());
  }
}
