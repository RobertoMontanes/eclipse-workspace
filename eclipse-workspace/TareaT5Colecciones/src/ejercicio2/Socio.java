package ejercicio2;


public class Socio implements Comparable<Socio>{
	
    private int id;
    private String nombre;
    private int edad;

    public Socio(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Socio { ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + " }";
    }

	
	@Override
	public int compareTo(Socio o) {
		return this.id - o.id;
	}
	
	
	
}

