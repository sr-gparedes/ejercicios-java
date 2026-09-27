package leccion1_variables;

public class Ejercicio5 {
	public static void main(String[] args) {
		// 5. Convierte 25 °C a Fahrenheit (F = C * 9/5 + 32). Prueba con 9/5 y con
		// 9.0/5 y explica por qué cambia el resultado.

		int f2 = 26 * 9 / 5 + 32; // con enteros
		double f3 = 26 * 9.0 / 5 + 32; // con double
		System.out.println(f2);
		System.out.println(f3);

		// entiendo que el resultado cambia porque la varisble int solo permite numeros
		// enteros y la varisble double permite los nuneros hom coma

	}
}