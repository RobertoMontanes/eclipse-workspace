package ejercicio2;

public class TarjetaVisita extends Documento {

	private int telefono;
	private String nombre;
	private String residencia;
	private double sueldo;

	public TarjetaVisita(String nombreEmpresa, int codigoEmpresa, double facturacionEmpresa, int telefono,
			String nombre, String residencia, double sueldo) {
		super(nombreEmpresa, codigoEmpresa, facturacionEmpresa);
		this.telefono = telefono;
		this.nombre = nombre;
		this.residencia = residencia;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "TarjetaVisita [telefono=" + telefono + ", nombre=" + nombre + ", residencia=" + residencia + ", sueldo="
				+ sueldo + "]";
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void imprimirCarta() {
		super.imprimirCarta();
		System.out.println("Teléfono: " + getTelefono());
		System.out.println("Nombre: " + getNombre());
		System.out.println("Residencia: " + getResidencia());
		System.out.println("Sueldo: " + getSueldo());
	}

}
