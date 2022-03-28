package clase5;

import java.util.Arrays;

public class MinimoMain {

	public static void main(String[] args) {
		/**
		 * Buscar el numero minimo dentro del array
		 */
		
		int[] edades = {36, 31, 16, 38, 34, 29, 35, 17, 17, 16};
		
		
		
		if(edades.length > 0) {
			int minimo = calcularMinimo(edades);
			int cantidadMinimos = contarMinimno(minimo,edades);
			int[] posicionesDeLosMinimos = indicarPosiciones(cantidadMinimos, minimo, edades);
			System.out.println("El minimo es: " + minimo + ", hay " + cantidadMinimos + " y estan en: " + Arrays.toString(posicionesDeLosMinimos));
			
				
		}else {
			System.out.println("No hay a quien preguntar.");
		}
		
	}
	static int[] indicarPosiciones(int cantidadMinimos, int elMinimo, int[] edades) {
		int[] posicionesMinimos = new int[cantidadMinimos];
		int j=0;
		for(int i = 0 ; i < edades.length; i++ ) {
			if(edades[i] == elMinimo) {
				posicionesMinimos[j] = i;
				j++;
			}
			
		}
		return posicionesMinimos;
	}
	
	static int contarMinimno(int minimo, int[] edades) {
		int cantidad = 0;
		for(int i=0 ; i < edades.length; i++) {
			if(edades[i] == minimo) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	
	static int calcularMinimo(int[] edades){
		int minimo = edades[0];
		for(int i = 1; i < edades.length ; i++ ) {
			
			if (edades[i] <= minimo) {
				minimo = edades[i];
			}
			
		}
		return minimo;
	}
	
}
