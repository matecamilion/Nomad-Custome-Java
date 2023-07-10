package clases;

public 
class Buzos extends Prenda {
    private String talle;
    private String color;

    public Buzos(int id, double precio, String talle, String color) {
        super(id, precio);
        this.talle = talle;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Buzos [id=" + id + ", precio=" + precio + ", talle=" + talle + ", color=" + color + "]";
    }
}
