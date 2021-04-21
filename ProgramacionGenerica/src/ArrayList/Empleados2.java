package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class Empleados2 {

	private String nombre2;
	
	private Double sueldo2;
	
	
	
	public static void main(String[] args) {

	
		
	    ArrayList <Empleados2> listaEmpleados2 = new ArrayList(); 
	
		 listaEmpleados2.add(new Empleados2("Rafael", 2000.00));
	     
	     listaEmpleados2.add(new Empleados2("Miguel", 1500.00));
	
	     listaEmpleados2.add(new Empleados2("Mario", 1200.00));
	     
	     listaEmpleados2.add(new Empleados2("Pepe", 1000.00));
	

	     
	     
	     //Elimina el espacio sabrante de memoria preparada para almacenar la lista de elementos.
	     listaEmpleados2.trimToSize();
	     
	 
	     
	    //Numero de elemntos.
	     System.out.println("La lista tiene "+ listaEmpleados2.size() + " elementos" + "\n");
	
	
	    /* El metodo iterator() de la interfaz Iterator, recorre secencialmente los elemntos de una coleccion
	       y devuelve un objeto de tipo Iterator */
	     
	     //Iterator recoorre elemento a elemnto la coleccion.
	     //<Empleados2> especifica que tipo de objetos que hay en la coleccion.
	     //iterador especifica el nombre del iterador.
	     
	     //El objeto devuelto por el metodo iterator() se almacena en la variable de tipo interfaz Iterator.
	     //Es decir, queda guardado el iterador en esa variable.
	     
	     //Con el metodo hasNext(), devuelve un boolean para saber si hay mas objetos en la coleccion o no. 
	     
	     Iterator <Empleados2> iterador = listaEmpleados2.iterator();
	    
	      while(iterador.hasNext()) {
	    	//Recorre la coleccion mientras existan objetos.  
	    	  
	    	  //Muestra si existe objeto o no dentro de la coleccion.
	    	  System.out.println(iterador.hasNext());
		      
	    	  //Y si existen consigue cada uno de ellos con el metodo next().
	    	  //Con el metodo ToStrin pasara a texto la informacion.
	    	  System.out.println(iterador.next().toString() + "\n");
	      

	      
	      }
	    
	    
	      
	  }

	
	
	
	
	
	
	public Empleados2(String nombre, Double sueldo) {
		 
		 this.nombre2 = nombre;
		 
		 this.sueldo2 = sueldo;
		 
		 
    }

	
	
	public void setNombre(String nombre) {
		
		this.nombre2 = nombre;
		
	}
	
	
	public String getNombre() {
		
		return this.nombre2;
		
	}
	
    public void setSueldo(Double sueldo) {
		
		this.sueldo2 = sueldo;
		
	}
	
	
	public Double getSueldo() {
		
		return this.sueldo2;
		
	}
	
	
    //El metodo toString se utiliza para describir la clase, es como pasar a texto que es lo que hace la clase. Clase Object.
   @Override
   public String toString() {

	return "El empleado/a " + nombre2 + " tine un sueldo de: " + sueldo2 + " €";
		
   }
		
	   
	   
   
}
