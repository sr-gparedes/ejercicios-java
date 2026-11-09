package leccion5_poo;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * 5.Agregale a Producto un método aumentarPrecio(double porcentaje) que
		 * incremente el precio ese porcentaje (ej: aumentarPrecio(10) sube el precio un
		 * 10%). Probalo en Ejercicio5 con un producto, mostrando el precio antes y
		 * después.
		 */
		Producto producto = new Producto("fideos", 800, 44);
		System.out.println(producto);
		producto.aumentarPrecio(10);
		System.out.println(producto);
		
	}

}
