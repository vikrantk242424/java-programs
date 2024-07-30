package rahulShettyPrograms;

public class MinmumFrom3by3Matrix {

	public static void main(String[] args) {

		int[][] ar = { { 5, 2, 3 }, { 4, 5, 6 }, { 2, 8, 9 } };

		int min = ar[0][0];

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar.length; j++) {

				if (ar[i][j] < min) {

					min = ar[i][j];
				}
            }
		}

		System.out.println(min);
	}

}
