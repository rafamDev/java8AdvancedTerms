package TreeSet;

public class Articulos implements Comparable<Articulos> {

    private int numero;
    
    private String descripcion;
	
	
    public Articulos(int numero, String descripcion) {
		
    	this.numero = numero;
    	
    	this.descripcion = descripcion;
		
	}
	
    public String getDescripcion() {
    	
    	return this.descripcion;
    	
    }
    
    //Ordena por numero.
	@Override
	public int compareTo(Articulos o) {
		
		return this.numero - o.numero;
	
	}
	
}
