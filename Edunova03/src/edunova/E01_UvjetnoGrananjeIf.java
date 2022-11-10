package edunova;

public class E01_UvjetnoGrananjeIf {

	public static void main(String[] args) {

		// obavezni dio if naredbe

		boolean uvjet = true;
		// if radi s boolean tipom podatka
		if (uvjet) {
			System.out.println("1");
		}

		int i = 7;

		if (i > 0) {
			System.out.println("2");
		}

		uvjet = i > 0;
		if (uvjet) {
			System.out.println("3");
		}

		// provjeravanje vrijednosti
		if (i == 7) {
			System.out.println("4");
		}

		// različito
		if (i != 0) {
			System.out.println("5");
		}
		i = 0;
		// logičko and
		if (i > 0 & i < 10) {
			System.out.println("6");
		}

		// & provjerava UVIJEK oba uvjeta
		// && u slučaju da prvi uvjet nije zadovoljen, drugi se ne provjerava
		if (i > 0 && i < 10) {
			System.out.println("7");
		}

		// logičko or
		if (i == 0 | i == 7) {
			System.out.println("8");
		}

		// | provjerava UVIJEK oba uvjeta
		// || u slučaju da je prvi uvjet zadovoljen drugi se ne provjerava
		if (!(i == 0 || i == 7)) {
			System.out.println("9");
		}

		// nije dobra praksa ne koristiti {}
		if (i == 1)
			System.out.println("10");
		System.out.println("11");

		// ne obavezni djelovi if naredbe

		i = 1;
		if (i == 0) {
			System.out.println("12");
		} else {
			System.out.println("13");
		}

		int j = 9;
		// ugnježđivanje
		if (i == 1) {
			if (j == 9) {
				System.out.println("14");
			} else {
				System.out.println("15");
			}
		}

		i = 1;
		j = 2;
		if (i == 1 && j == 2) {
			System.out.println("16");
		} else if (i == 2 && j == 1) {
			System.out.println("17");
		} else {
			System.out.println("18");
		}

		i = 7;
		j = 8;
		if (i > j) {
			System.out.println(i);
		} else {
			System.out.println(j);
		}

		// inline if - tercijarni operator ? :
		System.out.println(i > j ? i : j);

	}

}
