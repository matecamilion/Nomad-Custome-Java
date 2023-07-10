package clases;
import java.util.HashMap;

public class Stock {
    public HashMap<Integer, Prenda> prendas;

    public Stock() {
        this.prendas = new HashMap<>();
    }

    // Para agregar prendas
    public void agregarPrenda(Prenda prenda) {
        prendas.put(prenda.getId(), prenda);
    }

    // Recorre el stock y elimina la prenda con el ID proporcionado 	
    public boolean eliminarPrenda(int id) {
        if (prendas.containsKey(id)) {
            prendas.remove(id);
            return true;
        } else {
            return false;
        }
    }

    // Muestra el stock de prendas
    public void mostrarStock() {
        for (Prenda prenda : prendas.values()) {
            System.out.println(prenda.toString());
        }
    }
}
