package edunova;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class LjubavniKalk {

	public static void main(String[] args) {

		String ime1;
		while (true) {

			ime1 = JOptionPane.showInputDialog("Unesi prvo ime");

			if (ime1.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "Obavezan unos prvog imena");
			} else {
				break;
			}
		}

		String ime2;

		while (true) {

			ime2 = JOptionPane.showInputDialog("Unesi drugo ime");

			if (ime2.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "Obavezan unos drugog imena");
			} else {
				break;
			}
		}
		String ime12 = ime1.trim().toLowerCase().replaceAll("\\s", "")
				+ ime2.trim().toLowerCase().replaceAll("\\s", "");

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
		System.out.println(result + "%");
		JOptionPane.showMessageDialog(null, ime1 + " i " + ime2 + " vole se " + result + " % ");

	}

	private static Integer calc(List<Integer> arrayList) {

		int t = arrayList.size();

		for (int x = 0; x < t; x++) {

			int w = arrayList.get(x);

			if (w > 9) {

				arrayList.add(x, 1);
				arrayList.set(x + 1, w % 10);

			}

		}

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

		for (int i = 0; i < stop; i++) {

			int k2 = arrayList.get(p - i - z1);

			int k1 = arrayList.get(i);

			System.out.println("k1=" + k1 + " , " + "k2=" + k2);
			int k = k1 + k2;
			kList.add(k);
		}

		System.out.println("kList=" + kList);
		System.out.println("----------------------------");

		return calc(kList);

	}

}
