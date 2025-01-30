package ejercicio02_listado2;

public class Hotel {

	private Habitacion[] habitaciones;
	private int numHabitaciones; // Contador de habitaciones en el hotel

	public Hotel(int capacidad) {
		habitaciones = new Habitacion[capacidad]; // El tamaño del array es definido por la capacidad
		numHabitaciones = 0; // Inicialmente no hay habitaciones
	}

	public void agregarHabitacion(Habitacion habitacion) {
		if (numHabitaciones < habitaciones.length) {
			habitaciones[numHabitaciones] = habitacion; // Asignamos la habitación al array
			numHabitaciones++; // Incrementamos el contador
		}
	}

	public void mostrarHabitaciones() {
		if (numHabitaciones == 0) {
			System.out.println("No hay habitaciones registradas.");
		} else {
			for (int i = 0; i < numHabitaciones; i++) {
				System.out.println("Habitación " + i + ": " + habitaciones[i]);
			}
		}
	}

	public void mostrarHabitacionesDisponibles() {
		boolean hayDisponibles = false;
		for (int i = 0; i < numHabitaciones; i++) {
			if (!habitaciones[i].isOcupada()) {
				System.out.println("Habitación disponible: " + i);
				hayDisponibles = true;
			}
		}
		if (!hayDisponibles) {
			System.out.println("No hay habitaciones disponibles.");
		}
	}

	// Getter para acceder al array de habitaciones
	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}
}
