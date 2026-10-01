package Taller6_Modificadores_Acceso.Ejercicio_02.Vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarDetallesMoto() {
        System.out.println("Tipo: " + tipo + " | Marca: " + marca + " | Cilindrada: " + cilindrada + "cc");
    }
}
