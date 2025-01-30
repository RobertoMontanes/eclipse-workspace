package ejemplo1;

public class Empleado extends Trabajador{

	private double sueldo;
	private double impuesto;
	
	public Empleado(String nombre, String puesto, double sueldo, double impuesto) {
		super(nombre, puesto);
		this.sueldo = sueldo;
		this.impuesto = impuesto;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuesto=" + impuesto + "]";
	}

	public double calcularPaga(double base) {
		return super.calcularPaga(base)+sueldo - impuesto;
	}
	

	
	
	
}
