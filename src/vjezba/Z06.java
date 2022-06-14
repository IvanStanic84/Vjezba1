package vjezba;

import javax.swing.JOptionPane;

public class Z06 {

	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		if (i>=j) {
			System.out.println(i);
		}else {
			System.out.println(j);
		}

	}

}
