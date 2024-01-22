package LF11;

import java.util.Stack;

public class LeseListe {
	
public static void main(String[] args) {
		
	Stack<Buch> buecher = new Stack<Buch>();
	buecher.push(new Buch("Java-Buch", "12345", "Max Muster"));
	buecher.push(new Buch("HTML-Buch","25468", "Gisela Beiapiel" ));
	buecher.push(new Buch("Arduion-HandBuch", "25847", "Horst Schmiet"));
	buecher.push(new Buch("Wiso-Ordner", "254875", "Elsa Wuff"));
	
	
	// oberstes Buch auswählen - peek()
	System.out.println("Oberstes Buch: " + buecher.peek());
			
	// oberstes Element vom Stapel entfernen - pop
	System.out.println("Obertes Buch entfernen : " + buecher.pop());
			
	System.out.println("Oberstes Buch : " + buecher.peek());
			 
		
	}
	

}
