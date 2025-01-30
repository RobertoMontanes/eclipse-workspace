package cuatroenraya;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {

		System.out.println("¡Bienvenido al juego de 4 en raya!");

		// Configurar jugadores
		System.out.print("Introduce el nombre del primer jugador: ");
		String nombre1 = Leer.dato();
		Jugador jugador1 = new Jugador(nombre1, 'X');

		System.out.print("Introduce el nombre del segundo jugador: ");
		String nombre2 = Leer.dato();
		Jugador jugador2 = new Jugador(nombre2, 'O');

		// Configurar el tablero
		Tablero tablero = new Tablero(6, 7);
		boolean jugando = true;
		Jugador jugadorActual = jugador1;

		// Bucle principal del juego
		while (jugando) {
			tablero.dibujarTablero();

			// Mostrar el turno del jugador actual
			System.out.println("Turno de " + jugadorActual.getNombre() + " (" + jugadorActual.getFicha() + ")");
			int columna;
			boolean movimientoValido;

			do {
				// Pedir columna al usuario
				System.out.print("Elige una columna (0 a 6): ");
				columna = Leer.datoInt();

				// Validar movimiento
				movimientoValido = columna >= 0 && columna < 7
						&& tablero.colocarFicha(columna, jugadorActual.getFicha());
				if (!movimientoValido) {
					System.out.println("Columna inválida o llena. Intenta de nuevo.");
				}
			} while (!movimientoValido);

			// Comprobar si hay un ganador
			int[][] posicionesGanadoras = tablero.comprobarVictoriaExtendido(jugadorActual.getFicha());
			if (posicionesGanadoras != null) {
				tablero.dibujarTableroConGanador(posicionesGanadoras, jugadorActual.getFicha());
				System.out.println("¡" + jugadorActual.getNombre() + " ha ganado!");
				jugando = false;
			} else {
				// Cambiar al siguiente jugador
				jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
			}
		}

		System.out.println("Gracias por jugar a 4 en raya. ¡Hasta la próxima!");
	}

}
