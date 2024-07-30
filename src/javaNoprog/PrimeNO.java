package javaNoprog;

import java.util.Scanner;

public class PrimeNO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter value of a = ");

		int a = sc.nextInt();
		
	//	int a = 11;

		boolean flag = false;
		
		// one is not prime
		// two is prime
		// prime no. - is no. which has only two factor 1 and itself
		// like 2*1, 3*1, 5*1, 7*1,
		// so its reminder cant be zero for any value, except one and itself

		// for no. other than one, check upto value/2, if rem == 0 for any i value then
		// its not prime
		// prime no. is no. which can't be divided by any no.
		// so prime no. dont have rem ==0 for any divider

		for (int i = 2; i <= a / 2; i++) {

			if (a % i == 0) {

				flag = true;
				break;
			}

		}
		
		// here with flag or condition a==1, is added, if user enters value = 1, one is not prime
		
		// if statement execute when flag is true
		// otherwise else statement

		if (flag || a <= 1) {

			System.out.println("not prime");
		}

		else {

			System.out.println("prime");
		}

	}

}
