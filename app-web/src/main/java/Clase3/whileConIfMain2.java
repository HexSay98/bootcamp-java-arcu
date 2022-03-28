package Clase3;

import java.util.Scanner;

public class whileConIfMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int cont = 0;
		
		int  numero;
		
		//decir a java que voy a leer desde el teclado
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingre dato: ");
		
		numero = teclado.nextInt();
		
		while( numero != 0 ) {
			
			if( cont < 6 ) {
				
				cont++;
				
				System.out.println("Ingre dato: ");
				
				numero = teclado.nextInt();
				
			}else {
				
				break;
				
			}
			}
			
			System.out.println("Fin");
	
			teclado.close();
	
	
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


