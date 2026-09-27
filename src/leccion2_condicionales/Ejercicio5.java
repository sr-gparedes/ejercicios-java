package leccion2_condicionales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * 5. Usando &&, verificá si una persona puede entrar a una discoteca (edad >=
		 * 18 Y tiene entrada).
		 */

		System.out.println("Bienvenido a la discoteca!!");
		System.out.print("Cuantos años tienes? ");
		int edad = Integer.parseInt(input.nextLine());
		while (edad < 0 || edad > 100) {
			System.out.print("Por favor! Ingrese una edad valida: ");
			edad = Integer.parseInt(input.nextLine());
		}

		System.out.print("Tienes entradas [si || no]?  ");
		String entrada = input.nextLine();
		entrada = entrada.toLowerCase();
		while (!entrada.equals("si") && !entrada.equals("no")) {
			System.out.println("Por favor! Ingrese una respuesta valida: ");
			entrada = input.nextLine();
			entrada = entrada.toLowerCase();
		}

		if (edad >= 18 && entrada.equals("si")) {
			System.out.println("Puedes entrar a la discoteca!");
		} else {
			System.out.println("Lo siento! No puedes entrar a la discoteca!");
		}

		input.close();
	}
}
