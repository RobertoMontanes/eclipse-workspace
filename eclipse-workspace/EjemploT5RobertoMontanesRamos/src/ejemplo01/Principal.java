package ejemplo01;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		Producto p1 = new Producto("Patata", 2.5, false);
		Producto p3 = new Producto("Helado oscuro", 1.20, true);
		Producto p4 = new Producto("Fanta", 1.5, false);
		Producto p5 = new Producto("Pasta de dientes", 4.5, true);
		
		List <Producto> listado = new ArrayList<Producto>();
		
		listado.add(p1);
		listado.add(p3);
		listado.add(p4);
		listado.add(p5);
		
		listado.add(0, p5);
		System.out.println(listado);
		
		listado.add(5, p5);
		System.out.println(listado);
		
		System.out.println(listado.get(5));
		
	}

}
