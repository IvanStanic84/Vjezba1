package vjezba;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		float rez;
		
		rez = (float) i / j;
		
		System.out.println(rez);
	}

}
