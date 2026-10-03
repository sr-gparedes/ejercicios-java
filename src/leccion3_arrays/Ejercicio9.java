package leccion3_arrays;

public class Ejercicio9 {
	public static void main(String[] args) {
		/*
		 * Buscá si un número específico está dentro de un array (por ejemplo, buscá si
		 * el 15 está en {3, 7, 15, 22, 9}) e imprimí "Encontrado" o "No encontrado".
		 */
		int[] numeros = { 3, 7, 15, 22, 9 };
		int buscado = 15;
		int posicion = -1;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == buscado) {
				posicion = i;
				break;
			}
		}

		System.out.println(posicion != -1 ? "Encontrado en la posición " + posicion : "No está en el array");

	}
}