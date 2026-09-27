package leccion2_condicionales;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 2. Dado un número, indicá si es par o impar (usá %).
		int numero;

		System.out.print("Ingrese un número: ");
		numero = Integer.parseInt(input.nextLine());

		if (numero % 2 == 0) {
			System.out.println("El número ingresado es par");
		} else {
			System.out.println("El número ingresado es impar");
		}

		input.close();
	}
}