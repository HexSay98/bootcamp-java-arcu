package Clase3;

import java.util.Scanner;

public class forContinueMain {

	public static void main(String[] args) {
		
		int sumaDePares = 0;
		
		int restaDeImpares = 0;
		
		int cantidadDeLecturas = 4;
		
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		//ciclo for
		
		for(int i = 0 ; i < cantidadDeLecturas ; i++ ) {
			
			System.out.println("Ingrese valor");
			numero = teclado.nextInt();
			
			//pregunto si es par
			
			if(numero % 2 == 0) {
				
				sumaDePares += numero;
			
			} else {
			
			restaDeImpares += numero;
			
			}
			
			}
		
		teclado.close();
		
		System.out.println("Suma de pares= " + sumaDePares);
		
		System.out.println("Suma de impares= " + restaDeImpares);
		
		
		
		
		
		
		
	}

}
