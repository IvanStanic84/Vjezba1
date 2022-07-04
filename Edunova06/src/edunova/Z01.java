package edunova;

public class Z01 {

	// Metoda prima niz cjelih brojeva
	// metoda vraæa najmanji elelent niza
	// metoda se zove najmanji

	static int najmanji(int niz[]) {

		int min = Integer.MAX_VALUE;
		for (int i : niz) {
			if (i < min) {
				min = i;
			}
		}

		return min;

	}

}
