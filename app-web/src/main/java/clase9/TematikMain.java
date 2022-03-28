package clase9;

import java.util.Scanner;

import clase7.Buscador;
import clase7.Carrito;

public class TematikMain {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int continuar;
		
		do {
			String claveB;
			
			do {
				System.out.println("Ingrese clave de busqueda");
				
				claveB = teclado.next();
				
			}while("".equals(claveB) || "".equals(claveB.trim()));
			
			
			
			Buscador miBuscador = new Buscador(claveB);
			
			miBuscador.buscar();//f3
			
			miBuscador.mostrarContidadResultados();
			
			if(miBuscador.hayResultados()) {
				
				
				miBuscador.detalle();
			}
			
			System.out.println("Desea continuar?");
			System.out.println("1=SI / 0=NO");
			
			continuar = teclado.nextInt();
		}while(continuar == 1);
		
		teclado.close();
		System.out.println("fin");
		
		
	}



}
