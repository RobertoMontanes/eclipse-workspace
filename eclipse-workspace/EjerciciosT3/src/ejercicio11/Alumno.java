package ejercicio11;

import java.util.Arrays;

public class Alumno {

	private String nombre;
	private int curso;
	private double[] notas;
	private int numSuspensos;
	private double notaMedia;
	
	public Alumno(String nombre, int curso, double[] notas, int numSuspensos, double notaMedia) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.notas = notas;
		this.numSuspensos = numSuspensos;
		this.notaMedia = notaMedia;
	}

	public Alumno(int numNotas) {
		notas = new double[numNotas];
	}
	public Alumno() {
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public int getNumSuspensos() {
		return numSuspensos;
	}

	public void setNumSuspensos(int numSuspensos) {
		this.numSuspensos = numSuspensos;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + ", notas=" + Arrays.toString(notas) + ", numSuspensos="
				+ numSuspensos + ", notaMedia=" + notaMedia + "]";
	}

	

}
