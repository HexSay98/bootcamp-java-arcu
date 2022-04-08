package clase7;

public class Carrito {
	
	//atributos
	private Item[] items;
	
	//constructores
	public Carrito(){
		this.items = new Item[0];
	}
	
	public void agregarCarrito(Articulo art) {
		//agregar constructor a item
		//Item i = new Item(art,1);
		//Item[] nuevos = new Item[this.items.length + 1];
		
		//copiar los actuales al nuevo
		
		//items[items.length] = i;//ojo se rmope
		//this.items = nuevos;
	}
	
	public void seguirComprando() {
		System.out.println("Seguimos comprando.");
	}
	
	public void limpiar() {
		this.items = new Item[0];
	}
	
	public void actualizar(Item[] itemsActualizados) {
		this.items = itemsActualizados;
		
	}
	
	public Double obtenerPrecio() {
		//Como calculo?
		
		Double precioFinal = 0d;
		
		for(Item unItem : this.items ) {
			precioFinal += unItem.articulo.getPrecio();
		}
		return precioFinal;
	}
	
	
	public void eliminarItem(Item itemAEliminar) {
		for(Item item : this.items) {
			if(existeItem(itemAEliminar.articulo.getId())) {
				//int pos = obtenePosicion(itemAEliminar.articulo.id);
				//podemos crear un nuevo vector con un elemento menos de lo que tiene el original
				Item[] nuevos = new Item[this.items.length - 1];
				
			}
		}
	}
	
	public Integer obtenerCantidadItems() {
		return this.items.length;
	}
	
	
	public void copiarItems() {
		Item[] nuevos = new Item[this.items.length - 1];
		for(Item item : this.items) {
			
		}
		this.items = nuevos;
	}
	
	
	public boolean existeItem(Long idArticulo){
		boolean existe = false;
		for(Item item : this.items) {
			if(item.articulo.getId().equals(idArticulo)) {
				existe = true;
				break;
			}
		}
		return existe;
	}
}
