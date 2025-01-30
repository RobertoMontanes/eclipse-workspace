package ejercicio6;


public class Principal {

	public static void main(String[] args) {

		
		double precioproducto = 20.0;
		double descuento = 15.0;
		double descuentofinal = 0.0;
		double total;		
		double cien = 100;
		System.out.println("Buenos días, en este programa vamos a hacer el descuento de diferentes productos");
		
		System.out.println("El precio del producto es "+precioproducto+"€");
		
		System.out.println("El descuento aplicado al producto es del "+descuento+"%");
		descuentofinal=(precioproducto*descuento)/cien;
		
		total=precioproducto-descuentofinal;
		System.out.println("El precio final con el descuento aplicado es de "+total+"€");
		
		
		
	}

}
