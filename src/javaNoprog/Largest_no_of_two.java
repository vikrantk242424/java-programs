package javaNoprog;

import java.util.Scanner;

public class Largest_no_of_two {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter no. a = ");

		int a = sc.nextInt();

		System.out.print("enter no. b = ");

		int b = sc.nextInt();

		if (a > b) {

			System.out.println("a is greater than b");
		}

		else if (a == b) {

			System.out.println("a is equal to b");

		}

		else {

			System.out.println("b is grater than a");
		}

	}

}
