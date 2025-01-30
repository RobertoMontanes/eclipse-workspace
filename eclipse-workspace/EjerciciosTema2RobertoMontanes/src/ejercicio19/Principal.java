package ejercicio19;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		 double sueldoFijo;
	        double ventasTotales;
	        double comision;
	        double salarioTotal;

	        System.out.print("Ingrese el sueldo fijo mensual del vendedor: ");
	        sueldoFijo = Leer.datoDouble();

	        System.out.print("Ingrese el total de ventas realizadas en el mes: ");
	        ventasTotales = Leer.datoDouble();

	        comision = ventasTotales * 0.20;

	        salarioTotal = sueldoFijo + comision;

	        System.out.printf("El salario total del vendedor es: %.2f €\n", salarioTotal);
	        System.out.printf("Desglose:\n- Sueldo fijo: %.2f €\n- Comisión por ventas: %.2f €\n", sueldoFijo, comision);
	    }
	
		
	}


