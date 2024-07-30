package rahulShettyPrograms;

public class MaxFrom3by3matrix {

	public static void main(String[] args) {

		int[][] ar = { { 5, 2, 3 }, { 4, 5, 6 }, { 2, 8, 9 } };

		int max = ar[0][0];

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar.length; j++) {

				if (ar[i][j] > max) {

					max = ar[i][j];
				}
			}
		}

		System.out.println(max);
	}
}
