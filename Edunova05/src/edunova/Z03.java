package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {

		// Korisnik unosi dimenzije
		// matrice (x i y)
		// program puni matricu sluèajnim
		// vrijednostima izmeðu 5 i 9
		// program ispisuje izgraðenu matricu
		int i,j,n,m =0;
		n = Integer.parseInt(JOptionPane.showInputDialog("Unesi x"));
		m = Integer.parseInt(JOptionPane.showInputDialog("Unesi y"));

		int[][] matrica = new int[n][m];
		
		for(i=0; i<n; i++) {
			for(j=0; j<m; j++) {
				matrica[i][j] = (int) ((Math.random() * (9 - 5)) + 5);
			}
		}
		
		for(i=0; i<matrica.length; i++) {
			System.out.println(Arrays.toString(matrica[i]));
		}
		
		

	}
}
