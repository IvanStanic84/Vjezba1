package edunova;

import javax.swing.JOptionPane;

public class Zadatak07 {

	// program osigurava unos niza
	// znakova (String) koji ima
	// minimalno 3 znaka
	// ako nema tri znaka ispisuje korisniku
	// poruku: Minimalno 3 znaka
	public static void main(String[] args) {

		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost reda"));
		int kolona = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost kolone"));
		

		int umnozak = red * kolona;

		int[][] matrica = new int[red][kolona];

		int zaPopuniti = umnozak;
		int trenutniBroj = 1;
		int trenutniRed = red - 1;
		int trenutnaKolona = kolona - 1;
		int trenutnaGranicaLijevo = 0;
		int trenutnaGranicaGore = 0;
		int trenutnaGranicaDesno = kolona - 1;
		int trenutnaGranicaDolje = red - 2;
		char trenutniSmjer = 'L';

		while (zaPopuniti > 0) {
			matrica[trenutniRed][trenutnaKolona] = trenutniBroj;
			zaPopuniti--;
			trenutniBroj++;

			if (trenutniSmjer == 'L') {
				if (trenutnaKolona == trenutnaGranicaLijevo) {
					trenutniSmjer = 'U';
					trenutniRed--;
				} else {
					trenutnaKolona--;

				}

			} else if (trenutniSmjer == 'U') {
				if (trenutniRed == trenutnaGranicaGore) {
					trenutniSmjer = 'R';
					trenutnaKolona++;
				} else {
					trenutniRed--;
				}

			} else if (trenutniSmjer == 'R') {
				if (trenutnaKolona == trenutnaGranicaDesno) {
					trenutniSmjer = 'D';
					trenutniRed++;
				} else {
					trenutnaKolona++;
				}

			} else if (trenutniSmjer == 'D') {
				if (trenutniRed == trenutnaGranicaDolje) {
					trenutniSmjer = 'L';
					trenutnaKolona--;

					trenutnaGranicaLijevo++;
					trenutnaGranicaGore++;
					trenutnaGranicaDesno--;
					trenutnaGranicaDolje--;
				} else {
					trenutniRed++;
				}

			}
		}
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {

				System.out.printf("%4d", matrica[i][j]);
			}
			System.out.println();
		}

	}
	

}
