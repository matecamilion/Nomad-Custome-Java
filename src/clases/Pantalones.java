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
        return "Tenemos pantalon de color " + color + ", con el id " + id + ", de talle " + talle + " con el valor de $" + precio;
    }
}
