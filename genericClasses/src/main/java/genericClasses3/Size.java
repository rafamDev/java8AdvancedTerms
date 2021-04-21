package genericClasses3;

public class Size<T extends Number> {

	private T size;
	
	public Size(T size){
		this.size = size;
	}

	public T getSize() {
		return size;
	}
	
}
