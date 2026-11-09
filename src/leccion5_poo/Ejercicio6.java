package leccion5_poo;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * 6. En Ejercicio6, creá un Producto p1, hacé Producto p2 = p1;, modificá un
		 * atributo de p2 con su setter, e imprimí p1. Comprobá que también cambió y
		 * explicá en un comentario por qué (es el mismo concepto que viste con arrays).
		 */
		Producto p1 = new Producto("fideos", 800, 33);
		System.out.println(p1);

		Producto p2 = p1;
		p2.setPrecio(600);
		System.out.println(p1);
	}

}
/*
 * Al igual que con los arrays p2 esta copiando p1 pero basicamente p1 y p2 son
 * la misma cosa. p2 copia hacia donde apunta p1
 */