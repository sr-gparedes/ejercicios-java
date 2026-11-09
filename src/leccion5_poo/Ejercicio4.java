package leccion5_poo;

import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * En Ejercicio4, con Scanner, pedile al usuario nombre, precio y stock de un
		 * producto, y creá el objeto con esos datos. Si el precio ingresado es
		 * negativo, usá el setter para detectarlo y volvé a pedirlo.
		 */
		String nombreProducto;
		double precio;
		int cantidadEnStock;
		
		System.out.print("Ingrese un nuevo producto: ");
		nombreProducto = input.nextLine();
		
		System.out.print("Ingrese el precio del producto: $");
		precio = Double.parseDouble(input.nextLine());
		while (precio < 0) {
			System.out.println("\nPrecio invalido!!\n");
			System.out.print("Ingrese un precio valido: $");
			precio = Double.parseDouble(input.nextLine());
		}
		
		System.out.print("Ingrese la cantidad en stock del producto: ");
		cantidadEnStock = Integer.parseInt(input.nextLine());
		while (cantidadEnStock < 0) {
			System.out.println("\nCantidad en stock invalida!!\n");
			System.out.print("Ingrese una cantida en stock valida: ");
			cantidadEnStock = Integer.parseInt(input.nextLine());
		}
		
		Producto producto = new Producto(nombreProducto, precio, cantidadEnStock);
		System.out.println(producto);
		
		input.close();
	}

}
