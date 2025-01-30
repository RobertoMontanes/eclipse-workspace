package ejercicio;

public class Magdalena {

    private int id;
    private String sabor;
    private boolean cupcake;
    private double volumenMasa;

    public Magdalena(int id, String sabor, boolean cupcake, double volumenMasa) {
        this.id = id;
        this.sabor = sabor;
        this.cupcake = cupcake;
        this.volumenMasa = volumenMasa;
    }

    public Magdalena() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isCupcake() {
        return cupcake;
    }

    public void setCupcake(boolean cupcake) {
        this.cupcake = cupcake;
    }

    public double getVolumenMasa() {
        return volumenMasa;
    }

    public void setVolumenMasa(double volumenMasa) {
        this.volumenMasa = volumenMasa;
    }

    @Override
    public String toString() {
        return "Magdalena [id=" + id + ", sabor=" + sabor + ", cupcake=" + cupcake + ", volumenMasa=" + volumenMasa + "]";
    }
}
