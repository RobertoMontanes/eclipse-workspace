package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Sobremesa sobremesa = new Sobremesa(1000, 3.5, 800, "HP", 100);
        System.out.println("Ordenador de Sobremesa:");
        sobremesa.mostrarInformacion();
        System.out.println("Precio de Venta: " + sobremesa.calcularPrecioVenta(20) + " €\n");

        // Crear un portátil
        Portatil portatil = new Portatil(512, 2.8, 1000, "Dell", true, 50);
        System.out.println("Ordenador Portátil:");
        portatil.mostrarInformacion();
        System.out.println("Precio de Venta: " + portatil.calcularPrecioVenta(15) + " €");
    }
}
