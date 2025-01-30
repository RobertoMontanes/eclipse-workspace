package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Empleado e = new Empleado();
		Vendedor v = new Vendedor();
		Gerente g = new Gerente();
		Empleado e1 = new Empleado("Roberto", "Montañés", 120, 1);
		int numeroHorasTrabajadas = 0;
		double sueldoHora = 0;
		int opcion = 0;
		int comisionPorVenta = 0;
		double cantidadVentas;
		int impuestoPago = 0;
		Empleado [] listaEmpleados = {e1};
		System.out.println("Bienvenido a mi programa\n");

		do {
			System.out.println("Pulsa 0. para salir");
			System.out.println("Pulsa 1. para calcular tu sueldo base");
			System.out.println("Pulsa 2. para calcular sueldo Vendedor");
			System.out.println("Pulsa 3. para calcular sueldo Gerente");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 0:
				System.out.println("Saliendo del programa...");
				break;
			case 1:
				System.out.println("Calcular Sueldo Empleado");
				System.out.println("Dime el número de horas trabajadas al mes");
				numeroHorasTrabajadas = Leer.datoInt();
				System.out.println("Dime tu salario la hora");
				sueldoHora = Leer.datoDouble();

				e.setSueldoBase(e.calcularSueldoBase(numeroHorasTrabajadas, sueldoHora, 0, 0));
				System.out.println(e.getSueldoBase());
				break;
			case 2:
				System.out.println("Calcular Sueldo Vendedor");
				if (e.getSueldoBase() > 0) {
					System.out.println("Cuánta comisión recibes? (%)");
					comisionPorVenta = Leer.datoInt();
					System.out.println("Cuánto ha vendido? (€)");
					cantidadVentas = Leer.datoDouble();
					System.out.println("Tu sueldo con incentivos es de: " + (e.getSueldoBase()
							+ v.calcularSueldoBase(numeroHorasTrabajadas, sueldoHora, cantidadVentas, comisionPorVenta))
							+ "€");
				} else {
					System.out.println("Primero debes calcular tu sueldo base.");
				}
				break;
			case 3:
				System.out.println("Calcular Sueldo Gerente");
				if (e.getSueldoBase() > 0) {
					System.out.println("Cuánto impuestos pagas? (%)");
					impuestoPago = Leer.datoInt();
					System.out.println(g.calcularSueldoBase(0, 0, impuestoPago, 0));
				} else {
					System.out.println("Primero debes calcular tu sueldo base.\n");
				}
				break;

			default:
				System.out.println("Número Inválido. Seleccione otro número");
				break;
			}

		} while (opcion != 0);
	}

}
