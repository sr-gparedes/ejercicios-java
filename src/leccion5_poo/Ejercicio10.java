package leccion5_poo;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * 10. En Ejercicio10, armá un array de DestinoTuristico (podés reusar los del
		 * ejercicio 9) y, con un for-each, imprimí solo los que todavía tengan
		 * cuposDisponibles > 0.}
		 */
		DestinoTuristico[] destinos = new DestinoTuristico[3];
		destinos[0] = new DestinoTuristico("Escapada de la ciudad", "Tigre", 77000, 13);
		destinos[1] = new DestinoTuristico("Filo - Cerrano", "Merlo", 287000, 4);
		destinos[2] = new DestinoTuristico("Visita la nieve", "Bariloche", 360000, 5);

		for (DestinoTuristico d : destinos) {
			if (d.getCuposDisponibles() > 0) {
				System.out.println(d);
			}
		}

	}

}
