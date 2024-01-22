package LF11;

public class Autor {
	
	private String nachName;
	private String vorName;
	
	public Autor(String nachName, String vorName) {
		super();
		this.nachName = nachName;
		this.vorName = vorName;
	}
	
	/**
	 * @return the nachName
	 */
	public String getNachName() {
		return nachName;
	}
	/**
	 * @param nachName the nachName to set
	 */
	public void setNachName(String nachName) {
		this.nachName = nachName;
	}
	/**
	 * @return the vorName
	 */
	public String getVorName() {
		return vorName;
	}
	/**
	 * @param vorName the vorName to set
	 */
	public void setVorName(String vorName) {
		this.vorName = vorName;
	}

	@Override
	public String toString() {
		return "Autor [nachName=" + nachName + ", vorName=" + vorName + "]";
	}
	
	
	

}
