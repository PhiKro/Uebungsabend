package Grundstück;

public class Grundstueck {
	private String Inhaber;
	private int laenge;
	private int breite;
	
	public Grundstueck(String Inha,int laen,int brei){
		Inhaber = Inha;
		laenge = laen;
		breite = brei;
	}

	public int getFlaeche(){
		int Flaeche = laenge*breite;
		return Flaeche;
	}

	public String getInhaber() {
		System.out.println(Inhaber);
		return Inhaber;
	}


	public void setInhaber(String inhaber) {
		Inhaber = inhaber;
	}


	public int getLaenge() {
		return laenge;
	}


	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}


	public int getBreite() {
		return breite;
	}


	public void setBreite(int breite) {
		this.breite = breite;
	}
	

}
