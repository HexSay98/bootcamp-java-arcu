package Clase4;

public class repaso {

	public static void main(String[] args) {
		
		//tipos de datos
		
		//datos primitivos
		//char, byte, short, int, long, float, double
		//string (no es primitivo)
		
		//operadores
		/*
		 * aritmeticos
		 * 		+,-,/,*(hay mas)
		 */
		
		
		
		/**
		 * 
		 * logicos
		 * and &&
		 * or ||
		 * nor!
		 * xor 
		 */
		
		
		
		
		
		
		
		
			
		}
		
		
	static float XMas2 (float x) {
		
		float i = x + 2;
		
		return i;
		
	}
		
		
		static float dividir(float a, float b) {
		
			float res;
			
			if(b != 0) {
				res = a/b;
			}else {
				System.out.println("No se puede dividir por 0");
				
				res = -1;
				
			}
			return res;
			
			
		
	}
		
		
		
		static void mostrarParidad(float numero) {
			
			boolean esPar = (numero % 2 == 0) ? true : false;
			
			System.out.println(esPar ? "es pas" : "impar");
			
			
		}
		
		
		
		
		
	}


