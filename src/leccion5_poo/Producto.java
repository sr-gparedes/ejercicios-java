package leccion5_poo;

public class Producto {
	private String nombre;
	private double precio;
	private int cantidadEnStock;

	public Producto(String nombre, double precio, int cantidadEnStock) {
		this.nombre = nombre;
		this.setPrecio(precio);
		this.setCantidadEnStock(cantidadEnStock);
	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.setPrecio(precio);
	}

	// Metodos

	public double valorTotal() {
		return this.precio * this.cantidadEnStock;
	}
	
	public void aumentarPrecio(double porcentaje) {
		double aux = porcentaje * 0.01;
		double aumento = this.precio * aux;
		this.precio += aumento;
	}
	
	public static Producto masCaro(Producto[] productos) {
		Producto productoMasCaro = productos[0];
		
		for (Producto p : productos) {
			if (productoMasCaro.getPrecio() < p.getPrecio()) {
				productoMasCaro = p;
			}
		}
		
		return productoMasCaro;
	}

	// Getters and Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean setPrecio(double precio) {
		boolean valido = true;
		if (precio >= 0) {
			this.precio = precio;
		} else {
			System.out.println("El precio ingresado es invalido!!");
			valido = false;
		}

		return valido;

	}

	public int getCantidadEnStock() {
		return cantidadEnStock;
	}

	public boolean setCantidadEnStock(int cantidadEnStock) {
		boolean valido = true;
		if (cantidadEnStock >= 0) {
			this.cantidadEnStock = cantidadEnStock;
		} else {
			System.out.println("La cantidad en stock ingresada es invalida!!");
			valido = false;
		}

		return valido;

	}

	@Override
	public String toString() {
		return "Producto [nombre = " + nombre + ", precio = " + precio + ", cantidadEnStock = " + cantidadEnStock + "]";
	}

}
