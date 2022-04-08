package clase12;

public class ServiceMain {

	public static void main(String[] args) {
		
		String sitio = "2";
		
		//creo mi servicio en base a la clase 
		IService service = ServiceBuider.buildService(sitio);
		//ctrl + t
		Dato dato = service.consultar();
		
		dato.detalle();
		
		Formateable formateador = new FormatoHtml(dato);
		
		formateador.formatear();
		
	}

}
