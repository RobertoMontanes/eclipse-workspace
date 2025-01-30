package cuatroenraya;

public class Tablero {
	private char[][] tablero;
	private int filas;
	private int columnas;

	public Tablero(int filas, int columnas) {
		this.filas = filas;
		this.columnas = columnas;
		this.tablero = new char[filas][columnas];
		inicializarTablero();
	}

	private void inicializarTablero() {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				tablero[i][j] = ' ';
			}
		}
	}

	public void dibujarTablero() {
		System.out.print("    ");
		for (int col = 0; col < columnas; col++) {
			System.out.print(" " + col + "  ");
		}
		System.out.println();

		System.out.print("   ╔");
		for (int col = 0; col < columnas - 1; col++) {
			System.out.print("═══╦");
		}
		System.out.println("═══╗");

		for (int fila = 0; fila < filas; fila++) {
			System.out.print(" " + fila + " ║");
			for (int col = 0; col < columnas; col++) {
				System.out.print(" " + tablero[fila][col] + " ║");
			}
			System.out.println();

			if (fila < filas - 1) {
				System.out.print("   ╠");
				for (int col = 0; col < columnas - 1; col++) {
					System.out.print("═══╬");
				}
				System.out.println("═══╣");
			}
		}

		System.out.print("   ╚");
		for (int col = 0; col < columnas - 1; col++) {
			System.out.print("═══╩");
		}
		System.out.println("═══╝");
	}

	public boolean colocarFicha(int columna, char ficha) {
		for (int i = filas - 1; i >= 0; i--) {
			if (tablero[i][columna] == ' ') {
				tablero[i][columna] = ficha;
				return true;
			}
		}
		return false;
	}

	public int[][] comprobarVictoriaExtendido(char ficha) {
		// Comprobar filas (horizontal)
		for (int fila = 0; fila < filas; fila++) {
			for (int col = 0; col < columnas - 3; col++) {
				if (tablero[fila][col] == ficha && tablero[fila][col + 1] == ficha && tablero[fila][col + 2] == ficha
						&& tablero[fila][col + 3] == ficha) {
					return new int[][] { { fila, col }, { fila, col + 1 }, { fila, col + 2 }, { fila, col + 3 } };
				}
			}
		}

		// Comprobar columnas (vertical)
		for (int col = 0; col < columnas; col++) {
			for (int fila = 0; fila < filas - 3; fila++) {
				if (tablero[fila][col] == ficha && tablero[fila + 1][col] == ficha && tablero[fila + 2][col] == ficha
						&& tablero[fila + 3][col] == ficha) {
					return new int[][] { { fila, col }, { fila + 1, col }, { fila + 2, col }, { fila + 3, col } };
				}
			}
		}

		// Comprobar diagonales descendentes (\)
		for (int fila = 0; fila < filas - 3; fila++) {
			for (int col = 0; col < columnas - 3; col++) {
				if (tablero[fila][col] == ficha && tablero[fila + 1][col + 1] == ficha
						&& tablero[fila + 2][col + 2] == ficha && tablero[fila + 3][col + 3] == ficha) {
					return new int[][] { { fila, col }, { fila + 1, col + 1 }, { fila + 2, col + 2 },
							{ fila + 3, col + 3 } };
				}
			}
		}

		// Comprobar diagonales ascendentes (/)
		for (int fila = 3; fila < filas; fila++) {
			for (int col = 0; col < columnas - 3; col++) {
				if (tablero[fila][col] == ficha && tablero[fila - 1][col + 1] == ficha
						&& tablero[fila - 2][col + 2] == ficha && tablero[fila - 3][col + 3] == ficha) {
					return new int[][] { { fila, col }, { fila - 1, col + 1 }, { fila - 2, col + 2 },
							{ fila - 3, col + 3 } };
				}
			}
		}

		return null; // No hay victoria
	}

	public void dibujarTableroConGanador(int[][] posicionesGanadoras, char ficha) {
		char[][] tableroTemp = new char[filas][columnas];
		for (int i = 0; i < filas; i++) {
			System.arraycopy(tablero[i], 0, tableroTemp[i], 0, columnas);
		}

		for (int[] pos : posicionesGanadoras) {
			int fila = pos[0];
			int col = pos[1];
			tableroTemp[fila][col] = '╳'; // Marcar ganadoras
		}

		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				dibujarTablero();
			} else {
				dibujarTableroConFichas(tableroTemp);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		dibujarTableroConFichas(tableroTemp);
	}

	private void dibujarTableroConFichas(char[][] tableroTemp) {
		System.out.print("    ");
		for (int col = 0; col < columnas; col++) {
			System.out.print(" " + col + "  ");
		}
		System.out.println();

		System.out.print("   ╔");
		for (int col = 0; col < columnas - 1; col++) {
			System.out.print("═══╦");
		}
		System.out.println("═══╗");

		for (int fila = 0; fila < filas; fila++) {
			System.out.print(" " + fila + " ║");
			for (int col = 0; col < columnas; col++) {
				System.out.print(" " + tableroTemp[fila][col] + " ║");
			}
			System.out.println();

			if (fila < filas - 1) {
				System.out.print("   ╠");
				for (int col = 0; col < columnas - 1; col++) {
					System.out.print("═══╬");
				}
				System.out.println("═══╣");
			}
		}

		System.out.print("   ╚");
		for (int col = 0; col < columnas - 1; col++) {
			System.out.print("═══╩");
		}
		System.out.println("═══╝");
	}
}
