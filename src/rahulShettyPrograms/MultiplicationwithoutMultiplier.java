package rahulShettyPrograms;

public class MultiplicationwithoutMultiplier {

	public static int multiplyer(int a, int b) {

		int mul = 0;

		for (int i = 1; i <= b; i++) {

			mul = mul + a; // add a 10 times a+a+a+a+a+
		}

		return mul;

	}

	public static void main(String[] args) {

		int mul = multiplyer(5,10);
		
		System.out.println(mul);

	}

}
