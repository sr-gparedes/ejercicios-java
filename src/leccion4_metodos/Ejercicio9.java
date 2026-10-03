package leccion4_metodos;

import java.util.Arrays;

public class Ejercicio9 {
	/*
	 * Escribí invertirArray(int[] arr) (void) que invierta el array en el lugar,
	 * con dos índices, y mostrá que el array original cambió. Explicá con tus
	 * palabras por qué cambia.
	 */
	public static void main(String[] args) {
		int[] numeros = { 2, 4, 6, 8, 10 };

		System.out.println(Arrays.toString(numeros));

		invertirArray(numeros);

		System.out.println(Arrays.toString(numeros));

	}

	public static void invertirArray(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;

		}
	}
}

/*
 * el array "numeros" cabia porque en el metodo invertirArray el array arr
 * copia la referencia de numeros... es como si número fuera una caja con
 * números y arr apuntase  a la misma caja
 */