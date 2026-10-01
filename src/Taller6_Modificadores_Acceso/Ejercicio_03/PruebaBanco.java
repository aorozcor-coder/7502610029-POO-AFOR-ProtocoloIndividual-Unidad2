package Taller6_Modificadores_Acceso.Ejercicio_03;

public class PruebaBanco {
    public static void main(String[] args) {
        Banco cuenta = new Banco(1000.0);

        /*
         * INTENTO DE ACCESO DIRECTO NO PERMITIDO:
         * cuenta.saldo = -500.0; // ERROR DE COMPILACIÓN: saldo es private
         */

        cuenta.depositar(500.0);
        System.out.println("Saldo tras depósito: $" + cuenta.getSaldo());

        cuenta.retirar(200.0);
        System.out.println("Saldo tras retiro: $" + cuenta.getSaldo());
    }
}