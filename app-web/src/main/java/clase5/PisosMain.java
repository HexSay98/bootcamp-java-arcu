package clase5;

import java.util.Scanner;

public class PisosMain {

	public static void main(String[] args) {
		/**
		 * construir un edificio del tama�o indicado por el usuario
		 */
		
		Scanner tecaldo = new Scanner(System.in);
		
		System.out.println("Ingrese el tama�o");
		
		int tamanio = tecaldo.nextInt();
		
		
		
		
		
		//contruyo el edificio
		String[] edificio = new String[tamanio];
		
		//mostrar el tama�o del edificio, pero usando el edificio, no la variable
		
		System.out.println(edificio.length);
 		
		//cargamos los nombres de las personas
		for( int i = 0 ; i < edificio.length ; i++  ) {
			edificio[i] = "persona" + i;
		}
		
		
		//como recorrer un array (de cuakquier tipo)
		
		for( int i = 0 ; i < edificio.length ; i++  ) {
			String laureano = edificio[i];
			System.out.println(laureano + " vive en el piso " + i);
		}
		
		tecaldo.close();
	}

}
