package edunova;

public class E01 {

	public static void main(String[] args) {

		while (true) {
			break;
		}

		int i = 0;
		while (i < 10) {
			if (i + 1 == 2) {
				i++;
				continue;
			}
			System.out.println(++i);
		}

		for (int t = 10; t > 10; t++) {
			System.out.println("Osijek");
		}

		int t = 2;
		while (t > 2) {
			System.out.println("Edunova");
		}

	}

}
