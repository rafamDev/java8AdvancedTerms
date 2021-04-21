package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class MainCP {

	
	
	public static void main(String[] args) {
		
		String capShit = "";
		
		LinkedList<String> listaPaises = new LinkedList<String>();
        
		listaPaises.add("Spain");
		listaPaises.add("Portugal");
		listaPaises.add("England");
		listaPaises.add("France");
		
		
        LinkedList<String> listaCapitales = new LinkedList<String>();
        
		listaCapitales.add("Madrid");
		listaCapitales.add("Lisboa");
		listaCapitales.add("London");
		listaCapitales.add("Paris");
	
		ListIterator<String> itPaises = listaPaises.listIterator();
		ListIterator<String> itCapitales = listaCapitales.listIterator();
		
		
		//Mientras en la lista de las capitales haya un siguiente elemnto.
		while(itCapitales.hasNext()){
			
			 
			//Si hay pais, que salte un pais. es decir una posicion.
			if(itPaises.hasNext()){
				
				//Coje y salta un elemento.
				itPaises.next();
				
			}

		
			//Agreaga el siguiente elemento de (Capitales) del que acabas de saltar y coger, a (Paises). 
			itPaises.add(itCapitales.next());
			
		}
		
		
		itCapitales = listaCapitales.listIterator();
		//Volver a poner el iterador al inicio de la coleccion, es decir subirlo.
		
		
		while(itCapitales.hasNext()){
		//Esto pregunta si a continuacion del iterador hay un elemento.	
			
			//Ahora el iterador salta un elemento.
			itCapitales.next();
			
			     if(itCapitales.hasNext()){
			     //Preguntamos si hay una posicion mas.
			    	 
			        itCapitales.next();
			    	//Salta esa posicion. 
			        
			    	//Esa posiciion que saltamos se elimina. 
			        itCapitales.remove();
			  
			        //ELIMINA LOS ELEMENTOS UNA VEZ LOS PASA.
			     }
			
		}
		
	  System.out.println(listaPaises);	
		
	  System.out.println(listaCapitales);
	  
	  
	  listaPaises.removeAll(listaCapitales);
	  
	  System.out.println(listaPaises);
	  
	
	}

}
