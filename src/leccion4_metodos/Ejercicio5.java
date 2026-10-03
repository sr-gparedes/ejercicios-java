package leccion4_metodos;

public class Ejercicio5 {
	public static void main(String[] args) {
		// 5. Escribí calcularPromedio(int[] numeros) que devuelva double
		int[] numeros = {24, 22, 19, 16, 10};
		System.out.printf("El promedio del array es: %.2f%n", calcularPromedio(numeros));
	}
	
	public static double calcularPromedio(int[] numeros){
	    int sumaTotal = 0;
	    
	    for (int n : numeros){
	        sumaTotal += n;
	    }
	    
	    return (double)sumaTotal/numeros.length;
	    
	}
}