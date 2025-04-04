package java21;

import java.util.SequencedSet;
import java.util.LinkedHashSet;
import java.util.SequencedCollection;
import java.util.ArrayList;

public class ColeccionesSecuenciadas {
	public static void main(String[] args) {
		// Ejemplo con SequencedSet (mantiene el orden de inserción)
		SequencedSet<String> nombres = new LinkedHashSet<>();
		nombres.add("Roberto");
		nombres.add("Mario");
		nombres.add("Juan");

		System.out.println("Primer elemento: " + nombres.getFirst()); // "Roberto"
		System.out.println("Último elemento: " + nombres.getLast()); // "Juan"

		// Ejemplo con SequencedCollection (ArrayList)
		SequencedCollection<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);

		System.out.println("Primer número: " + numeros.getFirst()); // 10
		System.out.println("Último número: " + numeros.getLast()); // 30

		// Invertir el orden de la lista fácilmente
		SequencedCollection<Integer> numerosInvertidos = numeros.reversed();
		System.out.println("Lista invertida: " + numerosInvertidos);
	}

	/*
	 * 🔹 Explicación ✅ SequencedSet<String> nombres = new LinkedHashSet<>();
	 * 
	 * LinkedHashSet ahora implementa SequencedSet, lo que permite acceder al primer
	 * y último elemento con getFirst() y getLast().
	 * 
	 * ✅ SequencedCollection<Integer> numeros = new ArrayList<>();
	 * 
	 * ArrayList implementa SequencedCollection, permitiendo acceder a los extremos
	 * de la lista fácilmente.
	 * 
	 * ✅ reversed() para invertir colecciones
	 * 
	 * Antes, para invertir una lista teníamos que usar Collections.reverse(lista).
	 * 
	 * Ahora se puede hacer directamente con .reversed().
	 */
}
