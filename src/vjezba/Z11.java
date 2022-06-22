package vjezba;

import javax.swing.JOptionPane;

public class Z11 {

	public static void main(String[] args) {

		

		for (;;) {
			int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj izmeðu 10 i 20"));
			if (i < 10 || i > 20) {
				break;
			}
			int k = 1;
			int l = 1;

			for (k = 1; k <= 10; k++) {
				for (l = 1; l <= 10; l++)
					System.out.printf("%4d", k * l);
				System.out.println();
			}
		}

	}
}