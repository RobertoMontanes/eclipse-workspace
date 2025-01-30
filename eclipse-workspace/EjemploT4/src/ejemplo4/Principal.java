package ejemplo4;

public class Principal {

	public static void main(String[] args) {
		
		Anfibio a = new Anfibio();
		Rana r = new Rana();
		Anfibio a2 = new Rana();
		IPresa ip = new Rana();
		IDepredador id2 = new Rana();
		
		Felino f = new Felino();
		Leon l = new Leon();
		Felino f2 = new Leon();
		IDepredador id = new Leon(); 
		
		Bovido b = new Bovido();
		Gacela g = new Gacela();
		Bovido b2 = new Gacela();
		IPresa ip2 = new Gacela();
		
		
		r.huir();
		r.observar();
		ip.huir();
		ip.observar();
		id2.cazar();
		id2.perseguir();
		System.out.println();
		
		l.cazar();
		l.perseguir();
		id.cazar();
		id.perseguir();
		System.out.println();
		
		g.huir();
		g.observar();
		ip2.huir();
		ip2.observar();
		System.out.println();
		
		
	}

}
