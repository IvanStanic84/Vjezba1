package vjezba;

import javax.swing.JOptionPane;

public class Z10 {

	public static void main(String[] args) {

		int[] niz = new int[4];

		niz[0] = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi �lan niza"));
		niz[1] = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi �lan niza"));
		niz[2] = Integer.parseInt(JOptionPane.showInputDialog("Unesi tre�i �lan niza"));
		niz[3] = Integer.parseInt(JOptionPane.showInputDialog("Unesi �etvrti �lan niza"));

		System.out.println(niz[0] + niz[1] + niz[2] + niz[3]);
	}

}
