package clase7;

public class Carrito {
	
	//atributos
	Item[] items;
	
	//constructores
	Carrito(){
		this.items = new Item[0];
	}
	
	void agregarCarrito(Articulo art) {
		//agregar constructor a item
		Item i = new Item(art,1);
		Item[] nuevos = new Items[this.items.length + 1];
		
		//copiar los actuales al nuevo
		
		items[items.length] = i;//ojo se rmope
		this.items = nuevos;
	}
	
	void seguirComprando() {
		System.out.println("Seguimos comprando.");
	}
	
	void limpiar() {
		this.items = new Item[0];
	}
	
	void actualizar(Item[] itemsActualizados) {
		this.items = itemsActualizados;
		
	}
	
	Double obtenerPrecio() {
		//Como calculo?
		
		Double precioFinal = 0d;
		
		for(Item unItem : this.items ) {
			precioFinal += unItem.articulo.precio;
		}
		return precioFinal;
	}
	
	
	void eliminarItem(Item itemAEliminar) {
		for(Item item : this.items) {
			if(existeItem(itemAEliminar.articulo.id)) {
				//int pos = obtenePosicion(itemAEliminar.articulo.id);
				//podemos crear un nuevo vector con un elemento menos de lo que tiene el original
				Item[] nuevos = new Item[this.items.length - 1];
				
			}
		}
	}
	
	Integer obtenerCantidadItems() {
		return this.items.length;
	}
	
	
	void copiarItems() {
		Item[] nuevos = new Item[this.items.length - 1];
		for(Item item : this.items) {
			
		}
		this.items = nuevos;
	}
	
	
	boolean existeItem(Long idArticulo){
		boolean existe = false;
		for(Item item : this.items) {
			if(item.articulo.id.equals(idArticulo)) {
				existe = true;
				break;
			}
		}
		return existe;
	}
}
