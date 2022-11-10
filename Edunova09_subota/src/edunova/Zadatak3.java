package edunova;

public class Zadatak3 {
	
	public static void main(String[] args) {
		System.out.println(metoda("b b c d a f g a d a"));
	}
	
	// Kreirati privatnu metodu tipa int koja vraća 
	//sve pojavnosti slova a u primljenom stringu
	
	private static int metoda (String s) {
		int ukupno = 0;
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i)=='a') {
				ukupno++;
			}
		}
		
		
		return ukupno;
	}

}
