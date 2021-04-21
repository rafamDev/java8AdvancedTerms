package genericClasses3;

public class Main {

	public static void main(String[] args) {
		//I assign the data type in compile time.
		
		Size<Integer> integerNumber = new Size<Integer>(1); 
		System.out.println("Value of Size(generic subClass) -> " + integerNumber.getSize());
		
		Size<Float> floatNumber = new Size<Float>(2.45f);
		System.out.println("Value of Size(generic subClass) -> " + floatNumber.getSize());

	}

}
