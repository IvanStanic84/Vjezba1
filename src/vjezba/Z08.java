package vjezba;

import javax.swing.JOptionPane;

public class Z08 {

	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		if (i % 2 == 0 && j % 2 == 0) {
			System.out.println(i + j);
		} else {
			System.out.println(i - j);
		}

		System.out.println(i % 2 == 0 && i % 2 == 0 ? i + j : i - j);

	}

}
