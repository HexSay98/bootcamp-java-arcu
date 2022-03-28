package clase7;

public class Buscador {
	
	
	
	//atributos
	String claveBusqueda;
	Articulo[] articulos;
	Integer cantidad;
	
	
	//constructor
	public Buscador() {
		claveBusqueda = "";
		articulos = new Articulo[0];
		cantidad = 0;
	}
	
	public Buscador(String claveBusqueda) {
		//this
		this.claveBusqueda = claveBusqueda;
		
		
		
	}
	
	
	//metodos
	
	public void buscar(){
		//alguien me da los articulos
		Articulo[] resultados = new Articulo[3];
		resultados[0] = new Articulo(1l,"batman contra las feministas", "mark miller", 1540.9d, "https://pbs.twimg.com/profile_images/815376849668861952/iynHInHo_400x400.jpg");
		
		resultados[1] = new Articulo(2l,"batman tocador", "paul bntz", 500.3D, "https://pbs.twimg.com/profile_images/815376849668861952/iynHInHo_400x400.jpg");
		
		resultados[2] = new Articulo(3l,"batman enfiestado", "paul bntz", 500.3D, "https://pbs.twimg.com/profile_images/815376849668861952/iynHInHo_400x400.jpg");
		
		this.articulos = resultados;
		
		//ahora que tengo el total de los articulos uso el legth de ese vector para actualizar la cantidad
		
		cantidad = resultados.length;
	}

	public void mostrarContidadResultados() {
		System.out.println("Hemos encontrados " + this.cantidad + " resultados para " + this.claveBusqueda);
	}
	
	void detalle() {
		for(int i = 0;i<this.cantidad;i++ ) {
			//me quedo con el articulo en la posicion i
			Articulo aux = this.articulos[i];
			System.out.println(aux.nombre);
			System.out.println(aux.autor);
			//solo mostrar la img si tiene una como hago?
			if(aux.tieneImagen()) {
			System.out.println(aux.urlImagen);
			}else {
				System.out.println("no tiene, muestro marca de agua");
			}
		}
	}

	public boolean hayResultados() {
		// TODO Auto-generated method stub
		return this.cantidad > 0;
	}
	
	
	
	
	
	
}
