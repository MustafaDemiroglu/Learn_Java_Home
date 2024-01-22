package LF11;

import java.util.ArrayList;
import java.util.List;

public class TeilnehmerListe {

	public static void main(String[] args) {
		
		List<Teilnehmer> tnListe = new ArrayList<Teilnehmer>();
		tnListe.add(new Teilnehmer("Michael", 48));
		tnListe.add(new Teilnehmer("Sven", 47));
		tnListe.add(new Teilnehmer("Deniz", 47));
		tnListe.add(new Teilnehmer("Marvin", 29));
		
		for(int i = 0; i < tnListe.size(); i++) {
			System.out.println(tnListe.get(i).getName());
		}
		System.out.println("-----");
		
		for(Teilnehmer teilnehmer:tnListe) {
			System.out.println(teilnehmer);
		}

	}

}