package leccion2_condicionales;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * 10. Usando switch, dado un número del 1 al 7, imprimí el nombre del día de la
		 * semana correspondiente.
		 */
		System.out.print("Ingrese un número: ");
		int dia = Integer.parseInt(input.nextLine());

		switch (dia) {
		case 1:
			System.out.println("Elejiste: Domingo");
			break;
		case 2:
			System.out.println("Elejiste: Lunes");
			break;
		case 3:
			System.out.println("Elejiste: Martes");
			break;
		case 4:
			System.out.println("Elejiste: Miércoles");
			break;
		case 5:
			System.out.println("Elejiste: Jueves");
			break;
		case 6:
			System.out.println("Elejiste: Viernes");
			break;
		case 7:
			System.out.println("Elejiste: Sábado");
			break;
		default:
			System.out.println("Número inválido");
		}

		input.close();
	}
}
