package clase10;

import clase7.Articulo;

public class Libro extends Articulo{

	//atributos propios
	
	private String isbn;
	
	public Libro(Long id, String nombre, String autor, Double precio, String urlImagen, String isbn) {
		super(id, nombre, autor, precio, urlImagen);
		this.isbn = isbn;
	}

	public String getIsbn() {
		//misma logica
		return isbn;
	}

	public void setIsbn(String isbn) {
		//misma logica
		this.isbn = isbn;
	}

	/*@Override
	public void detalle() {
		// le digo al padre que hago lo que sabe hacer
		super.detalle();
		
		// ahora hjijo hago lo que se hacer
		System.out.println("ISBN: " + this.getIsbn());
	}
	*/
	
	//libro esta obligado a implementar el metodo detallehijo() de la  clase padre.
	@Override
	public void detalleHijo() {
		
		System.out.println("ISBN: " + this.getIsbn());
		
	}
}
