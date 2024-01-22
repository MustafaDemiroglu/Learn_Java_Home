package LF11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Liste {

	public static void main(String[] args) {
		
		List<String> belag = new ArrayList<String>();
		
		// Element hinzufügen - add
		belag.add("Salami");
		belag.add("Schinken");
		belag.add("Käse");
		
		// Element auswählen - get
		System.out.println(belag.get(1));
		
		// Element löschen - remove
		belag.remove(1); // Schinken weg
		
		System.out.println(belag.get(1)); // Käse - weil Schinken gelöscht
		
		// nicht mehr möglich, da Liste nur Strings aufnehmen kann
		//belag.add(17);
		//System.out.println(belag.get(2));
		
		System.out.println("------------");
		// Anzahl der Elemente bestimmen - size (bei Array length)
		System.out.println("Anzahl der Beläge: " + belag.size());
		
		//belag.contains("Käse"); // true oder false als Rückgabe
		if(belag.contains("Käse")) {
			System.out.println("Laktosealarm");
		}else {
			System.out.println("Käse drauf oder so lassen ;-)");
		}
		
		belag.add("Paprika");
		belag.add("Tomaten");
		belag.add("Ananas");
		
		System.out.println("------------");
		
		for(int i = 0; i < belag.size(); i++) {
			System.out.println(belag.get(i));
		}
		
		// Liste sortieren - a-z
		belag.sort(null);
		
		// Alternative zu sort (vor Version 8)
		//Collections.sort(belag);
		
		System.out.println("------------");
		for(String einzelBelag:belag) {
			System.out.println(einzelBelag);
		}
		
		//belag.sort(Collections.reverseOrder());
		belag.sort(Comparator.reverseOrder());
		
		System.out.println("------------");
		for(String einzelBelag:belag) {
			System.out.println(einzelBelag);
		}
		
	}

}
