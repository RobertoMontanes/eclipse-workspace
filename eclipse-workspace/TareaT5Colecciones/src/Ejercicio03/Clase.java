package Ejercicio03;

import java.util.HashSet;



public class Clase {

	private HashSet<Alumno> alumnos = new HashSet<>();

	public void agregarAlumno(String nombre, double nota) {
		if (alumnos.add(new Alumno(nombre, nota))) {
			System.out.println("Alumno agregado.");
		} else {
			System.out.println("El alumno ya existe.");
			
		}
	}	
	
	
	
	public void mostrarAlumno(String nombre) {
		for (Alumno a : alumnos) {
			if (a.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(a);
				return;
			}
		}
		System.out.println("Alumno no encontrado.");
	}

	public void modificarNota(String nombre, double nuevaNota) {
		for (Alumno a : alumnos) {
			if (a.getNombre().equalsIgnoreCase(nombre)) {
				a.setNota(nuevaNota);
				System.out.println("Nota actualizada.");
				return;
			}
		}
		System.out.println("Alumno no encontrado.");
	}

	public void eliminarAlumno(String nombre) {
		if (alumnos.remove(new Alumno(nombre, 0))) {
			System.out.println("Alumno eliminado.");
		} else {
			System.out.println("Alumno no encontrado.");
		}
	}

	public void mostrarTodos() {
		if (alumnos.isEmpty()) {
			System.out.println("No hay alumnos en la clase.");
		} else {
			for (Alumno a : alumnos) {
				System.out.println(a);
			}
		}
	}

	public double calcularNotaMedia() {
		if (alumnos.isEmpty()) {
			return 0;
		}
		double suma = 0;
		for (Alumno a : alumnos) {
			suma += a.getNota();
		}
		return suma / alumnos.size();
		
	}
	

	public int contarSuspensos() {
		int suspensos = 0;
		for (Alumno a : alumnos) {
			if (a.getNota() < 5)
				suspensos++;
		}
		return suspensos;
	}

	
	public double mediaSuspensos() {
		int suspensos = contarSuspensos();
		return alumnos.isEmpty() ? 0 : (double) suspensos / alumnos.size();
	}
}