package ejercicio2interfaces;

public class Trabajador implements IImpuesto {

	private int irpf;

	@Override
	public String toString() {
		return "Trabajador [irpf=" + irpf + "]";
	}

	public int getIrpf() {
		return irpf;
	}

	public void setIrpf(int irpf) {
		this.irpf = irpf;
	}

	public Trabajador(int irpf) {
		super();
		this.irpf = irpf;
	}

	@Override
	public double calculoIva(double precio, int iva) {
		return 0;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		return sueldo *irpf/100;
	}

}
