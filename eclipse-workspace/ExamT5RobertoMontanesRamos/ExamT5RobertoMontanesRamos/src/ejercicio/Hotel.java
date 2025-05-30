package ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hotel {

	List<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();

	public Hotel(List<Habitacion> listaHabitaciones) {
		super();
		this.listaHabitaciones = listaHabitaciones;
	}

	public List<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(List<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	@Override
	public String toString() {
		return "Hotel [listaHabitaciones=" + listaHabitaciones + "]";
	}

	public void agregarHabitacion(Habitacion habitacion) {
		listaHabitaciones.add(habitacion);
	}

	public void borrarHabitacion(int numero) {

		for (Habitacion habitacion : listaHabitaciones) {
			if (habitacion.getNumeroHabitacion() == numero) {
				listaHabitaciones.remove(habitacion);
				break;
			}
		}
	}

	public void modificarOcupacionHabitacion(int numero) {
		for (Habitacion habitacion : listaHabitaciones) {
			if (habitacion.getNumeroHabitacion() == numero) {
				habitacion.setOcupada(!habitacion.isOcupada());

			}
		}
	}

	public void mostrarHabitaciones() {
		Iterator<Habitacion> it = listaHabitaciones.iterator();

		while (it.hasNext()) {
			Habitacion habitacion = (Habitacion) it.next();
			System.out.println(habitacion);
		}

	}

	public void mostrarHabitacionesOcupadas() {
		Iterator<Habitacion> it = listaHabitaciones.iterator();

		while (it.hasNext()) {
			Habitacion habitacion = (Habitacion) it.next();
			if (habitacion.isOcupada()) {
				System.out.println(habitacion);
			}
		}

	}

	public void buscarHabitacionPorNumero(int numero) {
		for (Habitacion habitacion : listaHabitaciones) {
			if (habitacion.getNumeroHabitacion() == numero) {
				System.out.println(habitacion);
			}
		}
	}

	public double calcularDineroRecaudado() {

		double suma = 0;
		for (Habitacion habitacion : listaHabitaciones) {
			if (habitacion.isOcupada()) {
				suma += habitacion.getPrecioBasico();

			}
		}
		return suma;

	}

}