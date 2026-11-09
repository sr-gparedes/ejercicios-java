package leccion5_poo;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. Creá la clase Producto con atributos privados nombre (String), precio
		 * (double) y cantidadEnStock (int); un constructor que reciba los tres; getters
		 * para los tres; setters con validación (precio y cantidadEnStock no pueden ser
		 * negativos — si lo son, ignorá el cambio e imprimí un aviso); y toString(). En
		 * Ejercicio1, creá 3 productos distintos e imprimilos.
		 */
		System.out.println("Primeros objetos - productos validos");
		Producto producto1 = new Producto("Fideos", 1850, 20);
		Producto producto2 = new Producto("Arroz", 1500.85, 18);
		Producto producto3 = new Producto("Harina", 878.82, 33);

		System.out.println(producto1);
		System.out.println(producto2);
		System.out.println(producto3);

		System.out.println("\nPrimeros objetos - productos invalidos");
		Producto producto4 = new Producto("Azucar", -1320, 20);
		Producto producto5 = new Producto("Sal", 700.85, -24);

		System.out.println(producto4);
		System.out.println(producto5);

	}

}
