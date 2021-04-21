package ArrayList;

public class Alumnos {

	private String nombre;
	private int id;
	
	public Alumnos(String nombre, int id) {
	
		this.nombre = nombre;
		this.id = id;
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", id=" + id + "]";
	}
	
}
