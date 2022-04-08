package practicaSemanal4;

public class TorreMain {

	public static void main(String[] args) {
		
		Object[] voladores = CreadorDeVoladores.crearVoladores();
		
		for(Object v : voladores) {
			//cumple con el contrato
			if(v instanceof Aterrizable) {
				if (v instanceof Volador) {
					System.out.println("podes aterrizar compa aeronautico");
					((Aterrizable) v).aterrizar(); 
					
				}else {
					System.out.println("No sos de mi galaxia pero aterriza nomas");
					((Aterrizable) v).aterrizar(); 
					
				}
			}else {
				System.out.println("Prohibido aterrizar... realizar gota hacia 145 hacia el CUA");
			}
			
		}
	}

}
