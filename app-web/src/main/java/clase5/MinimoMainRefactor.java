package clase5;

public class MinimoMainRefactor {

	public static void main(String[] args) {
		/**
		 * Buscar el numero minimo dentro del array
		 */
		
		int[] edades = {36, 31, 38, 34, 29, 35, 17};
		
		
		
		if(edades.length > 0) {
			
			
			int minimo = edades[0];
			
			int posMin = 0;
			
			int posMax = 0;
			
			int maximo = edades[0];
			
			int cantMinimos = 0;
			
			int cantMaximos = 0;
			
			for(int i = 1; i < edades.length ; i++ ) {
				
				if (edades[i] <= minimo) {
					minimo = edades[i];
					posMin = i;
					cantMinimos++;
				}
				if (edades[i] >= maximo) {
					maximo = edades[i];
					posMax = i;
					cantMaximos++;
				}
			}
			System.out.println("El minimo es: " + minimo + " y esta en " + posMin + " y hay: " + cantMinimos);	
			System.out.println("El maximo es: " + maximo + " y esta en " + posMax + " y hay: " + cantMaximos);
		}else {
			System.out.println("No hay a quien preguntar.");
		}
		
	}

}
