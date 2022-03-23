package clase6;

public class AutoMain2 {

	public static void main(String[] args) {
		// crear nuestro primer objeto de la clase auto
		//Clase nombreObjeto = new Clase()
		
		Auto miAuto = new Auto();
		
		miAuto.anio = 2022;
		miAuto.marca = "renault";
		miAuto.modelo = "clio mio";
		miAuto.velocidad = 0f;
		
		
 		miAuto.encender();//con el f5 me puedo meter dentro del objeto en el debug
	
		
 		miAuto.acelerar();
 		
 		
 		miAuto.apagar();
		
		System.out.println("fin del main");
		
		
		
	}

}
