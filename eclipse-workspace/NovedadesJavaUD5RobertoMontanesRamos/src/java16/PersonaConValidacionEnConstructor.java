package java16;

public record PersonaConValidacionEnConstructor(String nombre, int edad) {
    // Constructor compacto con validación
    public PersonaConValidacionEnConstructor {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
    }

    // Método extra para mostrar una descripción
    public String descripcion() {
        return nombre + " tiene " + edad + " años.";
    }
}
