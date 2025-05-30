package ejemplo02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {

        int opcion = 0;
        Alumno a1 = new Alumno("Roberto", "78252188N", 8);        
        Alumno a2 = new Alumno("Mara", "7654328C", 5);        
        Alumno a3 = new Alumno("HonChang", "684154454H", 10);                
        Alumno a4 = new Alumno("Luis", "312565465L", 3);        
        Alumno a5 = new Alumno("Miguel", "654987654F", 1);        
        Alumno a6 = new Alumno("Mei", "987543124M", 0);        
        List<Alumno> listaNombres = new ArrayList<Alumno>();
        Secretaria s = new Secretaria(listaNombres);
        String dni;

        listaNombres.add(a1);
        listaNombres.add(a2);
        listaNombres.add(a3);
        listaNombres.add(a4);
        listaNombres.add(a5);
        listaNombres.add(a6);

        System.out.println("Bienvenido a mi programa\n");

        do {
            System.out.println("Elige una opcion");
            System.out.println("Pulsa 0. para salir");
            System.out.println("Pulsa 1. para agregar alumno");
            System.out.println("Pulsa 2. para mostrar alumnos");
            System.out.println("Pulsa 3. para modificar nota media");
            System.out.println("Pulsa 4. para borrar alumno");
            opcion = Leer.datoInt();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    s.agregarAlumno(a1);
                    System.out.println("Agregado correctamente :)");
                    break;
                case 2:
                    s.imprimirLista();
                    break;
                case 3:
                    System.out.println("Introduce el DNI del alumno:");
                    dni = Leer.dato();
                    System.out.println("Introduce la nueva nota media:");
                    double nuevaNotaMedia = Leer.datoDouble();

                    s.modificarNotaMedia(dni, nuevaNotaMedia);
                    System.out.println("Nota media modificada correctamente.");
                    break;
                case 4:
                	System.out.println("Dime tu dni");
                	dni = Leer.dato();
                	 s.borrarAlumno(dni);
                  
                    break;
                case 5:
                	
                    break;
                default:
                    System.out.println("Número inválido. Pulse otro");
                    break;
            }
        } while (opcion != 0);
    }
}
