package ejemplo4;

public class Rana extends Anfibio implements IPresa, IDepredador {

	@Override
	public void observar() {
		System.out.println("Rana mirando 360ª");
	}

	@Override
	public void huir() {
		System.out.println("Salto triple");
	}

	@Override
	public void cazar() {
		System.out.println("Te cazo de un lenguetazo");
		
	}

	@Override
	public void perseguir() {
		System.out.println("Te persigo a saltitos, soy una rana");
		
	}

}
