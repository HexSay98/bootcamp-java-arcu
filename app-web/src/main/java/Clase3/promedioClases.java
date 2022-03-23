package Clase3;

import java.util.Scanner;

public class promedioClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Calcular promedio de notas de un alumno.
		 * Se debe ingresar las tres notas del alumno.
		 * Si el promedio supera 7 esta aprobado.
		 * Si el promedio es menor que 7 informar que debe recuperar.
		 */
		
		//necesito 4 variables de tipo float, uno para cada nota y una para el promedio.
		
		float primerNota;
		
		float segundaNota;
		
		float terceraNota;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese primer nota: ");
		
		primerNota = teclado.nextFloat();
		
		System.out.println("Ingrese segunda nota: ");
		
		segundaNota = teclado.nextFloat();
		
		System.out.println("Ingrese tercera nota: ");
		
		terceraNota = teclado.nextFloat();
		
		
		//Calculo promedio de notas:
		
		float promedio = (primerNota + segundaNota + terceraNota) / 3;
		
		if(promedio >= 7) {
			System.out.println("Aprobaste negro con un " + promedio );
		} else {
			System.out.println("Segui participando fraca te sacaste un " + promedio);
		}
		
		teclado.close();
		
		
		
		
		
		

	}

}
