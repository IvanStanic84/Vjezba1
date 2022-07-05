package edunova;

public class Osoba {
// int sifra; OVO SE NE RADI

	// 2. princip OOP-a Uèahurivanje

	// naèini pristupa
	// package scope (bez navoðenja naèina)
	// class scope (private)
	// class scope (protected) - nasljeðivanje
	// vidljivo svima (public)

	// Klasa sakrije svoja svojstva
	private int sifra;

	// i uèini ih dostupnim putem
	// tkz. geter i seter metoda
	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

}
