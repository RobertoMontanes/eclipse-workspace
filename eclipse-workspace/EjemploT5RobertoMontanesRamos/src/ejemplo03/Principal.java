package ejemplo03;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		Set<Alumno> listado = new HashSet<Alumno>();
		listado.add(new Alumno("Roberto", "78252199N", 8));
		listado.add(new Alumno("Mara", "65498798F", 4));
		listado.add(new Alumno("Hongchan", "39875432S", 6));
		Secretaria2 s2 = new Secretaria2(listado);
		
		s2.imprimirLista();
						
	}
}
