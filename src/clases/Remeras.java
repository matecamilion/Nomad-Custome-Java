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
        return "Tenemos remera de color " + color + ", con el id " + id + ", de talle " + talle + " con el valor de $" + precio;
    }
}