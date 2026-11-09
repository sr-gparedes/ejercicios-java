package leccion5_poo;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * 3. Agregale a Producto un método de instancia valorTotal() que devuelva
		 * precio * cantidadEnStock. En Ejercicio3, armá un array de 5 Producto y sumá
		 * el valor total de todo el inventario.
		 */
		double valorTotalInventario = 0;
		Producto[] productos = {
				new Producto("Fideos", 1973.10, 50),
				new Producto("Arroz", 1142, 60),
				new Producto("Harina", 830.50, 50),
				new Producto("Sal", 740, 30),
				new Producto("Azucar", 830, 40)
		};
		
		for (Producto producto : productos) {
			valorTotalInventario += producto.valorTotal();
		}
		
		System.out.println("El valor total de todo el inventario es: $" + valorTotalInventario);
		
	}

}
