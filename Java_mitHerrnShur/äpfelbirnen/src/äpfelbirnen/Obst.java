
public abstract class Obst implements Comparable<Obst>{
	protected String name; // Obst soll eine Bezeichnung haben
	private String farbe;  // Obst habe eine vorherrschende Farbe
	private double hoehe;  // größte Höhe in cm
	private double breite; // größte Breite/Durchmesser in cm
	
	public Obst() { // Standard Konstruktor, initialisiert Variablen
		farbe = "";
		hoehe = 0;
		breite = 0;
	}
	
	// spezieller Konstruktor, setzt Farbe, Höhe und Breite
	public Obst(String farbe, double hoehe, double breite) {
		this.farbe = farbe;
		this.hoehe = hoehe;
		this.breite = breite;
	}

	// Get- gefolgt von Set-Methoden
	public String getName() {
		return name;
	}
	public String getFarbe() {
		return farbe;
	}
	public double getHoehe() {
		return hoehe;
	}
	public double getBreite() {
		return breite;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	public void setBreite(double breite) {
		this.breite = breite;
	}
	
	// Um die Schnittstelle zu implementieren,
	// wird compareTo implementiert. Hier einfache Sortierung
	// der Größe / Gewicht nach. Andere Ansätze natürlich denkbar.
	@Override
	public int compareTo(Obst obst) {
		if (obst.getGewicht() == this.getGewicht())
			return 0;
		if (obst.getGewicht() < this.getGewicht())
			return 1;
		if (obst.getGewicht() > this.getGewicht())
			return -1;	
		return 0; // sollte nicht auftreten
	}
	
	// Der Geschmack soll abhängig von der jeweiligen Sorte
	// sein, also auch erst bei dieser festgelegt werden.
	public abstract String getGeschmack(); 
	
	// Das Gewicht soll aus der Breite berechnet werden,  	
	// aber unterschiedlich bei der jeweiligen Sorte
	public abstract double getGewicht(); 
	
	@Override
	public String toString () { // für Ausgabe von Obst auf der Konsole
		return "Obst: " + name + "(" + String.format("%3.2f", getGewicht()) + "g / " 
	                                 + String.format("%2.2f", hoehe ) + "cm hoch / " 
				                     + String.format("%2.2f", breite) + "cm breit)";
	}	
	
}
