package clases;
import java.util.ArrayList;

public class Stock {
	private ArrayList <Prenda> prendas;
	
	public Stock() {
		prendas = new ArrayList<>();
	}
	//para agregar prendas
	public void agregarPrenda(Prenda prenda) {
		prendas.add(prenda);
		System.out.println("Prenda agregada correctamente!");
	}
	
	//recorre la lista de prendas y elimina las que tengan un id igual al id proporcionado
	public void eliminarPrenda(int id) {
		prendas.removeIf(prenda -> prenda.getId() == id);
		System.out.println("Prenda eliminada correctamente!");
	}
	public Prenda buscarPrenda(int id) {
		for(Prenda prenda : prendas) {
			if(prenda.getId() == id) {
				return prenda;
		}
		}
		return null;
	}
}
