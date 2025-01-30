package ejercicio03;

public class Principal {
    public static void main(String[] args) {
        
    	int numero = 5;
        Operacion o = new Operacion();
        
        
        System.out.println("Has seleccionado el número "+numero);
        o.imprimirResultado(o.calcularPositivo(numero));
        System.out.println("El número seleccionado es " + o.esParOImpar(numero));
    }
}
