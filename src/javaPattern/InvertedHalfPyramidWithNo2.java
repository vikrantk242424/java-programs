package javaPattern;

public class InvertedHalfPyramidWithNo2 {

	public static void main(String[] args) {

		int n = 5;

		int num = 1;

		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(num + "                 ");

				num++;

			}

			System.out.println();
		}

	}

}
