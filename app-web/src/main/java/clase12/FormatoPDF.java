package clase12;

public class FormatoPDF extends FormatoBase implements Formateable {

	public FormatoPDF(Dato dato) {
		super(dato);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void formatear() {
		
		System.out.println("Formateando en PDF");
	}

}
