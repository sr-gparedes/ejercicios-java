package leccion2_condicionales;

public class Ejercicio1 {
	public static void main(String[] args) {
		// 1. Pedí (declarala en el código) una edad e indicá si es mayor o menor de
		// edad.
		int edad1 = 22;
		int edad2 = 17;

		System.out.println("Ingrese su edad: " + edad1);

		if (edad1 >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

		System.out.println("--------------------------");

		System.out.println("Ingrese su edad: " + edad2);

		if (edad2 >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

	}
}