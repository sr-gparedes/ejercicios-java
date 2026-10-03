package leccion4_metodos;

import java.util.Arrays;

public class Ejercicio10 {
	public static void main(String[] args) {
		/*
		 * Intentá escribir intercambiar(int a, int b) que intercambie dos variables
		 * enteras y comprobá que no funciona; explicá por qué. Después escribí
		 * intercambiar(int[] arr, int i, int j), que intercambia dos posiciones de un
		 * array, y verificá que sí funciona.
		 */
		int[] arr = { 2, 3 };
		int a = 2;
		int b = 3;

		System.out.println("Intercambiar valores primer metodo: ");
		System.out.println(a + " " + b);
		invertir(a, b);
		System.out.println(a + " " + b);

		System.out.println("Intercambiar valores segundo metodo: ");
		System.out.println(Arrays.toString(arr));
		intercambiar(arr, 0, 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void invertir(int a, int b) {
		int c = a;
		a = b;
		b = c;
	}

	public static void intercambiar(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/*
	 * a diferencia del ejercicio pasando, los parametros que entran en el metodo
	 * son modificados localemnte
	 */
}