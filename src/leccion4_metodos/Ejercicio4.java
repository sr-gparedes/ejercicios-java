package leccion4_metodos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 4. Escribí mayorDeTres(int a, int b, int c) que devuelva el mayor.
		System.out.print("Ingrese un número: ");
		int a = Integer.parseInt(input.nextLine());
		
		System.out.print("Ingrese su segundo número: ");
		int b = Integer.parseInt(input.nextLine());
		
		System.out.print("Ingrese su tercer número: ");
		int c = Integer.parseInt(input.nextLine());
		
		System.out.println("El número maoyr es: " + mayorDeTres(a, b, c));
		
		input.close();
	}
	
	public static int mayorDeTres(int a, int b, int c){
		int comparacion = Math.max(a, b);
		int numMayor = Math.max(comparacion, c);
		return numMayor;
	}
}
