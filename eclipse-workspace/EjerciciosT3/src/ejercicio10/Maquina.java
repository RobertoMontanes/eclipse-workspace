package ejercicio10;

public class Maquina {

	private double cantBilletes;
	private double saldoTotal;
	private String contrasenaOperario;
	private Ticket t;

	@Override
	public String toString() {
		return "Maquina [cantBilletes=" + cantBilletes + ", saldoTotal=" + saldoTotal + ", contrasenaOperario="
				+ contrasenaOperario + ", t=" + t + "]";
	}

	public double getCantBilletes() {
		return cantBilletes;
	}

	public void setCantBilletes(double cantBilletes) {
		this.cantBilletes = cantBilletes;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public String getContrasenaOperario() {
		return contrasenaOperario;
	}

	public void setContrasenaOperario(String contrasenaOperario) {
		this.contrasenaOperario = contrasenaOperario;
	}

	public Ticket getT() {
		return t;
	}

	public void setT(Ticket t) {
		this.t = t;
	}

	public Maquina(double cantBilletes, double saldoTotal, String contrasenaOperario, Ticket t) {
		super();
		this.cantBilletes = cantBilletes;
		this.saldoTotal = saldoTotal;
		this.contrasenaOperario = contrasenaOperario;
		this.t = t;
	}

	public double calcularLineaVenta() {
		return cantBilletes*t.calcularPrecio();
	}

	public void agregarRecaudación() {
		saldoTotal+=saldoTotal+calcularLineaVenta();
		
	}
}
