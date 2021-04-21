package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Alumnos2{

	public static void main(String args[]) {
	
	Alumnos RRMFG = new Alumnos("Rafael",1234);
	Alumnos JMG = new Alumnos("Jose", 5678);
	Alumnos LFS = new Alumnos("Luis", 3456);
	Alumnos JAN = new Alumnos("Juan",2389);
	
	Alumnos PRF = new Alumnos("Pepe",2341);
	
	ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();
	
	listaAlumnos.add(RRMFG);
	listaAlumnos.add(JMG);
	listaAlumnos.add(LFS);
	listaAlumnos.add(JAN);
	
	listaAlumnos.add(1,PRF);
	
	
	Iterator<Alumnos> it = listaAlumnos.iterator();
	
	while(it.hasNext()){
		
		Alumnos alumnos = it.next();
		
		if(alumnos.equals(RRMFG)){
		
			System.out.println(alumnos);
		
		}
	
	}
	
	System.out.println(listaAlumnos);
	
	System.out.println(listaAlumnos.indexOf(LFS));
	
	System.out.println(listaAlumnos.contains(RRMFG));
	
 }
}
