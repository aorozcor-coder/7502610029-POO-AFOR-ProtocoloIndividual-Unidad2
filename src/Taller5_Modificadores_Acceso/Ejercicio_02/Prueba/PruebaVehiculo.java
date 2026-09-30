package Taller5_Modificadores_Acceso.Ejercicio_02.Prueba;

import Taller5_Modificadores_Acceso.Ejercicio_02.Vehiculos.Moto;
import Taller5_Modificadores_Acceso.Ejercicio_02.Vehiculos.Vehiculo;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Terrestre");
        Moto m = new Moto("Deportiva");

        // Intentar acceder directamente a la propiedad de paquete desde otro paquete:
        // System.out.println(v.tipo); // Error de compilacion: tipo no es visible fuera del paquete
        // System.out.println(m.tipo); // Error de compilacion: tipo no es visible fuera del paquete
    }
}