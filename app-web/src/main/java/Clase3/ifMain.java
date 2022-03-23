package Clase3;

public class ifMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int edad = 17;
		/**
		 *  Y &&
		 */
		/**
		 * operador relacional
		 *  
		 */
		if( edad >= 18 ) { // esViernes == true
			if(edad >= 20 && edad <= 30) {
				System.out.println("Es mayor y esta entre 20 y 30");
			} else {
				System.out.println("Es mayor pero no esta pero no esta entre 20 y 30 años");
			}
		}else {
			System.out.println("Es menor de edad");
		}
		
		
		
		
		
	}

}
