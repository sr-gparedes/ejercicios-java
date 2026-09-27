package leccion1_variables;

public class Ejercicio4 {
	public static void main(String[] args) {
		// 4. Calcula el área y el perímetro de un rectángulo de base 8 y altura 5.
		int base = 8;
		int altura = 5;

		int area = base * altura;
		int perimetro = 2 * (base + altura);

		System.out.println("Área: " + area);
		System.out.println("Perímetro: " + perimetro);
	}
}