package leccion5_poo;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * 8.Creá una clase nueva CuentaBancaria (atributos privados titular y saldo),
		 * con constructor, método depositar(double monto), y método retirar(double
		 * monto) que valide que haya fondos suficientes (si no, avisar sin retirar). En
		 * Ejercicio8, probá depósitos, un retiro válido y un retiro que falle.
		 */
		CuentaBancaria nuevaCuenta = new CuentaBancaria("Germán", 50);
		System.out.println(nuevaCuenta);

		// depositar
		nuevaCuenta.depositar(100);
		System.out.println(nuevaCuenta);

		// retiro valido
		nuevaCuenta.retirar(80);
		System.out.println(nuevaCuenta);

		// retiro invalido
		nuevaCuenta.retirar(800);
		System.out.println(nuevaCuenta);

	}

}
