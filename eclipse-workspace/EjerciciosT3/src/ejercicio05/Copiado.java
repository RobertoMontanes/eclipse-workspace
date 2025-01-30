package ejercicio05;


public class Copiado {

	/*
	 * Cuando era pequeño me mandaban a copiar determinadas frases cuando hacía algo
	 * mal para no olvidarlo. Realizar un programa que lea un texto del teclado y un
	 * número entero y muestre en pantalla dicho texto una cantidad de veces igual
	 * al número introducido. La clase se puede llamar "Copiado".
	 */	
	
	//Atributos
	private String texto;
	private int repeticiones;
	
	//Getters && Setters
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getRepeticiones() {
		return repeticiones;
	}
	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
		
	}
	
	//Metodo
	
	public String repetirTexto(String texto, int repeticiones) {
		String textoRepetido = "";
		while (repeticiones>0) {
			textoRepetido += texto;
			repeticiones--;
		}
		return textoRepetido;
		
		
		
	}
	
	
}
