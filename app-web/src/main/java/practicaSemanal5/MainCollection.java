package practicaSemanal5;

public class MainCollection {

	public static void main(String[] args) {
		
		String[] array = {"mundo"};
		
		CollectionCustom<String> arrayCustom = new CollectionCustom<>(array);
		System.out.println("el tamanio del array es: " + arrayCustom.size());
		
		arrayCustom.addFirst("Hola");
		arrayCustom.addLast("jaja");
		
		System.out.println("el tamanio del array es: " + arrayCustom.size());
		System.out.println("el tamanio del array es: " + array.length);
		
		arrayCustom.remove(2);
		
		System.out.println("el tamanio del array es: " + arrayCustom.size());
		
		System.out.println(arrayCustom.empty());
		
		arrayCustom.removeAll();
		
		arrayCustom.addFirst("Hola");
		
		System.out.println("el tamanio del array es: " + arrayCustom.size());
		
	}

}
