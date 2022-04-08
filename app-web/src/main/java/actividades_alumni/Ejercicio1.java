package actividades_alumni;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horasTotales = 1500;
		
		int dias = horasTotales / 24;
		
		int semanas = dias / 7;
		
		System.out.println("Cantidad de horas totales: " + horasTotales);
		
		System.out.println("");
		
		System.out.println("Semanas: " + semanas);

		int diasDef = dias % 7;
		
		System.out.println("Dias: " + diasDef);
		
		int horasDef = horasTotales % 24;
		
		System.out.println("Horas: " + horasDef);
		
		
	}

}
