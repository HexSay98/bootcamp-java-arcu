package clase9;

public class ConsolaMain {

	public static void main(String[] args) {
		
		
		Consola c = new Consola("generica", "china", 2022);
		
		//es una play?
		//no, es una consola
		
		PlayStation play = new PlayStation("PS5", "sony", 2022, "abc12345");
		
		//play es una consola = si
		// play es una playstation = si
		
		System.out.println(play instanceof Consola);
		
		
		System.out.println(c.marca);
		
	}

}
