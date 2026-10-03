package leccion4_metodos;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * Escribí esPar(int n) que devuelva boolean y usalo dentro de un if en main
		 */
		System.out.print("Ingrese un número: ");
		int n = Integer.parseInt(input.nextLine());
		
		if (esPar(n)) {
			System.out.println("Su número es par");
		} else {
			System.out.println("Su número es impar");
		}

		input.close();
	}

	public static boolean esPar(int n) {
		return n % 2 == 0;
	}
}