
public class Bank {

	public static void main(String[] args) {
		
		Konto Test = new Konto("Philipp Kropik","AT173837700000065599","RZSTAT2G");
		Konto Test2 = new Konto("Philipp Kropik","AT373837700000065599","RZSTAT2G");

	Konto.getKontostand();
	Test.aufbuchen(50);
	Konto.getKontostand();
	Test.abbuchen(40);
	Test.getKontostand();
	Test2.getKontostand();
	}

}
