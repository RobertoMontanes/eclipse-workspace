package ejercicioexamen2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Club {

	List<Socio> listaSocios = new ArrayList<Socio>();

	public Club(List<Socio> listaSocios) {
		super();
		this.listaSocios = listaSocios;
	}

	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	@Override
	public String toString() {
		return "Club [listaSocios=" + listaSocios + "]";
	}

	public void agregarSocio(Socio s) {
	    listaSocios.add(s);
	}

	public void mostrarSocios() {		
			for (Socio socio : listaSocios) {
				System.out.println(socio);
			}
		
	}
	public List<Socio> buscarSociosPorPagoMensualidad(double mensualidad){
		List<Socio> buscarPorPago = new ArrayList<Socio>();
		
		for (Socio socio : listaSocios ) {
			if (socio.getMensualidad() == mensualidad) {
				buscarPorPago.add(socio);
			}
		}
		return buscarPorPago;
	}
	
	public List<Socio> buscarSociosPorNombre(String nombre){
		List<Socio> buscarPorNombre = new ArrayList<Socio>();
		for (Socio socio : listaSocios) {
			if (socio.getNombre() == nombre) {
				buscarPorNombre.add(socio);
			}
		}
		return buscarPorNombre;
	}

}

