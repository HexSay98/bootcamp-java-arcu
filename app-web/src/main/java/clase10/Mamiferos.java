package clase10;

public class Mamiferos extends Animal{
	
	//tiene lo mismo que un animal
	
	private Integer tiempoGestacion;
	
	//nacen de una manera particular
	
	public Mamiferos(String color, Integer tiempoG) {
		//la primer linea del constructor del hijo debe ser llamar al constructor del padre
		super(color);
		
		//ahora que nacio el padre, seteo al hijo
		this.tiempoGestacion = tiempoG;
		super.getEdad();
	}
	
	//sus propios metodos
	
	
	
	
	
	
	
	
	
	
	
}
