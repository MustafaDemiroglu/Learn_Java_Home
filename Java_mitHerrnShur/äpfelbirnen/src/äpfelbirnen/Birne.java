
public class Birne extends Obst {

	public Birne() {
		super();
		super.name = "Birne";
	}

	public Birne(String farbe, double hoehe, double breite) {
		super(farbe, hoehe, breite);
		super.name = "Birne";
	}

	@Override
	public String getGeschmack() {
		return "birnig";
	}

	@Override
	public double getGewicht() {
		// 1,1 g/cm3 ?
		// Fruchtform kv=1,5?
		// aus alter Doktorarbeit / geschätzt :)
		// https://www.research-collection.ethz.ch/bitstream/handle/20.500.11850/140300/eth-38270-02.pdf?sequence=2
		return 1.1 * 4/3 * Math.PI * Math.pow(getBreite()/2.0, 3.0) * 1.5;
	}

}
