package edunova;

public class LjubavniKalkulator {
	public void main(String[] args) {

		String ime1 = "Marta";
		String ime2 = "Manuel";
		String ime12 = ime1 + ime2;

		int k = 0;
		String[] niz = new String[ime12.length()];
		System.out.println(ime1 + "   " + ime2);
		for (int i = 0; i < ime12.length(); i++) {
			k = 0;
			for (int j = 0; j < ime12.length(); j++) {
				if (ime12.charAt(i) == ime12.charAt(j)) {
					k++;
				}
			}
			niz[i] = k;
			System.out.print(k + " ");

		}
		System.out.println(rekurzija(niz));
		System.out.println();
		k = 0;
	}

	private int rekurzija(final String ime12) {
		if (ime12.length() <= 2) {
			return Integer.parseInt(ime12);
		}

		StringBuilder newime12 = new StringBuilder();
		final String[] novoime12 = ime12.split("");
		for (int i = 0, j = novoime12.length - 1; i <= j; i++, j--) {
			if (i == j) {
				newime12.append(novoime12[i]);
				break;
			}
			newime12.append(Integer.parseInt(novoime12[i]) + Integer.parseInt(novoime12[j]));
		}

		return rekurzija(novoime12.toString());
	}
}

/*
 * for (k = ime12.length() / 2; k > 2; k--) {
 * 
 * if (ime12.length() % 2 == 0) { for (int i = 0; i < ime12.length() / 2; i++) {
 * int prvibroj = niz[i]; int drugibroj = niz[ime12.length() - 1 - i]; int
 * rezultat = prvibroj + drugibroj; System.out.print(rezultat + " ");
 * System.out.println();
 * 
 * } } else { for (int i = 0; i < ime12.length() / 2; i++) { int prvibroj =
 * niz[i]; int drugibroj = niz[ime12.length() - 1 - i]; int rezultat = prvibroj
 * + drugibroj; System.out.print(rezultat + " ");
 * 
 * } int srednjibroj = niz[ime12.length() / 2]; System.out.print(srednjibroj);
 * System.out.println();
 * 
 * } } }
 * 
 * }
 */
