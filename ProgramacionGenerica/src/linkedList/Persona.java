package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Persona {

	public static void main(String args[]){
		
		LinkedList<String>listaPersonas = new LinkedList<String>();
		
		listaPersonas.add("Pepe");
		listaPersonas.add("Juan");
		listaPersonas.add("Fran");
		listaPersonas.add("Jose");
		
		System.out.println(listaPersonas.size());
		
		
		ListIterator<String> it = listaPersonas.listIterator();
		
		while(it.hasNext()){
		
			 if(it.next().equals("Fran")){ 
			  
		        it.add("Josefa");
		  
			 }
		}
		
		
		for(String p : listaPersonas) {
			
			System.out.println(p);
		}
	}
	
	
}
