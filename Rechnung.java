import java.util.ArrayList;


public class Rechnung {

	Artikel artikel;
	DruckStrategie strategie;
	ArrayList<Artikel> artikelListe = new ArrayList<>();

	public void add(String bezeichnung, double preis){
		artikel  = new Artikel(bezeichnung, preis);
		artikelListe.add(artikel);
	}

	public void drucken(){
		strategie.drucken(artikelListe);
	}

	public void setDruckStrategie(DruckStrategie druckStrategie){
		this.strategie = druckStrategie;
	}
	
	public static void main(String[] args){
		Rechnung rechnung = new Rechnung();
		TextDruckStrategie text = new TextDruckStrategie();
		HTMLDruckStrategie html = new HTMLDruckStrategie();
		
		rechnung.add("Turnschuhe", 12.99);
		rechnung.add("Ball", 7.99);
		
		rechnung.setDruckStrategie(text);
		rechnung.drucken();
		
		rechnung.setDruckStrategie(html);
		rechnung.drucken();
	}
	
}
