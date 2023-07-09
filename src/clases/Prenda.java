package clases;

public abstract class Prenda {
	private int id;
	private String nombre;
	private double precio;
	
	public Prenda(int id, String nombre, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	protected abstract int getId();

	@Override
	public String toString() {
		return "Prenda [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}


