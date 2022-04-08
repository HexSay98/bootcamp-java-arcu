package practicaSemanal4;

public class CreadorDeVoladores {

	public static Object[] crearVoladores() {
		
		Volador avion = new Avion("Avion1");
		Helicoptero h1 = new Helicoptero("ApacheNess");
		Superman clark = new Superman();
		Ovni o = new Ovni();
		
		Object[] voladores = {avion, h1,clark,o};
		
		return voladores;
	}

}
