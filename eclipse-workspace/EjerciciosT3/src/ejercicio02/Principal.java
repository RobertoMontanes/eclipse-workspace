package ejercicio02;

public class Principal {
    public static void main(String[] args) {
        
    	// Crear un objeto de la clase Circulo y mostrar su área
        Circulo circulo = new Circulo(2.4);
        System.out.println("Área en cm²: " + circulo.calcularAreaCm2());
        System.out.println("Área en m²: " + circulo.calcularAreaM2());
                   
    }
}
