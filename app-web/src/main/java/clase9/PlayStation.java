package clase9;

public class PlayStation extends Consola {
	
	//aributos propios
	
	private String codigoPlayNetwork;
	
	//ctrl o o
	
	//implemento el contructor del padre
	
	public PlayStation(String marca, String empresa, int anio, String codigoPlayNetwork) {
		//la primer linea del constructor del hijo es invocar al constructor del padre
		super(marca, empresa, anio);
		
		
		this.codigoPlayNetwork = codigoPlayNetwork;

	}
}
