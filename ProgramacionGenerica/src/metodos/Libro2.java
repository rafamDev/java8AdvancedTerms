package metodos;

public class Libro2 {

	public static void main(String[] args) {
	
		Libro l1 = new Libro("Coser y Cantar", "25");
	    Libro l2 = new Libro("Soledad", "20");
	    Libro l3 = new Libro("Soledad", "20");
	
	    // l2 = l3;
	    //Indicando que la referencia de ambas instancias sean al mismo objeto.
	    
	    if(l2.equals(l3)){
	    
	    	System.out.println("Es el mismo libro");
	    	System.out.println(l2.hashCode());
	    	System.out.println(l3.hashCode());
	    	
	    }else {
	    	
	    	System.out.println("NO es el mismo libro");
	    	System.out.println(l2.hashCode());
	    	System.out.println(l3.hashCode());
	    	
	    }
	    
	}

}
