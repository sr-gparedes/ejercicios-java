package leccion3_arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		// 4. Encontrá el número más grande de un array de al menos 7 elementos.
		int[] numeros = {146, 2026, 81, 17, 18, 1830, 177};
		int numMayor = Integer.MIN_VALUE;
		
		for (int n : numeros) {
			if (n > numMayor) {
				numMayor = n;
			}
		}
		
		System.out.println("El número mayor de tu Array es: " + numMayor);
		
	}

}
