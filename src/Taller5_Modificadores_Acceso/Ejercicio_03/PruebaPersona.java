package Taller5_Modificadores_Acceso.Ejercicio_03;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Carlos", 25);

        System.out.println("Edad: " + p.edad);
        p.edad = 26;


        System.out.println("Nombre: " + p.getNombre());
    }
}
