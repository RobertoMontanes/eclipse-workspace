package ejercicio01;

public class Cabecera {
    private String asignatura;
    private int aula;
    private String fecha;

    // Constructor
    public Cabecera(String asignatura, int aula, String fecha) {
        this.asignatura = asignatura;
        this.aula = aula;
        this.fecha = fecha;
    }

    // Método para imprimir la cabecera
    public void imprimirCabecera() {
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Aula: " + aula);
        System.out.println("Fecha: " + fecha);
    }
}
