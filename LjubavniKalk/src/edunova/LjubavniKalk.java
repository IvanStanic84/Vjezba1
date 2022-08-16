package edunova;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class LjubavniKalk {

	public static void main(String[] args) {

		String ime1 = "marta";//JOptionPane.showInputDialog("Unesi prvo ime");
		String ime2 = "manuel";//JOptionPane.showInputDialog("Unesi drugo ime");
		String ime12 = ime1 + ime2;

		int k = 0;
		int[] niz = new int[ime12.length()];
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
			k = 0;
		}
		/////////////////////////////////////////////////////

		List<Integer> arrayList = new ArrayList<>(niz.length);

		for (int i : niz) {
			arrayList.add(Integer.valueOf(i));
		}
		System.out.println();
		System.out.println(arrayList);

		////////////////////////////////////////////////////

		int result = calc(arrayList);
		System.out.println(result);

	}

	private static Integer calc(List<Integer> arrayList) {

		List<Integer> kList = new ArrayList<>();
		int p = arrayList.size();

		if (p <= 2) {
			StringBuilder str = new StringBuilder();
			for (int i : arrayList) {
				str.append(i);
			}
			return Integer.parseInt(str.toString());
		}

		boolean isOdd = !(p % 2 == 0);
		int z = isOdd ? 1 : 0;
		int z1 = isOdd ? 0 : 1;
		int stop = (p / 2 + z);

		if (isOdd) {
			arrayList.add(p / 2, 0);
		}

		System.out.println(arrayList);

		for (int i = 0; i < p; i++) {

			int k = arrayList.get(i);

			if (k > 9) {
				k = k % 10;
				arrayList.set(i - 1, arrayList.get(p - i - z1) + 1);
			}

		}

		for (int i = 0; i < stop; i++) {

			int k2 = arrayList.get(p - i - z1);

			if (k2 > 9) {
				k2 = k2 % 10;
				arrayList.set(i - 1, arrayList.get(p - i - z1) + 1);
			}
			int k1 = arrayList.get(i);
			if (k1 > 9) {
				k1 = k1 % 10;
				arrayList.set(i - 1, arrayList.get(i - 1) + 1);
			}

			System.out.println("k1=" + k1 + " , " + "k2=" + k2);
			int k = k1 + k2;
			kList.add(k);
		}

		System.out.println("kList=" + kList);
		System.out.println("----------------------------");

		return calc(kList);

	}

}
