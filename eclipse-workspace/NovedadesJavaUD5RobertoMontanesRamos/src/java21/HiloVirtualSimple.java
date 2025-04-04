package java21;

public class HiloVirtualSimple {
	public static void main(String[] args) throws InterruptedException {

		/*
		 * ✅ ¿Qué hace este código?
		 * 
		 * Crea un hilo virtual con Thread.ofVirtual().start().
		 * 
		 * El hilo imprime un mensaje junto con su nombre.
		 * 
		 * hilo.join(); espera a que termine antes de cerrar el programa.
		 * 
		 * Los hilos virtuales no bloquean el sistema operativo, por lo que son más
		 * eficientes que los hilos tradicionales.
		 */

		// Crear un hilo virtual y ejecutarlo
		Thread hilo = Thread.ofVirtual()
				.start(() -> System.out.println("¡Hola desde un hilo virtual! " + Thread.currentThread()));

		// Esperar a que el hilo termine
		hilo.join();
	}
	
	
	
}