package ejercicio02_listado2;

public class Habitacion {
    private String tipo;
    private double precioBase;
    private String serviciosExtra;
    private String clienteAsignado;
    private int diasContratados;
    private boolean estaLimpia;
    private boolean estaOcupada;
    private double consumoMinibar;

    public Habitacion(String tipo, double precioBase, String serviciosExtra) {
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.serviciosExtra = serviciosExtra;
        this.estaLimpia = true;
        this.estaOcupada = false;
        this.consumoMinibar = 0.0;
    }

    public void asignarCliente(String cliente, int dias) {
        this.clienteAsignado = cliente;
        this.diasContratados = dias;
        this.estaOcupada = true;
    }

    public void limpiarHabitacion() {
        this.estaLimpia = true;
    }

    public void registrarConsumoMinibar(double consumo) {
        this.consumoMinibar += consumo;
    }

    public boolean isOcupada() {
        return estaOcupada;
    }

    public double calcularPrecioFinal() {
        return (precioBase * diasContratados) + consumoMinibar;
    }

    public String generarFactura() {
        return "Cliente: " + clienteAsignado + "\n" +
               "Tipo de habitación: " + tipo + "\n" +
               "Días contratados: " + diasContratados + "\n" +
               "Servicios extra: " + serviciosExtra + "\n" +
               "Consumo minibar: " + consumoMinibar + "€\n" +
               "Total: " + calcularPrecioFinal() + "€\n";
    }

    @Override
    public String toString() {
        return "Habitación {" +
                "tipo='" + tipo + '\'' +
                ", precioBase=" + precioBase +
                ", serviciosExtra='" + serviciosExtra + '\'' +
                ", clienteAsignado='" + (clienteAsignado != null ? clienteAsignado : "Ninguno") + '\'' +
                ", estaLimpia=" + estaLimpia +
                ", estaOcupada=" + estaOcupada +
                '}';
    }
}

