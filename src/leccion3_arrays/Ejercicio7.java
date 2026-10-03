package leccion3_arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		// 7. Contá cuántos números pares hay dentro de un array de 10 enteros.
		int[] numeros = {80, 234, 98, 45, 17, 52, 39, 348, 5, 9347};
		int numerosPares = 0;
		
		for (int n : numeros) {
			if (n % 2 == 0) {
				numerosPares++;
			}
		}
		
		System.out.println("La cantidad de números pares en el Array es: " + numerosPares);

	}

}
