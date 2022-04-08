package clase9;

import clase10.Libro;
import clase7.Articulo;

public class OOPMain {
	public static void main(String[] args) {
		//dentro del paquete clase7 puedo instanciar un articulo porque el constructor es public
		
		//Articulo a = new Articulo(null, null, null, null, null); 
	
		//si un atributo es publico lo puedo ver y modificar
		
		//a.color = "blanco";
		
		//a.setId(100l);
		
		
		Articulo a = new Libro(null, null, null, null, null, null);
		
		System.out.println(a.color);
		
		
		
		
	}
}
