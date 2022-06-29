package edunova;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		// program prima dva cijela broja
		// ispisuje sve prim brojeve izmeðu
		// dva primljena broja

		int k = Integer.parseInt(JOptionPane.showInputDialog("Unesi  x"));
		int l = Integer.parseInt(JOptionPane.showInputDialog("Unesi  y"));

		int min = k < l ? k : l;
		int max = k > l ? k : l;

		boolean prim;
		for (int i = min; i <= max; i++) {

			prim = true;
			for (int b = 2; b < i; b++) {
				if (i % b == 0) {
					prim = false;
					break;
				}
			}

			if (prim) {
				System.out.println(i);
			}
		}
	}

}
