package clases;

public class Pantalones extends Prenda{
	private String talle;
	private String color;
	
	public Pantalones(int id, String nombre, double precio, String talle, String color) {
		super(id, nombre, precio);
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
		return "Pantalones [talle=" + talle + ", color=" + color + ", getTalle()=" + getTalle() + ", getColor()="
				+ getColor() + ", getId()=" + getId() + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	@Override
	protected int getId() {
		return 0;
	}
}
