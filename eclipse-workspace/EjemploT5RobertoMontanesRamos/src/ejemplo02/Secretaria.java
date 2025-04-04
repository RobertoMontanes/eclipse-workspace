package ejemplo02;

import java.util.List;

public class Secretaria {

    private List<Alumno> listAlumnos;

    public Secretaria(List<Alumno> listAlumnos) {
        super();
        this.listAlumnos = listAlumnos;
    }

    public List<Alumno> getListAlumnos() {
        return listAlumnos;
    }

    public void setListAlumnos(List<Alumno> listAlumnos) {
        this.listAlumnos = listAlumnos;
    }

    @Override
    public String toString() {
        return "Secretaria [listAlumnos=" + listAlumnos + "]";
    }

    public void agregarAlumno(Alumno a) {
        listAlumnos.add(a);
    }

    public Alumno buscarDni(String dni) {

        Alumno tem = null;
        boolean salir = false;
        for (int i = 0; i < listAlumnos.size(); i++) {
            if (listAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
                tem = listAlumnos.get(i);
                salir = true;
            }
        }
        return tem;
    }

    public String buscarDni2(String dni) {
        Alumno tem = buscarDni(dni);
        return (tem != null) ? tem.getDni() : "DNI no encontrado";
    }

    public void borrarAlumno(String dni) {
        Alumno alumno = buscarDni(dni);
        if (alumno != null) {
            listAlumnos.remove(alumno);
        }
    }

    public void imprimirLista() {
        for (Alumno alumno : listAlumnos) {
            System.out.println(alumno + "\n");
        }
    }

    public void modificarNotaMedia(String dni, double nuevaNotaMedia) {
        Alumno alumno = buscarDni(dni);
        if (alumno != null) {
            alumno.setNotaMedia(nuevaNotaMedia);
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    public double calcularMediax2(double notaMedia) {
        double total = 0;
        for (Alumno alumno : listAlumnos) {
            total += alumno.getNotaMedia();
        }
        return total / listAlumnos.size();
    }
}
