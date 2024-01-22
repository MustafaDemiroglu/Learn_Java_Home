package LF11;

import java.util.Stack;

public class LeseListe {
	
	public static void main(String[] args) {
			
		Autor muster = new Autor ("Muster", "Max");
		Autor beispiel = new Autor ("Beispiel", "Gisela"); 
		Autor schmitt = new Autor ("Schmitt", "Horst");
		Autor wiso = new Autor ("Wuff", "Elsa"); 
		Buch java = new Buch("Java-Buch","12345",muster);
		
		Stack<Buch> geleseneBuecher = new Stack<Buch>();
		
		Stack<Buch> ungeleseneBuecher = new Stack<Buch>();
		ungeleseneBuecher.push(java);
		ungeleseneBuecher.push(new Buch("HTML-Buch","25468", beispiel ));
		ungeleseneBuecher.push(new Buch("Arduion-HandBuch", "25847", schmitt));
		ungeleseneBuecher.push(new Buch("Wiso-Ordner", "254875", wiso));
		
		/*
		// oberstes Buch auswählen - peek()
		System.out.println("Oberstes Buch: " + buecher.peek());
				
		// oberstes Element vom Stapel entfernen - pop
		System.out.println("Obertes Buch entfernen : " + buecher.pop());
				
		System.out.println("Oberstes Buch : " + buecher.peek());
		
		System.out.println("-------------------------");
		
		*/ 
		
		while(!ungeleseneBuecher.isEmpty()) {
			System.out.println("Ungelesen : " + ungeleseneBuecher.size());
			System.out.println("Gelesen : " + geleseneBuecher.size());
			ungeleseneBuecher.peek().lesen(ungeleseneBuecher, geleseneBuecher);
			
			// TO-DO gelesene Bücher solleb auf den Stapel "gelesene Bücher
		}
		
		System.out.println("Ungelesen : " + ungeleseneBuecher.size());
		System.out.println("Gelesen : " + geleseneBuecher.size());
		
				
	}
}
