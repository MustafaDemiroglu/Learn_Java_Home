package LF11;

public class Dozent extends Teilnehmer {

		

		private double gehalt;

		public Dozent(String name, int alter, double gehalt) {
			super(name, alter);
			this.gehalt = gehalt;
		}
		
		public double getGehalt() {
			return gehalt;
		}

		public void setGehalt(double gehalt) {
			this.gehalt = gehalt;
		}

		public String getName() {
			return "Dozenten verraten ihren Namen nicht";
		}

		
		public int getAlter() {
			return 97;
		}
		
		
		@Override
		public String toString() {
			// super greift auf Teilnehmer zu 
			return "Dozent: " + super.getName() + ", " + super.getAlter() + ", " + gehalt;
			// return "Dozent: " + getName() + ", " + getAlter() + ", " + gehalt;
		}
		
		
	
}