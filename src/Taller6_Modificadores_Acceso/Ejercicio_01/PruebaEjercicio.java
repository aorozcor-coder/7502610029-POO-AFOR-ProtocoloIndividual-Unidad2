package Taller6_Modificadores_Acceso.Ejercicio_01;

public class PruebaEjercicio {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos", 2500.0);
        Gerente ger = new Gerente("Ana", 4500.0, "Sistemas");

        emp.mostrarInformacion();
        ger.mostrarInformacion();
    }
}
