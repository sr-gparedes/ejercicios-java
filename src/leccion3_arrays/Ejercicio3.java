package leccion3_arrays;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 3. Dado el mismo array, calculá el promedio.
		int[] numeros = { 2, 5, 17, 18, 25, 27 };
		int sumaTotal = 0;

		for (int n : numeros) {
			sumaTotal += n;
		}
		double promedio = (double)sumaTotal / numeros.length;
		System.out.printf("El prmedio de todos los números del Array es: %.2f%n", promedio);

	}

}
