package edunova;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class CiklicnaMatrica {

	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi x"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi y"));

		int[][] matrica = new int[i][j];

		int umnozak = i * j;

		int pocetnibroj = 1;
		int redak = i - 1;
		int stupac = j - 1;

		int lijevo = 0;
		int gore = 0;
		int desno = j - 1;
		int dolje = i - 2;
		char smjer = 'L';

		while (umnozak > 0) {
			matrica[redak][stupac] = pocetnibroj;
			umnozak--;
			pocetnibroj++;

			if (smjer == 'L') {
				if (stupac == lijevo) {
					smjer = 'U';
					redak--;
				} else {
					stupac--;
				}
			} else if (smjer == 'U') {
				if (redak == gore) {
					smjer = 'R';
					stupac++;
				} else {
					redak--;
				}
			} else if (smjer == 'R') {
				if (stupac == desno) {
					smjer = 'D';
					redak++;
				} else {
					stupac++;
				}
			} else if (smjer == 'D') {
				if (redak == dolje) {
					smjer = 'L';
					stupac--;
					lijevo++;
					desno--;
					dolje--;
				} else {
					redak++;
				}
			}

		}

		for (int k = 0; k < matrica.length; k++) {

			for (int l = 0; l < matrica[k].length; l++) {

				System.out.printf("%5d", matrica[k][l]);

			}
			System.out.println();
		}

	}

}