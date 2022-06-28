package edunova;

import javax.swing.JOptionPane;

public class E05 {

	public static void main(String[] args) {

		int i = 0;
		while (true) {
			try {
				i = Integer.parseInt(JOptionPane.showInputDialog("broj"));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Neispravan unos");
			}
		}
		System.out.println(i);

	}

}

