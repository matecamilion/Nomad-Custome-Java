package clases;

public class Remeras extends Prenda {
    private String talle;
    private String color;

    public Remeras(int id, double precio, String talle, String color) {
        super(id, precio);
        this.talle = talle;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Remeras [id=" + id + ", precio=" + precio + ", talle=" + talle + ", color=" + color + "]";
    }
}