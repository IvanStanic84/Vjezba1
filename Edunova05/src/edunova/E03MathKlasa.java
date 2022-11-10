package edunova;

public class E03MathKlasa {

	public static void main(String[] args) {
		
		int i=0;
		while(true) {
			i = (int)(Math.random()*100);
			if(i>=1 && i<=10) {
				System.out.println(i);
				break;
			}
		}
		
		//https://www.baeldung.com/java-generating-random-numbers-in-range
		
		int sb = (int)((Math.random() * (10 - 1)) + 1);
		System.out.println(sb);
		
		
	}
}
