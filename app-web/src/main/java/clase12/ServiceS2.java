package clase12;

public class ServiceS2 implements IService {

	@Override
	public Dato consultar() {
		String res = "id0001nombrecarlos    saldo01550";
		
		//substring(start,end) incluye start, excluye end
		
		String ids = res.substring(2,6);
		
		String nonmbres = res.substring(12,22);
		//nonmbres = nonmbres.trim();
		
		String saldos = res.substring(res.length()-5,res.length());
		
		return new Dato(Long.parseLong(ids), nonmbres);
	}

}
