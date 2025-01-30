package ejercicio10V2.copy;

import java.util.Scanner;

public class Maquina {
    private double saldoTotal;
    private double precioTicket;
    private String contrasenaOperario = "admin123"; // Contraseña fija para el operario

    // Constructor
    public Maquina(double precioTicket) {
        this.precioTicket = precioTicket;
        this.saldoTotal = 0;
    }

    // Método para comprar billetes
    public Ticket comprarBilletes(int numeroPersonas, double dineroRecibido) {
        double total = precioTicket * numeroPersonas;
        if (dineroRecibido < total) {
            System.out.println("Dinero insuficiente.");
            return null;
        }

        saldoTotal += total;  // Sumar al saldo de la máquina
        double cambio = dineroRecibido - total;
        System.out.println("Billetes comprados para " + numeroPersonas + " personas.");
        System.out.println("Cambio a devolver: " + cambio);
        return new Ticket(precioTicket, numeroPersonas);
    }

    // Método para imprimir un ticket
    public void imprimirTicket(Ticket ticket) {
        if (ticket != null) {
            ticket.imprimir();
        } else {
            System.out.println("No se ha realizado ninguna compra.");
        }
    }

    // Método para ver el saldo total de la máquina
    public void verSaldoTotal() {
        System.out.println("Saldo total recaudado: " + saldoTotal);
    }

    // Método para poner a cero el saldo total
    public void resetearSaldo() {
        saldoTotal = 0;
        System.out.println("Saldo total reiniciado.");
    }

    // Método para cambiar el precio del billete
    public void cambiarPrecio(double nuevoPrecio) {
        precioTicket = nuevoPrecio;
        System.out.println("Nuevo precio del billete: " + precioTicket);
    }

    // Método para comprobar la contraseña del operario
    public boolean comprobarContrasena(String contrasena) {
        return contrasena.equals(contrasenaOperario);
    }
}
