package ejercicio;

public class Pasteleria {

    private Magdalena[] lista;
    private int contador;

    public Pasteleria(int capacidad) {
        lista = new Magdalena[capacidad];
        contador = 0;
    }

    public void agregarMagdalena(Magdalena magdalena) {
        if (contador < lista.length) {
            lista[contador] = magdalena;
            contador++;
        } else {
            System.out.println("No puedes añadir más magdalenas, el array está lleno.");
        }
    }

    public void mostrarLista() {
        if (contador == 0) {
            System.out.println("No hay magdalenas.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(lista[i].toString());
            }
        }
    }

    public void buscarPorSabor(String sabor) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (lista[i].getSabor().equalsIgnoreCase(sabor)) {
                System.out.println(lista[i].toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron magdalenas de sabor " + sabor);
        }
    }

    public void buscarPorId(int id) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (lista[i].getId() == id) {
                System.out.println(lista[i].toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ninguna magdalena con ID " + id);
        }
    }

    public double calcularMediaVolumen() {
        if (contador == 0) {
            System.out.println("No hay magdalenas para calcular la media.");
            return 0;
        }
        double sumaVolumen = 0;
        for (int i = 0; i < contador; i++) {
            sumaVolumen += lista[i].getVolumenMasa();
        }
        return sumaVolumen / contador;
    }

    public double calcularPrecioCoste() {
        double precioTotal = 0;
        for (int i = 0; i < contador; i++) {
            precioTotal += lista[i].getVolumenMasa() * 0.05; // Asumimos que 1 cm3 = 0.05 de coste
        }
        return precioTotal;
    }

    public void mostrarCupcakes() {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (lista[i].isCupcake()) {
                System.out.println(lista[i].toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay cupcakes en la lista.");
        }
    }
}
