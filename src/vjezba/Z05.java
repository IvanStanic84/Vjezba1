package vjezba;

import javax.swing.JOptionPane;

public class Z05 {
	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		if(i%2==1) {
			System.out.println("Neparan");
		}else {
			System.out.println("Paran");
		}
	}

}
