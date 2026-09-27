package leccion1_variables;

public class Ejercicio7 {

	public static void main(String[] args) {
		// 7. Intercambia los valores de a = 3 y b = 7 usando una variable auxiliar.
		int a = 3, b = 7, c;

		System.out.println("Intercambiemos los valores de 'a = " + a + "' y 'b = " + b + "'");

		c = a;
		a = b;
		b = c;

		System.out.println("El valor de 'a' ahora es: " + a);
		System.out.println("El valor de 'b' ahora es: " + b);

	}
}
