package leccion2_condicionales;

public class Ejercicio9 {

	public static void main(String[] args) {
		// 9. Con un for, contá cuántos números pares hay entre 1 y 50.
		int numerosPares = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				numerosPares++;
			}
		}

		System.out.println("Hay " + numerosPares + " números pares entre 1 y 50");

	}
}
