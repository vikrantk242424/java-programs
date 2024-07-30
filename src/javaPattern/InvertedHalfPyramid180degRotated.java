package javaPattern;

public class InvertedHalfPyramid180degRotated {

	public static void main(String[] args) {

		int n = 4;

		int m = 4;

		// outer loop
		for (int i = 1; i <= n; i++) {

			// loop to print space
			for (int j = 1; j <= n - i; j++) {

				System.out.print(" ");

			}

			// loop to print star
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
				
			}
           
		   System.out.println("");	
		}

	}

}
