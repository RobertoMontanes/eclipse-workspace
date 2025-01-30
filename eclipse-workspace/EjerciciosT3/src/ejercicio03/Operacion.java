package ejercicio03;

public class Operacion {


  
    public boolean calcularPositivo(int numero) {
    	boolean res;
    	if (numero>=0) {
         	res = true;
 			
 		}else {
 			res = false;
 		}
    	return res;
     }
    
    
    public void imprimirResultado(boolean res) {
    	if (res) {
			System.out.println("El número es positivo");
		}else {
			System.out.println("El número es negativo");
		}
    }
    
    public String esParOImpar(int numero) {
    	boolean resul;
    	if (numero % 2 == 0) {
			return "PAR";
		}else {
			return "IMPAR";
		}
    	
    }
}
