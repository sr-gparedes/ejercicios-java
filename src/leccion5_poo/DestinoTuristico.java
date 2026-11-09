package leccion5_poo;

public class DestinoTuristico {
	private String nombre;
	private String ciudad;
	private double precio;
	private int cuposDisponibles;
	
	public DestinoTuristico(String nombre, String ciudad, double precio, int cuposDisponibles) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.precio = precio;
		this.cuposDisponibles = cuposDisponibles;
	}
	
	
	// Metodos
	
	public void reservar(int personas) {
		if(personas <= this.cuposDisponibles) {
			this.cuposDisponibles -= personas;
		} else {
			System.out.println("Sin cupo!!");
		}
	}

	// Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCuposDisponibles() {
		return cuposDisponibles;
	}

	public void setCuposDisponibles(int cuposDisponibles) {
		this.cuposDisponibles = cuposDisponibles;
	}


	@Override
	public String toString() {
		return "DestinoTuristico [nombre = " + nombre + ", ciudad = " + ciudad + ", precio = " + precio
				+ ", cuposDisponibles = " + cuposDisponibles + "]";
	}
	
	
}
