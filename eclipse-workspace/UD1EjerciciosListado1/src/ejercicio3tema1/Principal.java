package ejercicio3tema1;

public class Principal {

	public static void main(String[] args) {

	/*Crear un programa donde se declare una variable inicializada con un valor de 50 
	 * que será una cantidad de euros, y mostrar por pantalla su cambio a libras
	 *  esterlinas (moneda oficial del Reino Unido). Se debe tener otra variable cuyo
	 *   valor será el valor de 1 libra en euros y otra para guardar el resultado
(podéis buscar el cambio en internet).*/
		
		double CantidadEuro = 50.0;
		double ValorEuro = 1.0;
		double ValorLibra = 0.83;
		double traspasoLaE = 0.0;
		
		System.out.println("Hola, en este ejercicio vamos a "
				+ "ver como pasar de libras a euros");
		
		System.out.println("Tenemos que pasar 50€ a libras");
		traspasoLaE = CantidadEuro * ValorLibra;
		System.out.println("50€ son "+ traspasoLaE);
		
	}

}
