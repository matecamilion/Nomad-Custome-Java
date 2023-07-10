import java.util.Scanner;
import clases.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Stock stock = new Stock();
        int opcion = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            while (opcion != 4) {
                System.out.println("----BIENVENIDO A NOMAD CUSTOME----");
                System.out.println("Elija una opcion:");
                System.out.println("1. Agregar prenda al stock");
                System.out.println("2. Realizar venta");
                System.out.println("3. Ver stock");
                System.out.println("4. Salir");

                int opcion1 = scanner.nextInt();
                scanner.nextLine();

                switch (opcion1) {
                    case 1:
                        System.out.println("Elija que prenda desea agregar:");
                        System.out.println("1. Agregar remera");
                        System.out.println("2. Agregar pantalon");
                        System.out.println("3. Agregar buzo");

                        int tipoDePrenda = scanner.nextInt();
                        scanner.nextLine();

                        switch (tipoDePrenda) {
                            case 1:
                                System.out.println("----Agregar remera al stock----");
                                System.out.print("Ingrese el ID de la remera: ");
                                int id = scanner.nextInt();
                                scanner.nextLine();

                                System.out.print("Ingrese el precio de la remera: ");
                                double precio = scanner.nextDouble();

                                System.out.print("Ingrese el talle de la remera: ");
                                String talle = scanner.next();

                                System.out.print("Ingrese el color de la remera: ");
                                String color = scanner.next();

                                System.out.println("Prenda agregada al stock.");
                                stock.agregarPrenda(new Remeras(id, precio, talle, color));

                                break;

                            case 2:
                                System.out.println("----Agregar pantalon al stock----");
                                System.out.print("Ingrese el ID del pantalón: ");
                                int id1 = scanner.nextInt();
                                scanner.nextLine(); 

                                System.out.print("Ingrese el precio del pantalon: ");
                                double precio1 = scanner.nextDouble();

                                System.out.print("Ingrese el talle del pantalon: ");
                                String talle1 = scanner.next();

                                System.out.print("Ingrese el color del pantalon: ");
                                String color1 = scanner.next();

                                System.out.println("Prenda agregada al stock.");
                                stock.agregarPrenda(new Pantalones(id1, precio1, talle1, color1));

                                break;

                            case 3:
                                System.out.println("----Agregar buzos al stock----");
                                System.out.print("Ingrese el ID del buzo: ");
                                int id2 = scanner.nextInt();
                                scanner.nextLine();

                                System.out.print("Ingrese el precio del buzo: ");
                                double precio2 = scanner.nextDouble();

                                System.out.print("Ingrese el talle del buzo: ");
                                String talle2 = scanner.next();

                                System.out.print("Ingrese el color del buzo: ");
                                String color2 = scanner.next();

                                System.out.println("Prenda agregada al stock.");
                                stock.agregarPrenda(new Buzos(id2, precio2, talle2, color2));

                                break;

                            default:
                                System.out.println("Esta opción no existe");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("----Realizar venta----");

                        System.out.print("Ingrese el ID de la prenda que quiere vender: ");
                        int idVenta = scanner.nextInt();
                        scanner.nextLine();

                        if (stock.eliminarPrenda(idVenta)) {
                            System.out.println("Prenda vendida.");
                        } else {
                            System.out.println("El ID ingresado no existe.");
                        }

                        break;

                    case 3:
                        System.out.println("----Mostrar stock de prendas----");
                        if (stock.prendas.isEmpty()) {
                            System.out.println("No hay prendas en el stock.");
                        } else {
                            stock.mostrarStock();
                        }

                        break;

                    case 4:
                        System.out.println("Gracias por pasar por Nomad!");
                        return;

                    default:
                        System.out.println("Esta opción no existe");
                        return;
                }
            }
        }
    }
}