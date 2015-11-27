
public class Konto {
	
	private String Kontoinhaber;
	private String IBAN;
	private String BIC;
	private double Kontostand;
	
	public Konto(String Inhaber, String IBAN,String BIC)
	{
		Kontoinhaber = Inhaber;
		this.IBAN = IBAN;
		this.BIC = BIC;
		Kontostand = 0.0;
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

	public String getIBAN() {
		return IBAN;}
	
	public String getBIC() {
		return BIC;}
	
	public double getKontostand() {
		System.out.println("Der Kontostand Beträgt: "+Kontostand +"€"); 
		return Kontostand;}
	
	public String getOwner(){
	return Kontoinhaber;}
	
	public void Kontodrucker(){
	System.out.println("*********************************");
	System.out.println("Kontoinhaber: " + Kontoinhaber);
	System.out.println("IBAN: " + IBAN);
	System.out.println("BIC: " + BIC);
	System.out.println("Kontostand: " + Kontostand);
	System.out.println("*********************************");
	System.out.println("");
	}
	}