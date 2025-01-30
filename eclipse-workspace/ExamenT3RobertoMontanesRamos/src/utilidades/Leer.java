package utilidades;

import java.io.*;

public class Leer {

	public static String dato() {
		String sdato = " ";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader flujoE = new BufferedReader(isr);
			sdato = flujoE.readLine();
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		return sdato;

	}

	public static int datoInt() {
		return Integer.parseInt(dato());
	}

	public static float datoFloat() {
		return Float.parseFloat(dato());
	}
//Leer un char por teclado

	public static char datoChar() {
		char c = ' ';
		try {
			java.io.BufferedInputStream b = new BufferedInputStream(System.in);
			c = (char) b.read();
		} catch (IOException e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
		return c;
	}

	public static long datoLong() {
		return Long.parseLong(dato());
	}

	public static short datoShort() {
		return Short.parseShort(dato());
	}

	public static double datoDouble() {
		return Double.parseDouble(dato());
	}

}
/*
* // Constructor para inicializar el array
public Gimnasio(int capacidad) {
    this.lista = new Cliente[capacidad];
    this.contador = 0;
}
*
* // Método para agregar un cliente
public void agregarCliente(Cliente cliente) {
    if (contador < lista.length) {
        lista[contador] = cliente;
        contador++;
    } else {
        System.out.println("El gimnasio está lleno, no se pueden añadir más clientes.");
    }
}

 // Método para mostrar la lista de clientes
public void mostrarLista() {
    if (contador == 0) {
        System.out.println("No hay clientes en el gimnasio.");
    } else {
        for (int i = 0; i < contador; i++) {
            System.out.println(lista[i].toString());
        }
    }
}
*/