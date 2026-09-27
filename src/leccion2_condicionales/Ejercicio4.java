package leccion2_condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * 4. Con if/else if, convertí una nota numérica (0-10) en letra: 9-10 "A", 7-8
		 * "B", 6 "C", menos de 6 "D".
		 */
		System.out.print("Igrese la calificación del alumno: ");
		int calificacion = Integer.parseInt(input.nextLine());

		while (calificacion < 0 || calificacion > 10) {
			System.out.println("Calificaión invalida!!");
			System.out.print("Ingrese una calificación valida [0 al 10]: ");
			calificacion = Integer.parseInt(input.nextLine());
		}

		if (calificacion >= 9) {
			System.out.println("Calificación del alumno: A");
		} else if (calificacion >= 7) {
			System.out.println("Calificación del alumno: B");
		} else if (calificacion == 6) {
			System.out.println("Calificación del alumno: C");
		} else {
			System.out.println("Calificación del alumno: D");
		}

		input.close();
	}
}
