package leccion2_condicionales;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 3. Dada una nota (0 a 10), imprimí "Aprobado" si es >= 6, si no
		// "Desaprobado".
		int notaAlumno;

		System.out.print("Ingrese la nota del alumno: ");
		notaAlumno = Integer.parseInt(input.nextLine());

		while (notaAlumno < 0 || notaAlumno > 10) {
			System.out.println("Nota invalida!!");
			System.out.print("Ingre una nota valida [0 a 10]: ");
			notaAlumno = Integer.parseInt(input.nextLine());
		}

		if (notaAlumno >= 6) {
			System.out.println("El alumno esta Aprobado");
		} else {
			System.out.println("El alumno esta Desaprobado");
		}

		input.close();
	}
}