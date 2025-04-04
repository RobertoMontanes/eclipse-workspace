package ejemplotrycatch;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num;
		double den;
		double res = 0;
		String aux;

		try {
			System.out.println("Diga el numerador:");
			aux = sc.nextLine();
			num = Double.parseDouble(aux);

			System.out.println("Diga el denominador:");
			aux = sc.nextLine();
			den = Double.parseDouble(aux);

			if (den == 0) {
				throw new ArithmeticException("El denominador no puede ser cero");
			}

			res = num / den;
			System.out.printf("La división es: %.2f", res);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Deben ser números");
		}
	}
}
