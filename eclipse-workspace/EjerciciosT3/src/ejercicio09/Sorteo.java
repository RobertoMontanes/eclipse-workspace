package ejercicio09;

import java.util.Random;

public class Sorteo {

    private int numeroPremiado;
    private int numeroBoletoElegido;
    private boolean premio;

    // Constructor sin parámetros
    public Sorteo() {
        this.numeroPremiado = 0;  // Inicializa el número premiado a 0
        this.numeroBoletoElegido = 0;  // Inicializa el boleto elegido a 0
    }

    public int getNumeroBoletoElegido() {
        return numeroBoletoElegido;
    }

    public void setNumeroBoletoElegido(int numeroBoletoElegido) {
        this.numeroBoletoElegido = numeroBoletoElegido;
    }

    public int getNumeroPremiado() {
        return numeroPremiado;
    }

    public void setNumeroPremiado(int numeroPremiado) {
        this.numeroPremiado = numeroPremiado;
    }

    // Método para comprar un número de boleto
    public int comprarNumeroBoleto(int numeroPorTeclado) {
        this.numeroBoletoElegido = numeroPorTeclado;
        return numeroBoletoElegido;
    }

    // Método para generar un número aleatorio dentro de un rango
    public int generarNumeroAleatorio(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min;
    }

    // Método para generar un número premiado aleatorio
    public int generarNumeroPremiado() {
        if (numeroPremiado == 0) { // Si aún no se ha generado un número premiado
            Random rnd = new Random();
            int min = 1;
            int max = 99999;
            numeroPremiado = rnd.nextInt((max - min) + 1) + min;
        }
        return numeroPremiado;
    }

    // Método para comprobar si el boleto ha ganado
    public boolean comprobarSiHaGanado() {
        return numeroBoletoElegido == numeroPremiado;
    }

    // Método para obtener un mensaje de victoria o derrota
    public String mensajeDeResultado() {
        if (comprobarSiHaGanado()) {
            return "¡Ha ganado :)!";
        } else {
            return "No ha ganado :(";
        }
    }
}
