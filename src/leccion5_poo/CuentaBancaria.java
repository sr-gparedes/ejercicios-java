package leccion5_poo;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	
	public CuentaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;

	}
	
	// Metodos
	
	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	public void retirar(double monto) {
		if (monto <= this.saldo) {
			this.saldo -= monto;
		} else {
			System.out.println("Fondos insuficiente!!");
		}
	}
	
	// Getters and Setters

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [titular = " + titular + ", saldo = " + saldo + "]";
	}
	
	

}
