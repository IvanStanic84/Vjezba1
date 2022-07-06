package edunova;

public class LjubavniKalkulator {

	public static void main(String[] args) {

		String ime1 = "Marta";
		String ime2 = "Manuel";
		String ime12 = ime1 + ime2;

		int k = 0;
		int[] niz = new int[ime12.length()];
		System.out.println(ime12);
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

	}

}
