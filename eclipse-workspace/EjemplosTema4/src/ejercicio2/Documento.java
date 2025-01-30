package ejercicio2;

public class Documento {

	private String nombreEmpresa;
	private int codigoEmpresa;
	private double facturacionEmpresa;

	public Documento(String nombreEmpresa, int codigoEmpresa, double facturacionEmpresa) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.codigoEmpresa = codigoEmpresa;
		this.facturacionEmpresa = facturacionEmpresa;
	}

	@Override
	public String toString() {
		return "Documento [nombreEmpresa=" + nombreEmpresa + ", codigoEmpresa=" + codigoEmpresa
				+ ", facturacionEmpresa=" + facturacionEmpresa + "]";
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public double getFacturacionEmpresa() {
		return facturacionEmpresa;
	}

	public void setFacturacionEmpresa(double facturacionEmpresa) {
		this.facturacionEmpresa = facturacionEmpresa;
	}

	public void imprimirCarta() {
		System.out.println("Nombre de Empresa: " + getNombreEmpresa());
		System.out.println("Código de Empresa: " + getCodigoEmpresa());
		System.out.println("Facturación de Empresa: " + getFacturacionEmpresa());

	}
}
