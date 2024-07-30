package javaPattern;

public class PrimeNo {

	public static void main(String[] args) {

		int a = 2;

		boolean flag = false;

		for (int i = 2; i <= a / 2; i++) {

			if (a % i == 0) {

				flag = true;

				break;
			}

		}

		if(flag) {
			
			System.out.println("not prime no.");
		}
		
		else {
			
			System.out.println("prime no.");
		}
	}

}
