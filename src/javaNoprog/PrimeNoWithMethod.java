package javaNoprog;

import java.util.Scanner;

public class PrimeNoWithMethod {

	public static boolean isPrimeNo(int number) {

		for (int i = 2; i <= number / 2; i++) {

			if (number % i == 0) {

				return true;
			}

		}

		return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter value of a= ");

		int number = sc.nextInt();

		if (isPrimeNo(number)) {

			System.out.println("not prime no");

		}

		else {

			System.out.println("prime no");
		}

		sc.close();

	}

}