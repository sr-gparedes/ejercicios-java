package leccion4_metodos;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*
		 * 1.Escribí saludar(String nombre) (void) que imprima "Hola, [nombre]!".
		 * Llamalo con tres nombres.
		 */
		saludar("Ambar");
		saludar("Lucia");
		saludar("Joaquín");
	}

	public static void saludar(String nombre) {
		System.out.println("Hola, " + nombre + "!");
	}

}