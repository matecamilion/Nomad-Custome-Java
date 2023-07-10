package clases;

public class Pantalones extends Prenda {
    private String talle;
    private String color;

    public Pantalones(int id, double precio, String talle, String color) {
        super(id, precio);
        this.talle = talle;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pantalones [id=" + id + ", precio=" + precio + ", talle=" + talle + ", color=" + color + "]";
    }
}
