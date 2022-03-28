package practicaSemanal3;

import java.util.Scanner;

public class Escuela {

	public static void main(String[] args) {
		
				Scanner teclado = new Scanner(System.in);

				String[] nombreAlumnos;
				String[] apellidoAlumnos;
				int cantAlumnos;
				int cantEx;
				int[] examenes;
				int[] promedios;
				

				System.out.print("Ingrese la cantidad de alumnos: ");

				cantAlumnos = teclado.nextInt();

				nombreAlumnos = new String[cantAlumnos];
				apellidoAlumnos = new String[cantAlumnos];
				promedios = new int[cantAlumnos];
				
				System.out.print("Ingrese la cantidad de examenes: ");
				
				cantEx = teclado.nextInt();
				examenes = new int[cantEx];
				
				
				cargaDatos(teclado, nombreAlumnos, apellidoAlumnos, cantAlumnos, cantEx, examenes, promedios);
				
				
				mayoresProm(nombreAlumnos, apellidoAlumnos, promedios);
				
				menoresProm(nombreAlumnos, apellidoAlumnos, promedios);
				
				
				alumnosPromocion(nombreAlumnos, apellidoAlumnos, promedios);

				alumnosRecursar(nombreAlumnos, apellidoAlumnos, promedios);
				
				
				
				teclado.close();

			}

	private static void cargaDatos(Scanner teclado, String[] nombreAlumnos, String[] apellidoAlumnos, int cantAlumnos,
			int cantEx, int[] examenes, int[] promedios) {
		for (int i = 0; i < cantAlumnos; i++) {
			int promedio;
			int suma = 0;
			nombre(teclado, nombreAlumnos, i);

			apellido(teclado, nombreAlumnos, apellidoAlumnos, i);
			
			suma = ingresarExamen(teclado, nombreAlumnos, apellidoAlumnos, examenes, i, suma);
			
			promedio = suma / cantEx;
			promedios[i] = promedio;
		}
	}

	private static void menoresProm(String[] nombreAlumnos, String[] apellidoAlumnos, int[] promedios) {
		if(promedios.length > 0) {
			
			int minimo = promedios[0];
			
			int posMin = 0;
			
			for(int i = 1; i < promedios.length ; i++ ) {
				
				if (promedios[i] <= minimo) {
					minimo = promedios[i];
					posMin = i;
				}
			}
			System.out.println("El Alumno con menor promedio es " + nombreAlumnos[posMin] + " " + apellidoAlumnos[posMin] + " con un " + promedios[posMin]);
		}
	}

	private static void mayoresProm(String[] nombreAlumnos, String[] apellidoAlumnos, int[] promedios) {
		if(promedios.length > 0) {
			
			int posMax = 0;
			
			int maximo = promedios[0];
			
			for(int i = 1; i < promedios.length ; i++ ) {
				
				if (promedios[i] >= maximo) {
					maximo = promedios[i];
					posMax = i;
				}
			}
			System.out.println("El alumno con mayor promedio es " + nombreAlumnos[posMax] + " " + apellidoAlumnos[posMax] + " con un " + promedios[posMax]);	
		}
	}

	private static void nombre(Scanner teclado, String[] nombreAlumnos, int i) {
		System.out.print("Ingrese el nombre del alumno " + (i+1) + ": ");
		nombreAlumnos[i] = teclado.next();
	}

	private static void apellido(Scanner teclado, String[] nombreAlumnos, String[] apellidoAlumnos, int i) {
		System.out.print("Ingrese el apellido del alumno " + nombreAlumnos[i] + ": ");
		apellidoAlumnos[i] = teclado.next();
	}

	private static int ingresarExamen(Scanner teclado, String[] nombreAlumnos, String[] apellidoAlumnos, int[] examenes,
			int i, int suma) {
		for(int examen = 0; examen < examenes.length ; examen++ ) {
		boolean aux;
			do {
			System.out.print("Ingrese la nota " + (examen+1) +  " del alumno " + nombreAlumnos[i] + " " + apellidoAlumnos[i] + ": ");
			int nota = teclado.nextInt();
			if(nota >= 0 && nota <= 10) {
			examenes[examen] = nota;
			suma = suma + examenes[examen];
			aux =true;
			
		}else { aux = false;
					}
	}while(aux == false);
		}return suma;
	}

	private static void alumnosRecursar(String[] nombreAlumnos, String[] apellidoAlumnos, int[] promedios) {
		System.out.println("Los alumnos desaprobados son:");
		for(int i = 0 ; i < promedios.length ; i++) {
				if(promedios[i] < 7) {
					System.out.println(nombreAlumnos[i] + " " + apellidoAlumnos[i] + " con un " + promedios[i]);
				}
		}
	}
	private static void alumnosPromocion(String[] nombreAlumnos, String[] apellidoAlumnos, int[] promedios) {
		System.out.println("Los alumnos aprobados son:");
		for(int i = 0 ; i < promedios.length ; i++) {
				if(promedios[i] >= 7) {
					System.out.println(nombreAlumnos[i] + " " + apellidoAlumnos[i] + " con un " + promedios[i]);
				}
		}
	}
		
			
		
		
		
	}


