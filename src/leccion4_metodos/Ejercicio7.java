package leccion4_metodos;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		/*
		 * Sobrecarga: creá area(double radio) (círculo) y area(double base, double
		 * altura) (rectángulo). Probá ambos.
		 */
		Scanner input = new Scanner(System.in);
		double radio, base, altura;

		System.out.println("=== CALCULADOR DE AREA ===");

		System.out.println("\nCalculemos el area de un circulo.");
		System.out.print("Ingrese el radio del circulo: ");
		radio = Double.parseDouble(input.nextLine());
		System.out.printf("El area de su circulo es: %.2fcm²%n", area(radio));

		System.out.println("\nCalculemos el area de un rectangulo.");
		System.out.print("Ingrese la base del rectangulo: ");
		base = Double.parseDouble(input.nextLine());

		System.out.print("Ingrese la altura del rectangulo: ");
		altura = Double.parseDouble(input.nextLine());
		System.out.printf("El area de su rectangulo es: %.2fcm²%n", area(base, altura));

		input.close();
	}

	public static double area(double radio) {
		return 3.1416 * (radio * radio);
	}

	public static double area(double base, double altura) {
		return base * altura;
	}

}