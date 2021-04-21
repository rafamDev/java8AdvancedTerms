package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Nombres2 {

	
	public static void main(String[] args) {

     ArrayList<Nombres> listaNombres = new ArrayList<Nombres>();
		
		listaNombres.add(new Nombres("Jose"));

		listaNombres.add(new Nombres("Pepe"));
		
		listaNombres.add(new Nombres("Manuel"));

		listaNombres.add(new Nombres("Joe"));
		
		
		listaNombres.remove(2);
		listaNombres.add(2,new Nombres("Rafa"));
	
		
		for(Nombres n: listaNombres) {
			
			System.out.println(n.getNombre());
			
		}
      
	    //La posicion del elemento de la lista.
		System.out.println("\n" + listaNombres.get(2).toString() + " <-Posicion(2)\n");
		
	
		Iterator <Nombres> it = listaNombres.iterator();
		
		while(it.hasNext()){
			
			Nombres nombre = it.next();
			
			System.out.println(nombre);
		//	it.remove();
			
		}
		
	}

}
