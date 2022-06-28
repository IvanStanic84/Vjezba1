package edunova;

import java.util.Arrays;

public class Z01 {

	public static void main(String[] args) {

		// Deklarirajte niz decimalnih
		// brojeva dužine 12 i svim elementima
		// niza postavite vrijednost 3,14
		// s while petljom

		double[] niz = new double[12];

		int i = 0;

		while (i < 12) {

			niz[i] = 3.14;

			i++;

		}
		System.out.print(Arrays.toString(niz));
	}

}
