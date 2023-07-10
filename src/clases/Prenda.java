package clases;

public abstract class Prenda {
    protected int id;
    private double precio;

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

    public void setId(int id) {
        this.id = id;
    }

    public abstract int getId();

    @Override
    public String toString() {
        return "Prenda [id=" + id + ", precio=" + precio + "]";
    }
    


}
