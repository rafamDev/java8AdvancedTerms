package TreeSet;

import java.util.TreeSet;

public class ListArticulos {

	public static void setListArticulos() {
	
    	Articulos a1 = new Articulos(1, "Primer articulo");
    	Articulos a2 = new Articulos(2, "Segundo articulo");
        Articulos a3 = new Articulos(3, "Tercer articulo");
    		
        //Son ordenados con el compareTo(Articulo o) usando el int numero.
		TreeSet<Articulos> listaArticulos = new TreeSet<Articulos>();
		
		listaArticulos.add(a2);
		listaArticulos.add(a3);
		listaArticulos.add(a1);
		
		for (Articulos a : listaArticulos) {
			System.out.println(a.getDescripcion());
		}
		
	}
}
