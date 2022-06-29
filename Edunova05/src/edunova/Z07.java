package edunova;

import javax.swing.JOptionPane;

public class Z07 {

	public static void main(String[] args) {
		// program osigurava unos niza
		// znakova (String) koji ima
		// minimalno 3 znaka
		// ako nema tri znaka ispisuje korisniku
		// poruku: Minimalno 3 znaka

		String s;
		while (true) {
			s = JOptionPane.showInputDialog("Upiši minimalno 3 znaka");
			if (s.length() < 3) {
				JOptionPane.showMessageDialog(null, "Rekli smo minimalno 3 znaka");
				continue;
			}
			break;
		}
		System.out.println(s);

	}

}
