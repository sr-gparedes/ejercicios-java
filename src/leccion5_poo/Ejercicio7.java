package leccion5_poo;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * 7. Agregale a Producto un método static masCaro(Producto[] productos) que
		 * devuelva el producto con mayor precio del array. Pensá por qué tiene que ser
		 * static (pista: no pertenece a un producto en particular, compara varios).
		 * Probalo en Ejercicio7.
		 */

		Producto[] productos = new Producto[5];
		productos[0] = new Producto("Fideos", 800, 33);
		productos[1] = new Producto("Arroz", 1800, 53);
		productos[2] = new Producto("Aceite", 2300, 83);
		productos[3] = new Producto("Nutela", 5800, 45);
		productos[4] = new Producto("Azucar", 600, 54);

		Producto productoMasCaro = Producto.masCaro(productos);
		System.out.println(productoMasCaro);

	}

}
/*
 * Con la pista que se me da entiendo que tiene que ser static porque solo de
 * esa forma el metodo "masCaro()" compara todos los productos del array y no
 * solamente uno. "static" hace que el metodo pase a pertenecer a la clase
 * Prducto y no a un procducto en particular
 */