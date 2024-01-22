package LF11;

public class Buch {
	
	private String titel;
	private String isbn;
	private String autor;
	
	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Buch(String titel, String isbn, String autor) {
		super();
		this.titel = titel;
		this.isbn = isbn;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Buch [titel=" + titel + ", isbn=" + isbn + ", autor=" + autor + "]";
	}

	

}
