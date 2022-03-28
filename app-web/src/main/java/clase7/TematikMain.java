package clase7;

public class TematikMain {

	public static void main(String[] args) {
		
		String claveB = "batman";
		
		//quiero realizar una b usqueda
		//1- crear un buscador= instanciar un objeto de la clase buscador
		//2 - ejecutar el metodo buscar de la instancia creada
		
		Buscador miBuscador = new Buscador(claveB);
		
		//miBuscador.claveBusqueda = claveB;
		
		miBuscador.buscar();//f3
		
		//mostramos cuantos resultados encuentro
		miBuscador.mostrarContidadResultados();
		
		if(miBuscador.hayResultados()) {
			
			//Como recorro los resultados?
			
			miBuscador.detalle();
			
			
		}
		//creo el carrito
		Carrito carrito = new Carrito();
		
		
		//ahora agrego los articulos impares al carrito
		
		if(miBuscador.hayResultados()) {
			for(int i = 0; i < miBuscador.getCantidadArticulos(); i++) {
				if(i%2 != 0) {
					//carrito.
				}
			}
		}
		
		
		
	}



}
