package LF11;

import java.util.LinkedList;
import java.util.Queue;

public class Warteschlange {

	public static void main(String[] args) {
	
		Queue<Kunde> kunden = new LinkedList<Kunde>();
		
		// Kunden hinzufügen zur Warteschange
		kunden.add(new Kunde("Harry", 5));
		kunden.add(new Kunde("Mustafa", 17));
		kunden.add(new Kunde("Christian", 1));
		kunden.add(new Kunde("Thomas",3));
		kunden.add(new Kunde("Deniz", 45));
		kunden.add(new Kunde("Marvin", 2));
		
		for(int i = 0; i < kunden.size();) {
			//wählt nächsten Kunden aus
			System.out.println(kunden.poll());
		}
		
		System.out.println("-----------------");
		
		while (!kunden.isEmpty()) {
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		
		// Wieviele Kunden stehen in Schlange? - size
		// Wer ist der nächste Kunde? - peek
		// nach kassieren den Kunden aus dem Laden werfen - poll
		
		
		
	}

}