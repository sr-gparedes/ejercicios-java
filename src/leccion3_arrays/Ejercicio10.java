package leccion3_arrays;

public class Ejercicio10 {
	public static void main(String[] args) {
		/*
		 * Creá una matriz de 3x3 con números del 1 al 9 e imprimila recorriéndola con
		 * dos for anidados (uno para filas, otro para columnas).
		 */
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int[] fila : matriz) {
			for (int valor : fila) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}

	}
}