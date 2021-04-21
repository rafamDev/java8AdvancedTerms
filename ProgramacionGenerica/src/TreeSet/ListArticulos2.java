package TreeSet;

import java.util.TreeSet;

public class ListArticulos2 {

	public static void setListArticulos() {
	
    	Articulos2 a1 = new Articulos2(1, "Primer articulo");
    	Articulos2 a2 = new Articulos2(2, "Segundo articulo");
        Articulos2 a3 = new Articulos2(3, "Tercer articulo");
    	
        Articulos2 comparador = new Articulos2();
		
        TreeSet<Articulos2> listaArticulosB = new TreeSet<Articulos2>(comparador);
		
		listaArticulosB.add(a2);
		listaArticulosB.add(a3);
		listaArticulosB.add(a1);
		
		for (Articulos2 a : listaArticulosB) {
			System.out.println(a.getDescripcion());
		}
		
		
	}
}
