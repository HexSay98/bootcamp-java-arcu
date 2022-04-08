package clase11;

import java.util.Scanner;

public class MainLog {

	public static void main(String[] args) {
		
		Scanner telcado = new Scanner(System.in);
		
		String op;//fs 2 email
		String msj = "mensaje a enviar";
		
		System.out.println("ingrese cantidad");
		
		int cantidad = telcado.nextInt();
		
		//padre p =
		Log[] log = new Log[cantidad];
		
		
		
		for (int i = 0 ; i <log.length ; i++) {
			System.out.println("ingrese la opcion 1 = FS - 2 = Email");
			op = telcado.next();
			Log aux = getLog(op);
			
			
			aux.setMsj(msj);//por polimorfismo se ejecuta el setter porque al ser publico en el padre los hijos heredan tambien
			log[i] = aux;
		}
		//por polimorfimo, recorro el array y voy ejecutando metodo loguear
		for(Log s : log) {
			s.loguear();
			if(s instanceof IEjecutable) {
				IEjecutable iinterface = (IEjecutable)s;
				iinterface.ejecutar();
			}
		}
		
		
		telcado.close();
	}
	
	public static Log getLog(String op) {
		Log log;
		
		switch (op) {
		case "1":
			log = new FSLog();
			break;
		case "2":
			log = new EmailLog2();
			break;
		default:
			log = new DefaultLog();
			break;
		}
		
		
		
		return log;
	}
	
	
}
