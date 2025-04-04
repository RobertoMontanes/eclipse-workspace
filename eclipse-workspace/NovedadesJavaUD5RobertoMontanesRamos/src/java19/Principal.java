package java19;

public class Principal {

	public static void main(String[] args) {

		/*
		 * 🔹 Explicación 
		 * 
		 * record Punto(int x, int y) {} → Define un record Punto con dos
		 * atributos.
		 * 
		 * instanceof Punto(int x, int y) → Si obj es una instancia de Punto, extrae
		 * automáticamente x e y.
		 * 
		 * La impresión funciona solo si el objeto es un Punto. Si no, simplemente se
		 * ignora.
		 */
		Punto punto1 = new Punto(3, 5);
		Punto punto2 = new Punto(-2, 8);
		String texto = "No soy un punto";

		imprimir(punto1); // ✅ Debe imprimir: Punto en (3, 5)
		imprimir(punto2); // ✅ Debe imprimir: Punto en (-2, 8)
		imprimir(texto); // ❌ No hace nada, porque no es un Punto
	}

	static void imprimir(Object obj) {
		if (obj instanceof Punto(int x, int y)) {
			System.out.println("Punto en (" + x + ", " + y + ")");
		}
	}

}
