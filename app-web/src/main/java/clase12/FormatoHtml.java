package clase12;

public class FormatoHtml extends FormatoBase implements Formateable {

	public FormatoHtml(Dato dato) {
		super(dato);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void formatear() {
		
		String html = "<html>";
		html = html + "<p>id:" + super.getDato().getId() + "</p>";
		html = html + "<p>description:" + super.getDato().getDescription() + "</p>";
		html = html + "</html>";
		System.out.println(html);
		
	}

}
