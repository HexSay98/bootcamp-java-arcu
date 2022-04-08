package clase11;

public class EmailLog2 extends Log {
	
	public EmailLog2() {
		super();
		Log.cont++;
	}

	public EmailLog2(String msj) {
		super(msj);
		Log.cont++;
	}

	@Override
	public void loguear() {
		System.out.println("EMAIL en c:/" + super.getMsj());
	}

}
