package ejercicio3;

public class Furgonetas extends Vehiculo {

	private boolean transportaMercancias;

	public Furgonetas(String categoriaEmisiones, double impuestoBase, boolean transportaMercancias) {
		super(categoriaEmisiones, impuestoBase);
		this.transportaMercancias = transportaMercancias;
	}

	public boolean isTransportaMercancias() {
		return transportaMercancias;
	}

	public void setTransportaMercancias(boolean transportaMercancias) {
		this.transportaMercancias = transportaMercancias;
	}

	@Override
	public String toString() {
		return "Furgonetas [transportaMercancias=" + transportaMercancias + "]";
	}

	public double calcularImpuesto() {
		double impuestoTransporteMercancias = 200.0;
		if (transportaMercancias == true) {
			return getImpuestoBase()+impuestoTransporteMercancias;
		}else {
			return getImpuestoBase();
		}
		
	}
	
}
