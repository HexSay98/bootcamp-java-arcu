package clase10;

import java.util.Scanner;

public class RepasoOPP {
	
	//es el punto de inicio de la aplicacion
	public static void main(String[] args) {
		
		//crear una clase: molde para crear objetos
		
		//instanciar un objeto de esa clase: objeto vivo 
		
		Animal perro = new Animal("negro"); //invocar constructor de la clase animal
		
		//ejecutar un metodo de ese objeto: accion/comportamiento del objeto vivo
		
		perro.hablar();
		
		
		
		//voy a cambiar el color del perro
		perro.setColor("negro");
		
		System.out.println("el color es " + perro.getColor());
		
		
		//le pedimos al usuario que ingrese edad del animal
		
		Scanner teclado = new  Scanner(System.in);
		Integer edad;
		do {
			System.out.println("Ingrese edad del animal");
			edad = teclado.nextInt();
		}while(edad == null);
		
		perro.setEdad(edad);
		
		System.out.println(perro.getEdad());
		
		
	}

	

}
