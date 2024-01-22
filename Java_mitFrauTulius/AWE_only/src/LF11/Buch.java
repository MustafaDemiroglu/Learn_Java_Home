package LF11;

import java.util.Stack;

public class Buch {
	
	private String titel;
	private String isbn;
	private Autor autor;
	
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Buch(String titel, String isbn, Autor autor) {
		super();
		this.titel = titel;
		this.isbn = isbn;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Buch [titel=" + titel + ", isbn=" + isbn + ", autor=" + autor + "]";
	}

	public void lesen (Stack<Buch> ungelesenListe, Stack<Buch> gelesenListe) {
		ungelesenListe.remove(this);
		gelesenListe.push(this);
		System.out.println("Das Buch " + this.getTitel() + " ist schon gelesen und wird vom ungelesenen Stapel entfernt und auf den gelesen Stapel gelegt");
	}
}
