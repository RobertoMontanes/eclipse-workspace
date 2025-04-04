package java13;

public class Principal {

	public static void main(String[] args) {

		//Antes de Java 13 
			String json = "{\n" +
		              "    \"nombre\": \"Roberto\",\n" +
		              "    \"edad\": 20\n" +
		              "}";
		System.out.println(json);

		//En Java 13 y posteriores con el uso de Text blocks
	

			String json2 = """
			    {
			        "nombre": "Juan",
			        "edad": 15
			    }
			    """;
			System.out.println(json2);

	
	}

}
