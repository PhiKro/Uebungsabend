
public class Bank {

	public static void main(String[] args) {
		
		Konto Philipp = new Konto("Philipp Kropik","AT173837700000065599","RZSTAT2G");
		Konto Mayer = new Konto("Hans Mayer","AT373837700000065599","RZSTAT2G");

	
	Philipp.aufbuchen(50);
	Mayer.aufbuchen(40);
	
	Philipp.Kontodrucker();
	Mayer.Kontodrucker();
	Philipp.aufbuchen(50);
	Mayer.abbuchen(40);	
	Philipp.Kontodrucker();
	Mayer.Kontodrucker();
	}

}
