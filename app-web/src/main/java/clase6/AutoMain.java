package clase6;

public class AutoMain {

	public static void main(String[] args) {
		// crear nuestro primer objeto de la clase auto
		//Clase nombreObjeto = new Clase()
		
		Auto miAuto = new Auto("renault","clio mio",2022,200f);
		
		Auto miAuto2 = new Auto("renault","clio mio",2022,200f);
 		miAuto.encender();//con el f5 me puedo meter dentro del objeto en el debug
		miAuto.encender();
		
		//uso los mismos valores que tiene miauto en miauto2
		
		miAuto2.anio = miAuto.anio;
		
		//recolector de basura "garbage collector" dentro de la vm
		
		//puedo matar un objeto?
		
		miAuto = null;
		
		//le puedo pedir algo mas?
		
		//miAuto.encender();
		
		//revivo al objeto
		
		miAuto = new Auto("renault","clio mio",2022,200f);
		
		miAuto.encender();
		
		
		
		
		
		
	}

}
