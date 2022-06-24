package vjezba;

import java.util.Arrays;

public class Vjezba8 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("Osijek");
		}

		for (int i = 0; i < 10; i += 1) {
			System.out.println(i + 1);
		}

		for (int i = 10; i > 0; i = i - 1) {
			System.out.println(i);
		}

		for (int i = 0; i < 100; i = i + 10) {
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
int[] niz = {2,3,2,3,3,2};
		
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
		String ime = "Edunova";
		for(int i=0;i<ime.length();i++) {
			System.out.println(ime.charAt(i));
		}
		int d = 10;
		int[][] tablica = new int[d][d];
		for(int i=0;i<d;i++) {
			for(int j=0;j<d;j++) {
				tablica[i][j] = (i+1) * (j+1);
			}
		}
		
		for(int i=0;i<d;i++) {
			System.out.println(Arrays.toString(tablica[i]));
		}
		
		
		
		for(int i=0;i<10;i++) {
			if(i==3 || i==5) {
				continue; 
			}
			
			System.out.println(i);
		}
		
		for(int i=0;i<10;i++) {
			if(i!=3 && i!=5) {
				System.out.println(i);
			}
			
		}
	}

}
