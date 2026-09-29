package Taller4_Modificadores_Acceso.Ejercicio_01;

public class PruebaEstudiante {
    public static void main (String[] args){
        Estudiante est1 = new Estudiante("Juan", 20, 4.5);

        System.out.println(est1.getNombre());
        System.out.println(est1.getEdad());
        System.out.println(est1.getNotaPromedio());


    }
}
