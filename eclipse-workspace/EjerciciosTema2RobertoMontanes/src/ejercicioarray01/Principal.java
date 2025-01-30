package ejercicioarray01;

public class Principal {
    public static void main(String[] args) {

        String[] nombres;


        nombres = new String[]{"Ana", "Luis", "María", "Juan", "Sofía"};


        System.out.println("Los nombres ingresados son:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
