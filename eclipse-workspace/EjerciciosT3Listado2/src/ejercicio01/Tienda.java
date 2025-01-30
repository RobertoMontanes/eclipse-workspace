package ejercicio01;

public class Tienda {

	private Producto[] lista;

	public Tienda(Producto[] productos) {
		this.lista = productos;
	}

	public void listarTodos() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				System.out.println(lista[i]);
			}
		}
	}

	public boolean comprobarFragil(int id) {
		for (Producto producto : lista) {
			if (producto != null && producto.getId() == id) {
				return producto.isFragil();
			}
		}
		return false;
	}

	public void imprimirFragil(int id) {
		if (comprobarFragil(id)) {
			System.out.println("Es frágil");

		} else {
			System.out.println("No es frágil");
		}
	}

	public void añadirProducto(Producto producto) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				lista[i] = producto;
				System.out.println("Producto añadido correctamente.");
				return;
			}
		}
		System.out.println("No hay espacio disponible para añadir más productos.");
	}

	public double calcularInversionTotal() {
		double total = 0;
		for (Producto producto : lista) {
			if (producto != null) {
				total += producto.getPrecioFabrica();
			}
		}
		return total;
	}

	public double calcularPVP(double porcentaje) {
		double totalPVP = 0;
		for (Producto producto : lista) {
			if (producto != null) {
				double precioCoste = producto.calcularPrecioCoste(porcentaje);
				totalPVP += precioCoste + (precioCoste * porcentaje / 100);
			}
		}
		return totalPVP;
	}

	public double calcularGanancias(double porcentaje) {
		double inversion = calcularInversionTotal();
		double totalPVP = calcularPVP(porcentaje);
		return totalPVP - inversion;
	}

	public Producto[] buscarByNombre(String nombre) {
		Producto[] aux = new Producto[lista.length];
		for (int i = 0; i < lista.length - 1; i++) {
			if (lista[i].getNombre().equalsIgnoreCase(nombre)) {
				aux[i] = lista[i];
			}
		}
		return aux;

	}

}