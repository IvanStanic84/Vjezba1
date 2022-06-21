package vjezba;

import java.util.Arrays;

public class Vjezba4 {

	public static void main(String[] args) {

		int[] temp;

		temp = new int[12];

		temp[0] = 2;
		temp[1] = 1;
		temp[temp.length - 1] = 5;

		System.out.println(Arrays.toString(temp));

		int boje[] = new int[4];
		boje[1] = 7;
		System.out.println(boje[1]);

		int[] vrijednosti = { 2, 5, 6, 3, 4, 1, 5, 1, 5, 2 };
		System.out.println(vrijednosti[0] + "," + vrijednosti[vrijednosti.length - 1]);

	}

}
