package programasAparte;

public class Alumno {
	private String nombre;
	private int[] notas;
	private int cantidadDeNotas;

	public Alumno(String nombre, int cantidadNotasMaximas) {
		this.nombre = nombre;
		this.notas = new int[cantidadNotasMaximas];
		this.cantidadDeNotas = 0;
	}

	public void agregarNota(int nota) {
		if (cantidadDeNotas < notas.length) {
			notas[cantidadDeNotas] = nota;
			cantidadDeNotas++;
		} else {
			System.out.println("¡¡Maximo de notas alcazado!!");
		}

	}

	public void mostrarNotas() {
		System.out.println("Notas de " + nombre + ":");
		for (int i = 0; i < cantidadDeNotas; i++) {
			System.out.println((i + 1) + ") " + notas[i]);
		}
	}

	public double promedio() {
		double suma = 0, promedio;

		for (int n : notas) {
			suma += n;
		}

		promedio = suma / cantidadDeNotas;

		return promedio;
	}

	public boolean aprobado() {
		boolean aprobar = false;
		if (promedio() >= 6) {
			aprobar = true;
		}
		return aprobar;
	}

}
