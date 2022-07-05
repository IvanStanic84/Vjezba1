package edunova;

import javax.swing.JOptionPane;

public class CiklicnaMatrica2 {

	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi x"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi y"));

		int matrica[][] = new int[x][y];
		int k = 1;
		int stupac1 = 0;
		int stupac2 = y - 1;
		int redak1 = 0;
		int redak2 = x - 1;

		while (k <= x * y) {
			for (int i = stupac2; i >= stupac1; i--) {
				matrica[redak2][i] = k++;
			}

			if (k > x * y)
				break;

			for (int j = redak2 - 1; j >= redak1; j--) {
				matrica[j][stupac1] = k++;
			}

			if (k > x * y)
				break;

			for (int i = stupac1 + 1; i <= stupac2; i++) {
				matrica[redak1][i] = k++;
			}

			if (k > x * y)
				break;

			for (int j = redak1 + 1; j < redak2; j++) {
				matrica[j][stupac2] = k++;
			}

			if (k > x * y)
				break;

			stupac1++;
			stupac2--;
			redak1++;
			redak2--;
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
