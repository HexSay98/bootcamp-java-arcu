package paracticaSemanl6;

import clase7.Articulo;

public class AccionModificacion implements IAccion {

	@Override
	public void exec(Articulo ctx) {
		
		Articulo art = null;
		try {
			art = InMemoryDB.getById(ctx.getId());
		} catch (MemoryException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//System.out.println("Ingrese titulo nuevo");
		
		if(art != null) {
			try {
				InMemoryDB.update(ctx.getId(), ctx);
			} catch (MemoryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
