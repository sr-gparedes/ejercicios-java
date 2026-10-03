package leccion4_metodos;

public class Ejercicio8 {
	public static void main(String[] args) {
		/*
		 * Escribí factorial de dos formas, iterativa (con for) y recursiva, y comprobá
		 * que dan igual para 5 y 10.
		 */

		System.out.println("Factorial de 5: ");

		System.out.println("Metdo Interativo: " + factorialInterativo(5));
		System.out.println("Metodo Recursivo: " + factorialRecursivo(5));

		System.out.println("\nFactorial de 10: ");

		System.out.println("Metdo Interativo: " + factorialInterativo(10));
		System.out.println("Metodo Recursivo: " + factorialRecursivo(10));

	}

	public static int factorialInterativo(int n) {
		int resultado = 1;
		for (int i = n; i >= 1; i--) {
			resultado *= i;
		}
		return resultado;
	}

	public static int factorialRecursivo(int n) {
		if (n <= 1)
			return 1;
		return n * factorialRecursivo(n - 1);
	}
}