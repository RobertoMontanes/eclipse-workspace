package ejercicio10V2.copy;

public class Ticket {
    private double precio;
    private int numeroPersonas;

    // Constructor
    public Ticket(double precio, int numeroPersonas) {
        this.precio = precio;
        this.numeroPersonas = numeroPersonas;
    }

    // Getters y Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    // Método para imprimir el ticket
    public void imprimir() {
        System.out.println("Ticket de metro:");
        System.out.println("Precio por persona: " + precio);
        System.out.println("Número de personas: " + numeroPersonas);
        System.out.println("Total a pagar: " + (precio * numeroPersonas));
    }
}
