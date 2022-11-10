package edunova;

public class Petlje {

	public Petlje() {

		// primjer1();
		// primjer2();
		primjer3();

	}

	private void primjer3() {
		vanjska:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
					// uslučaju j=7 prekini vanjsku petlju
					if (j==7) {
						break vanjska;
			}
		}
	}

	}

	private void primjer2() {

		int x = 170;
		int y = 234;

		int max = x * y;
		int brojZnakova = saznajBrojZnakova(max);
		System.out.println(max);
		System.out.println(brojZnakova);
		String osnovica = "", broj;
		for (int i = 0; i < brojZnakova; i++) {
			osnovica += " ";
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				broj = osnovica + (i + 1) * (j + 1);
				System.out.print(broj.substring(broj.length() - brojZnakova) + " ");
			}
			System.out.println();
		}
	}

	private int saznajBrojZnakova(int max) {
		int ukupno = 0;
		while (max > 0) {
			max /= 10;
			ukupno++;
		}
		return ukupno;
	}

	private void primjer1() {

		for (int i = 10; i > 0; i = i - 1) {
			if (i == 7) {
				continue;
			}
			if (i == 3) {
				break;
			}

			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		new Petlje();
	}
}
