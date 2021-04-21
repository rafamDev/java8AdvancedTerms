package Map;

import java.util.*;

public class Personal {

	
 public static void getListaPersonal(){
	
	Empleado empleado1 = new Empleado("Jose");
	Empleado empleado2 = new Empleado("Pepe");
	Empleado empleado3 = new Empleado("Maria");
	
	HashMap<String,Empleado> personal = new HashMap<String,Empleado>();
	
	personal.put("1A", empleado1);
	personal.put("1B", empleado2);
	personal.put("2A", empleado2);
	
	personal.put("2A", new Empleado("Rafael"));
	//Lo que hace el HashMap es substituir el elemento repetido por el actual.
	
	
	//Map.Entry es necesaria para utilizar los metodos gettersKV. (Es una interfaz interna que implementa la clase Map)
	//El metodo entrySet() devuelve el map en forma de coleccion.
	for (Map.Entry<String, Empleado> entrada: personal.entrySet()) {
		
		String clave = entrada.getKey();
		
		Empleado valor = entrada.getValue();
		
		System.out.println("Clave: " + clave + " Valor: " + valor);
	
	
	}
  }
}
