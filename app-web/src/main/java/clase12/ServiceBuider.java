package clase12;

public class ServiceBuider {
	
	public final static IService buildService(String site) {
		
		//interface i = new ClaseQueImplementaLaInterface();
		
		IService service;
		
		switch (site) {
			case "1":
				service = new ServiceS1();
				break;
				
			case "2":
				service = new ServiceS2();
				break;
			
			default:
				service = new DefaultService();
				break;
		}
	
		return service;
}
}