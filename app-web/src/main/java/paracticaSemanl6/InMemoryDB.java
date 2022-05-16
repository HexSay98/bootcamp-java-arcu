package paracticaSemanl6;

import java.util.HashMap;
import java.util.Map;

import clase7.Articulo;

public class InMemoryDB {

	static private Map<Long,Articulo> db = new HashMap<>();
	
	public static void save(Long key,Articulo valor) throws MemoryException {
		if(key == null) {
			throw new MemoryException("el parametro key es null");
			}
			else if(valor == null) {
				throw new MemoryException("el parametro valor es null");
			}else {
				InMemoryDB.db.put(key, valor);
			}
		
	}
	
	public static void update(Long key, Articulo newValue) throws MemoryException {
		if(key == null) {
			throw new MemoryException("el parametro key es null");
			}
			else if(newValue == null) {
				throw new MemoryException("el parametro newValue es null");
			}else {
		InMemoryDB.db.replace(key,newValue);
	}
	}
	
	public static void delete(Long key) throws MemoryException {
		if(key == null) {
			throw new MemoryException("el parametro key es null");
			}
			else {
		InMemoryDB.db.remove(key);
	}
	}
	
	public static Articulo getById(Long key) throws MemoryException {
		if(key == null) {
			throw new MemoryException("el parametro key es null");
			}
			else {
		Articulo value = null;
		if(InMemoryDB.db.containsKey(key)) {
			value = InMemoryDB.db.get(key);
		}
		return value;
	}
	}

	public static void listAll(){
		System.out.println(InMemoryDB.db.values());		
	}
}
