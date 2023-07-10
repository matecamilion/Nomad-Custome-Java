package clases;

public class Buzos extends Prenda{
    private String talle;
    private String color;

    public Buzos(int id, double precio, String talle, String color) {
        super(id, precio);
        this.talle = talle;
        this.color = color;
    }
    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Buzos [talle=" + talle + ", color=" + color + ", getTalle()=" + getTalle() + ", getColor()="
                + getColor() + ", getId()=" + getId() + ", getPrecio()=" + getPrecio()
                + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + "]";
}
    @Override
    public int getId() {
        return 0;
    }
}
