package ejercicio;

import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator<Habitacion>{

	public OrdenarPorPrecio() {
		super();
	}

	@Override
	public int compare(Habitacion h1, Habitacion h2) {
		return Double.compare(h1.getPrecioBasico(), h2.getPrecioBasico());
	}
	
	
	
	
	

}
