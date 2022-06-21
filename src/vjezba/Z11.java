package vjezba;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Z11 {

	public static void main(String[] args) {
		int d = 10;
		
		int[][] tablica = new int[d][d];
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < d; j++) {
				tablica[i][j] = (i + 1) * (j + 1);
			}
		}

		for(int i=0;i<d;i++) {
			System.out.println(Arrays.toString(tablica[i]));
		}
	}
}