package edunova;

public class Osoba {
// int sifra; OVO SE NE RADI

	// 2. princip OOP-a U�ahurivanje

	// na�ini pristupa
	// package scope (bez navo�enja na�ina)
	// class scope (private)
	// class scope (protected) - naslje�ivanje
	// vidljivo svima (public)

	// Klasa sakrije svoja svojstva
	private int sifra;

	// i u�ini ih dostupnim putem
	// tkz. geter i seter metoda
	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

}
