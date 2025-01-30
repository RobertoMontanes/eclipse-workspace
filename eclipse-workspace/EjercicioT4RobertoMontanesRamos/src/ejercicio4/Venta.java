package ejercicio4;

public class Venta {

    private LineaVenta[] lineasVenta;
    private int contador;

    public Venta(int maxProductos) {
        lineasVenta = new LineaVenta[maxProductos];
        contador = 0;
    }

    public void agregarLineaVenta(LineaVenta linea) {
        if (contador < lineasVenta.length) {
            lineasVenta[contador] = linea;
            contador++;
        } else {
            System.out.println("No se pueden agregar más productos a la venta.");
        }
    }

    public void imprimirTicket() {
        double total = 0.0;
        System.out.println("----- TICKET DE COMPRA -----");
        for (int i = 0; i < contador; i++) {
            System.out.println(lineasVenta[i]);
            total += lineasVenta[i].calcularTotal();
        }
        System.out.println("----------------------------");
        System.out.println("Total: " + total);
    }

    public void listarProductos() {
        System.out.println("----- LISTA DE PRODUCTOS -----");
        
        for (int i = 0; i < contador; i++) {
            System.out.println(lineasVenta[i]);
            if (lineasVenta[i].getP1() instanceof Alimentacion) {
                ((Alimentacion) lineasVenta[i].getP1()).avisoCaducidad(2);
                
            }
        }
    }
}
