package rahulShettyPrograms;

import java.util.Arrays;

public class MaxDiffAdjArray {

	public static void main(String[] args) {

		int[] ar = { 40, 2, 3, 4, 7, 5, 9, 10, 20, 3 };

		int diff = 0;

		for (int i = 0; i < ar.length - 1; i++) {

			int value = ar[i + 1] - ar[i];

			int absValue = Math.abs(value);

			if (absValue > diff) {

				diff = absValue;

			}
		}

		System.out.println(diff);
	}

}
