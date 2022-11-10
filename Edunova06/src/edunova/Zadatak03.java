package edunova;

import javax.swing.JOptionPane;

public class Zadatak03 {
	
	// Program učitava dva broja
	// ispisuje zbroj dvaju učitanih brojeva
	// Kreirati metode:
	// ucitaj
	// izracunaj
	// ispisi
	
	public static void main(String[] args) {
		ispisi(izracunaj(ucitaj("Prvi"),ucitaj("Drugi")));
	}
	
	
	static int ucitaj(String poruka) {
		return 
				Integer.parseInt(
						JOptionPane.showInputDialog(poruka));
	}
	
	static int izracunaj(int a, int b) {
		return a+b;
	}
	
	static void ispisi(int b) {
		System.out.println(b);
	}

}
