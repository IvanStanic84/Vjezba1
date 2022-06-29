package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {

	public static void main(String[] args) {

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi x"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi y"));

		int[][] matrica = new int[i][j];

		int min = (i - 1) * (j - 1);

		for (int x = i - 1; i > 0; i--) {

			for (int y = j - 1; j > 0; j--) {

				matrica[x][y] = (int) ((Math.multiplyExact(x + 1, y + 1)));

			}
			for (i = matrica.length - 1; i >= 0; --i) {

				System.out.println(Arrays.toString(matrica[x]));
			}
		}

	}
}