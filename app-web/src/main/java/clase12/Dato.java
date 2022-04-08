package clase12;

public class Dato {
	
	private Long id;
	
	private String description;
	
	public Dato(Long id, String description) {
		super();
		this.id = id;
		//this.description = description;
		setDescription(description);
	}
	
	public void detalle() {
		System.out.println("id: " + id);
		System.out.println("descripcion: " + description);
		
		
		
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
	private void setDescription(String desc) {
		if(desc!= null) {
			this.description = desc.trim();
		}
		
	}
	

}
