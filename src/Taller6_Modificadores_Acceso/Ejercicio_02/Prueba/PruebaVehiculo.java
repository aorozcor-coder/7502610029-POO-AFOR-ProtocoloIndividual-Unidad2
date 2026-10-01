package Taller6_Modificadores_Acceso.Ejercicio_02.Prueba;

import Taller6_Modificadores_Acceso.Ejercicio_02.Vehiculos.Vehiculo;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Terrestre", "Yamaha");

        /*
         * INTENTO DE ACCESO INCORRECTO:
         * System.out.println(vehiculo.tipo);  // ERROR DE COMPILACIÓN
         * System.out.println(vehiculo.marca); // ERROR DE COMPILACIÓN
         *
         * Explicación: La clase PruebaVehiculo está en un paquete distinto (Prueba)
         * y no hereda de Vehiculo.
         */
    }
}
