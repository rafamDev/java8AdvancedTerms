package TreeSet;

import java.util.Comparator;

public class Articulos2 implements Comparator<Articulos2> {

    private int numero;
    
    private String descripcion;
	
	
    public Articulos2(int numero, String descripcion) {
		
    	this.numero = numero;
    	
    	this.descripcion = descripcion;
		
	}
	
    public Articulos2(){
    	
    	//Se necesita este constructor por defecto para crear el objeto comparador
    }
    
    
    public String getDescripcion() {
    	
    	return this.descripcion;
    	
    }
  
    
	//Ordena por orden alfabetico
	@Override
	public int compare(Articulos2 o1, Articulos2 o2) {
		
		String descripcionA = o1.getDescripcion();
		
		String descripcionB = o2.getDescripcion();
		
		return descripcionA.compareToIgnoreCase(descripcionB);
	}
	
}