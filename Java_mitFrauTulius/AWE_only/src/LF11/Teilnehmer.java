package LF11;

public class Teilnehmer {
	
	private String name;
	private int alter;	
	

	public Teilnehmer(String name, int alter) {
		super();
		this.name = name;
		this.alter = alter;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAlter() {
		return alter;
	}


	public void setAlter(int alter) {
		this.alter = alter;
	}

	@Override
	public String toString() {
		return "Teilnehmer:" + name + ", " + alter;
	}
	

}