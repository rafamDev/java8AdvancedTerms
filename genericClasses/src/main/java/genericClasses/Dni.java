package genericClasses;

public class Dni<T> {

	private T dni;
	
	public Dni(T dni){
	   this.dni = dni;
	}
	
	public T getDNI(){
		return this.dni;
	}
	
}
