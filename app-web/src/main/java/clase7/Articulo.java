package clase7;

public class Articulo {
	
	Long id;
	String nombre;
	String autor;
	Double precio;
	String urlImagen;

	public Articulo(Long id, String nombre, String autor, Double precio, String urlImagen) {
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.urlImagen = urlImagen;
	}
	
	//alt+shift+s
	
	boolean tieneImagen() {
		//logica?
		return this.urlImagen != null && this.urlImagen != "";
			
	}
	
}
