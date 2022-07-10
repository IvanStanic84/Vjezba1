package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {

		// Za unesena 2 broja program ispisuje
		// sumu svih izmedju njih

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		int suma = 0;

		for (int k = i >= j ? j : i; k <=( j >= i ? j : i); k++) {

			suma += k;

		}
		System.out.println(suma);

	}
}
