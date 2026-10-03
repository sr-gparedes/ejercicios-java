package leccion3_arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		// 2. Dado un array de 6 números, calculá la suma total.
		int[] numeros = { 2, 5, 17, 18, 25, 27 };
		int sumaTotal = 0;

		for (int n : numeros) {
			sumaTotal += n;
		}
		System.out.println("La suma total de todos los números del Array es: " + sumaTotal);

	}

}
