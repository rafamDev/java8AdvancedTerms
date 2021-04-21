package TreeSet;

import java.util.Comparator;

public class Comparador3 implements Comparator<Articulos3> {

	@Override
	public int compare(Articulos3 o1, Articulos3 o2) {

		String descripcionA = o1.getDescripcion();
		String descripcionB = o2.getDescripcion();
		
	    return descripcionA.compareTo(descripcionB);
	}

}
