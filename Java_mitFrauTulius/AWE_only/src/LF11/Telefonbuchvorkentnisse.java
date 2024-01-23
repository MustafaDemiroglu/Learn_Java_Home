package LF11;

import java.util.HashMap;
import java.util.Map.Entry;

public class Telefonbuchvorkentnisse {

	public static void main(String[] args) {
		
		HashMap<String, String> telefonbuch = new HashMap<>();
		
		// Einträge hinzufügen mit put(Schlüssel, Wert)
		telefonbuch.put("+491765896542","Musterman, Max");
		telefonbuch.put("+491765896321","Beispiel, Gisela");
		telefonbuch.put("+332144789625","Beispiel, Horst");
		
		// Eintrag aufrufen, get
		System.out.println(telefonbuch.get("+491765896542"));
		
		// Eintrag löschen - remove
		telefonbuch.remove("+491765896542");
		
		// Nach Schlüsel suchen
		System.out.println(telefonbuch.containsKey("+332144789625"));
		
		// Nicht mehr vorhanden , da remove
		System.out.println(telefonbuch.containsKey("+491765896542"));
		
		// Nach Wert suchen - containsValue
		System.out.println(telefonbuch.containsValue("Beispiel, Gisela"));
		
		// Alle Einträge durchlaufen
		// For each (einzeleintrag, wasZuDurchlaufenIst
		for(Entry<String, String> eintrag: telefonbuch.entrySet()) {
			System.out.println("Name: " + eintrag.getValue() + ", Telefonnummer: " + eintrag.getKey());
		}
		
		System.out.println(suchePerson(telefonbuch, "Beispiel, Horst"));
		System.out.println(suchePerson(telefonbuch, "irgendwas"));
		System.out.println(suchePerson(telefonbuch, "Beispiel"));	
	}
	
	private static String suchePerson (HashMap<String, String> telefonbuch, String suchBegriff) {
		for(Entry<String, String> eintrag: telefonbuch.entrySet()) {
			if (eintrag.getValue().contains(suchBegriff)){
				return eintrag.getKey();
			}
		}
		return "Kein Treffer";
	}

}
