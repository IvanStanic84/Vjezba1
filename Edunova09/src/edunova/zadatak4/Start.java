package edunova.zadatak4;

public class Start {
	public static void main(String[] args) {

		Racunalo racunalo = new Racunalo(null, 0, 200.00, true);

		// Kreirati niz od 15 racunala i u njega
		// postaviti 15 Istanci racunala

		Racunalo[] niz = new Racunalo[15];

		for (int i = 0; i < niz.length; i++) {
			niz[i] = new Racunalo();
		}

	}

}
