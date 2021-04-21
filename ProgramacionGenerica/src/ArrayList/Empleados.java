package ArrayList;

import java.util.ArrayList;

public class Empleados {

	
	private String nombre;
	
	private Double sueldo;
	
	
	
	public static void main(String[] args) {

	
		
		/* ArrayList no necesita numero de posiciones. El contrucutor por defecto de la clase ArrayList,
	 * abarca de 10 elementos en el mismo espacio de memoria, si fueran necesarios mas elemntos,
	 * crearia otro espacio de memoria mas grande donde almacenaria los 11 elemntos.
	 * 
	 */
		 
		
	    ArrayList <Empleados> listaEmpleados = new ArrayList<Empleados>(); 
		
	    // listaEmpleados.ensureCapacity(4);
		// Determina el numero de elmentos que se van a utilizar. NO OBLIGA a usar el numero indicado.
		
	    
	     listaEmpleados.add(new Empleados("Rafael", 2000.00));
	     
	     listaEmpleados.add(new Empleados("Miguel", 1500.00));
	
	     listaEmpleados.add(new Empleados("Mario", 1200.00));
	     
	     listaEmpleados.add(new Empleados("Pepe", 1000.00));
	
	
	     //listaEmpleados.set(0, new Empleados("Jose", 2200.00));
	     
	     
	     //Elimina el espacio sabrante de memoria preparada para almacenar la lista de elementos.
	     listaEmpleados.trimToSize();
	     
	   
	     //Consigue la posicion solicitda [0,n] y con el ToString lo pasa a texto.
	       System.out.println(listaEmpleados.get(2).toString());
	     
	     
	     
	     //Numero de elemntos.
	     System.out.println("La lista tiene "+ listaEmpleados.size() + " elementos");
	
	
	    
	    for(Empleados e: listaEmpleados) {
	    	 
	    	 System.out.println("El empleado/a " + e.nombre + " tine un sueldo de: " + e.sueldo + " €");
	    	 
	     }
	    
	
	     
	    /*Utilizando for normal:
	     
	    for(int i = 0; i < listaEmpleados.size(); i++) {
	    	 
	    	 Empleados e = listaEmpleados.get(i);
	    	 
	    	 System.out.println(e.toString());
	    	 
	    	 
	     } */
	
	
	/*  //Pasar un ArrayList a un array normal.
	   
	    Empleados arrayEmpleados[] = new Empleados[listaEmpleados.size()];
	
	    listaEmpleados.toArray(arrayEmpleados);
	     
	    for(int i = 0; i < arrayEmpleados.length; i++) {
	    	
	    	System.out.println(arrayEmpleados[i].toString());
	    	
	    } 
	   
	*/
	
	}

	
	
	public Empleados(String nombre, Double sueldo) {
		 
		 this.nombre = nombre;
		 
		 this.sueldo = sueldo;
		 
		 
    }

	
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
    public void setSueldo(Double sueldo) {
		
		this.sueldo = sueldo;
		
	}
	
	
	public Double getSueldo() {
		
		return this.sueldo;
		
	}
	
	
    //El metodo toString se utiliza para describir la clase, es como pasar a texto que es lo que hace la clase. Clase Object.
   @Override
   public String toString() {

	return "El empleado/a " + nombre + " tine un sueldo de: " + sueldo + " €";
		
   }
		
	   
	   
   
	
	
	
	
}
