
public class Konto {
	
	private static String Kontoinhaber;
	private static String IBAN;
	private static String BIC;
	private static double Kontostand;
	
	public Konto(String Inhaber, String IBAN,String BIC)
	{
		Kontoinhaber =Inhaber;
		Konto.IBAN = IBAN;
		Konto.BIC = BIC;
		Konto.Kontostand = 0.0;
	}

	public void aufbuchen(double betrag)
	{
		Kontostand += betrag;
	}
	
	public void abbuchen(double betrag)
	{
		if (Kontostand >= betrag)
			{
				Kontostand -= betrag;
			}
		else
			{
				System.out.println("Nicht genügend Guthaben, Buchung abgbrochen!");
			}
	}

	public static String getIBAN() {
		return IBAN;
	}
	public static String getBIC() {
		return BIC;
	}
	public static double getKontostand() {
		System.out.println("Der Kontostand Beträgt: "+Kontostand +"€"); 
		return Kontostand;
		}
	
}