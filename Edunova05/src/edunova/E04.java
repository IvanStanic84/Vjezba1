package edunova;

public class E04 {

	public static void main(String[] args) {

		int[] niz = { 1, 5, 4, 2, 1, -1, 2, 4 };

		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
		System.out.println("---------------");

		for (int broj : niz) {

			if (broj == 4) {
				continue;
			}
			if (broj == -1) {
				break;
			}
			System.out.println(broj);
		}

	}
}
