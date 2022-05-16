package paracticaSemanl6;

import clase7.Articulo;

public class AccionAlta implements IAccion {

	@Override
	public void exec(Articulo ctx) {

		//usa la base de datos en memoria
		try {
			InMemoryDB.save(ctx.getId(), ctx);
		} catch (MemoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
