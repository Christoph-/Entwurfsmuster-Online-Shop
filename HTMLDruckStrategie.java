import java.util.ArrayList;


public class HTMLDruckStrategie implements DruckStrategie{

	@Override
	public void drucken(ArrayList<Artikel> artikelListe){
		System.out.println("<table>");
		
		for(Artikel artikel: artikelListe){
			System.out.println("	<tr>\n		<td>" + artikel.getBezeichnung() + "</td>\n		<td>" + artikel.getPreis() + "</td>\n	</tr>");
		}
		
		System.out.println("</table>");
	}
	
}
