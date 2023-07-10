package clases;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Stock {
    public HashMap<Integer, Prenda> prendas;

    public void guardarStockEnArchivo() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("stock.txt"))) {
            for (Prenda prenda : prendas.values()) {
                writer.println(prenda.toString());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el stock en el archivo.");
        }
    }
    
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
