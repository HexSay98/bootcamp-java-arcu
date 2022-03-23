package clase6;

public class Auto {
	//atributos = variable
	String marca;
	Float velocidad;
	Float velocidadMaxima;
	String modelo;
	Integer anio;
	boolean encendido;
	
	
	//agrego el constructor que se anulo por usar el parametrizado
	Auto(){
		init();
	}
	
	
	//contructor
	Auto(String marcaParametro, String modeloNacimiento, Integer anioDeNacimiento, Float velocidadMaximaNa){
		marca = marcaParametro;
		modelo = modeloNacimiento;
		anio = anioDeNacimiento;
		velocidadMaxima = velocidadMaximaNa;
		//por defecto
		init();
	}
	
	//metodos = funciones
	// los metodos modifican la/s variables dentro de la clase 
	
	void init() {
		encendido = false;
		velocidad = 0f;
	}
	
	
	void encender(){
		if (!encendido) {
			encendido = true;
			System.out.println("ralenti...");
		}else {
			System.out.println("Ya esta encendido, no se puede encender otra vez");
		}
	}
	void apagar() {
		if (encendido) {
			//frenar mientras la velocidad sea >0
			while(velocidad > 0) {
				frenar();
			}
				encendido = false;
			System.out.println("Se apago");			
		} else {
			System.out.println("no se puede apagar mas de una vez");
		}
	}
	void acelerar() {
		//solo acelera si esta encendido 
		if(encendido) {
			velocidad++;
			System.out.println("Acelerando...");
		}else {
			System.out.println("debe encender el auto para acelerar");
		}
		
		
	}
	
	void frenar() {
		if(encendido) {	
			if(velocidad>=1) {
				velocidad --;
			}else {
				System.out.println("Esta detenido");
		}
	} else {
		System.out.println("Esta apagado");
	}
}
}
