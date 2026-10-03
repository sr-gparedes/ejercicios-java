package leccion3_arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		/* 6. Dado un array de String con nombres, imprimí cada uno con su
		índice: "0: Ana", "1: Luis", etc.*/
		String[] nombres = {"Ana", "Luis", "Karmen", "Juan"};
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre del Array en la posición " + i + ": " + nombres[i]);
		}

	}

}
