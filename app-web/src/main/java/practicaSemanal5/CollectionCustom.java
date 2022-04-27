package practicaSemanal5;

import java.util.Arrays;

public class CollectionCustom<T> {
	
	public T[] unArrayDeT;
	
	public CollectionCustom(T[] array) {
		this.unArrayDeT = array;
	}

	public int size() {
		int tamanio = unArrayDeT.length;
		return tamanio;
	}
	
	public void addFirst(T coso) {
		T[] cosoNuevo = Arrays.copyOf(unArrayDeT, (unArrayDeT.length + 1));
		for (int i = 1; i < this.unArrayDeT.length; i++) {
			cosoNuevo[i] = this.unArrayDeT[i];
		}
		cosoNuevo[0] = coso;
		this.unArrayDeT = cosoNuevo;
		
	}
	
	public void addLast(T coso) {
		T[] cosoNuevo = Arrays.copyOf(unArrayDeT, (unArrayDeT.length + 1));
		for (int i = 0; i < this.unArrayDeT.length; i++) {
			cosoNuevo[i] = this.unArrayDeT[i];
		}
		cosoNuevo[this.unArrayDeT.length] = coso;
		this.unArrayDeT = cosoNuevo;
	}
	
	public void add(T coso) {
		T[] cosoNuevo = Arrays.copyOf(unArrayDeT, (unArrayDeT.length + 1));
		for (int i = 1; i < this.unArrayDeT.length; i++) {
			cosoNuevo[i] = this.unArrayDeT[i];
		}
		cosoNuevo[0] = coso;
		this.unArrayDeT = cosoNuevo;
	}
	
	public T[] remove(int lugar){
		int ii = lugar + 1;
		
		T[] cosoNuevo = Arrays.copyOf(unArrayDeT, (unArrayDeT.length - 1));
		for (int i = 0; i < this.unArrayDeT.length; i++) {
			if(i != lugar) {
				cosoNuevo[i] = this.unArrayDeT[i];
			}else {
				System.out.println("eliminando ando");
			}
			
		}
		for (int c = ii ; c < this.unArrayDeT.length; c++) {
			cosoNuevo[lugar] = this.unArrayDeT[c];
			lugar++;
		}
		
		this.unArrayDeT = cosoNuevo;
		return unArrayDeT;
	}
	public void removeAll() {
		
		this.unArrayDeT = null;
		
	}
	public boolean empty() {
		 boolean t;
		if(unArrayDeT.length < 0) {
			t= true;
		}else {
			t=false;
		}
		
		return t;
		
	}

}
