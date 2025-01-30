package ejemplo4;

public class Leon extends Felino implements IDepredador {

	@Override
	public void cazar() {
		System.out.println("Te miro y te cazo");
		
	}

	@Override
	public void perseguir() {
		System.out.println("Te persigo con sigilo");
		
	}

	
}
