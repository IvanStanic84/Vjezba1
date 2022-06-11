package vjezba;

import javax.swing.JOptionPane;

public class Vjezba1 {

	public static void main(String[] args) {

		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));

		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		int rezultat = prviBroj + drugiBroj;
		
		System.out.println(rezultat);



	}

}
