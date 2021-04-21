package TreeSet;

import java.util.TreeSet;

public class ListArticulos3 {
	
	public static void setListArticulos() {
		
    	Articulos3 a1 = new Articulos3(1, "Primer articulo");
    	Articulos3 a2 = new Articulos3(2, "Segundo articulo");
        Articulos3 a3 = new Articulos3(3, "Tercer articulo");
    	
        Comparador3 comparador = new Comparador3();
		
        TreeSet<Articulos3> listaArticulos = new TreeSet<Articulos3>(comparador);
		
		listaArticulos.add(a2);
		listaArticulos.add(a3);
		listaArticulos.add(a1);
		
		for (Articulos3 a : listaArticulos) {
			System.out.println(a.getDescripcion());
		}
		
		
	}
}
