package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {

	public static void main(String[] args) {

		String broj = "";
		int x;
		int suma = 0;
		int countUnosa = 0;

		while (true) {
			try {
				broj = JOptionPane.showInputDialog("Unesi broj: ");

				x = Integer.parseInt(broj);

				suma += x;
				countUnosa++;

			} catch (Exception e) {

				if (broj.toLowerCase().trim().equals("stop")) {
					break;

				} else {
					JOptionPane.showMessageDialog(null, "Obavezan unos ili stop za kraj");
				}

			}
		}
		System.out.println(suma / (double) countUnosa);
	}
}
