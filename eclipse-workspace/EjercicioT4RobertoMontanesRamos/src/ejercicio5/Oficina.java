package ejercicio5;

public class Oficina {

	private Empleado[] listaEmpleados;

	public double calcularSueldo(Empleado e, int ventas) {
		return e.calcularSueldoBase(ventas, ventas, ventas, ventas);
	}

	public double calcularGastos(int ventas) {
		double resul = 0;
		for (Empleado e : listaEmpleados) {
			resul += this.calcularSueldo(e, ventas);
		}
		return resul;
	}

}
