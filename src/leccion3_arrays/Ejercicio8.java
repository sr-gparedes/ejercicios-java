package leccion3_arrays;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Invertí un array (que el último elemento pase a ser el primero) e imprimí el
		 * resultado. (Pista: podés crear un array nuevo y recorrer el original al
		 * revés.)
		 */
		int[] numeros = { 80, 234, 98, 45, 17, 52, 39, 348, 5, 9347 };
		int[] numerosInvertido = new int[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
			numerosInvertido[i] = numeros[numeros.length - 1 - i];
		}

		for (int n : numerosInvertido) {
			System.out.println(n);
		}

	}

}
