package java16;

public class Principal {

	public static void main(String[] args) {

		// Antes de Java 16
		Persona persona = new Persona("Roberto", -5); // ❌ No hay validación dentro del Record

		// Validación fuera del Record (no eficiente)
		if (persona.edad() < 0) {
			throw new IllegalArgumentException("La edad no puede ser negativa");
		}

		System.out.println(persona);

		// Java 16 con validación de Records dentro de un constructor
		PersonaConValidacionEnConstructor personaValida = new PersonaConValidacionEnConstructor("Roberto", 20);
        System.out.println(personaValida.descripcion()); // ✅ Roberto tiene 20 años.

        PersonaConValidacionEnConstructor personaInvalida = new PersonaConValidacionEnConstructor("Juan", -5); // ❌ Lanza error: "La edad no puede ser negativa"
    }

}
