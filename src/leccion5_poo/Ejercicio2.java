package leccion5_poo;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * 2. gregale a Producto un segundo constructor (sobrecargado) que reciba solo
		 * nombre y precio, dejando cantidadEnStock en 0. En Ejercicio2, creá productos
		 * usando los dos constructores y mostralos.
		 */
		System.out.println("Crando productos de ambos constructores");
		Producto producto1 = new Producto("Pizza para horno", 7560, 10);
		Producto producto2 = new Producto("Helado", 2560);
		
		System.out.println(producto1);
		System.out.println(producto2);
	}

}
