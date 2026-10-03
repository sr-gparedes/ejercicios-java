package leccion3_arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		// 5. Encontrá el número más chico de ese mismo array.
		int[] numeros = {146, 2026, 81, 17, 18, 1830, 177};
		int numMenor = Integer.MAX_VALUE;
		
		for (int n : numeros) {
			if (n < numMenor) {
				numMenor = n;
			}
		}

		System.out.println("El número menor de tu Array es: " + numMenor);

	}

}
