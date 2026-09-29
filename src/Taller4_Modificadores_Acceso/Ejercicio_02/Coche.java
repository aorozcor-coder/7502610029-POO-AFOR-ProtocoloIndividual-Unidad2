package Taller4_Modificadores_Acceso.Ejercicio_02;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMax;

    public Coche(){
        this.marca = "no asignado";
        this.modelo = "no asignado";
        this.velocidadMax = 0;
    }

    public Coche(String marca, String modelo, double velocidadMax){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
    }

    public void acelerar(double incremento){
        if (incremento > 0){
            velocidadMax += incremento;
        }
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public double getVelocidadMax(){
        return velocidadMax;
    }

}
