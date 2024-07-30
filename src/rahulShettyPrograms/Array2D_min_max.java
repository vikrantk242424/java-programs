package rahulShettyPrograms;

public class Array2D_min_max {

	public static void main(String[] args) {

		int[][] ar = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int min = ar[0][0];

		int minCol = 0;

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar.length; j++) {

				if (ar[i][j] < min) {

					min = ar[i][j];

					minCol = j;
				}

			}

		}

		System.out.println(min);

		int max = ar[0][minCol];

		for (int i = 0; i < ar.length; i++) {

			if (ar[i][minCol] > max) {

				max = ar[i][minCol];

			}

		}

		System.out.println(max);

	}

}
