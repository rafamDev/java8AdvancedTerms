package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Clientes2 {
     
	public static void main(String[] args) {

      Clientes cl1 = new Clientes("Paco", "42", 2000);
      Clientes cl2 = new Clientes("Jose", "45", 1500);
      Clientes cl3 = new Clientes("Rafa", "40", 200);
      Clientes cl4 = new Clientes("Luis", "41", 25450);
      
      //No hay orden ni duplicado ya que en este caso no interesa.
      Set <Clientes> listaClientes = new HashSet <Clientes> ();
      
      listaClientes.add(cl1);
      listaClientes.add(cl3);
      listaClientes.add(cl4);
      listaClientes.add(cl2);
      
      
      Iterator <Clientes> it = listaClientes.iterator();
      
      while(it.hasNext()){

    	  //Consigue los nombres de los elementos de la lista.
    	 //Almacena todos los nombres uno a uno en bucle. 
		 String nombre = it.next().getNombre();
    	 
		    if(nombre.equals("Rafa")){
			   
			   System.out.println("El cliente: " + nombre + " se ha dado de baja");
			  
			   it.remove();
			   
			  }
    	    
      }
      
      System.out.println("\n" + listaClientes);
    
   
	}

}
