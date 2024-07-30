package array_Programs;

public class smallestNOArray {

	public static void main(String[] args) {

		int[] ar = { 1, 5, 6, 8, 0, 10 };

		int smallestNo = ar[0];

		for (int i = 1; i < ar.length; i++) {

			if (ar[i] < smallestNo) {

				smallestNo = ar[i];

			}

		}
		
		System.out.println(smallestNo);

	}

}
