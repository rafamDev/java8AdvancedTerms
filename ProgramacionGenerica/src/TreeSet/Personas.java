package TreeSet;

import java.util.TreeSet;

public class Personas {

 //Los TreeSet deben ir en un metodo. NO HAY ORDEN.	
 public static void lista(){
	
	TreeSet<String> listaPersonas = new TreeSet<String>();
	
	listaPersonas.add("Juan");
	
	listaPersonas.add("Pepe");
	
	listaPersonas.add("Maria");
	
	
	for (String p : listaPersonas) {
	
		System.out.println(p);
		
	}

  }
	
}
