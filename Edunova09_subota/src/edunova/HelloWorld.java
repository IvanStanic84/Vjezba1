package edunova;

import javax.swing.JOptionPane;





public class HelloWorld {

	public static void main(String[] args) {
		
		// Program ispisuje uneseno ime
		

		System.out.println("Hello world");
		
		
		
		String ime;
		
		while(true) {
			
			 ime = JOptionPane.showInputDialog("Unesi ime");	
			
			 if(ime.trim().equals("") ) {
				 JOptionPane.showMessageDialog(null, "Obavezan unos");
			 }else {
				 break;
			 }
		}
		System.out.println(ime);
		 
	}

}
