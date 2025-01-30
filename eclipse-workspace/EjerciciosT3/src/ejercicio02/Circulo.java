package ejercicio02;

public class Circulo {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área en cm²
    public double calcularAreaCm2() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el área en m²
    public double calcularAreaM2() {
        return calcularAreaCm2() / 10000; // Convierte cm² a m²
    }
}
