package cuatroenraya;

import utilidades.Leer;

public class Juego {
	public static void main(String[] args) {
		System.out.println("¡Bienvenido al juego de 4 en raya!");

		System.out.print("Introduce el nombre del primer jugador: ");
		String nombre1 = Leer.dato();
		Jugador jugador1 = new Jugador(nombre1, 'X');

		System.out.print("Introduce el nombre del segundo jugador: ");
		String nombre2 = Leer.dato();
		Jugador jugador2 = new Jugador(nombre2, 'O');

		Tablero tablero = new Tablero(6, 7);
		boolean jugando = true;
		Jugador jugadorActual = jugador1;

		while (jugando) {
			tablero.dibujarTablero();
			System.out.println("Turno de " + jugadorActual.getNombre() + " (" + jugadorActual.getFicha() + ")");
			System.out.print("Elige una columna: ");
			int columna = Leer.datoInt();

			if (columna < 0 || columna >= 7 || !tablero.colocarFicha(columna, jugadorActual.getFicha())) {
				System.out.println("Movimiento inválido, intenta de nuevo.");
				continue;
			}

			int[][] posicionesGanadoras = tablero.comprobarVictoriaExtendido(jugadorActual.getFicha());
			if (posicionesGanadoras != null) {
				tablero.dibujarTableroConGanador(posicionesGanadoras, jugadorActual.getFicha());
				System.out.println("¡" + jugadorActual.getNombre() + " ha ganado!");
				jugando = false;
			} else {
				jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
			}
		}
	}
}
