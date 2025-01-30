package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Realizar un programa que simule un inicio de sesión leyendo por teclado el
		 * nombre del usuario y la contraseña y comprobando si esos coinciden con unos
		 * guardados en unas variables inicializadas por vosotros al comienzo del
		 * programa
		 */
		String usuario = "usuario";
		String contraseña = "contraseña";	
		String lecturaUsuario;
		String lecturaContraseña;
		
		
		System.out.println("Hola, en este programa vamos a "
				+ "ver si coincide tu usuario y contraseña");
		
		System.out.println("Dime tu usuario");
		lecturaUsuario = Leer.dato();
		
		System.out.println("Dime tu contraseña");
		lecturaContraseña = Leer.dato();
		
		if (lecturaUsuario.equalsIgnoreCase(usuario) && lecturaContraseña.equalsIgnoreCase(contraseña)) {
			System.out.println("Enhorabuena, has accedido al programa");
		} else {
			System.out.println("Credenciales incorrectas");
		}
	}
}
