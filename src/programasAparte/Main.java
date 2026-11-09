package programasAparte;

public class Main {

	public static void main(String[] args) {
		Alumno[] alumnos = new Alumno[6];
		alumnos[0] = new Alumno("Evelyn", 5);
		alumnos[1] = new Alumno("German", 5);
		alumnos[2] = new Alumno("Joaquin", 5);
		alumnos[3] = new Alumno("Lucia", 5);
		alumnos[4] = new Alumno("Ambar", 5);
		alumnos[5] = new Alumno("Jesica", 5);

		// notas del primer alumno
		alumnos[0].agregarNota(10);
		alumnos[0].agregarNota(10);
		alumnos[0].agregarNota(10);
		alumnos[0].agregarNota(10);
		alumnos[0].agregarNota(10);

		// notas del segundo alumno
		alumnos[1].agregarNota(10);
		alumnos[1].agregarNota(8);
		alumnos[1].agregarNota(9);
		alumnos[1].agregarNota(7);
		alumnos[1].agregarNota(6);

		// notas del tercer alumno
		alumnos[2].agregarNota(6);
		alumnos[2].agregarNota(7);
		alumnos[2].agregarNota(9);
		alumnos[2].agregarNota(8);
		alumnos[2].agregarNota(10);

		// notas del cuarto alumno
		alumnos[3].agregarNota(8);
		alumnos[3].agregarNota(9);
		alumnos[3].agregarNota(8);
		alumnos[3].agregarNota(9);
		alumnos[3].agregarNota(8);

		// notas del quinto alumno
		alumnos[4].agregarNota(9);
		alumnos[4].agregarNota(9);
		alumnos[4].agregarNota(9);
		alumnos[4].agregarNota(9);
		alumnos[4].agregarNota(9);
		
		
	}
	
	public static int cuantosAprobaron(Alumno[] arr) {
		int cantidadAprobados = 0;
		for (Alumno n : arr) {
			if(n.aprobado()) {
				cantidadAprobados++;
			}
		}
		return cantidadAprobados;
	}

}
