package edunova;

import javax.swing.JOptionPane;

public class E06DrugiProgram {
	
	// Za upisana dva cjela broja
	// program ispisuje njihov zbroj
	
	public static void main(String[] args) {
		
		//unos
	int prviBroj = Integer.parseInt(
		JOptionPane.showInputDialog("Unesi prvi broj")
	);
	
	int drugiBroj = Integer.parseInt(
			JOptionPane.showInputDialog("Unesi drugi broj")
		);
	
	//algoritam
	int rezultat = prviBroj + drugiBroj;
	
	
	//izlaz
	System.out.println(rezultat);
	
		
	}

}
