package LF11;

import java.util.HashMap;
import java.util.Map.Entry;

public class Postleitzahl {

	public static void main(String[] args) {
		HashMap<String, String> postleitzahl = new HashMap<>();
		
		// Einträge hinzufügen put()
		postleitzahl.put("10115","Berlin");
		postleitzahl.put("35390","Gießen");
		postleitzahl.put("35392","Gießen");
		postleitzahl.put("35394","Gießen");
		postleitzahl.put("35396","Gießen");
		postleitzahl.put("35398","Gießen");
		postleitzahl.put("10179","Berlin");
		postleitzahl.put("10117","Berlin");
		postleitzahl.put("10119","Berlin");
		postleitzahl.put("10178","Berlin");
		postleitzahl.put("10247","Berlin");
		postleitzahl.put("10367","Berlin");
		postleitzahl.put("10435","Berlin");
		postleitzahl.put("10369","Berlin");
		postleitzahl.put("60310","Frankfurt");
		postleitzahl.put("64283","Darmstadt");
		postleitzahl.put("63450","Hanau");
		postleitzahl.put("55246","Wiesbaden");
		postleitzahl.put("34117","Kassel");
		postleitzahl.put("35037","Marburg");
		postleitzahl.put("35576","Wetzlar");
		postleitzahl.put("65555","Limburg");
		
		
		// Eintrag aufrufen get()
		System.out.println(postleitzahl.get("35396"));
		
		// Eintrag löschen remove()
		postleitzahl.remove("10179");
		
		// Nach Schlüssel suchen contains.Key()
		System.out.println(postleitzahl.containsKey("35390"));
		
		// suchen was schon gellöscht
		System.out.println(postleitzahl.containsKey("10179"));
		
		// suchen was nicht enthält
		System.out.println(postleitzahl.containsKey("21487"));
		
		// Nach Wert suchen contains.Value()
		System.out.println(postleitzahl.containsValue("Gießen"));
		
		System.out.println("------------ Alle Einträge ------------");
		// Alle Einträge
		for(Entry<String, String> eintrag: postleitzahl.entrySet()) {
			System.out.println("Ort: " + eintrag.getValue() + ", PLZ: " + eintrag.getKey());
		}
		
		
		
		// 
		
		


	}

}
