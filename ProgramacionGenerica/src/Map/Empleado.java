package Map;

public class Empleado {

	
	private String nombre;
	
	private double sueldo;
	
	
	public Empleado(String nombre) {
		
		this.nombre = nombre;
		
		this.sueldo = 2000.00;
		
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}


	
	
}
