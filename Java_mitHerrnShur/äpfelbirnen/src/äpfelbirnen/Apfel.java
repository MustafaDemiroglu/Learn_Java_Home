
public class Apfel extends Obst {

	public Apfel() { // Standard Konstruktor, initialisiert Namen
		super();
		super.name = "Apfel";		
	}
	// spezieller Konstruktor, setzt Farbe, Höhe und Breite
	// Konstruktoren werden nicht vererbt, gibt hier aber 
	// an Oberklasse weiter
	public Apfel(String farbe, double hoehe, double breite) {
		super(farbe, hoehe, breite);
		super.name = "Apfel";
	}
 	
	// Für den generellen Apfel nix besonderes,
	// würde erst interessant, wenn man Apfel jetzt
	// in weitere Sorten weitervererbt ...	
	@Override
	public String getGeschmack() {
		return "apfelig";
	}

	@Override
	public double getGewicht() {
		// Dichte = 0,84 g/cm3
		// Kv=0,83
		// https://de.wikipedia.org/wiki/Cox_Orange
		// V = 4/3 · PI · r^3 · Kv
		// https://link.springer.com/article/10.1007/BF00445475
		return 0.84 * 4/3 * Math.PI * Math.pow(getBreite()/2.0, 3.0) * 0.83;				
	}
}
