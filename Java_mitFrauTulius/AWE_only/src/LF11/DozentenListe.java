package LF11;

import java.util.ArrayList;
import java.util.List;

public class DozentenListe {

	public static void main(String[] args) {
		List<Dozent> dzListe = new ArrayList<Dozent>();
		dzListe.add(new Dozent("Tullius", 44, 1500.57));
		dzListe.add(new Dozent("Uhlemann", 52, 2154.23));
		
		System.out.println(dzListe.get(0));
		System.out.println(dzListe.get(1));

	}

}