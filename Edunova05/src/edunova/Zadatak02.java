package edunova;

import javax.swing.JOptionPane;

public class Zadatak02 {
	
	// Program od korisnika unosi
	// cjele brojeve dok korisnik
	// ne unese broj -1
	// program ispisuje sumu svih unesenih
	// brojeva
	// koristeći while
	
	public static void main(String[] args) {
		
		
		int i=0, suma=0;
		while(i!=-1) {
			i=Integer.parseInt(
					JOptionPane.showInputDialog("broj"));
			suma += i;
		}
		System.out.println(suma+1);
		
	}

}
