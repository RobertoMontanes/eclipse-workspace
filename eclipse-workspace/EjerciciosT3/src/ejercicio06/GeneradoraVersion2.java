package ejercicio06;

public class GeneradoraVersion2 {

    public String generarQuiniela() {
        int numAleatorio = (int) (Math.random() * 3);

        switch (numAleatorio) {
            case 0:
                return "Empate";
            case 1:
                return "Gana equipo local";
            case 2:
                return "Gana equipo visitante";
            default:
                return "Error";
        }
    }

    public String generarParImpar() {
        int numAleatorio = (int) (Math.random() * 100);
        return (numAleatorio % 2 == 0) ? "Par" : "Impar";
    }

    public int generarChinos() {
        return (int) (Math.random() * 3) + 1; // Valores 1, 2 o 3
    }

    public int generarPrimitiva() {
        return (int) (Math.random() * 49) + 1; // Valores entre 1 y 49
    }
}
