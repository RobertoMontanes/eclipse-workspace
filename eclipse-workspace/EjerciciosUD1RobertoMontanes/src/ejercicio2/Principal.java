package ejercicio2;


public class Principal {

	public static void main(String[] args) {

	double PisOliLar=50;
	double PisOliAnc=21;
	double PisOliPro=2.50;
	double profundidadCir=1.80, radio=12.0, exp=2.0;
	double precioagua=1.80;
	double Volu=PisOliLar*PisOliAnc*PisOliPro;
	double precioFinal=Volu*precioagua;
	double VoluCir=0.0;
	double precioFinalCir=0.0;
				
	System.out.println("Hola, hoy veremos cómo calcular el precio para llenar unas piscinas de diferente tamaño\n");
	
	
	System.out.println("Piscina Olímpica");
				
	System.out.println("La piscina tiene "+ Volu +" m2");
	System.out.println("Rellenar la piscina olímpica cuesta en total "+ precioFinal +" €");	
	
	
	System.out.println("\nPiscina Circular");
	VoluCir=profundidadCir*Math.PI*Math.pow(radio, exp);
	System.out.println("la piscina circular tiene "+ VoluCir +" m2");
	System.out.printf("El volumen es: %.2f metros cúbicos \n", VoluCir);
	
	
	
	precioFinalCir=VoluCir*precioagua;
	
	System.out.printf("A pagar: %.2f €", precioFinalCir);
	System.out.println("\nGracias por su visita");
	}

}
