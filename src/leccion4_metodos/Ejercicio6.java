package leccion4_metodos;

public class Ejercicio6{

	public static void main(String[] args) {
		/*
		 * 6. Escribí esPrimo(int n) y usalo para imprimir todos los primos del 1 al 50.
		 */
		for (int i = 1; i <= 50; i++) {
			System.out.print(esPrimo(i) ? i + " " : "");
		}

	}

	public static boolean esPrimo(int n) {
		int contadorDeResto = 0;
		boolean respuesta = false;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				contadorDeResto++;
				if (contadorDeResto >= 3)
					break;
			}
		}
			
		if (contadorDeResto == 2) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		

		return respuesta;
	}

}