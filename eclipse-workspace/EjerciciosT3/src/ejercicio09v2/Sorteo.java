package ejercicio09v2;

import java.util.Random;

public class Sorteo {

	private int numeroPremiado;
	private int numeroBoletoElegido;

	public Sorteo() {
	}

	// Constructor opcional
	public Sorteo(int numeroPremiado, int numeroBoletoElegido) {
		this.numeroPremiado = numeroPremiado;
		this.numeroBoletoElegido = numeroBoletoElegido;
	}

	// Getter y setter para el número premiado
	public int getNumeroPremiado() {
		return numeroPremiado;
	}

	public void setNumeroPremiado(int numeroPremiado) {
		this.numeroPremiado = numeroPremiado;
	}

	// Getter y setter para el boleto elegido
	public int getNumeroBoletoElegido() {
		return numeroBoletoElegido;
	}

	public void setNumeroBoletoElegido(int numeroBoletoElegido) {
		this.numeroBoletoElegido = numeroBoletoElegido;
	}

	// Comprar un número ingresado por teclado
	public int comprarNumeroBoleto(int numeroPorTeclado) {
			numeroBoletoElegido = numeroPorTeclado;
			return numeroBoletoElegido;
	}

	// Generar un número aleatorio
	public int GenerarNumeroAleatorio() {
		Random rnd = new Random();
		int min = 1;
		int max = 99999;
		return rnd.nextInt(max - min + 1) + min;
	}

	// Generar el número premiado (solo una vez)
	public int GenerarNumeroPremiado() {
		Random rnd = new Random();
		int min = 1;
		int max = 99999;
		numeroPremiado = rnd.nextInt(max - min + 1) + min;
		return numeroPremiado;
	}

	// Comprobar si el número elegido está premiado
	public boolean comprobarPremio() {
		return numeroBoletoElegido == numeroPremiado;
	}

	// Mostrar resultado
	public String Ganar() {
		if (comprobarPremio()) {
			return imprimirVictoria();
		} else {
			return imprimirDerrota();
		}
	}

	// Mensaje de derrota
	private String imprimirDerrota() {
		return "No ha ganado :(";
	}

	// Mensaje de victoria
	private String imprimirVictoria() {
		return "¡Felicidades! Ha ganado :)";
	}
}
