package Clase3;

import java.util.Scanner;

public class whileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int cont = 0;
		
		int  numero;
		
		//decir a java que voy a leer desde el teclado
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingre dato: ");
		
		numero = teclado.nextInt();
		
		while(numero != 0 && cont < 6 ) {
			cont++;
			
			System.out.println("Ingre dato: ");
			
			numero = teclado.nextInt();
		}
		
		System.out.println("Fin");
		
		teclado.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
