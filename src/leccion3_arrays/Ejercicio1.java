package leccion3_arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. Creá un array con 5 números enteros (a elección) e imprimilos uno por uno
		 * con un for.
		 */
		int[] numeros = new int[5];
		numeros[0] = 27;
		numeros[1] = 2;
		numeros[2] = 17;
		numeros[3] = 18;
		numeros[4] = 25;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición del Array " + i + ": " + numeros[i]);
		}

	}

}
