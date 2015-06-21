import java.util.ArrayList;


public class TextDruckStrategie implements DruckStrategie{
	
	@Override
	public void drucken(ArrayList<Artikel> artikelListe) {	
		for(Artikel artikel: artikelListe){
			System.out.println(artikel.getBezeichnung() + ": " + artikel.getPreis());
		}
	}
	
}
