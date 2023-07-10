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
        return "Tenemos buzo de color " + color + ", con el id " + id + ", de talle " + talle + ", con el valor de $" + precio;
    }
}
