package clases;

public abstract class Prenda {
    protected int id;
    protected double precio;

    public Prenda(int id, double precio) {
        this.id = id;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Prenda [id=" + id + ", precio=" + precio + "]";
    }
}