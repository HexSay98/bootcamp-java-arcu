package clase10;

public class Oviparos extends Animal{
	
	//tiene lo mismo que un animal
	
	public Oviparos(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	private Float tamanioHuevo;
	
	//nacen de una manera particular
	
	//sus propios metodos
	
	
	public void setHue(Float cm) {
		if(cm > 0) {
			this.tamanioHuevo = cm;
		}else {
			System.out.println("ingrese un tama�o correcto");
		}
		
		
	}
	
	
	
	
	
}
