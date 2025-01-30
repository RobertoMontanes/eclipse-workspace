package ejercicio2interfaces;

public class Principal {

	public static void main(String[] args) {
		
		Producto p = new Producto("CoCaCoLa", 12);
		Producto p3 = new Alimentacion("Croquetas", 1.20, true);
		IImpuesto ii = new Producto("fritos", 5);
		
		
		System.out.println(p3.calcularPVP(21));
		System.out.println(p3.calculoIrpf(1200));
	}

}
