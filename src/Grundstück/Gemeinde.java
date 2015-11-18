package Grundstück;

public class Gemeinde {

	public static void main(String[] args) {
		Grundstueck[] grundstueck = new Grundstueck[3];
		grundstueck[0] = new Grundstueck("Max Maier",50,30);
		grundstueck[1] = new Grundstueck("Max Muster",1000,100);
		grundstueck[2] = new Grundstueck("Max Mayer",100,30);

for(int i=0;i<grundstueck.length;i++)
	{
	if (grundstueck[i].getFlaeche()>10000)
	{
		grundstueck[i].getInhaber();
	}
	else
	{
		continue;
	}
	}

	
	
}
}