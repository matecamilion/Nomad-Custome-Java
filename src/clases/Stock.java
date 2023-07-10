package clases;
import java.util.ArrayList;

public class Stock {
	private ArrayList <Prenda> prendas;
	public String buscarPrenda;
	
	public Stock() {
		prendas = new ArrayList<>();
	}
	
	
	//para agregar prendas
	public void agregarPrenda(Prenda prenda) {
		prendas.add(prenda);
		
	}
	
	
	//recorre la lista de prendas y elimina las que tengan un id igual al id proporcionado
	
	public void eliminarPrenda(int id) {
        if(id >= 0 && id < prendas.size()) {
            prendas.remove(id);
            System.out.println("Prenda eliminada");
        }else{
        	System.out.println("El ID ingresado no existe");
        }
	}
	public Prenda buscarPrenda() {
		for(Prenda prenda : prendas) {
		System.out.println(prenda.toString());
		
		}
		return null;
	}
}
