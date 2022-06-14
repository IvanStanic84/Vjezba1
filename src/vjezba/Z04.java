package vjezba;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
		
		int j = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));

		int z = i + j;
		if(z>10) {
			System.out.println("Osijek");
		}else {
			System.out.println("Edunova");
		}
	}

}
