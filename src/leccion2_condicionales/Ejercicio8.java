package leccion2_condicionales;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * 8. Con un while, sumá los números del 1 al 100 e imprimí el resultado total.
		 */
		int e = 1, resultadoTotal = 0;

		while (e <= 100) {
			resultadoTotal += e;
			e++;
		}

		System.out.println(resultadoTotal);

	}
}
