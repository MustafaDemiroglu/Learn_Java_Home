package LF11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stapelverarbeitung {
	
	public static void main(String[] args) {
		
		Stack<String> buecher = new Stack<String>();
		
		// Element auf den Stapel legen - push
		buecher.push("Java-Buch");
		buecher.push("HTML-Buch");
		buecher.push("Arduion-HandBuch");
		buecher.push("Wiso-Ordner");
		
		// oberstes Element auswählen - peek()
		System.out.println("Oberstes Buch: " + buecher.peek());
		
		// oberstes Element vom Stapel entfernen - pop
		System.out.println("Obertes Buch entfernen : " + buecher.pop());
		
		System.out.println("Oberstes Buch : " + buecher.peek());
		
		
		
		
	}
		
		
	
	

}
