package rahulShettyPrograms;

public class Method_accepts_Array_returns_sum_array {

	public static int arraySum(int[] ar) {

		int sum = 0;

		for (int i = 0; i < ar.length; i++) {

			int no = ar[i];

			sum = sum + no;
		}

		return sum;

	}

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// we a method returns value, then save it inside a var in main method
		// sum in arraySum method and sum in main method two different local var , w.r.t
		// there method

		int sum = arraySum(ar);

		System.out.println(sum);

	}

}
