package ejercicio3;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Motocicletas m = new Motocicletas("ECO", 2000, 125);
		Coches c = new Coches("Cero emisiones", 2000, 200);
		Furgonetas f = new Furgonetas("Tipo C", 2000, true);
		int opcion;
		
		System.out.println("Bienvenido a mi programa\n\n");
		System.out.println("El impuesto Base para los vehículos de motor es de 2000€\n");

		System.out.println("Pulsa 1. si tienes una motocicleta");
		System.out.println("Pulsa 2. si tienes un coche");
		System.out.println("Pulsa 3. si tienes una furgoneta");
		opcion = Leer.datoInt();

		switch (opcion) {
			case 1:
				System.out.println("Tu moto al tener "+m.getCilindradas()+ " cilindradas y tener un tipo de emisión "+ m.getCategoriaEmisiones());
				System.out.println("Tienes que pagar: "+(m.getImpuestoBase()+ m.calcularImpuesto() + "€"));
				break;
			case 2:
				System.out.println("Tu coche al tener "+c.getPotencia()+ " Caballos de potencia y tener un tipo de emisión "+ c.getCategoriaEmisiones());
				System.out.println("Tienes que pagar: "+(c.getImpuestoBase()+ c.calcularImpuesto() + "€"));
				
				break;
			case 3:
				if (f.isTransportaMercancias() == true) {
				System.out.println("Los impuestos por transporte de mercancías son de 200€ y tener un tipo de emisión "+ f.getCategoriaEmisiones());
				System.out.println("Tienes que pagar: "+(f.calcularImpuesto() + "€"));

				}else {
					System.out.println("Tú furgoneta no tiene impuestos por transporte de mercancias y tener un tipo de emisión "+ f.getCategoriaEmisiones());
					System.out.println("Tienes que pagar: " + f.getImpuestoBase()+ " €");
				}
				break;
			default:
				System.out.println("Número Inválido");
				break;
		}
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("Gracias por usar mi programa");

	}

}
