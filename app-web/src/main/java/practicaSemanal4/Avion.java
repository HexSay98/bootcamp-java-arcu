package practicaSemanal4;

public class Avion extends Volador implements Aterrizable{

	
	Float velocidadMaxima;
	
	
	
	public Avion(String nombre) {
		super(nombre);
		
		
	}



	@Override
	public void aterrizar() {
		System.out.println("avion " + this.getNombre() + " bajando...");
	}
	
	
	
	

}
