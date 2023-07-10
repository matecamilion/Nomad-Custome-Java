import java.util.Scanner;
import clases.*;

public class Main {
	
	public static void main(String[] args) {
		
		Stock stock = new Stock();
		Venta venta = new Venta();
		int  opcion = 0;
		
		try(Scanner scanner = new Scanner(System.in)){
			while(opcion != 4) {
				System.out.println("----BIENVENIDO A NOMAD CUSTOME----");
				System.out.println("Que operacion desea hacer?");
				System.out.println("1. Agregar prenda al stock");
                System.out.println("2. Realizar venta");
                System.out.println("3. Ver stock");
                System.out.println("4. Salir");
                
                int opcion1 = scanner.nextInt();
                scanner.nextLine();
				
				switch(opcion1) {
				case 1: 
					System.out.println("Elija que prenda desea agregar:");
					System.out.println("1. Agregar remera");
					System.out.println("2. Agregar pantalon");
					System.out.println("3. Agregar buzo");
					
					int tipoDePrenda = scanner.nextInt();
					scanner.nextLine();
					
					switch(tipoDePrenda) {
					case 1:
						System.out.println("----Agregar remera al stock----");
						 System.out.print("Ingrese el ID de la remera: ");
	                     int id = scanner.nextInt();
		                 scanner.nextLine(); // salto de linea
	                     
	                     System.out.print("Ingrese el precio de la remera: ");
	                     double precio = scanner.nextDouble();
	                     
	                     System.out.print("Ingrese el talle de la remera: ");
	                     String talle = scanner.next();
	                     
	                     System.out.print("Ingrese el color de la remera: ");
	                     String color = scanner.next();
	                     
	                     System.out.println("Prenda agregada al stock.");
	                     Remeras remeras1=new Remeras(id, precio, talle, color);
	                     remeras1.toString();
	                    break;
	
					case 2: 
						System.out.println("----Agregar pantalon al stock----");
						 System.out.print("Ingrese el ID de el pantalon: ");
	                    int id1 = scanner.nextInt();
	                    scanner.nextLine(); // salto de linea
	                   
	                    System.out.print("Ingrese el precio de el pantalon: ");
	                    double precio1 = scanner.nextDouble();
	                    
	                    System.out.print("Ingrese el talle de el pantalon: ");
	                    String talle1 = scanner.next();
	                    
	                    System.out.print("Ingrese el color de el pantalon: ");
	                    String color1 = scanner.next();
	                    
	                    System.out.println("Prenda agregada al stock.");
	                    Pantalones pantalones1=new Pantalones(id1, precio1, talle1, color1);
	                    pantalones1.toString();
	                    break;
	                    
					case 3:
						System.out.println("----Agregar buzos al stock----");
						System.out.print("Ingrese el ID del buzo: ");
	                    int id2 = scanner.nextInt();
	                    scanner.nextLine(); // salto de linea
	                    
	                    System.out.print("Ingrese el precio del buzo: ");
	                    double precio2 = scanner.nextDouble();
	                    
	                    
	                    System.out.print("Ingrese el talle del buzo: ");
	                    String talle2 = scanner.next();
	                    
	                    System.out.print("Ingrese el color del buzo: ");
	                    String color2 = scanner.next();
	                    
	                    System.out.println("Prenda agregada al stock.");
	                    Buzos buzos1=new Buzos(id2, precio2, talle2, color2);
	                    buzos1.toString();
	                    break;
	                   
	                   default:
	                	   System.out.println("Esta opcion no existe");
	                	   break;
					}
					break;
                   
				case 2:
						System.out.println("----Realizar venta----");
						
						System.out.println("Que prenda desea vender?");
						System.out.println("1. Vender remera");
						System.out.println("2. Vender pantalon");
						System.out.println("3. Vender buzos");
						
						int venderPrenda = scanner.nextInt();
						scanner.nextLine();
						
						
						switch(venderPrenda) {
						case 1:
							System.out.println("----Vender remera----");
							
							System.out.println("Ingrese el ID de la remera que quiere vender:");
							int id = scanner.nextInt();
							stock.eliminarPrenda(id);
						}
					
						
				 
					break;
					
				case 3:
					System.out.println("----Mostrar prendas vendidas----");
					System.out.println("Prendas vendidas:" + stock.buscarPrenda);
					
					break;
					
					
					
				case 4:
					System.out.println("Gracias por pasar!");
					return;
					
				default:
					System.out.println("Esta opcion no existe");
					return;
					
				
					
                    
                   
					
				}
			
			}
		}
	}
}