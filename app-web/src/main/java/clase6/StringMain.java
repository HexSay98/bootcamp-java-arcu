package clase6;

public class StringMain {
	
	public static void main(String[] args) {

	String palabra = "hola soy de river el mejor de america";
	
	if(palabra.startsWith("h")) {
		System.out.println("empiza con H vieja");
	}else {
		System.out.println("no arranca con h vieja");
	}
	
	char primerCaracter = palabra.charAt(0); //te dice el caracter que le indicas
	
	if(primerCaracter == 'h') {
		System.out.println("si");
	}else {
		System.out.println("no");
	}
	
	
	Object edad = new Integer(10);
	Object nombre = "carlos";
	Object letra = new Character('a');
	 
	
	Object[] unArrayCualquiera = {edad, nombre, letra};
	
	for(Object aux : unArrayCualquiera) {
		//instanceof
		if(aux instanceof Integer) {
			Integer auxInteger = (Integer)aux;
			System.out.println(auxInteger);
		}else if(aux instanceof String) {
			String auxString = (String)aux;
			System.out.println(auxString);
		}else {
			Character auxChar = (Character)aux;
			System.out.println(auxChar);
		}
		
		
	}
	
	
	
	
	
	
	
	}
}
