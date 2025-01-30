package ejemplo4;

public class Gacela extends Bovido implements IPresa{

	@Override
	public void observar() {
		System.out.println("Observo soy gacela");
		
	}

	@Override
	public void huir() {

		System.out.println("Huyo como una gacela");
		
	}

	
	
}
