package edunova;

public abstract class Osoba extends Object {

	private String ime;
	private String prezime;

	// "prazan" konstruktor
	public Osoba() {
		super();
	}

	// "puni" konstruktor
	public Osoba(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	@Override
	public String toString() {
		// return ime + " " + prezime; - ovo nije dobra praksa
		StringBuilder sb = new StringBuilder();
		sb.append(ime).append(" ").append(prezime);
		return sb.toString();

	}
}
