package ejercicioexamen;

import java.util.HashSet;
import java.util.Set;


public class Oficina {
	
	Set<Trastero> listaTrasteros = new HashSet<Trastero>();

	public Oficina(Set<Trastero> listaTrasteros) {
		super();
		this.listaTrasteros = listaTrasteros;
	}

	public Set<Trastero> getListaTrasteros() {
		return listaTrasteros;
	}

	public void setListaTrasteros(Set<Trastero> listaTrasteros) {
		this.listaTrasteros = listaTrasteros;
	}

	@Override
	public String toString() {
		return "Oficina [listaTrasteros=" + listaTrasteros + "]";
	}
	
	public void agregarTrastero(Trastero t) {
		listaTrasteros.add(t);
	}
	

	
	public void mostrarTrasteros() {
		for (Trastero trastero : listaTrasteros) {
			System.out.println(trastero);
		}
	}
	
	public Set<Trastero> buscarPorPrecio(double precio){
		Set<Trastero> buscarPorPrecio = new HashSet<Trastero>();
		
		for (Trastero trastero : listaTrasteros) {
			if (trastero.getPrecio() == precio) {
				buscarPorPrecio.add(trastero);
			}
		}
		return buscarPorPrecio;
}
}