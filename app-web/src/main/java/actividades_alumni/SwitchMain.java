package actividades_alumni;

import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {
		/**
		 * Realizar una mini calculadora
		 * operaciones:
		 * +,-,/,*
		 * 
		 * El usuario ingrear la operacion(+,/,*,- 0 PARA SALIR)
		 * 0,1,2,3,4 (0=salir; 1=resta; 2=mult; 3=divi; 4 =suma)
		 */
		//switch
		//ascci ?
		//if
		//do;while
		
		int opcion;
		double res;
		double a;
		double b;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese operacion: ");
		System.out.println("0=salir, 1=suma, 2=resta; 3=multi, 4=div");
		opcion = teclado.nextInt();
		
		if(opcion == 1) {
			System.out.println("Ingrese a");
			a = teclado.nextDouble();
			
			System.out.println("Ingrese b");
			b = teclado.nextDouble();
			
			res = a + b;
			
			mostrarResultado(res, "+");
		}else if(opcion == 2) {
			System.out.println("Ingrese a");
			a = teclado.nextDouble();
			
			System.out.println("Ingrese b");
			b = teclado.nextDouble();//f6
			
			res = a - b;
			
			mostrarResultado(res, "-");//f5
		}else if(opcion == 3) {
			System.out.println("Ingrese a");
			a = teclado.nextDouble();
			
			System.out.println("Ingrese b");
			b = teclado.nextDouble();
			
			res = a * b;
			
			mostrarResultado(res, "*");
		}else if(opcion == 4) {
			System.out.println("Ingrese a");
			a = teclado.nextDouble();
			
			System.out.println("Ingrese b");
			b = teclado.nextDouble();
			
			if(b != 0) {
				res = a / b;
				mostrarResultado(res, "/");
			}else {
				System.out.println("No se puede divir por 0");
			}
		}else {
			if(opcion  == 0){
				System.exit(1);
			}
		}
		teclado.close();
		
		System.out.println("Salida exitos");
	}

	static void mostrarResultado(double res, String operacion) {
		System.out.println(" La operacion " + operacion + " = " + res);//f6
	}//f7
}
