package ejercicio11;

public class GestionNotas {

    private Alumno alumno; // Referencia al objeto Alumno

    public GestionNotas(Alumno alumno) {
        this.alumno = alumno; // Inicializar la referencia al objeto Alumno
    }

    public boolean agregarNotas(double nota) {
        for (int i = 0; i < alumno.getNotas().length; i++) {
            if (alumno.getNotas()[i] == 0.0) { // Verificar si la nota está vacía
                alumno.getNotas()[i] = nota; // Asignar la nota en la posición libre
                return true;
            }
        }
        System.out.println("El array de notas está lleno.");
        return false;
    }
}
