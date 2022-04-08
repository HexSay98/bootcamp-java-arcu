package clase10;

public class Animal {
	
	//atributos
	//encapsulamos: ocultar al mundo exterior este atributo
	
	protected String color;
	private Integer edad;
	//tipo y nombre;
	
	//constructor: forma de nacer
	
	public Animal(String color) {
		System.out.println("nace un animal");
		
	}
	
	//metodo
	
	public void hablar() {
		System.out.println("animal hablando");
	}
	
	//geter obtengo el valor de un atributo
	//no tienen parametrs porque solo obtienen valores
	//firma del metodo
	public String getColor() {
		//variable local
		String color;
		if(this.color == null) {
			color = "no hay color";
		}else {
			color = this.color;
		}
		return color;
		
	}
	
	//setter modifico el valor

	public void setColor(String nuevoColor) {
		if(nuevoColor != null) {
			this.color = nuevoColor;
		}else {
			System.err.println("no pusiste color");
		}
	}
	
	public void setEdad(Integer nuevaEdad) {
		if(nuevaEdad != null) {
			this.edad = nuevaEdad;
		}
	}
	
	
	public Integer getEdad() {
		return this.edad != null ? edad : 0;
	}

}
