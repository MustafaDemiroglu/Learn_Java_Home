package LF11;

public class Kunde {

	private String name;
	private int anzahlArtikel;
	
	
	
	public Kunde(String name, int anzahlArtikel) {
		super();
		this.name = name;
		this.anzahlArtikel = anzahlArtikel;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAnzahlArtikel() {
		return anzahlArtikel;
	}
	public void setAnzahlArtikel(int anzahlArtikel) {
		this.anzahlArtikel = anzahlArtikel;
	}


	@Override
	public String toString() {
		return "Kunde [name=" + name + ", anzahlArtikel=" + anzahlArtikel + "]";
	}
	
	
	
}