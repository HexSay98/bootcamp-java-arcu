package clase7;

import clase10.Libro;
import clase10.Musica;
import clase10.Pasatiempo;

public class Buscador {
	
	
	
	//atributos
	private String claveBusqueda;
	private Articulo[] articulos;
	private Integer cantidad;
	
	
	//constructor
	public Buscador() {
		claveBusqueda = "";
		articulos = new Articulo[0];//vector vacio
		cantidad = 0;
	}
	
	public Buscador(String claveBusqueda) {
		//this
		this.claveBusqueda = claveBusqueda;
		articulos = new Articulo[0];//vector vacio
	}
	
	
	//metodos
	
	public void buscar(){
		//alguien me da los articulos
		Articulo[] resultados = new Articulo[3];
		resultados[0] = new Libro(1l,"batman contra las feministas", "mark miller", 1540.9d, "https://pbs.twimg.com/profile_images/815376849668861952/iynHInHo_400x400.jpg","laureano");
		String[] temas = {"tema1", "tema2", "rock in roul"};
		resultados[1] = new Musica(2l,"batman tocador", "paul bntz", 500.3D, "https://pbs.twimg.com/profile_images/815376849668861952/iynHInHo_400x400.jpg",temas);
		((Musica)resultados[1]).agregarTemas("tema 3");
		
		resultados[2] = new Pasatiempo(3l,"batman enfiestado", "paul bntz", 500.3D, "https://pbs.twimg.com/profile_images/815376849668861952/iynHInHo_400x400.jpg", "hasbro");
		
		this.articulos = resultados;
		
		//ahora que tengo el total de los articulos uso el legth de ese vector para actualizar la cantidad
		
		cantidad = resultados.length;
	}

	public void mostrarContidadResultados() {
		System.out.println("Hemos encontrados " + this.cantidad + " resultados para " + this.claveBusqueda);
	}
	
	public void detalle() {
		for(int i = 0;i<this.cantidad;i++ ) {
			//me quedo con el articulo en la posicion i
			Articulo aux = this.articulos[i];
			aux.detalle();
			System.out.println("---------------");
		}
	}

	public boolean hayResultados() {
		// TODO Auto-generated method stub
		return this.cantidad > 0;
	}
	
	public int getCantidadArticulos() {
		int cantidad = 0;
		if(this.articulos != null) {
			this.cantidad = this.articulos.length;
		}
		return cantidad;
	}

	public Articulo[] getResultados() {
		return this.articulos;
	}
	
	
	
	
}
