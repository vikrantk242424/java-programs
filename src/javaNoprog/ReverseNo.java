package javaNoprog;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int givenNo = 123215;
		
		int modNo = givenNo;

		int rev = 0;

		while (modNo > 0) {

			int rem = modNo % 10;

			rev = rev * 10 + rem;

			modNo = modNo / 10;

		}

		System.out.println(rev);

		if (givenNo == rev) {

			System.out.println("given no is palindrome");
		}

		else {

			System.out.println("given no is not palindrome");
		}

	}

}
