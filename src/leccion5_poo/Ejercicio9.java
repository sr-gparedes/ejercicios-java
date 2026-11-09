package leccion5_poo;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * 9. Creá DestinoTuristico (atributos nombre, ciudad, precio,
		 * cuposDisponibles), con constructor, getters/setters, toString(), y un método
		 * reservar(int personas) que reste cupos si alcanzan, o avise “sin cupo” si no.
		 * En Ejercicio9, creá 2 o 3 destinos y probá reservas válidas e inválidas.
		 */
		int respuesta, cantidadDePasajeros;
		DestinoTuristico destino1 = new DestinoTuristico("Escapada de la ciudad", "Tigre", 77000, 13);
		DestinoTuristico destino2 = new DestinoTuristico("Filo - Cerrano", "Merlo", 287000, 4);
		DestinoTuristico destino3 = new DestinoTuristico("Visita la nieve", "Bariloche", 360000, 5);

		System.out.println("Elija un destino turístico!! \n");
		System.out.print("1. ");
		mensaje(destino1);
		System.out.print("2. ");
		mensaje(destino2);
		System.out.print("3. ");
		mensaje(destino3);

		do {
			System.out.print("Ingrese su respuesta: ");
			respuesta = Integer.parseInt(input.nextLine());
		} while (respuesta < 1 || respuesta > 3);

		switch (respuesta) {
		case 1:
			System.out.println("Elijió el viaje a " + destino1.getCiudad());
			System.out.println("Cuantos lugares desea reservar?");
			System.out.print("Ingrese su respuesta: ");
			cantidadDePasajeros = Integer.parseInt(input.nextLine());
			destino1.reservar(cantidadDePasajeros);
			System.out.println(destino1);
			break;
			
		case 2:
			System.out.println("Elijió el viaje a " + destino2.getCiudad());
			System.out.println("Cuantos lugares desea reservar?");
			System.out.print("Ingrese su respuesta: ");
			cantidadDePasajeros = Integer.parseInt(input.nextLine());
			destino2.reservar(cantidadDePasajeros);
			System.out.println(destino2);
			break;
			
		case 3:
			System.out.println("Elijió el viaje a " + destino3.getCiudad());
			System.out.println("Cuantos lugares desea reservar?");
			System.out.print("Ingrese su respuesta: ");
			cantidadDePasajeros = Integer.parseInt(input.nextLine());
			destino3.reservar(cantidadDePasajeros);
			System.out.println(destino3);
			break;
		
		default:
			break;
		}

		input.close();
	}

	public static void mensaje(DestinoTuristico d) {
		System.out.println(d.getNombre() + "!! Viajá a " + d.getCiudad() + ": $" + d.getPrecio());
	}

}
