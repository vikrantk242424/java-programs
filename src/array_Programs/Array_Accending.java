package array_Programs;

public class Array_Accending {

	public static void main(String[] args) {

		int[] ar = { 5, 4, 8, 3, 2, 1 };

		int temp;

		for (int i = 0; i < ar.length; i++) {

			for (int j = i + 1; j < ar.length; j++) {

				if (ar[i] > ar[j]) {

					temp = ar[i];

					ar[i] = ar[j];

					ar[j] = temp;
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {

			System.out.print(ar[i] + " ");

		}
	}

}
