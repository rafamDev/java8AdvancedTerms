package genericClasses;

public class Main {

	public static void main(String[] args) {
		//I assign the data type in compile time.
	    Dni<String> myDNI = new Dni<String>("12345678A");
	    System.out.println("Value of DNI(Generic Class) -> " + myDNI.getDNI());
	}
}
