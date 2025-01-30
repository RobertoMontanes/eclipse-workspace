package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

	//double litros;
	//double costegasolina = 1.51;
	//double total;
	//double consumo = 0.0;
		
	//System.out.println("El coste de la gasolina es "+costegasolina+"€/L");
	
	//System.out.println("Cuánto consume su coche por cada 100KM?");
	//consumo=Leer.datoDouble();
	
	//System.out.println("¿Cúantos euros quiere repostar de gasolina?");
	//litros = Leer.datoDouble();
	
	//total = litros/costegasolina;
	//System.out.printf("En total se respostará %.2f litros de gasolina",total);
	
	//System.out.println("\nCuántos KM piensa hacer");
		
		double consumokm, km, preciogasolina, litrosgasolina, consumototal, cien = 100;

		
		System.out.println("Hola, Vamos a calcular el consumo de gasolina del coche y que consumo supone");
		System.out.println("Ingrese el precio actual de la gasolina");
		preciogasolina = Leer.datoDouble();
		System.out.println("indique cual es su consumo cada 100km");
		consumokm = Leer.datoDouble();
		System.out.println("Ingrese la cantidad de kilometros que va a realizar");
		km = Leer.datoDouble();
		
		consumokm = consumokm/cien;
		litrosgasolina = consumokm*km;
		consumototal = litrosgasolina*preciogasolina;
		
		System.out.printf("El consumo de gasolina del viaje es %.2f, lo que supone un precio de",consumototal);
		System.out.println("\n¡Gracias por su visita!");
	}

}
