package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {

		// Program od korisnika unosi
		// cjele brojeve dok korisnik
		// ne unese broj -1
		// program ispisuje sumu svih unesenih
		// brojeva
		// koristeæi while
		int i = 0;
		int suma = 0;
		while (i != -1) {
			i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

			suma += i;

		}
		System.out.println(suma + 1);

	}
}
