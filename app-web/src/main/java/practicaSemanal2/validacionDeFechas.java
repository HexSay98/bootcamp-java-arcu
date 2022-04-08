package practicaSemanal2;

import java.util.Scanner;

public class validacionDeFechas {

	public static void main(String[] args) {
		
		int dd;
		int mm;
		int yyyy;
		
	
		
		int valid = 0;
		
			Scanner teclado = new Scanner(System.in);
		while(valid != 3) {
				valid = 0;
			
				System.out.println("Ingrese dia:");
				
				dd = teclado.nextInt();
				
				System.out.println("Ingrese mes:");
				
				mm = teclado.nextInt();
				
				System.out.println("Ingrese año:");
				
				yyyy = teclado.nextInt();
				
				System.out.println("Analizando datos...");
				
				if( yyyy>=1900 && yyyy <=2099 ) {
					System.out.println("Año ingresado correctamente.");
					valid++;
				} 
				else {
					System.out.println("año mal ingresado.");
				}
				
				if (mm >= 1 && mm <= 12) {
					System.out.println("Mes ingresado correctamente.");
					
					valid++;
					
				} else {
					System.out.println("Mes mal ingresado.");
				}
			
				
				int i = yyyy % 4;
				
				switch (mm) {
				case 2:
					if (i == 0 && mm == 2) {
						if (dd >= 1 && dd <= 29) {
							System.out.println("Dia ingresado bien.");
							valid++;
							}
						else {
							System.out.println("Dia mal ingresado.");							
									}
					}else if (i != 0 && mm == 2) {
						if(dd >= 1 && dd <= 28) {
							System.out.println("Dia ingresado bien.");
							valid++;
							}
						else {
							System.out.println("Dia mal ingresado.");														}
					}
					break;
				case 1:
					if (dd>=1 && dd <= 31) {
					System.out.println("Dia ingresado bien.");
					valid++;
				}else {
					System.out.println("Dia mal ingresado.");					
				}
					break;
				case 3:
					if (dd>=1 && dd <= 31) {
						System.out.println("Dia ingresado bien.");
						valid++;
					}else {
						System.out.println("Dia mal ingresado.");					
					}
						break;
				case 4:
					if (dd>=1 && dd <= 30) {
						System.out.println("Dia ingresado bien.");
						valid++;
					}else {
						System.out.println("Dia mal ingresado.");					
					}
						break;
				case 5:
					if (dd>=1 && dd <= 31) {
						System.out.println("Dia ingresado bien.");
						valid++;
					}else {
						System.out.println("Dia mal ingresado.");					
					}
						break;
				case 6:
					if (dd>=1 && dd <= 30) {
						System.out.println("Dia ingresado bien.");
						valid++;
					}else {
						System.out.println("Dia mal ingresado.");					
					}
						break;
				case 7:
					if (dd>=1 && dd <= 31) {
						System.out.println("Dia ingresado bien.");
						valid++;
					}else {
						System.out.println("Dia mal ingresado.");					
					}
						break;
				case 8:
					if (dd>=1 && dd <= 31) {
						System.out.println("Dia ingresado bien.");
						valid++;
					}else {
						System.out.println("Dia mal ingresado.");					
					}
						break;
				case 9:
					if (dd>=1 && dd <= 30) {
						System.out.println("Dia ingresado bien.");
						valid++;
					}else {
						System.out.println("Dia mal ingresado.");					
					}
						break;
				case 10:
					if (dd>=1 && dd <= 31) {
						System.out.println("Dia ingresado bien.");
						valid++;
					}else {
						System.out.println("Dia mal ingresado.");					
					}
						break;	
				case 11:
					if (dd>=1 && dd <= 30) {
						System.out.println("Dia ingresado bien.");
						valid++;
					}else {
						System.out.println("Dia mal ingresado.");					
					}
						break;
				case 12:
					if (dd>=1 && dd <= 31) {
						System.out.println("Dia ingresado bien.");
						valid++;
					}else {
						System.out.println("Dia mal ingresado.");					
					}
						break;
				default:
					System.out.println("Al ingresar mal es mes no se puede comprobar el dia.");
					break;
			}
		
			if(valid ==3) {
				System.out.println("Los datos se han validado stasfactoriamente.");
			}else {
				System.out.println("Vuelva a cargar los datos.");
			}
			
	}
		
		teclado.close();
	}

}
