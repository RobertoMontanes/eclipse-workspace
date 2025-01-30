package ejercicio;

import java.util.Arrays;

public class Taquilla {

	EntradaNormal listaEntradas[];
	EntradaNormal e;
	
	public Taquilla(EntradaNormal[] listaEntradas, EntradaNormal e) {
		super();
		this.listaEntradas = listaEntradas;
		this.e = e;
	}

	@Override
	public String toString() {
		return "Taquilla [listaEntradas=" + Arrays.toString(listaEntradas) + ", e=" + e + "]";
	}

	public EntradaNormal[] getListaEntradas() {
		return listaEntradas;
	}

	public void setListaEntradas(EntradaNormal[] listaEntradas) {
		this.listaEntradas = listaEntradas;
	}

	public EntradaNormal getE() {
		return e;
	}

	public void setE(EntradaNormal e) {
		this.e = e;
	}

	public void buscarPorZonaAsiento() {
		for (int i = 0; i < listaEntradas.length; i++) {
			if (listaEntradas[i].getZonaAsiento() == 2) {
				System.out.println(i + "" + listaEntradas[i]+"\n");
			}
		}
	}

	public double recaudadoEntradasGrupo(int zonaAsiento, double descuento) {
		double total = 0.0;
		for (int i = 0; i < listaEntradas.length; i++) {
			total += listaEntradas[i].calcularPrecioEntrada(zonaAsiento, descuento, i);
		}
		return total;
	}

	public double recaudadoEntradasZona2(int zonaAsiento, double descuento, double costoAdicional) {
		double total = 0.0;
		for (int i = 0; i < listaEntradas.length; i++) {
			total += listaEntradas[i].calcularPrecioEntrada(zonaAsiento, descuento, costoAdicional);
		}
		return total;
	}
}
