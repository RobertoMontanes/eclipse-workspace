package ejercicio03;

import java.util.Arrays;

public class Gimnasio {

	private Cliente[] lista;
    private int contador;	

	@Override
	public String toString() {
		return "Gimnasio [lista=" + Arrays.toString(lista) + ", contador=" + contador + "]";
	}

	public Cliente[] getLista() {
		return lista;
	}
	
	public Gimnasio(int capacidad) {
		lista = new Cliente[capacidad];
		contador = 0;
	}
	

	public void setLista(Cliente[] lista) {
		this.lista = lista;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public Gimnasio(Cliente[] lista, int contador) {
		super();
		this.lista = lista;
		this.contador = contador;
	}

	public void mostrarLista() {
		for (int i = 0; i < contador ; i++) {
			System.out.println(lista[i]);
			
		}
	}
	public void agregarClientes(Cliente cliente) {
		for (int i = 0; i < lista.length; i++) {
			if (contador < lista.length) {
				lista[contador] = cliente;
				contador++;
			}else {
				System.out.println("El gimnasio está lleno, no se pueden añadir mas clientes");
			}
		}
	}

}
