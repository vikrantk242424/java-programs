package javaPattern;

import java.util.Scanner;

public class FourByFourStar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter no. of row n = ");

		int n = sc.nextInt();

		System.out.print("enter no. of col m = ");

		int m = sc.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {

				System.out.print("*");

			}
			
			System.out.println();

		}

	}

}
