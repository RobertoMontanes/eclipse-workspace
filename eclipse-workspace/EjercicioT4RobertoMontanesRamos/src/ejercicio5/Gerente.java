package ejercicio5;

public class Gerente extends Empleado {

	public double calcularSueldoBase(int horasTrabajadas, double sueldoHora, double incentivo, int cantidadVentas) {
		double total; 
		total = super.getSueldoBase()- super.getSueldoBase() * incentivo / 100;
		 return total;
	}
}
