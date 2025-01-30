package ejercicio01;

import java.util.ArrayList;

public class GestionNotas {

	
	 private static ArrayList<Nota> notas = new ArrayList<Nota>();

	    public static void agregarNota(String titulo, String contenido) {
	        notas.add(new Nota(titulo, contenido));
	        System.out.println("Nota agregada correctamente.");
	    }

	    public static void mostrarNotas() {
	        if (notas.isEmpty()) {
	            System.out.println("No hay notas para mostrar.");
	            return;
	        }
	        for (int i = 0; i < notas.size(); i++) {
	            System.out.println((i + 1) + ". " + notas.get(i).getTitulo());
	        }
	    }

	    public static void mostrarNotaIndividual(int indice) {
	        if (indice >= 0 && indice < notas.size()) {
	            System.out.println(notas.get(indice));
	        } else {
	            System.out.println("Índice inválido.");
	        }
	    }

	    public static void borrarNota(int indice) {
	        if (notas.isEmpty()) {
	            System.out.println("La lista de notas está vacía. No se puede borrar ninguna nota.");
	            return;
	        }

	        if (indice >= 0 && indice < notas.size()) {
	            notas.remove(indice);
	            System.out.println("Nota borrada correctamente.");
	        } else {
	            System.out.println("Índice inválido. No se pudo borrar la nota.");
	        }
	    }

	    public static void numeroDeNotas() {
	        System.out.println("Número de notas guardadas: " + notas.size());
	    }

}
